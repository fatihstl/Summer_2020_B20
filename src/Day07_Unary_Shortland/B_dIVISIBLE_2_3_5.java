package Day07_Unary_Shortland;

public class B_dIVISIBLE_2_3_5 {

    public static void main(String[] args) {

        // ornek =  input: 65;

        //output
        //  65 is divisible by 2: false
        //  65 is divisible by 3: false
        //  65 is divisible by 5: true

        int number = 65;

        boolean  divisbleby2 = number % 2 ==0;
        boolean   divisbleny3 = number % 3 ==0;
        boolean divisble5  = number % 5==0;

        System.out.println( number + "is eventl divisble by 2 "+  divisbleby2);
        System.out.println( number + "is eventl divisble by 3 "+  divisbleny3);
        System.out.println( number + "is eventl divisble by 5 "+divisble5 );



    }

}
