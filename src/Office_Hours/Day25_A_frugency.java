package Office_Hours;

public class Day25_A_frugency {

    public static void main(String[] args) {
        /// catcatcat

        String str = "cat cat cat Cat Cat".toLowerCase(); // to lowe case buyuk ve kucuk harf icin kullandim.
        int count = 0;


        while (str.contains("cat")){
            count++;
           str=  str.replaceFirst("cat", "");

        }
        System.out.println(count);

    }
}
