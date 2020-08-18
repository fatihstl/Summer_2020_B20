package Day11_NestedIfSwich;

public class H_NEsstedif_practice {

    public static void main(String[] args) {

        /// precondition: minumum salaray 30K
        // subcondition minumum 2 years.

        double salary = 100_000;
        int minumumyearsjob= 3;
        String  result1 = "";


        if (salary > 30_000) {
            if (minumumyearsjob >= 2) {
                result1 = "eligible";
            } else {
                result1 = " you must have at least 2 years";
            }
        }
        else {
            result1 = "You must learn at least 30K";
        }
        System.out.println(result1);

    }
}
