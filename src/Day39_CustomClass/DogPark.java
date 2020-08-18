package Day39_CustomClass;

public class DogPark {

    public static void main(String[] args) {

        Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        //                 0         1          2          3          4     indexleri

        dogPark[0].setDogInfo(" Karaoglan", " german", " midium ", 6, " brown");
        dogPark[1].setDogInfo(" cano", " pit", "ium ", 6, " brown");
        dogPark[2].setDogInfo(" bano", " german", " midium ", 6, " brown");
        dogPark[3].setDogInfo(" kano", " german", " midium ", 6, " brown");
        dogPark[4].setDogInfo(" pasa", "erman", " midium ", 6, " brown");

        for (int i = 0; i <= dogPark.length - 1; i++) {
            dogPark[i].getDogInfo();
        }
        System.out.println("==========================================");

        for(Dog eachDog : dogPark ){
            eachDog.getDogInfo();
        }

        System.out.println("====================================================");
        String food = "treats";
        for (Dog eachDog : dogPark){
            eachDog.eat(food);
        }


        System.out.println("=====================================================");
        String drink = "milk";
        for (Dog eachDog : dogPark){
            eachDog.drink(drink);
        }


        System.out.println("====================================================");
        // play
        String play = "playing";
        for(Dog eachDog: dogPark) {
            eachDog.play(play);
        }





        System.out.println("====================================================");
        // sleep
        // sleep


    }
}