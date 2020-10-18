package Day51_Exceptions.BrowsersTask;

public class FireFoxBrowser extends webDriver{
    public void get(String url) {
        System.out.println("openning the"+url+"in firefox browser");
    }


    public void close() {
        System.out.println("closing firefox browser");

    }
}
