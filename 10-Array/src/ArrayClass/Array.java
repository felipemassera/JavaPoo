package ArrayClass;

public class Array {

    private double arrayA[] = new double [50] ;
    private double arrayB[] = new double [20];

    public Array() {
    }
    
    public Array(double[] arrayA, double[] arrayB) {
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
        return "Array{" + "arrayA=" + arrayA + ", arrayB=" + arrayB + '}';
    }

}
