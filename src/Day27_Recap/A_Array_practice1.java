package Day27_Recap;

import org.w3c.dom.ls.LSOutput;

public class A_Array_practice1 {
    public static void main(String[] args) {

        String[] names = {"Aaliya", "Nurbiye", "Ayse"};
        // 0         1          2

        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);

            if (!names[i].startsWith("A")) {
                continue;
            }
            System.out.println(names[i]);

        }


    }
            }


