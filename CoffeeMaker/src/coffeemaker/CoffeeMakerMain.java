package coffeemaker;

import Class.CoffeeMaker;
import Service.CoffeeMakerService;
import java.util.Scanner;

public class CoffeeMakerMain {

    @SuppressWarnings("empty-statement")

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        CoffeeMakerService cs = new CoffeeMakerService();
        CoffeeMaker c1 = cs.Nespresso();
        
        
        boolean ok = false;
        int option;
        int option1;

        System.out.println("Nespresso CoffeeMaker");
        do {
            System.out.println("     Menu :" + "\n"
                    + "1) Charge the CoffeeMaker" + "\n"
                    + "2) Charge the Coffee" + "\n"
                    + "3) Cup Volume" + "\n"
                    + "4) Empty the CoffeeMaker" + "\n"
                    + "5)Exit");
            option = read.nextInt();
            switch (option) {
                case 1:
                    cs.Charge(c1);
                    break;
                case 2:
                    ok=cs.ChargeCoffee(c1, ok);
                    break;
                case 3://cup volume
                    
                    if (ok) {
                        do {
                            System.out.println("How CUP choose?" + "\n"
                                    + "    1)Expresso cup (60ml)" + "\n"
                                    + "    2)Medium (125ml)" + "\n"
                                    + "    3)Large (250ml)" + "\n"
                                    + "    4)XLarge (300ml)" + "\n"
                                    + "    5)Exit" + "\n");
                            option1 = read.nextInt();
                            switch (option1) {
                                case 1:
                                    cs.fillCup(c1, 60);
                                    break;
                                case 2:
                                    cs.fillCup(c1, 125);
                                    break;
                                case 3:
                                    cs.fillCup(c1, 250);
                                    break;
                                case 4:
                                    cs.fillCup(c1, 300);
                                    break;
                                case 5:
                                    System.out.println("Exit");
                                    break;
                                default:
                                    System.out.println("Number Error");
                                }
                        } while (option1 != 5);
                    } else {
                        System.out.println("No coffee Charge in Nesspreso");
                    }
                    break;
                case 4:
                    cs.Empty(c1);
                    break;
                case 5:
                    System.out.println("GoodLuck and have good day! :) ");
                    break;
                default:
                    System.out.println("Number Error");
            }
        } while (5 != option);
    }
}
