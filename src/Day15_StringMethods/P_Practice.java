package Day15_StringMethods;

import java.util.Scanner;

public class P_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        System.out.println(sentence.charAt(0));

        int lastIndextNum = sentence.length() -1;
        System.out.println(lastIndextNum);

    }

}
