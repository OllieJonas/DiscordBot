package me.ollie.discordbot.command

data class Cooldown(var duration: Long, var scope: Scope) {

    enum class Scope(val id: Int) {
        USER(1),
        CHANNEL(2),
        GUILD(3),
        GLOBAL(4);
    }
}