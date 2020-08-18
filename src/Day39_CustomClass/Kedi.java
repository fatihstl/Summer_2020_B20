package Day39_CustomClass;

public class Kedi {

    String rengi;
    String cins;
    int yas;
    double fiyati;


        public void setInfoKedi(String kedininrengi, String kedinincinsi, int kedininyasi, double kedininfiyati){
    rengi = kedininrengi;
    cins= kedinincinsi;
    yas = kedininyasi;
    fiyati =  kedininfiyati;
        }

        public void getInfokedi (){
            System.out.println(rengi+" "+ cins+", " +yas+", " +fiyati);
        }

        public void kediyaz(){
            System.out.println(cins+ " kedileri cok pahalidir.");
        }
}