package Office_Hours.Practice_09_16_2020_Exceptions;

public class ThrowsKeyword  {

    public static void main(String[] args) {
        ThrowsKeyword obj = new ThrowsKeyword();
      try{
        obj.MethodA();} catch (InterruptedException e){

      }

    }

    public void MethodA () throws InterruptedException{// declared that method throws an expections

        Thread.sleep(3000);
    }
    public void MethodB () throws InterruptedException{
        MethodA();
    }
}
