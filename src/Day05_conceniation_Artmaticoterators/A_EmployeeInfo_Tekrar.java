package Day05_conceniation_Artmaticoterators;

public class A_EmployeeInfo_Tekrar {

    public static void main(String[] args) {
        // Ornek 1- ilk print statement cok onemli.
        String firstName = "John";
        String lastName = "Daniel";
        int hisAge = 34;
        char gender = 'M';
        String companyName = "CapitolOme";
        String jobTitle = "SDET";
        boolean isFultime = true;
        boolean isMarried = false;
        double salary = 120_000.50;

        System.out.println("Full Name : " + firstName + " " +  lastName);
        System.out.println(firstName+ " "+ lastName+ " Cinsiyeti : "+ gender);
        System.out.println(firstName+ " "+ lastName+ " age : " + hisAge+ " years old");
        System.out.println(firstName+ " "+ lastName+" works at : " + companyName );
        System.out.println(firstName+ " " + lastName+ " job Title : "+ jobTitle);
        System.out.println(firstName+ " " + lastName+ "Salary: $" + salary );
        System.out.println(firstName + "  "  + lastName+ "is Full Time " + isFultime);
        System.out.println(firstName+ " "+ lastName+ "is married " + isMarried);


    }
}
