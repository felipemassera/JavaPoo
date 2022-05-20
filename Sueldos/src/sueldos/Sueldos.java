package sueldos;

import Entidades.Vendedor;
import Servicio.VendedorServicio;

public class Sueldos {

    /**
     * La idea del uso de identidades y servicios es que desde el main podamos
     * llamar los metodos y no tener que escribir tanto codigo, se busca
     * reutilizar las estructuras definidas en los objetos, como la estructura
     * de los servicios como para no tener quye escribir cada metodo en el main
     * cada vez que lo necesite
     *
     */
    public static void main(String[] args) {

        VendedorServicio vs = new VendedorServicio(); // se instancia un objeto de tipo servicio para poder acceder
        Vendedor v1 = vs.altaVendedor();//se instancia de el objeto en el cual voy a alberjar el retorno de lo construido en la clase de servicio "altaVendedor"

        //Aca usamos los metodos para poder realizar los calculos de sueldo y vacaciones
        vs.SueldoMensual(v1);
        vs.vacaciones(v1);
    }

}
