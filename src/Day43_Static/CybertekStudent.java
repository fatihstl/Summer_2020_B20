package Day43_Static;


class A{
    static  int a = 200;
}
public class CybertekStudent {
    // for the advantages static

    String studentName;
    int age;
    char gender;

    static String schoolname= "Cybertek School";

    public static void getInfo(){ // ==> static metod
       //  System.out.println("Name: "+studentName); kabul etmez
    }

    public void getinfo1 (){ //instance metod hem static hem istance veriable kabil etti.
        System.out.println("Name: "+schoolname);
        System.out.println("School Name: "+ schoolname);
    }
        public static void printSchoolName (){ // ==> static method sadece statici kabul eder ve etti.
            System.out.println("School Name: "+ schoolname);
        }


}
