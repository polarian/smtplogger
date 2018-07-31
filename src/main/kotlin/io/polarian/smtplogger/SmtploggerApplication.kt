package io.polarian.smtplogger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmtploggerApplication

fun main(args: Array<String>) {
    runApplication<SmtploggerApplication>(*args)
}
