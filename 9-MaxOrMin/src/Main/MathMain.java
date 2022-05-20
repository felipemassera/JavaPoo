/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y 
 */
package Main;

import Class.MathClass;
import Service.MathService;

public class MathMain {

    public static void main(String[] args) {

        MathService ms = new MathService();
        MathClass m1 = ms.newMath();

        ms.returnMax(m1);
        ms.calculateExponent(m1);
        ms.calculateSqrt(m1);
    }

}
