package net.mt1006.mapie;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.javafmlmod.FMLModContainer;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(MapieMod.MOD_ID)
public class MapieModForge implements MapieModLoaderInterface
{
	public static final boolean isDedicatedServer = FMLEnvironment.dist.isDedicatedServer();
	private final FMLModContainer modContainer;

	public MapieModForge(FMLJavaModLoadingContext ctx)
	{
		modContainer = ctx.getContainer();
		MapieMod.init(isDedicatedServer, this);
	}

	@Override public String getLoaderName()
	{
		return "Forge";
	}

	@Override public String getModVersion()
	{
		return modContainer.getModInfo().getVersion().toString();
	}
}
