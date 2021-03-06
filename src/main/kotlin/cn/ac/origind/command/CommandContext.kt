package cn.ac.origind.command

import cn.ac.origind.destinybot.DestinyBot.bot

data class CommandContext(val senderId: Long, val subjectId: Long, val message: String, val time: Long) {
    val subject get() = bot.getGroupOrFail(subjectId)
}
