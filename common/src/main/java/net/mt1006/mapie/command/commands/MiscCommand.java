package net.mt1006.mapie.command.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

public class MiscCommand
{
	public static LiteralArgumentBuilder<CommandSourceStack> getArgumentBuilder()
	{
		LiteralArgumentBuilder<CommandSourceStack> commandBuilder = Commands.literal("misc");

		//commandBuilder.then(Commands.literal("sync").
		//	then(Commands.literal("enable").executes(CommandUtils.command(MiscCommand::syncEnable))).
		//	then(Commands.literal("disable").executes(CommandUtils.command(MiscCommand::syncDisable))));
		//commandBuilder.then(Commands.literal("clear_cache").executes(CommandUtils.command(MiscCommand::clearCache)));

		return commandBuilder;
	}
}
