package Office_Hours.practice_08_26_Classs;

import Library.Util;

public class methodCall {
    public static void main(String[] args) {

        double [] arr1 = {1.5, 0.5, 2.5, 6.5};

        practice2.printArray(arr1);

        String str = "AAABBBCCCDEEEEEEEBBBCC"; // ABCD

        String nonDup = "";
        for (int i = 0; i<= str.length()-1; i++){
            if(!nonDup.contains(""+str.charAt(i))){
            nonDup+= str.charAt(i);

            }
        }
        System.out.println(nonDup);

        String str2= "MMMMMNNNNNNNN";
        String nonDup2 = Util.removeDup(str2);
        System.out.println(nonDup2);
    }
}
