package Day23_Nestedloops_Arrays;

import java.util.Scanner;

public class D_freguency_Intewiew {
    public static void main(String[] args) {

      /*  3. write a prgram that can return the frequency of every single characters from the string:
        ex:
        str1 = "aabbccaa";
        output: a4b2c2
        HINT:
        easier approach:
        1. remove duplicates ==> str2 = "abc"
        2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
        3. result: a4b2c2
        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
        Collapse
        :+1:
        8
:heavy_check_mark:*/
        // her karakterden kac kez var ona bakiyoruz.
     //   Scanner scan = new Scanner(System.in);
        //String str = scan.next();


        String str =  "BBCCDD";

        String nonDup = "";  //"BCD"
        // ab

       for(int i =0; i <= str.length()-1; i++) {  // remove duplciates from str and added to nonDup
            String ch = ""+ str.charAt(i);   // B, B, C, C, D, D

              if(nonDup.contains(ch)){
                continue;

              }else{
            nonDup += ch;
             }

            }

            String expectedResult = "";    //"B2C2D2"

            // str = "BBCCDD"      nonDup = "BCD"    ===> "B2C2D2"

            for (int j = 0; j <= nonDup.length() - 1; j++) { // iterates the string nonDup

                char ch = nonDup.charAt(j);  // B, C, D   every single characters from nonDup
                int count = 0; // 2,  2,   2    frequnecy of every single ch

                for (int i = 0; i <= str.length() - 1; i++) {  // returns the frequnecy of each ch from string str
                    if (str.charAt(i) == ch) {
                        count++;
                    }
                }

                expectedResult += "" + ch + count;

            }


            System.out.println(expectedResult);


        }
                    }

