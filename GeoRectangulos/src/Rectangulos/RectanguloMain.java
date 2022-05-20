/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulos;

import RectanguloClass.Rectangulo;
import RectanguloService.RectanguloService;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class RectanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RectanguloService rs = new RectanguloService();
        
        Rectangulo r1 = rs.crearRectangulo();
        
        rs.Perimetro(r1);
        rs.Superficie(r1);
        rs.verRectangulo(r1);
    }
    
}
