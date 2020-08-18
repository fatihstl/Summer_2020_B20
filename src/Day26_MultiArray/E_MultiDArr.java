package Day26_MultiArray;

public class E_MultiDArr {
    public static void main(String[] args) {

        int [] [] scores = {{10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48 , 125, 135}};

        for (int [] each1DArray: scores){
            for (int eachElement : each1DArray)
            if (eachElement %3 == 0 || eachElement %5 == 0) {
                System.out.print(eachElement+ " ");
            }
        }
    }
}
