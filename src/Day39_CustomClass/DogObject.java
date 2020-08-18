package Day39_CustomClass;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        // once set sonra get yapiyoruz cunku diger
        dog1.setDogInfo("Sivan", "Beagle", "midium", 2, "mix");
        dog2.setDogInfo("Rofus", "Argentina", "Large", 1, "White");
        dog3.setDogInfo("Wiston", "Scott", "small", 1, "Black");

          dog1.getDogInfo();
          dog2.getDogInfo();
          dog3.getDogInfo();


          dog1.eat("kelle paca");
          dog3.eat("steak");
          dog2.eat("polo");





          dog3.drink("cola");
          dog1.drink("milk");
          dog2.drink("redbull");

          dog1.sleep("so much");
    }
}
