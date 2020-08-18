package Day19_for_loop;

public class A_warmupTask {

    public static void main(String[] args) {

        // 1-write odd number 0-100  ayni zamanda 3 ve 5 bolunebilir olmasi lazim

       for (int i = 1; i <= 100; i += 2){ // burada odd yaptik tek sayilar
           if (i %5== 0 && i %3 ==0){ // burada bir alt kosul daha yaptik bu oddlar ayni zamainda 3 ve 5 bolunecek.
               System.out.print(i + " ");
           }
       }
       System.out.println();
       // 1- soru ikinci yol java yolu
          for (int i = 0; i <= 100; i++){
              if (i %2 != 0) {
                  if(i %5== 0 && i %3 ==0) {
                      System.out.print(i + " ");
                  }
              }
          }

        // 2-write even number 0-100  ayni zamanda 3 ve 5 bolunebilir olmasi lazim
        System.out.println();

     for (int i = 0; i<=100 ; i +=2){
         if(i %3 == 0 && i % 5 == 0){
             System.out.print(i + " ");
         }
     }
        System.out.println();
        // 2.sorunun ikinci yolu
        for (int i = 0 ; i<= 100; i++) {
            if( i % 2 ==0  ){
             if (i % 3 ==0 && i %5 ==0){
                 System.out.print(i+ " ");
             }
            }
        }


    }
}
