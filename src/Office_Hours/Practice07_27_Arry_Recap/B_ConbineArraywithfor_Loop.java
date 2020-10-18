package Office_Hours.Practice07_27_Arry_Recap;

import java.util.Arrays;

public class B_ConbineArraywithfor_Loop
{

    public static void main(String[] args) {


        char [] a1= {'A' , 'B', 'C', 'D'};// 4 tane
        char [] a2= {'D', 'E', 'F'}; // 3 aded


        char [] a3= new char[a1.length+a2.length]; // yukaridakilerden hepsi



        int index = 0;
        for (int i = 0; i<= a1.length-1; i++){
         a3[index]= a1[i];
         index++;
        }
         for (int j = 0; j<= a2.length-1; j++){
             a3[index] = a2[j];
             index++;
        }


        System.out.println((Arrays.toString(a3))); // ikisini a3 ile birlestirdik.






    }







}
