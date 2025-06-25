package net.mt1006.mapie.forge;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mt1006.mapie.MapieMod;
import net.mt1006.mapie.command.MapieCommand;

@Mod.EventBusSubscriber(modid = MapieMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RegisterCommand
{
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event)
	{
		MapieCommand.register(event.getDispatcher(), event.getBuildContext());
	}
}
