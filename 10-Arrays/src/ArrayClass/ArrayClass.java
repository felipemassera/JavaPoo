/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales,
y el segundo B, un arreglo de 20 números, también reales. */
package ArrayClass;

public class ArrayClass {

   

    public ArrayClass() {
    }

    public ArrayClass(double[] arrayA, double[] arrayB) {
           this.arrayA = arrayA;
           this.arrayB = arrayB;     
    }

    public double[] getArrayA() {
        return arrayA;
    }

    public void setArrayA(double[] arrayA) {
        this.arrayA = arrayA;
    }

    public double[] getArrayB() {
        return arrayB;
    }

    public void setArrayB(double[] arrayB) {
        this.arrayB = arrayB;
    }

    @Override
    public String toString() {
        return "ArrayClass{" + "arrayA=" + arrayA + ", arrayB=" + arrayB + '}';
    }

    
    
}
