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
public class ManejadorJugadores {
    List<Jugadores> listJuga;

    public ManejadorJugadores() {
        this.listJuga = new ArrayList<>();
    }
    
    public boolean guarJuga(String nomb, int edad, int altu, int peso)
    {
        boolean resp = false;
        try
        {
            this.listJuga.add(new Jugadores(nomb, edad, altu, peso));
            resp = true;
        }
        catch (Exception ex) {
            System.err.println("Error al guardar Jugadores: " + ex.getMessage());
        }
        return resp;
    }
    
    public List<Jugadores> consTodo()
    {
        return this.listJuga;
    }
}
