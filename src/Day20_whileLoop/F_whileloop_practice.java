package Day20_whileLoop;

public class F_whileloop_practice {
    public static void main(String[] args) {
  // ornek 1
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
            System.out.println();
     // ornek 2
            int num1 = 1;
            while (num1 <= 5) {
                System.out.print("Fatih, ");
                num1++;
            }
            System.out.println();

            // ornek 3 while tersine cevirmrk
            String str = "Cybertek";
            String result = "";
            int i = str.length()- 1;
            while (i >= 0) {
                result += str.charAt(i);
                i--;
            }
            System.out.print(result);
        }
    }
