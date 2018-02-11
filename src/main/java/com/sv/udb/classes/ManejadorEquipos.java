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
public class ManejadorEquipos {
    List<Equipos> listEqui;

    public ManejadorEquipos() {
        this.listEqui = new ArrayList<>();
    }
    
    public boolean guarEqui(String nomb)
    {
        boolean resp = false;
        try
        {
            this.listEqui.add(new Equipos(nomb));
            resp = true;
        }
        catch (Exception ex) {
            System.err.println("Error al guardar Equipos: " + ex.getMessage());
        }
        return resp;
    }
    
    public List<Equipos> consTodo()
    {
        return this.listEqui;
    }
    
    /**
    * Función que agrega UN jugador a la lista
    * y luego se envía de nuevo al objeto
    *
    * @param equi Equipo a agregar el jugador
    * @param juga Objeto de tipo Jugador a agregar
     * @return verdadero o false dependiendo el resultado de la operación
    */
    
    public boolean agreJugaAList(Equipos equi, Jugadores juga)
    {
        boolean resp = false;
        try
        {
            if(equi != null)
            {
                List<Jugadores> listTemp = equi.getListJuga(); //Obtiene la lista de jugadores
                listTemp.add(juga); //Agrega el jugador
                equi.setListJuga(listTemp); //Devuelve la lista con el jugador agregado
                resp = true;
            }
        }
        catch (Exception ex) {
            System.err.println("Error al agregar el Jugador al Equipo: " + ex.getMessage());
        }
        return resp;
    }
}
