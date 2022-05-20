package Service;

import Class.ChainClass;
import java.util.Scanner;

public class ChainService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public ChainClass newChain() {
        ChainClass c1 = new ChainClass();

        System.out.println("Add your text");
        c1.setText(read.next().toLowerCase());

        c1.setCharacters(c1.getText().length());
        return c1;
    }
//• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

    public void seeVocals(ChainClass c1) {
        String aux = "";
        int voc = 0;
        for (int i = 0; i < c1.getCharacters(); i++) {
            aux = c1.getText().substring(i, i + 1);
            if (aux.equals("a") || aux.equals("e") || aux.equals("i") || aux.equals("o") || aux.equals("u")) {
                voc++;
            }
        }
        System.out.println("Vocals : " + voc);
        System.out.println("");
    }
    //• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
//Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void inverter(ChainClass c1) {
        String Inv = "";
        for (int i = c1.getCharacters() - 1; i >= 0; i--) {
            Inv = Inv + c1.getText().charAt(i);
        }
        System.out.println(c1.getText() + " is now: " + Inv);
        System.out.println("");

    }

    /**
     * • Método vecesRepetido(String letra), recibirá un carácter ingresado por
     * el usuario y contabilizar cuántas veces se repite el carácter en la
     * frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter
     * 'a' se repite 4 veces.
     */
    public void nRepeat(ChainClass c1) {
        System.out.println("Insert char for comparation with de text");
        String aux = read.next();
        int repeat = 0;
        for (int i = 0; i < c1.getCharacters(); i++) {
            if (aux.equals(c1.getText().substring(i, i + 1))) {
                repeat++;
            }
        }
        System.out.println("'" + aux + "' are repeated in the text: " + repeat + " times.");
        System.out.println("");

    }

    /**
     * • Método compararLongitud(String frase), deberá comparar la longitud de
     * la frase que compone la clase con otra nueva frase ingresada por el
     * usuario.
     */
    public void compChar(ChainClass c1) {
        System.out.println("Add a new text");
        String text2 = read.next();
        int character2 = text2.length();

        if (character2 == c1.getCharacters()) {
            System.out.println("the two texts have the same length");
        } else {
            System.out.println("The two text dont have the same length");
        }
        System.out.println("");

    }

    // • Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void joinText(ChainClass c1) {
        System.out.println("Insert a new Text");
        String txt = read.next();

        System.out.println(txt.concat(c1.getText()));
        System.out.println("");

    }

    /*• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.*/
    public void reemplace(ChainClass c1) {
        String aux;
        System.out.println("Insert one caracter no ASCII soported");
        String aux2 = read.next();
        for (int i = 0; i < c1.getCharacters(); i++) {
            aux = c1.getText().substring(i, i + 1);
            if (aux.equals("a")) {
                aux = aux2;
            }
            System.out.print(aux);
        }
        System.out.println("");
    }

    /*• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public Boolean contain(ChainClass c1) {
        System.out.println("Insert a letter to search in the text");
        String aux = read.next();
        String aux2;
        boolean ok = false;
        for (int i = 0; i < c1.getCharacters(); i++) {
            aux2 = c1.getText().substring(i, i + 1);

            if (aux2.equals(aux)) {
                ok = true;
                break;
            }
        }
        return ok;
    }

}
