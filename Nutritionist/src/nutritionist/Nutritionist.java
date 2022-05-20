/*
 A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package nutritionist;

import Class.PersonClass;
import Service.PersonService;

/**
 *
 * @author Felipe
 */
public class Nutritionist {

    public static void main(String[] args) {
        boolean ok=false;
        double aux = 0;
        int imc = 999;
        double less = 0;
        double normal = 0;
        double height = 0;
        PersonService ps = new PersonService();
        PersonClass p1 = ps.newPerson();
        PersonClass p2 = ps.newPerson();
        PersonClass p3 = ps.newPerson();
        PersonClass p4 = ps.newPerson();

        for (int i = 1; i < 2; i++) {
            switch (i) {
                case 1:
                    imc = ps.IMC(p1);
                    ok = ps.legacyAge(p1);
                    
                    break;
              case 2:
                    imc = ps.IMC(p2);
                    ok = ps.legacyAge(p2);
                    break;
                case 3:
                    imc = ps.IMC(p3);
                    ok = ps.legacyAge(p3);
                    break;
                case 4:
                    imc = ps.IMC(p4);
                    ok = ps.legacyAge(p4);
                    break;
                            
            }
            if (ok) {
                System.out.println(ok);
                aux++;
            }
            switch (imc) {
                case -1:
                    less++;
                    break;
                case 0:
                    normal++;
                    break;
                case 1:
                    height++;
                    break;
            }
        }
        System.out.println("Plus 18: "+ (aux/4)*100+"%");
        System.out.println("Less 18: "+ ((4-aux)/4)*100+"%");
        System.out.println("Less weight : "+ (less/4)*100+"%");
        System.out.println("Normal weight: "+ (normal/4)*100+"%");
        System.out.println("Over weight: "+ (height/4)*100+"%");
    }
}
