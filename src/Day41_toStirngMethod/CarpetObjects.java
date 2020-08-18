package Day41_toStirngMethod;

import java.util.ArrayList;

public class CarpetObjects {
    /* create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects
    ( make sure you set the instance variables of those objets)
     *
               create two ArrayList of carpets:
                                         persianCarpets
                                          reugularCarpets
                write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                       use for each loop to print out all the persian carpets */

    public static void main(String[] args) {

        Carpet [] carpet = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpet[0].customOrder(4.5, 3.5, 7.5, false);
        carpet[1].customOrder(5.5, 3.5, 18.5, true);
        carpet[2].customOrder(4.5, 5.5, 19.5, false);
        carpet[3].customOrder(3.5, 4.5, 20.5, true);
        carpet[4].customOrder(6.5, 5.5, 21.5, true);



        for (Carpet each : carpet){
            each.getCarpetInfo();
        }
        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpet = new ArrayList<>();

        for (int i = 0; i <= carpet.length; i++){
            if (carpet[i].isPersian){
                persianCarpets.add(carpet[i]);
            } else {
                regularCarpet.add(carpet[i]);
            }

        }
        System.out.println("Number of Persian carpets: "+ persianCarpets.size());
        System.out.println("Number of regular carpet: "+regularCarpet.size());
    }


}
