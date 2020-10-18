package Day51_Exceptions.BrowsersTask;

public class OperaBrowser extends webDriver {

    public void get(String url) {
        System.out.println(" openning the "+ url+ " in opera browser");
    }


    public void close() {
        System.out.println(" closing  Opera browser");


    }
}
