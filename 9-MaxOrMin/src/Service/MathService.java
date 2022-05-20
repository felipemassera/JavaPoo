
package Service;

import Class.MathClass;

public class MathService {
    public MathClass newMath(){
        MathClass m1= new MathClass();
        
        m1.setNum1((int) (Math.random() * 10));
        m1.setNum2((int) (Math.random() * 10));
        System.out.println("The num1 is: "+m1.getNum1());
        System.out.println("The num2 is: "+m1.getNum2());
        return m1;
    }
//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public int returnMax(MathClass m1){
  
        return Math.max(m1.getNum1(),m1.getNum2());            
    }
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.    
    public void calculateExponent(MathClass m1){
         
        double aux= Math.pow(Math.max(m1.getNum1(),m1.getNum2()),Math.min(m1.getNum1(),m1.getNum2()));
        System.out.println("The result Nmax^Nmin is: "+aux); 
    }
/*• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/    
public void calculateSqrt(MathClass m1){
    double aux= Math.min(m1.getNum1(),m1.getNum2());
        aux=Math.abs(aux);
        System.out.println("La raiz cuadrada del num "+aux+ " es: "+Math.sqrt(aux));
}
        
        
}
