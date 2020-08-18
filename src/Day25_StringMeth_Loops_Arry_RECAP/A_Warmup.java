package Day25_StringMeth_Loops_Arry_RECAP;

public class A_Warmup {
    public static void main(String[] args) {
        //  1. Write a program that can return the longest string of text from a String array

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int minLength = arr[0].length(); //3

        for (int i = 0; i <= arr.length - 1; i++) {  // to find out the minimum lenght of the string in arr
            int l = arr[i].length();  // 4  8   4  8

            if (l < minLength) {
                minLength = l;
            }
        }


        for (int i = 0; i <= arr.length - 1; i++) {  // to see how many strings' lengths in the array is matching with minLength
            if (arr[i].length() == minLength) {
                System.out.println(arr[i]);


            }


        }

    }
}