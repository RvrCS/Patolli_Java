/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentesConocimiento;

import entidades.Juego;

/**
 *
 * @author River
 */
public interface IFuenteConocimiento {
    
    public static Juego juego = Juego.getInstance();
    
    public void updateBlackboard();
    
}
