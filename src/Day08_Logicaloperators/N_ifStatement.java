package Day08_Logicaloperators;

public class N_ifStatement {

    public static void main(String[] args) {
        // ucgen ornegi  180 olmasi gekekir valid or unvalid yapacagiz.

        double angel1= 100;
        double angel2 = 60;
        double angel3 = 20;

        boolean valid = angel1 + angel2 + angel3 == 180;
        boolean invalid= !valid;

        if (valid){
            System.out.println("Valid Triangle");

        }

        if (invalid){

            System.out.println("Invalid Triangle");

        }





    }

}
