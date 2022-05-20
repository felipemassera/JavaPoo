package Service;

import Class.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    Scanner read = new Scanner(System.in);

    /**
     * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas
     * máxima. Con la palabra del usuario, pone la longitud de la palabra, como
     * la longitud del vector. Después ingresa la palabra en el vector, letra
     * por letra, quedando cada letra de la palabra en un índice del vector. Y
     * también, guarda en cantidad de jugadas máximas, el valor que ingresó el
     * usuario y encontradas en 0.
     */
    public Ahorcado crearJuego() {

        Ahorcado a1 = new Ahorcado();
        System.out.println("Ingrese la palabra A ENCONTRAR");
        String x = read.next().toLowerCase();
        cargaVector(a1, x);
        System.out.println("Cantidad de jugadas maximas?");
        a1.setJugadasMax(read.nextInt());
        a1.setpEncontradas(0);

        return a1;
    }

    public Ahorcado cargaVector(Ahorcado a, String x) {

        String[] vector = new String[x.length()]; //creo un vector del tamaño de la long de la palabra

        for (int i = 0; i < x.length(); i++) {

            vector[i] = x.substring(i, i + 1);

        }
        a.setPalabra(vector); //ingreso los datos del array en el arrayClass

        return a;
    }

    /**
     * Método longitud(): muestra la longitud de la palabra que se debe
     * encontrar. Nota: buscar como se usa el vector.length.
     */
    public void longitud(Ahorcado x) {

        System.out.println("Longitud de la palabra: " + x.getPalabra().length);
    }

    /**
     * Método buscar(letra): este método recibe una letra dada por el usuario y
     * busca sila letra ingresada es parte de la palabra o no. También informará
     * si la letra estaba o no.
     */
    public void buscar(Ahorcado a, String letra, String[] vec2) { //HAY QUE TERMINARLO
        boolean ok = false;
        String aux = "";
        String[] vec = a.getPalabra();
        for (int i = 0; i < vec.length; i++) {

            aux = vec[i];
            if (aux.equals(letra)) {
                ok = true;
                vec2[i] = letra;
            }
        }
        if (ok) {
            System.out.println("La letra pertenece a la palabra ");
        } else {
            System.out.println("La letra NO pertenece a la palabra");
        }
        System.out.print("La palabra es:   ");
        for (int i = 0; i < vec2.length; i++) {
            System.out.print(vec2[i] + " ");

        }
        System.out.println("");
    }

    /**
     * Método encontradas(letra): que reciba una letra ingresada por el usuario
     * y muestre cuantas letras han sido encontradas y cuantas le faltan. Este
     * método además deberá devolver true si la letra estaba y false si la letra
     * no estaba, ya que, cada vez que se busque una letra que no esté, se le
     * restará uno a sus oportunidades.
     */
    public boolean encontradas(Ahorcado a, String letra) {
        boolean ok = false;
        int cont = 0;
        String aux = "";
        String[] vec = a.getPalabra();
        for (int i = 0; i < vec.length; i++) {

            aux = vec[i];
            if (aux.equals(letra)) {
                cont++;
                ok = true;
            }
        }

        a.setpEncontradas(cont + a.getpEncontradas());
        System.out.println("Número de letras (encontradas, faltantes): (" + a.getpEncontradas() + "," + ((a.getPalabra().length) - a.getpEncontradas()) + ")");

        return ok;
    }

    /**
     * Método intentos(): para mostrar cuantas oportunidades le queda al
     * jugador.
     */
    public void intentos(Ahorcado a, boolean ok) {

        if (!ok) {
            a.setJugadasMax(a.getJugadasMax() - 1);
        }
        if (a.getJugadasMax() != 0) {
            System.out.println("Número de oportunidades restantes: " + a.getJugadasMax());
        } else {
            System.out.println(" Lo sentimos, no hay más oportunidades");
        }
    }

    /* Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main */
    public void juego(Ahorcado a) {
        String buscar;
        boolean ok = false;
        String[] vec2 = new String[a.getPalabra().length];
        carga2(vec2);

        do {
            System.out.println("Ingrese una letra: ");
            buscar = read.next().toLowerCase();
            longitud(a);
            buscar(a, buscar, vec2);
            ok = encontradas(a, buscar);
            intentos(a, ok);

        } while ((a.getpEncontradas() != a.getPalabra().length) & (a.getJugadasMax() != 0));

        if (a.getJugadasMax() != 0) {
            System.out.println("GANASTE!!");
        } else {
            System.out.println("GAME OVER! :(");
        }
    }
    //// MODULOS NO PEDIDOS PARA "MEJORAR " el juego 

    public String[] carga2(String[] vec2) {

        for (int i = 0; i < vec2.length; i++) {
            vec2[i] = "-";
        }

        return vec2;
    }
}
