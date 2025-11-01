package net.mt1006.mapie;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import org.jetbrains.annotations.Nullable;

@Mod(MapieMod.MOD_ID)
public class MapieModNeoForge implements MapieModLoaderInterface
{
	public static final boolean isDedicatedServer = FMLEnvironment.getDist().isDedicatedServer();
	private final @Nullable ModContainer modContainer;

	public MapieModNeoForge(IEventBus eventBus)
	{
		ModContainer modContainer = ModLoadingContext.get().getActiveContainer();
		this.modContainer = modContainer.getModId().equals("minecraft") ? null : modContainer;
		MapieMod.init(isDedicatedServer, this);
	}

	@Override public String getLoaderName()
	{
		return "NeoForge";
	}

	@Override public String getModVersion()
	{
		return modContainer != null ? modContainer.getModInfo().getVersion().toString() : "[unknown]";
	}
}
