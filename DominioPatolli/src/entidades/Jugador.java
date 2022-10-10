/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author River
 */
public class Jugador {
    
    private String nombre;
    private int fondo;

    public Jugador(String nombre, int fondo) {
        this.nombre = nombre;
        this.fondo = fondo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }
    
    
    
}
