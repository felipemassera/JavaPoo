/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import CalculadoraClass.Operacion;
import CalculadoraServicio.OperacionServicio;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class OperacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        OperacionServicio os = new OperacionServicio();

        Operacion o1 = os.crearOperacion();
        int option = 0;
        do {

            do {
                System.out.println("Que Operacion desea realizar?");
                System.out.println(""
                        + "1)Suma" + "\n"
                        + "2)Resta" + "\n"
                        + "3)Multiplicacion" + "\n"
                        + "4)Division" + "\n"
                        + "5)Salir");
                option = leer.nextInt();
                if (option < 1 || option > 5) {
                    System.out.println("Error!");
                }
            } while (option < 1 || option > 5);

            switch (option) {
                case 1:
                    System.out.println("El resultado es " + os.Sumar(o1));
                    break;
                case 2:
                    System.out.println("El resultado es " + os.Resta(o1));
                    break;
                case 3:
                    System.out.println("El resultado es " + os.Multi(o1));
                    break;
                case 4:
                    System.out.println("El resultado es " + os.Div(o1));
                    break;
                case 5:
                    System.out.println("Saliste");
                    break;
            }
        } while (option != 5);

    }

}
