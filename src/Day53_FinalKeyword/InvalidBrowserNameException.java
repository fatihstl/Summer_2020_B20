package Day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException {
    public InvalidBrowserNameException() {
        super("Invalid Browser Name");

    }
           public InvalidBrowserNameException(String name) {

    }
}

class Test2 {
    public static void main(String[] args) {
        String name = "cybertek";

        switch (name.toLowerCase()) {
            case "chrome":
                System.out.println("Chrome is selected");
                break;

            case "firefox":
                System.out.println(" Firefox is selcted");

            case "safari":
                System.out.println("Safari is selected");
                break;

            default:
                throw new InvalidBrowserNameException();
        }

    }

}