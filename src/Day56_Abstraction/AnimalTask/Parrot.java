package Day56_Abstraction.AnimalTask;

public class Parrot  extends Animal implements Flyable, Playeble, Talkative{

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");

    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }


    @Override
    public void play() {
        System.out.println("Parrot is Playing");
    }

    @Override
    public void talk() {

    }
}
