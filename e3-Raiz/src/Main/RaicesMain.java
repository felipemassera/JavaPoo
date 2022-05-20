package Main;

import Class.Raices;
import Service.RaicesService;

public class RaicesMain {
    
    public static void main(String[] args) {
        
        RaicesService rs = new RaicesService();
        Raices r1 = rs.newRaiz();
        
        double ok = rs.getDiscriminante(r1);
        System.out.println(ok);
        rs.calcular(r1, ok);
    }
    
}
