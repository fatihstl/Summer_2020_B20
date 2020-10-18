package Day56_Abstraction.AnimalTask;

public class Cat extends Animal implements Playeble {



    @Override
    public void play() {

    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping" );
    }


}
