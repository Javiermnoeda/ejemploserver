package com.ejemploserver.ejemploserver

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


//para crear una entidad de tarea
@Entity //Con esto tarea va a ser una clase y tb va a ser una tabla de nuestra bbdd

class Tarea (
    var titulo  : String,
    var detallesTarea : String = "",
    var esFavorito : Boolean,
    var fechaCreacion : Long = System.currentTimeMillis(),
    var fechaEdicion : Long = fechaCreacion){

    @Id
    @GeneratedValue
    var id = 0L

}