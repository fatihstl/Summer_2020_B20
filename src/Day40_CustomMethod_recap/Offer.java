package Day40_CustomMethod_recap;
       /*Offer
        Attribute:
        salary, Location, hasPTO, isFullTime, WFH, jobTitle, benifit
        Actions:
        setOfferInfo
        getOfferInfo
        MUST use this keyword */

public class Offer {

    double salary;
    String state;
    boolean hapPTO;
    boolean isFullTime;
    boolean isWFH;
    String jobtitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary, String state, boolean hapPTO, boolean isFullTime, String jobtitle, boolean hasBenefit){
        this.salary= salary;
        this.state= state;
        this.hapPTO=hapPTO;
        this.isFullTime= isFullTime;
        this.isWFH= isFullTime;
        this.jobtitle= jobtitle;
        this.hasBenefit= hasBenefit;
    }
//
    public void getOfferInfo(){
        System.out.println("===================================");
        System.out.println("Salaray: "+salary);
        System.out.println("JobTitle: "+jobtitle);
        System.out.println("Location: "+state);
        System.out.println("=====================================");
    }


}
