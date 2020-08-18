package Day12_SwitchScanner;

public class E_switchDayinMonth {
    public static void main(String[] args) {

        // hangi aylar 30 , 21 28  // 2. ay subat  // 4,6,9,11 30 // 31-- 1,3,5,7,8,,10,12

        int  month = 10;

        switch(month){

            case 2 :
                System.out.println(" 28 day");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("30 days");
                break;

            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("31 days");
                break;
            default :
                System.out.println("invalid");
                break;
        }

    }
}
