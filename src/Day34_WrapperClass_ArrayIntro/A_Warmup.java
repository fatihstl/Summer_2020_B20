package Day34_WrapperClass_ArrayIntro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A_Warmup {
    public static void main(String[] args) {

            // use the lacaldate & time  get the current date follwing format
        // Sinday , 10:28 AM, Jul/26/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now();
        System.out.println();

        System.out.println( today.format(dtf) );

    }

}
