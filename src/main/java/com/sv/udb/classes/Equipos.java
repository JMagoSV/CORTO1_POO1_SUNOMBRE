/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauricio González
 */
public class Equipos {
    private String nomb;
    private List<Jugadores> listJuga;

    /**
    * Constructor, no olvidar crear el objeto de las listas
    * en ambos constructores
    *
    * @param nomb El nombre del equipo
    */
    public Equipos(String nomb) {
        this.listJuga = new ArrayList<>();
        this.nomb = nomb;
    }

    public Equipos() {
        this.listJuga = new ArrayList<>();
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }
    
    public List<Jugadores> getListJuga() {
        return listJuga;
    }

    public void setListJuga(List<Jugadores> listJuga) {
        this.listJuga = listJuga;
    }

    @Override
    public String toString() {
        return nomb;
    }    
}
