package Day44_Constracter;

import java.util.concurrent.Callable;

public class ConstructorIntro {

    public ConstructorIntro(String a ){
        System.out.println("Hello "+ a);

    }


    public static void main(String[] args) {

       // ConstructorIntro obj = new ConstructorIntro(10); // bunu uretmen lazim

        ConstructorIntro obj3 = new ConstructorIntro("Muhtar");
        ConstructorIntro obj4 = new ConstructorIntro("Davut");
        ConstructorIntro obj5 = new ConstructorIntro("Zeliha");
    }

}
