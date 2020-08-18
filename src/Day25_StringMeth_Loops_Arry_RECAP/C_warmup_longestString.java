package Day25_StringMeth_Loops_Arry_RECAP;


public class C_warmup_longestString{
    public static void main(String[] args) {

      //  String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abuduljabar", "mamattursun"
                , "Gebremariam", "VasilicaPutulica"};

        int maxLength = arr[0].length();  //4
        //int maxLength = arr[0].length();

        for( String each : arr) {
          //  for (String each : arr) { // to find max length
                if (each.length() > maxLength) {
                    maxLength = each.length();
                }
            }

            System.out.println(maxLength);

            for (String each : arr) {
                if (each.length() == maxLength) {
                    System.out.println(each);
                }
            }


        }
        }



