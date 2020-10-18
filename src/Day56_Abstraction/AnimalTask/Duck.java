package Day56_Abstraction.AnimalTask;

 public class Duck extends Animal implements Swimmable, Flyable, Playeble{

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is sleeping");

    }

    @Override
    public void swim() {
        System.out.println("Duck is swim");
    }


    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void play() {
        System.out.println("Duck is playing");
    }
}
