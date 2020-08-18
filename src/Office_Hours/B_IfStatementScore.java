package Office_Hours;

public class B_IfStatementScore {
    public static void main(String[] args) {

        // soru-2

        int  score = 0;

        if (score == 0){
            score += 50;
        } if(score != 0)  {
            score += 50;
        } System.out.println(score);

           /// 3, soru
        char grade =  'A';
        boolean passed =  grade == 'A' || grade =='B';
                               // true              ==> true

        boolean passe2 = grade == 'C'|| grade == 'D';
                                //false || false  ==> false
        if (passed || passe2) {

            System.out.println("You passed the exam");
        } else{
            System.out.println("You failed");
        }
        // 4.soru

        boolean x = true;
        boolean  y =  !x ==false;
        boolean z = y;

        if (x){
            System.out.println("A");
        } else if (y){
            System.out.println("b");
        } else {
            System.out.println("c");
        }

    }
}
