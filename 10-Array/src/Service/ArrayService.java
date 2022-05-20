package Service;

import ArrayClass.Array;
import java.util.Arrays;

public class ArrayService {

    /**
     * a deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla
     */
    public Array newArray() {

        Array a = new Array();

        double arrayA[] = a.getArrayA();
        double arrayB[] = a.getArrayB();

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = Math.random() * 10;
        }
        // for (int i = 0; i < arrayB.length; i++) {
        //     arrayB[i]=Math.random()*10;}
        System.out.println("Array A");
        for (int i = 0; i < a.getArrayA().length; i++) {
            System.out.println(i + ")- " + a.getArrayA()[i]);
        }
        return a;
    }

    //Mostrar los dos arreglos resultantes
    public void show(Array a) {
        System.out.println("Array A");
        for (int i = 0; i < a.getArrayA().length; i++) {
            System.out.println(i + ")- " + a.getArrayA()[i]);
        }
        System.out.println("Array B");
        for (int i = 0; i < a.getArrayB().length; i++) {
            System.out.println(i + ")- " + a.getArrayB()[i]);
        }
    }

    /**
     * el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10
     * números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
     * elementos con el valor 0.5
     */
    public Array modify(Array a) {

        double[] arrayA = a.getArrayA();
        double[] arrayB = a.getArrayB();

        Arrays.sort(arrayA);

        for (int i = 0; i < 10; i++) {

            arrayB[i] = arrayA[i];
        }

        for (int i = 10; i < 20; i++) {
            arrayB[i] = 0.5;
        }

        return a;
    }

    public Array modify2(Array a) {
        double[] arrayA = a.getArrayA();
      
        Arrays.sort(arrayA);
        a.setArrayB(Arrays.copyOf(arrayA, 20));
        Arrays.fill(a.getArrayB(), 10, 20, 0.5);
        return a;
    }

}
