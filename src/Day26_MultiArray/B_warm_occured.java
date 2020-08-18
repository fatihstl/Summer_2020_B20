package Day26_MultiArray;

import java.util.Arrays;

public class B_warm_occured {
    public static void main(String[] args) {
      /*  2. write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
        ex:
        input: I love Java, Python is cool
        output: 1 Java 1 Python
        input: Java Java Python Python Python
        output: 2 Java 3 Python*/

        String sentence = "I love Java, python is cool";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        int countJava = 0;
        int countPyton = 0;
        for (String each : words) {
            if (each.contains("Java")) {
                countJava++;
            }

        } //else if(each.contains())



        System.out.println(countJava);
    }

}
