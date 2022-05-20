package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {

    //7) se crea un metodo que retorne un objeto del tipo vendedor y se lo importa
    public Vendedor altaVendedor() {

//8) se instancia un objeto del tipo vendedor
        Vendedor v1 = new Vendedor(); // de esta manera se inicia con el constructor vacio o por defecto

//9) comienzo a llenar los atributos del objeto recien creado (Invocamos el SCanner)
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el Dni del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el Sueldo Basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());

        System.out.println("Ingrese el dia de inicio de trabajo");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de inicio de trabajo");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de inicio de trabajo");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);

        return v1; //10) retorna objeto con el valor cargado
    }

    /**
     * 11) creamos un metodo que no retorna nada para calcular el sueldo mensual
     */
    public void SueldoMensual(Vendedor v1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);// comision es el 15% de las ventas
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El Sueldo mensual del vendedor " + v1.getNombre() + " es de $ " + v1.getSueldoMensual());
    }

    /**
     * 12) Hacemos otro metodo para valcular las vacaciones
     */
    public void vacaciones(Vendedor v1) {
        Scanner leer = new Scanner(System.in);
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5 && antiguedad >= 1) {
            System.out.println("Le corresponde 14 dias de vacaciones");
        } else if (antiguedad < 10 && antiguedad >= 5) {
            System.out.println("Le corresponde 21 dias de vacaciones");
        } else if (antiguedad < 20 && antiguedad >= 10) {
            System.out.println("Le corresponde 28 dias de vacaciones");
        } else if (antiguedad >= 20) {
            System.out.println("Le corresponde 35 dias de vacaciones");
        } else {
            System.out.println("Le corresponde dias de vacaciones proporcionales");

        }
    }

//UNA VEZ HECHO ESTO VAMOS AL MAIN    
}
