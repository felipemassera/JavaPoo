/*
//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
//operaciones asociadas a dicha clase son:
//• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//• Agregar los métodos getters y setters correspondientes

 */
package Class;

public class AcountClass {
    int nAcount;
    long dni;
    int balance;

    public AcountClass() {
    }

    public AcountClass(int nAcount, long dni, int balance) {
        this.nAcount = nAcount;
        this.dni = dni;
        this.balance = balance;
    }

    public int getnAcount() {
        return nAcount;
    }

    public void setnAcount(int nAcount) {
        this.nAcount = nAcount;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AcountClass{" + "nAcount=" + nAcount + ", dni=" + dni + ", balance=" + balance + '}';
    }
    
    
    
}
