package net.mt1006.mapie;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.mt1006.mapie.command.MapieCommand;

import java.util.Optional;

public class MapieModFabric implements ModInitializer, MapieModLoaderInterface
{
	private static final FabricLoader FABRIC_LOADER = FabricLoader.getInstance();
	public static final boolean isDedicatedServer = FABRIC_LOADER.getEnvironmentType() == EnvType.SERVER;

	@Override public void onInitialize()
	{
		MapieMod.init(isDedicatedServer, this);
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> MapieCommand.register(dispatcher, registryAccess));
	}

	@Override public String getLoaderName()
	{
		return "Fabric";
	}

	@Override public String getModVersion()
	{
		Optional<ModContainer> modContainer = FABRIC_LOADER.getModContainer(MapieMod.MOD_ID);
		return modContainer.isPresent() ? modContainer.get().getMetadata().getVersion().getFriendlyString() : "[unknown]";
	}
}
