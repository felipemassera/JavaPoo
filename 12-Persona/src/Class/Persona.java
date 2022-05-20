package Class;

import java.time.LocalDate;

public class Persona {

    LocalDate Fecha;
    String Name;

    public Persona() {
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Persona(LocalDate Fecha, String Name) {
        this.Fecha = Fecha;
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Persona{" + "Fecha=" + Fecha + ", Name=" + Name + '}';
    }

}
