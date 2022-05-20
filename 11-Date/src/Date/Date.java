
package Date;

import Class.DateClass;
import Service.DateService;

public class Date {

    public static void main(String[] args) {
       
        DateService ds= new DateService();
        DateClass d1 = ds.newDate();
       
        ds.fechaActual(d1);
        
    }
    
}
