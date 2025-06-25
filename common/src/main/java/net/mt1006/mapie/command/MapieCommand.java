package net.mt1006.mapie.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.mt1006.mapie.command.commands.MiscCommand;

public class MapieCommand
{
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext buildContext)
	{
		LiteralArgumentBuilder<CommandSourceStack> commandBuilder = Commands.literal("mapie").requires(source -> source.hasPermission(2));

		commandBuilder.then(MiscCommand.getArgumentBuilder());
		//commandBuilder.then(Commands.literal("info").executes(CommandUtils.command(MapieCommand::info)));

		dispatcher.register(commandBuilder);
	}
}
