package Day11_NestedIfSwich;

public class B_taskb {
    public static void main(String[] args) {
        //     2. write a program that can find the number of days in a month
        //        (Assume that Feb has 28 days)
        // subat : 2  30: 4. 6. 9. 11 ay     31: 3,5,7, 8, 10 ,12.


        int month = 11;
        boolean day28 = month == 2; // subat icin
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean invalid = month < 1 || month > 12;
        String result = "";

        if (day28) {
            result = "28 Days";

        } else if (days30) {

            result = " 30 days";
        } else if (invalid) {
            result = "Invalid";
        } else {

        }

        System.out.println(result);

        boolean ali = true;
        boolean b = false;

        if (ali){
            System.out.println("hello");
        }
               if (b){
                   System.out.println("bele");
               }
    }
}