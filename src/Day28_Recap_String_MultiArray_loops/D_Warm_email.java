package Day28_Recap_String_MultiArray_loops;

public class D_Warm_email {
    public static void main(String[] args) {

       /* 3. write a program that can get the name and domain of any given email address
        Ex:
        cybertek@gmail.com
        output:
        name: cybertek */

      String email= "cybertekSchool@gmail.com";

      String name= email.substring(0, email.indexOf("@"));
      String domain= email.substring(email.indexOf("@")+1 , email.lastIndexOf("."));


       System.out.println(name);
       System.out.println(domain);

        int [] num1 =  new int[3];
        int [] num2= {1,2,3,4,5};
        num1=num2;

        for (int i = 0; i< num1.length; i++){
            System.out.println(num1[i]);
        }




    }


}
