package cn.ac.origind.destinybot.config

import com.uchuhimo.konf.ConfigSpec

object AccountSpec : ConfigSpec() {
    val qq by required<Long>()
    val password by required<String>()
}