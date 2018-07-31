package io.polarian.smtplogger

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class ApiController {
    @GetMapping
    fun get(): Api {
        return Api("myKey", "myValue")
    }

    @GetMapping("/error")
    fun exception() {
        throw RuntimeException("this is big issue")
    }

    @PostMapping
    fun post(@RequestBody api: Api): Api {
        return api
    }
}

data class Api(val key: String, val value: String)