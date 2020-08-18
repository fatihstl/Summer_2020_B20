package Day41_toStirngMethod;
//armup tasks:
//    1. create a custom class for the Carpet class that should contain the following:
//
//                instance variables:
//                        width, length, unitPrice, isPersian (boolean)
//                instance methods:
//                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
//                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
//                        getCarpetInfo(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
//            total price of carpet= (width*length)*unitprice
//            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
//

public class Carpet {
     double width;
     double length;
     double unitPrice;
     boolean isPersian;
// 1. metodumuzu olusturduk
     public void customOrder (double width, double length, double unitPrice, boolean isPersian){
         this. width= width;
         this.length= length;
         this.unitPrice = unitPrice;
         this.isPersian= isPersian;

     }


     public double calcCost (){

         double totalPrice = (width*length)*unitPrice; // bunu hoca verdi.

         if(isPersian){
             totalPrice+= 200;
         }
         return totalPrice;
     }


     public void getCarpetInfo(){
         System.out.println("=============================");
         System.out.println("with: "+width);
         System.out.println("length: " +length);
         System.out.println("Unit Price: "+unitPrice);
         System.out.println("Persian carpet: "+isPersian);
         System.out.println("Total Price "+calcCost());

         System.out.println("=============================");




     }

}
