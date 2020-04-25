package me.ollie.discordbot.command

import net.dv8tion.jda.api.entities.Message
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import java.security.SecureRandom

class CommandListener: ListenerAdapter() {

    val cringeMessages: Array<String> = arrayOf("cringe", "bro that's kinda cringe", "you're cringe", "hella cringe bro")

    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.author.isBot) return
        val message: Message = event.message
        val content: String = message.contentRaw
        val rand = SecureRandom().nextInt(cringeMessages.size)
        val channel = event.channel
        channel.sendMessage(cringeMessages[rand]).queue()
    }

}