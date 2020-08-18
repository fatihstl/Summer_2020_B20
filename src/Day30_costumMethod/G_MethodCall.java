package Day30_costumMethod;
import Library.Util;
public class G_MethodCall {
    public static void main(String[] args) {

          // dublicate yaptik.
           String str= "aasbbbcccdddefc";

           String str2 = Util.removeDup(str);
           System.out.println(str2);


           // reverse yapacagiz.
        String str3 = Util.reverse(str);
        System.out.println(str3);


        String str4 = "Fatih";
        String str5= Util.reverse(str4);
        System.out.println(str5);





    }

}
