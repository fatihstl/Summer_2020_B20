package Day20_whileLoop;

public class branchigStatement {
    public static void main(String[] args) {

       char ch = 'A';
       while (ch <= 'E'){
          if (ch == 'C'){ // c atladi.
              ch++;
          continue;
          }
           System.out.println(ch);
           ch++;
       }
    }
}
