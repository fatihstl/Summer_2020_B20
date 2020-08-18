package Day23_Nestedloops_Arrays;

public class DE_Remove_Dublicate {

    public static void main(String[] args) {
        String str = "BBCCDD";
        String NonDup = "";

        for (int i = 0; i<= str.length()-1; i++){
            String ch =  ""+ str.charAt(i); // B B C C D D

          if (NonDup.contains(ch)){
              continue;
          }else
              NonDup+= ch;
        }
        System.out.println(NonDup);






    }


    }



