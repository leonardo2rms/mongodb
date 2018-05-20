package com.example.mongodb.document;

import org.springframework.data.annotation.Id;

/**
 * Created by leonardo2rms on 19/05/18.
 */

public class WorkArea {

    @Id
    private Long id;
    private String zona;
    private String nombre;

    public WorkArea(String prueba, String prueba2) {
        this.zona = prueba;
        this.nombre = prueba2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
