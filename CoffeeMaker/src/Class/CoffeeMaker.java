/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters
 */
package Class;

/**
 *
 * @author Felipe
 */
public class CoffeeMaker {
    private int maxCapacity;
    private int capActually;

    public CoffeeMaker() {
    }

    public CoffeeMaker(int maxCapacity, int capActually) {
        this.maxCapacity = maxCapacity;
        this.capActually = capActually;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCapActually() {
        return capActually;
    }

    public void setCapActually(int capActually) {
        this.capActually = capActually;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" + "maxCapacity=" + maxCapacity + ", capActually=" + capActually + '}';
    }
    
    
}
