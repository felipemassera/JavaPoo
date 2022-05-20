/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Class.MesSecreto;
import java.util.Scanner;

/**
 * Ala clase variable mesSecreto hazla igual a un elemento del array (por
 * ejemplo, mesSecreto = mes[9]
 */
public class MesSecretoService {

    Scanner read = new Scanner(System.in);

    public MesSecreto newMes() {

        MesSecreto m1 = new MesSecreto();

        cargaMes(m1);
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
        String x = read.next();
        if (x.equals(m1.getMesSecreto())) {
            System.out.println("¡Ha acertado!");
        } else {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
        }

        return m1;
    }

    public MesSecreto cargaMes(MesSecreto m1) {

        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        m1.setMesSecreto(mes[9]);
        m1.setMes(mes);

        return m1;

    }

}
