/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Circunferencia;
import Services.CircunferenciaServicio;

/**
 *
 * @author Felipe
 */
public class CircunferenciaMain {
    
    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        
        Circunferencia c1 = cs.CrearCircunferencia();
        
        cs.Areacircunf(c1);
        cs.perimetrocircunf(c1);
        
    }
    
}
