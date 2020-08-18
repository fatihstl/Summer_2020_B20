package Day19_for_loop;

public class R_continues {
    public static void main(String[] args) {

        // birinci ornek
        for(int i= 1; i<=5 ; i++){
            if( i == 3){
             continue;  // jumps to the next iteration
            }
       System.out.print(i+" "); // 1  2  4 5
        }
        System.out.println();


        // ikinci ornek
        for(char ch = 'A'; ch <= 'F'; ch++){ // ch: A B C D E F

            if(ch == 'C' || ch == 'F') {
                continue;
            }
            System.out.print(ch +" ");

        }

    }
}
