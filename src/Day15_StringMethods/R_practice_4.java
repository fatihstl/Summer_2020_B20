package Day15_StringMethods;

public class R_practice_4 {
    public static void main(String[] args) {

        // adini soyadini yazip birlestirtikten buyuk harfe donusturme ornegi.
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter your first Name");
        String firstname = input.next();

        System.out.println("Enter your last Name");
        String lastName = input.next();

        String fullName=  firstname+ " "+lastName;
        fullName = fullName.toUpperCase();

        System.out.println(fullName); */

       //ornek diger yol
       /*Scanner input1 =  new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input1.next();

        System.out.println("Enter your surname: ");
       String surname=  input1.next();

        System.out.println(name.toUpperCase()+ " " + surname.toUpperCase());*/


       String str = " I like you";
       str = str.replace("like", "");///
        System.out.println(str);

    }

}
