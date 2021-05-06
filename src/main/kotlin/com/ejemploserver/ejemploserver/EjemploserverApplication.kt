package com.ejemploserver.ejemploserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication // Esto es una anotacion, las anotaciones modifican cosas seria como el @FXML en javafx
class EjemploserverApplication

val listaTareas = mutableListOf<Tarea>()
fun main(args: Array<String>) { // El main es el punto de inicio del servidor (este main seria como el Initialize de javafx)
	println("Empezamos el servidor, OLEEEEE")
	runApplication<EjemploserverApplication>(*args) // Esto es una funcion
	println("Se ha completado la creación del servidor")


	// Aqui podemos poner la cantidad de codigo que nos de la gana que nos de la gana.

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

}