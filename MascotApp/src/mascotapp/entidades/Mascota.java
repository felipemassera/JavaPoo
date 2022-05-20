/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author Felipe
 */
public class Mascota { //atributos

    private String nombre;
    private String apodo;
    private String tipo;//conejo perro o gato
    private String color;
    private int edad;
    private boolean cola; //cuando es un boolean t y no se define valor, por defecto es FALSE
    private String raza;
    private int energia; // seria la energia usada en el paseo

    public Mascota() {
        //this.energia=1000; este es lo mismo que el anterior se pone THIS cuando hay redundancia de variables
        energia = 1000;
    } // SIEMPRE HAY QUE TENER UN CONSTRUCTOR VACIO

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")) {
            this.tipo = tipo;
        }
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }

    //PARA AGREGAR SETTER O GETTER ES: ALT+INSERT 
    /**
     * SETTER
     */
    public void setNombre(String nombre) { //de esta manera se hace un setter y sirve para cambiar los valores PRIVATE de nuestro objeto desde el main.
        if (nombre.length() > 0) { //LOGICA: usamos este if para que el setteo se haga cuando hay al menos 1 caracter para almacenar
            this.nombre = nombre; //LOGICA: de esta fotma se setea directo.
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    /**
     * GETTER hecho con ALT + INS
     */
    public String getNombre() { //de esta manera podemos acceder desde el main a los datos del NOMBRE del objeto. 
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    public int getEnergia() {
        return energia;
    }

    /**
     * FUNCION DESTINADA A PASEAR
     *
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar) { //la logica de este metodo(FUNCION) es que cada vezx que se pasee se le resta energia
        // energia= energia - energiaRestar; //(formato1) significa que a energia le resta el valor 'energiaRestar' y lo vuelve a guardar en energia
        energia -= energiaRestar; //(formato2) HACE LO MISMO que el 1 pero escrito de una forma mas compacta
        return energia;
    }

    /**
     * funcion destinada a pasear por vueltas
     *
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas) { //FUNCION similar a la anterior, cambian los parametros recibidos y opera en funcion de ellos
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
        return energia;
    }

    /**
     * toString hecha con ALT + INS (Documenta todo el objeto)
     */
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

}
