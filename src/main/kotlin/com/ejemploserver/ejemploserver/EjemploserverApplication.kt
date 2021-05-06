package com.ejemploserver.ejemploserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EjemploserverApplication

fun main(args: Array<String>) { // El main es el punto de inicio del servidor
	runApplication<EjemploserverApplication>(*args)
}

