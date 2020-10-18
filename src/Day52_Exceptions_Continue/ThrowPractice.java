package Day52_Exceptions_Continue;

import java.time.LocalTime;

public class ThrowPractice {
    public static void main(String[] args) {

        String driverName = "chrome";


        if (driverName.equalsIgnoreCase("chrome")){
            System.out.println("set up chrome");
        }else if (driverName.equalsIgnoreCase("firefox")){
            System.out.println("set up firefox");
        }else if (driverName.equalsIgnoreCase("opera")){
            System.out.println("set up opera");
        }else {
            throw new RuntimeException("Invalid browser name");
        }


        System.out.println("==================================================================");
        if(LocalTime.now().getMinute()== 45){
            throw new RuntimeException("It is break time");
        }else  {
            System.out.println("continue");
        }



    }
}
