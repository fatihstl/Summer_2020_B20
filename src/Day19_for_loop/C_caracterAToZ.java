package Day19_for_loop;

public class C_caracterAToZ {
    public static void main(String[] args) {
       // 5. Write a program that will print out all letters in English alphabet in ascending order

                  // buyuk harflerin asci table de buluyoruz. A- Z

        for (char ch = 'A' ; ch <= 'Z' ; ch++ ){
            System.out.print(ch+ " ");
        }
        System.out.println();
         // ikinci yol
        for (int i = 65 ; i<=90; i++){
            char ch =(char)i;
            System.out.print(ch+ " ");
        }
        System.out.println();

        // 6.soru buyuk harfler Z den A ya
        // 6. Write a program that will print out all letters in English alphabet in descedning order

        for (char ch = 'Z' ; ch> 'A' ; ch--){
            System.out.print(ch+ " ");
        }
        // ikinci yol
        System.out.println();// printden sonra yaziyoruz ki karisiklik olmasin
        for (int i = 90 ; i >= 65; i--){
            System.out.print((char)i+ " ");
        }
    }
}
