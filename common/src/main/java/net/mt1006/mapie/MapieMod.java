package net.mt1006.mapie;

import net.mt1006.mocap.api.v1.MocapAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MapieMod
{
	public static final String MOD_ID = "mocapapiexample";
	public static final String FOR_VERSION = "1.21.10";

	public static final Logger LOGGER = LogManager.getLogger();
	public static MapieModLoaderInterface loaderInterface = null;

	public static void init(boolean isDedicatedServer, MapieModLoaderInterface loaderInterface)
	{
		MapieMod.loaderInterface = loaderInterface;
		LOGGER.info(getFullName());
		MocapAPI.executeAfterInit(MapieMod::onMocapInit);
	}

	public static String getFullName()
	{
		return String.format("Mocap API Example v%s for Minecraft %s [%s]",
				loaderInterface.getModVersion(), FOR_VERSION, loaderInterface.getLoaderName());
	}

	private static void onMocapInit()
	{
		LOGGER.info("Mocap API Implementation: {}", MocapAPI.Info.fullName());
	}
}
