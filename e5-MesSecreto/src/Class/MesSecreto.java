/*Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String */
package Class;

/**
 *
 * @author Felipe
 */
public class MesSecreto {
    String [] mes = new String[12];
    String mesSecreto;
    
    public MesSecreto() {
    }

    public MesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

      
    
}
