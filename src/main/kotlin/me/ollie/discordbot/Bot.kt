package me.ollie.discordbot

import me.ollie.discordbot.command.AbstractCommand
import me.ollie.discordbot.command.CommandListener
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.MessageChannel

class Bot {

    private val BOT_TOKEN: String = "NzAzNjQ1NTUzMjcxMTExNzQw.XqS9Sg.AoDtow_E4miWywnZ2qfaB26hteQ"

    private var api: JDA? = null

    val commands: HashMap<String, AbstractCommand> = HashMap()

    init {

    }

    fun start() {
        api = JDABuilder.createDefault(BOT_TOKEN)
            .addEventListeners(
                CommandListener()
            )
            .build()

    }

    fun sendMessage(channel: MessageChannel, message: String) {
        channel.sendMessage(message).queue()
    }

    fun broadcast(message: String) {
        
    }
}