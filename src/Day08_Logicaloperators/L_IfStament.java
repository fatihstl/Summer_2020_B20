package Day08_Logicaloperators;

public class L_IfStament {
    public static void main(String[] args) {

        int a = 100;
        int b = 100;


        if (a > b ) {

            System.out.println(a+ " is larger number");
        }

        if ( b> a ){

            System.out.println(b+ "is the larger number");
        }
        if (a == b){

            System.out.println(" both are equal");
        }


        // ORNEK ikinci ornek sadece
        boolean breakTime = true;

        if (breakTime== true) {
            System.out.println("Take a break");
        }

        if (breakTime == false)    {
            System.out.println("NO time");

        }

          // ORNEK -3
        boolean Corona= true;

        if (Corona) {

            System.out.println("Buy toilet paper");
            System.out.println("Stay away from people");
            System.out.println("Stay at home");

        }

    }

}
