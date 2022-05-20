/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Class.Ahorcado;
import Service.AhorcadoService;

/**
 *
 * @author Felipe
 */
public class AhorcadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
        Ahorcado a1 = as.crearJuego();
        
        as.juego(a1);
    }
    
}
