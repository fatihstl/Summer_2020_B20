package Day31_Recap;

import Library.Util;
public class D_FregOfCharacter {

    public static void main(String[] args) {
        String str= "AABBCCC";
        String ecpectedREsult= "";
        String nonDup= Util.removeDup(str);

      /*  for (char each : str.toCharArray()){
            int count1 = Util.frequency(str,each);
            ecpectedREsult+= ""+each+count1;
        }*/

        for (int i = 0; i <= nonDup.length()-1; i++){

            char ch1 = nonDup.charAt(i);
            int count1 = Util.frequency(str,ch1);
            ecpectedREsult+= ""+ch1+ count1;
        }

        System.out.println(ecpectedREsult);


        System.out.println("=======================================================");

        String str2 = "wwweeeeerrrrrrrrrttttttttyyyyyyyuuuuuu";

        String expectedResult2 = frequencyOfChars(str2);

        System.out.println(expectedResult2);


    }


    public static String frequencyOfChars(String str){

        String expectedResult = "";
        String nonDup =    Util.removeDup(str);

        for(char each : nonDup.toCharArray() ){
            int count1 = Util.frequency(str, each);
            expectedResult +=   ""+ each + count1;
        }

        return expectedResult;
    }








}
