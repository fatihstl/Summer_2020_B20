package Office_Hours;

public class day24_Unique_String {
    public static void main(String[] args) {


        // uniq stringi buluyoruz.
        String [] words = {"C#", "C#" , "payton", "payton", "java"};
              //     0     1        2         3        4

        for(String b: words){

            int count = 0;
            for(String a : words){
                if(a.equals(b)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(b);
            }

        }




    }
}
