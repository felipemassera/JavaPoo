package pkg8.phrase;

import Class.ChainClass;
import Service.ChainService;

/**
 * En el main se creará el objeto y se le pedirá al usuario que ingrese una
 * frase que puede ser una palabra o varias palabras separadas por un espacio en
 * blanco y a través de los métodos set, se guardará la frase y la longitud de
 * manera automática según la longitud de la frase ingresada
 */
public class Phrase {
    
    public static void main(String[] args) {
        
        ChainService cs = new ChainService();
        ChainClass c1 = cs.newChain();
        
        cs.seeVocals(c1);
        cs.inverter(c1);
        cs.nRepeat(c1);
        cs.compChar(c1);
        cs.joinText(c1);
        cs.reemplace(c1);
        System.out.println(cs.contain(c1));
    }
    
}
