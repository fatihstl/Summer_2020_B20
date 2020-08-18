package Day41_toStirngMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObject2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat ();
        cat1.setInfo("cass",1, 'F', "Black", "Persian");

        Cat [] catpark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};


        catpark[1].setInfo("Puki",3,'M',"Orange","Abyssinian");
        catpark[2].setInfo("Miaw",1,'M',"White","Persian");
        catpark[3].setInfo("Reese",2,'F',"Gray","British Shorthair");
        catpark[4].setInfo("Yoyo",3,'F',"Brown and White","Siamese");
        catpark[5].setInfo("cici",3,'M',"White","Abyssinian");


        ArrayList<Cat>femaleCats = new ArrayList<>();
        femaleCats.addAll(Arrays.asList(catpark));
        femaleCats.removeIf(p->p.gender=='M'); // fameleri istiyoruz.

        ArrayList<Cat>maleCats = new ArrayList<>();
        maleCats.addAll(Arrays.asList(catpark));
        maleCats.removeAll(femaleCats);

        System.out.println("Number of Famele Cats: "+ femaleCats);
        System.out.println(("Number of Male Cats: "+maleCats));


    }
}
