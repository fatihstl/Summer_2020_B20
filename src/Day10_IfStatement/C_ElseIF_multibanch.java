package Day10_IfStatement;

public class C_ElseIF_multibanch {
    public static void main(String[] args) {

  // Numaranin pozitif, negative ya da zero oldugunu buluyoruz.

        int num = 0;

        if (num >= 0){
            System.out.println(num+ " is pozitive");
        } else if (num<0 ){
            System.out.println(num+ " is negative");
        } else {
            System.out.println(num+ " is zero");
        }
    }

}
