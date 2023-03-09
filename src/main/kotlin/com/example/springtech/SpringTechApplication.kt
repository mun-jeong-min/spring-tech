package com.example.springtech

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTechApplication

fun main(args: Array<String>) {
    runApplication<SpringTechApplication>(*args)
}
