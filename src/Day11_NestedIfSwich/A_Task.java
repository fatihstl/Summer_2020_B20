package Day11_NestedIfSwich;

public class A_Task {

    public static void main(String[] args) {


        // write a java program that can convert numbers
        // between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid


        int num = 3;
        String result = "";

        if (num== 0) {
            result = "zero";
        }
        else if (num == 1)
        {
            result = "One";
        } else if (num == 2) {
            result = "two";
        } else if (num == 3)
        {
            result = "There";
        } else if (num== 4){

            result = "four";
        }
        else if (num== 5){

            result = "seven";
        }
        else if (num==6){
            result = "six";
        }
        else if (num ==7){
            result = "seven";

        }
        else if (num==8){
            result = "eight";
        }
        else if (num==9){
            result = "nine";
        }
   else {

            result = "invalid";
        }

        System.out.println(result);


}
}
