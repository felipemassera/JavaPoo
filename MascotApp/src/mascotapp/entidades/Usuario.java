package mascotapp.entidades;//entidades es el "molde"de nuestras objetos

import java.util.Date;

public class Usuario {

    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;//se hace esto para que cuando figure la edad no sea algo estatico sino que se actualiza con la cuenta del año en curso menos el nacimiento
    public String pais;

    public Usuario() {

    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

}
