package Day12_SwitchScanner;

public class B_warmup_Nestedif {

    public static void main(String[] args) {

      /*  /*2. write a program that can define the age groups of a person
        age groups are:
        Teenager (< 21)
        Adult   (>=21 && <55 )
        Senior  ( > 55 )
        age cannot be negative or greater than 150
        NOTE: MUST APPLY NESTED IF*/

       int age = 35;

        String ageGroup = "";
        if (age > 0 && age <= 150){
            if(age> 0 && age <21){
               ageGroup = "Teeneger";
            } else if (age >= 21 &&  age <=55 ) {
               ageGroup = "adult";
            } else {
                ageGroup = "senior";
            }
          //  bunu ternary de yapabilirdim

            //String ageGroup = (age> 0 && age <21) ? " Teeneger" :(age >= 21 &&  age <=55) ? "adult" : "Senior";
       }else{

           ageGroup = "invalid";
        }
        System.out.println(ageGroup);


    }
}
