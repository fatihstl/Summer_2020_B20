package Day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class H_timeFormatting {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2020,7,25);

        System.out.println(ld);

        // datatime formater
        /// istedigin sekilde veriyor.
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(ld.format(dateFormat));



        // local time duzenliyoruz.formater ile
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime now = LocalTime.now();

        System.out.println(now);
        System.out.println(now.format(timeFormat));

        // May/20/2019 Dayname 4:30 pm
        // May/20/19 Dayname 4:30 pm
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019, 5, 20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println(  LocalDateTime.now().format(DTFormat)  );


        // Saturday 4:34:45 pm
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now);

        System.out.println(Now.format(dtf));


    }
}
