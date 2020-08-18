package Day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class F_Times {
    public static void main(String[] args) {


       LocalTime t1=  LocalTime.of(23, 59, 43);
        System.out.println(t1);


        LocalTime t2= LocalTime.now();
        System.out.println(t2);



    }
}
