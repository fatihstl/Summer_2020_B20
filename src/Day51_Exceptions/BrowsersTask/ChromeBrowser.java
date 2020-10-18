package Day51_Exceptions.BrowsersTask;

public class ChromeBrowser extends webDriver {

  /*
  get (url), close
   */

  public void get (String url){
      System.out.println("openning the"+url+"in firefox browser");
  }

    public void close() {
        System.out.println("closing Chrome browser");

    }

}
