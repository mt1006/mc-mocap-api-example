package net.mt1006.mapie.neoforge;

import net.mt1006.mapie.MapieMod;
import net.mt1006.mapie.command.MapieCommand;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.server.command.ConfigCommand;

@EventBusSubscriber(modid = MapieMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class RegisterCommand
{
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event)
	{
		MapieCommand.register(event.getDispatcher(), event.getBuildContext());
		ConfigCommand.register(event.getDispatcher());
	}
}
