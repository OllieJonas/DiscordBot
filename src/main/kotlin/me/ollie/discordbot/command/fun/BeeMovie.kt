package me.ollie.discordbot.command.`fun`

import me.ollie.discordbot.Bot
import me.ollie.discordbot.command.AbstractCommand
import me.ollie.discordbot.command.CommandCategory
import me.ollie.discordbot.command.Rank
import me.ollie.discordbot.user.User

class BeeMovie: AbstractCommand() {

    override fun execute(author: User, bot: Bot, message: String, channel: String, args: Array<String>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val name: String = "beemovie"

    override val rank: Rank = Rank.USER
    override val aliases: List<String>? = listOf("bee", "bm", "bmovie")
    override val category: CommandCategory = CommandCategory.FUN
    override val help: String = "Prints out the bee movie... muahahahaa >:)"
    override val usage: String? = ""



}
