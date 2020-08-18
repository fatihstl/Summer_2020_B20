package Day11_NestedIfSwich;

import org.w3c.dom.ls.LSOutput;

public class J_nestedHaftaningunleri {
    public static void main(String[] args) {

        int day = 8;
        boolean validNumner = day >= 1 && day <= 7;
        String result = "";

        if (validNumner) {
            if (day == 7) {
                result = "Sunday";
            } else if (day == 6) {
                result = "Saturday";
            } else if (day == 5) {
                result = "Friday";
            } else if (day == 4) {
                result = "thursday";
            } else if (day == 3) {
                result = "tuesday";
            } else {
                result = "monday";
            }

            String result1 = (day == 7) ? "Sunday" : (day == 6) ? "saturday" : (day == 5) ? "Friday" : "monday";

        }else {
            result = "Invalid";

        }
        System.out.println(result);



    }
}
