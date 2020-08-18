package Day29_custommethod;

public class A_Warm_Uniq {
    public static void main(String[] args) {

        /*1.  Write a program that can print out the unique values from a String Array
        Ex:
        if arr -> {"A", "A", "B", "C", "C"}
        output: B
        if arr -> {"A", "B", "B", "C"}
        output:  A
                C
        MUST use for each loop*/

        String[] arr = {"A", "B", "B", "C", "D", "E", "F"};

        for( String a: arr){ // gets each of the element

            int count = 0;
            for( String each: arr ){ // gets the frequency of the element
                if( a.equals(each) ){
                    count++;
                }
            }

            if(count == 1){ // unique
                System.out.print(a+" ");
            }

        }








    }



}
