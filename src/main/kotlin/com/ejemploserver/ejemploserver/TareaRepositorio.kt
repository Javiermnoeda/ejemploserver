package com.ejemploserver.ejemploserver

import org.springframework.data.jpa.repository.JpaRepository

interface TareaRepositorio : JpaRepository<Tarea, Long>{

}