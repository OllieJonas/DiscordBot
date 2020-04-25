package me.ollie.discordbot.command

enum class Rank {
    USER,
    MEMBER,
    MODERATOR,
    ADMIN,
    OWNER;

    fun hasPermission(rank: Rank): Boolean {
        return this.ordinal >= rank.ordinal
    }
}