package Day51_Exceptions;

public class ExceptionsPractice {
    public static void main(String[] args) {

        System.out.println("Hello ");


        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }


        System.out.println("World");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

        System.out.println("How are you?");
    }

    public static void sleep (int seconds){

                try {
            Thread.sleep(seconds * 10000);
        }catch (InterruptedException e ){

        }





    }
}
