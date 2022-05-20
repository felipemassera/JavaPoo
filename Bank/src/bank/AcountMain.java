package bank;

import Class.AcountClass;
import Service.AcountService;
import java.util.Scanner;

public class AcountMain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        AcountService as = new AcountService();
        AcountClass a1 = as.newAcount();
        int menu = 0;
        
        do {
            do {
                System.out.println("AutomaticBank");
                System.out.println("Choice your option");
                System.out.println("1)Insert cash" + "\n"
                        + "2)withdraw cash" + "\n"
                        + "3)quickly withdraw cash" + "\n"
                        + "4)Check Balance" + "\n"
                        + "5)Check data" + "\n"
                        + "6)Exit");
                menu = read.nextInt();
                
            } while (menu > 6 && menu < 1);
            switch (menu) {
                case 1:
                    as.insertCash(a1);
                    break;
                case 2:
                    as.cashOut(a1);
                    break;
                case 3:
                    as.quickCashOut(a1);
                    break;
                case 4:
                    as.checkBalance(a1);
                    break;
                case 5:
                    as.checkAcount(a1);
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
            }
        } while (menu != 6);
    }
    
}
