package Day40_CustomMethod_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class Offerjob {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(100000,"VA", true, true, "SDET", true);

        offer2.setOfferInfo(125_000,"VA", true, true, "SDET", true);

        offer1.setOfferInfo(175_000,"VA", true, true, "SDET", true);

        offer2.setOfferInfo(125_000,"VA", true, true, "SDET", true);

        offer1.setOfferInfo(100000,"VA", true, true, "SDET", true);
        offer2.setOfferInfo(130_000,"VA", true, true, "SDET", true);
        offer1.setOfferInfo(150_000,"VA", true, true, "SDET", true);

        ArrayList<Offer> jobOffers = new ArrayList<>();
         jobOffers.addAll(Arrays.asList(offer1,offer2, offer3, offer4, offer5, offer6, offer7));

         for (Offer eachOffer : jobOffers){
             eachOffer.getOfferInfo();
         }
        // simdi bazilarini kaldiracagiz
      //  jobOffers.removeIf(p->p.salary<120_000);
      //  System.out.println("Number of offers: "+jobOffers.size());

        // 120 den asagi 120 bin ve virginiaadan az ise
       // jobOffers.removeIf(p->p.salary<120_000 || !p.state.equals("VA"));
      //  System.out.println("Number of Offers: "+jobOffers.size());


        //  does not have PTO or does not have benefit or is not full time, or less than 120k
        jobOffers.removeIf( p -> p.hapPTO == false || p.hasBenefit == false || p.isFullTime == false || p.salary < 120000);
        System.out.println("Number of Offers: "+jobOffers.size());

    }
}
