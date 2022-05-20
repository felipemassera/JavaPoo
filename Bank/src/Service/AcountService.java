/**
 * //• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 * //• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 * //ingresar y se la sumara a saldo actual.
 * //• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
 * //se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
 * //pondrá el saldo actual en 0.
 * //• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
 * //que el usuario no saque más del 20%.
 * //• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
 * //• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Service;

import Class.AcountClass;
import java.util.Scanner;

public class AcountService {

    Scanner read = new Scanner(System.in);

    public AcountClass newAcount() {
        AcountClass a1 = new AcountClass();

        System.out.println("Insert you number Acount");
        a1.setnAcount(read.nextInt());
        System.out.println("Insert you ID");
        a1.setDni(read.nextLong());
        System.out.println("Current balance: ");
        a1.setBalance(read.nextInt());
        return a1;
    }

    public void insertCash(AcountClass a1) {
        System.out.println("Insert cash for the balance");
        a1.setBalance(a1.getBalance() + read.nextInt());
    }

    public void cashOut(AcountClass a1) {
        System.out.println("you balance is $" + a1.getBalance());
        System.out.println("Insert mount for rest to the balance");
        int a = read.nextInt();
        if (a > a1.getBalance()) {
            a1.setBalance(0);

        } else {
            a1.setBalance(a1.getBalance() - a);
        }

    }

    public void quickCashOut(AcountClass a1) {
        System.out.println("you balance is $" + a1.getBalance());
        System.out.println("Insert mount for rest to the balance");
        int a = read.nextInt();
        int a2 = (int) (a1.getBalance() * 0.2);
        if (a < a2) {
            a1.setBalance(a1.getBalance() - a);
        } else {
            System.out.println("You have reached the limit for your transactionm");
        }
    }

    public void checkBalance(AcountClass a1) {
        System.out.println("Your Balance is $" + a1.getBalance());
    }

    public void checkAcount(AcountClass a1) {
        System.out.println("Your Number Acount is " + a1.getnAcount() + "\n"
                + "Id:  " + a1.getDni() + "\n"
                + "balance $" + a1.getBalance());
    }
}
