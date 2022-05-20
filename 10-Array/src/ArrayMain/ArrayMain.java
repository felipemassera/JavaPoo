package ArrayMain;

import ArrayClass.Array;
import Service.ArrayService;

public class ArrayMain {

    public static void main(String[] args) {
    
        ArrayService as = new ArrayService();
        Array a= as.newArray();
        
        //as.modify(a);
        as.modify2(a);
        as.show(a);
    }
    
}
