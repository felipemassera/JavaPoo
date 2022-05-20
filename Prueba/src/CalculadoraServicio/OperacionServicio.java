/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraServicio;

import CalculadoraClass.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion o1 = new Operacion();

        System.out.println("Ingrese el numero 1");
        o1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el numero 2");
        o1.setNumero2(leer.nextInt());

        return o1;
    }

    public int Sumar(Operacion o1) {
        int tot = o1.getNumero1() + o1.getNumero2();
        return tot;
    }

    public int Resta(Operacion o1) {
        int tot = o1.getNumero1() - o1.getNumero2();
        return tot;
    }

    public int Multi(Operacion o1) {
        int tot;
        if (o1.getNumero1() != 0 && o1.getNumero2() != 0) {
            tot = o1.getNumero1() * o1.getNumero2();
        } else {
            System.out.println("Error");
            tot = 0;
        }
        return tot;
    }

    public double Div(Operacion o1) {
        double tot1;
        if (o1.getNumero1() != 0 && o1.getNumero2() != 0) {
            tot1 = o1.getNumero1() / o1.getNumero2();
        } else {
            System.out.println("Error");
            tot1 = 0;
        }
        return tot1;
    }

}
