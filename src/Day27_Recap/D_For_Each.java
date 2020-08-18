package Day27_Recap;

public class D_For_Each {
    public static void main(String[] args) {

        int [] scores = {10, 20, 30 ,40, 50 ,60 , 70 , 80, 90, 100, 110};

        for ( int each : scores){

           if(each %3 != 0 ){
               continue;
           }

            System.out.print(each + " ");
        }

        System.out.println("=============================");

        String [] names = {"AB", "ABC", "A", "AB", "ABCD"};
        for (String each: names) {
            if (!each.contains("C")){
                continue;
            }
            System.out.print(each+ ",  ");
        }




    }
}
