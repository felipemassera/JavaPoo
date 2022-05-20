/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. 
 */
package Class;

public class ChainClass {

    private String text;
    private int characters;

    public ChainClass() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCharacters() {
        return characters;
    }

    public void setCharacters(int characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "ChainClass{" + "text=" + text + ", characters=" + characters + '}';
    }
        
}
