
package Service;

import Class.DateClass;
import java.util.Date;
import java.util.Scanner;

public class DateService {
    Scanner read= new Scanner (System.in);
    public DateClass newDate(){
        
        DateClass d1 = new DateClass();
        System.out.println("Day?");
        d1.setDia(read.nextInt());
        System.out.println("Month?");
        d1.setMes(read.nextInt());
        System.out.println("Year?");
        d1.setAnio(read.nextInt());
       
        
        Date fecha = new Date(d1.getAnio() - 1900, d1.getMes() - 1, d1.getDia()); //Aparentemente es el formato 
        d1.setFecha(fecha);
        System.out.println(fecha);
       
        return d1;
    }
    
    public void fechaActual(DateClass d1){
        
        int diaactual=05;
        int mesactual=05;
        int anioactual = 2022;
        System.out.println(diaactual+","+mesactual+","+anioactual);
        System.out.println("La diferencia de años es de "+(anioactual-d1.getAnio()));
        
    }
}
