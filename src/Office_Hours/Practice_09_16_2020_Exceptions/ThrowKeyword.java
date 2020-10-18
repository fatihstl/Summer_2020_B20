package Office_Hours.Practice_09_16_2020_Exceptions;

public class ThrowKeyword {
    public static void main(String[] args) {

        String browser= "cybertek";

        if (!browser.equalsIgnoreCase("chrome")){
            throw new RuntimeException(" There is no such browser"+ browser);
        }
        System.out.println("Test started on: "+browser+ " browser");

    }

    public void method1  () throws  CloneNotSupportedException{
        throw  new CloneNotSupportedException();
    }


    public void method2  () throws  CloneNotSupportedException{
        throw  new CloneNotSupportedException();
    }

    public void method3() throws Exception{
        method3();
    }
}
