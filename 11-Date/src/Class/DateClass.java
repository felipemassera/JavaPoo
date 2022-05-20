/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Class;

import java.util.Date;

/**
 *
 * @author Felipe
 */

public class DateClass {
    int dia;
    int mes;
    int anio;
    Date fecha;
    
    public DateClass() {
    }

    public DateClass(int dia, int mes, int anio, Date fecha) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.fecha = fecha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "DateClass{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", fecha=" + fecha + '}';
    }

    
    
}
