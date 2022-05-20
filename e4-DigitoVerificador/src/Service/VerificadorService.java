/*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F) */
package Service;

import Class.NIF;
import java.util.Scanner;

public class VerificadorService {

    Scanner read = new Scanner(System.in);

    public NIF crearNIF() {
        String[] vector = new String[23];
        NIF n1 = new NIF();

        System.out.print("Ingrese el numero de DNI : ");
        n1.setDni(read.nextLong());

        cargaVector(vector);
        n1.setLetra(calcularLetra(n1, vector));

        return n1;
    }

    public String[] cargaVector(String[] v) {
        v[0] = "T";
        v[1] = "R";
        v[2] = "W";
        v[3] = "A";
        v[4] = "G";
        v[5] = "M";
        v[6] = "Y";
        v[7] = "F";
        v[8] = "P";
        v[9] = "D";
        v[10] = "X";
        v[11] = "B";
        v[12] = "N";
        v[13] = "J";
        v[14] = "Z";
        v[15] = "S";
        v[16] = "Q";
        v[17] = "V";
        v[18] = "H";
        v[19] = "L";
        v[20] = "C";
        v[21] = "K";
        v[22] = "E";
        return v;
    }

    public String calcularLetra(NIF n1, String[] v) {

        long a = n1.getDni() % 23;
        System.out.println(a);
        String b = v[Math.toIntExact(a)];

        return b;
    }

    public void mostrar(NIF n1) {

        System.out.println(n1.getDni() + "-" + n1.getLetra());
    }
}
