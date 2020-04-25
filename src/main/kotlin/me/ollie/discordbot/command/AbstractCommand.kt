package me.ollie.discordbot.command

import me.ollie.discordbot.Bot
import me.ollie.discordbot.user.User

abstract class AbstractCommand {
    abstract val name: String
    abstract val rank: Rank
    abstract val aliases: List<String>?

    abstract val category: CommandCategory
    abstract val help: String
    abstract val usage: String?

    abstract fun execute(author: User, bot: Bot, message: String, channel: String, args: Array<String>)
}