package Day29_custommethod;

public class C_method_withoutPrametre2 {

    public static void main(String[] args) {

        printHello5X();
        cano();
        cano();
        printHello5X();
        merhabaHayat();
    }

    public static void printHello5X() {

        for (int i = 0; i <= 4; i++) {
            System.out.println("Hello, ");
        }
    }

    public static void cano() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Sabir, ");
        }
           }

    public static void merhabaHayat (){
        for (int i = 0; i<= 4; i++){
            System.out.println("Hayirlisi Olsun");
        }
    }





}