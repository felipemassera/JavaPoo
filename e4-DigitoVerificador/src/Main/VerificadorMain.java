package Main;

import Class.NIF;
import Service.VerificadorService;

public class VerificadorMain {
    
    public static void main(String[] args) {
        
        VerificadorService vs = new VerificadorService();
        
        NIF n1 = vs.crearNIF();
        
        vs.mostrar(n1);
        
    }
    
}
