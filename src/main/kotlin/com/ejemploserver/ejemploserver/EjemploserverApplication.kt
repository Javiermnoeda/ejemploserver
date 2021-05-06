package com.ejemploserver.ejemploserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication // Esto es una anotacion, las anotaciones modifican cosas seria como el @FXML en javafx
class EjemploserverApplication

fun main(args: Array<String>) { // El main es el punto de inicio del servidor (este main seria como el Initialize de javafx)
	println("Empezamos el servidor, OLEEEEE")
	runApplication<EjemploserverApplication>(*args) // Esto es una funcion
	println("Se ha completado la creación del servidor")


	// Aqui podemos poner la cantidad de codigo que nos de la gana que nos de la gana.



	//Modelo Vista Controlador



}