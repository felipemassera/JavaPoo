/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario.
Constructores, tanto el vacío como el parametrizado
 */
package Class;

/**
 *
 * @author Felipe
 */
public class Ahorcado {

    String[] palabra = {"t", "e", "r", "m", "o", "c", "u", "p", "l", "a"};
    int pEncontradas;
    int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int lEncontradas, int jugadasMax) {
        this.palabra = palabra;
        this.pEncontradas = lEncontradas;
        this.jugadasMax = jugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getpEncontradas() {
        return pEncontradas;
    }

    public void setpEncontradas(int lEncontradas) {
        this.pEncontradas = lEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", pEncontradas=" + pEncontradas + ", jugadasMax=" + jugadasMax + '}';
    }

}
