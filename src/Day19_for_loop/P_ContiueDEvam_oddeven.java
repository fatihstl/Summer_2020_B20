package Day19_for_loop;

public class P_ContiueDEvam_oddeven {

    public static void main(String[] args) {

       // 3. print odd numbers between 1 to 50
       // 4. print even number between 1 to 50

         ///// 3. soru odd ornegi odddlari skip even numberlari yazar.
        for (int i = 1; i <=50 ; i++) {
            if(i%2 !=0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        ///// oddd numberlari yazdir evenleri skip
        for (int i = 0; i <=50 ; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
