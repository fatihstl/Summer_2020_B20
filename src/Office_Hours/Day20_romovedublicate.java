package Office_Hours;

import java.util.Scanner;

public class Day20_romovedublicate {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        //String str = scan.nextLine();
        String str = "nalan";
        String  result = "";
        for (int i = 0 ; i <= str.length()-1; i++){
            String s = ""+str.charAt(i); // s: n a l a n
            if (result.contains(s)){
                continue;
            }else{
                result +=s;
            }
        }
        System.out.println(result);
    }
}
