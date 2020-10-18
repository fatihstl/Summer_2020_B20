package Day51_Exceptions;
class X{
    public X(){
        System.out.println("X");
    }
}

class Y extends X{
    public Y(){
        System.out.println("Y");
    }

}
class Z extends Y{
    public Z(){
        //super();
        System.out.println("Z");
    }




}

public class practice {

    public static void main(String[] args) {

        System.out.println("");

    }
}
