package Day09_IfStatemnent;

public class A_WarmupTask1_2_3 {

    public static void main(String[] args) {

        // warmup one-1 alkol alip almayacagini if ile belirleyecegiz.
        //  SORU - 4 write a java program that can identify if a person is eligible to buy alcohol

             boolean hasID = true;
             int age = 19;
             boolean  eligible = hasID &&  age>= 21;
                      //          true && false

         String result = "";

             if (eligible== true ){

                // System.out.println("Eligible to buy alcohool");  // oyle de olur boyle de olur.
                 result = "Eligible to buy";
             }

            if (eligible== false ){
                //System.out.println("You cant buy alchool");
                result = " not Eligible to buy";
            }

        System.out.println(result);

    }




}
