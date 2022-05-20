/*, Ala clase variable mesSecreto hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Main;

import Class.MesSecreto;
import Service.MesSecretoService;

/**
 *
 * @author Felipe
 */
public class MesSecretoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesSecretoService ms = new MesSecretoService();
        MesSecreto s1 = ms.newMes();

    }

}
