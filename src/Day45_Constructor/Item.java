package Day45_Constructor;


public class Item {




        String name;
        double unitPrice;
        int quantity;



    public Item (String name, double unitPrice, int quantity){// constroctor metod

            this.name = name;
            this.quantity = quantity;
            this.unitPrice = unitPrice;

    }

    public double calcost(){
        return unitPrice*quantity;
    }

    public String toString (){
        return "Name: "+name+ ", Unit Price: "+unitPrice+", Quantity"+quantity+", Total Price:  "+calcost();

    }


}
