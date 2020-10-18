package Day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {
    public Constructor(){
        System.out.println("No arg constructer");
    }
    public Constructor(int a ){ ;
        System.out.println("intli olan");
    }

    public Constructor (String a){
        System.out.println("String Argument");
    }

    public Constructor(int a, int b){
        System.out.println("2 argument");
    }

    public static void main(String[] args) {

        Constructor obj1 = new Constructor(10, 20);

      /*  ArrayList<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println(list2);  */

    }
}
