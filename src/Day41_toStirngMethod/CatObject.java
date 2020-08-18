package Day41_toStirngMethod;

import java.util.ArrayList;

public class CatObject {
    public static void main(String[] args) {

        Cat cat1 = new Cat ();
        cat1.setInfo("cass",1, 'F', "Black", "Persian");
        Cat cat2 = new Cat ();
        Cat cat3 = new Cat ();
        Cat cat4 = new Cat ();
        Cat cat5 = new Cat ();

        System.out.println(cat1); // hashcode verirdi eger cunku toString metod olmasaydi.yoksa print alamazsin.

        System.out.println("===============================================================================");

        Cat [] catpark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        catpark[1].setInfo("Puki",3,'M',"Orange","Abyssinian");
        catpark[2].setInfo("Miaw",1,'M',"White","Persian");
        catpark[3].setInfo("Reese",2,'F',"Gray","British Shorthair");
        catpark[4].setInfo("Yoyo",3,'F',"Brown and White","Siamese");
        catpark[5].setInfo("cici",3,'M',"White","Abyssinian");

            for (Cat each : catpark){
                System.out.println(each);
            }
        ArrayList<Cat> femaleCats = new ArrayList<>();
        ArrayList<Cat> maleCats = new ArrayList<>();
/*
        for (int i = 0; i <=catpark.length-1; i++){
            if (catpark[i].gender== 'M'){
                maleCats.add(catpark[i]);
            }else {
                femaleCats.add(catpark[i]);
            }
        }
       */
        for(Cat each : catpark){
            if(each.gender == 'M'){
                maleCats.add(each);
            }else{
                femaleCats.add(each);
            }
        }

        System.out.println(femaleCats);
        System.out.println(maleCats);


        }

    }

