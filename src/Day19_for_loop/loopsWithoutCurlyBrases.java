package Day19_for_loop;

public class loopsWithoutCurlyBrases {
    public static void main(String[] args) {
      for (int i = 5 ; i <10 ; i++) {
          System.out.println("Hello");
          System.out.println("How are you");
      }
        System.out.println();

      // {} killanmazsak  5 hello yazar 1 how are you yazar,
        for (int i = 5 ; i <10 ; i++)
            System.out.println("Hello");
            System.out.println("How are you");
    }
}
