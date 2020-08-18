package Day27_Recap;

public class D_Max_Min_Arrays {
    public static void main(String[] args) {

        int [] score =  {80, 75 ,  65, 110, 90 , 45 , 56, 78};
         int max = score[0];
         int min = score[0];

         for (int each : score){
             if (each> max){
                 max= each;
             }
             if (each < min ){
                 min= each;
             }
         }

        System.out.println(min);
        System.out.println(max);


    }

}
