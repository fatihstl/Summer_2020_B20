package Day19_for_loop;

public class N_breakstatement {

    public static void main(String[] args) {
    for (int i =  0; i <5 ; i++){
     System.out.println("Hello");
    break;
 }


      for (char ch = 'A'; ch<= 'H'; ch++){

         if (ch=='C'){
             break;
         }
          System.out.println(ch + " ");
          }

 // baska ornek
        for (int i = 10; i <= 50; i += 10){/// 10, 20, 30, 40 50 -5 kez yazmasi lazim
            System.out.print(i+ " ");
             if (i ==30){
                 break;
             }
        }
        System.out.println();

        // ornek baska
           for (int x = 1000; x>=100; x-= 100){
               if (x== 500){
                   break;
               }
               System.out.print(x+ " ");
           }


    }
}
