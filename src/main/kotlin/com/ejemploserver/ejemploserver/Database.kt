package com.ejemploserver.ejemploserver

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration

class Database {
    @Bean // Es lo que tiene ejecutar por primera vez al crear la base de datos
    fun initDatabase (tareaRepositorio: TareaRepositorio) : CommandLineRunner {
        return CommandLineRunner { args : Array<String?>? ->
            println("Base de datos creándose")
            val listaTareas = mutableListOf<Tarea>()

            val tarea1 = Tarea("Primera Tarea","Hacer Tarea 1", false)
            listaTareas.add(tarea1)

            val tarea2 = Tarea("Segunda Tarea","Hacer Tarea 2", true)
            listaTareas.add(tarea2)

            val tarea3 = Tarea("Tercera Tarea","Hacer Tarea 3", false)
            listaTareas.add(tarea3)

            val tarea4 = Tarea("Cuarta Tarea","Hacer Tarea 4", true)
            listaTareas.add(tarea4)

            val tarea5 = Tarea("Quinta Tarea","Hacer Tarea 5", true)
            listaTareas.add(tarea5)
            
            listaTareas.forEach {
                println("La tarea con id ${it.id}, contiene ${it.titulo} y fue creada ${it.fechaCreacion}")
            }
            tareaRepositorio.count()
        }
    }
}