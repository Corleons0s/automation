import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Helper {
    public static final String CHROMEKEY = "webdriver.chrome.driver";
    public static final String CHROMEPATH = "res\\chromedriver.exe";

    public static final String  HEROROPOWN = "https://testsheepnz.github.io/BasicCalculator.html";
    public static String GOOGLE = "https://www.google.co.il/";

    public static final String GITHUB = "https://github.com/";
    public static final String SAUCE = "https://www.saucedemo.com/";

    public static final String USERNAMEFIELD = "user-name";
    public static final String FIND= "//*[@id=\"searchform\"]/div/div/div/input";
    public static final String USERNAMEFIELD2 = "xpath";
    public static final String USERNAMEFIELD3 = "//*[@id=\"user-name\"]";
    public static final String PASSWORDFIELD = "password";

   public static final String LOGINBTN = "login-button";
    public static final String STANDART = "standard_user";

    public static final String LOCKED = "locked_out_user";

    public static final String  PROBLEM  = "problem_user";
    public static final String LOCK = "locked_out_user";

// WIKIPEDIA user-name

    public static  final String WIKI = "https://he.wikipedia.org/wiki/Smalltalk";



    public static final String PASSWORD ="secret_sauce";
    public static final String FOLDER = "C:\\Users\\corlion_italiano\\Desktop\\test\\";
    public static final String USERS = "users";
    public static final String CHAKBOX = "#content > ul > li:nth-child(6) > a";
    public static final String INTERNETHERS = "https://the-internet.herokuapp.com/";
    public static final String XPTCHAKBOX = "//*[@id=\"content\"]/ul/li[6]/a";
    public static final String XPTCHAKBOX2 = "//*[@id=\"checkboxes\"]/input[1]";
    public static final String CALCULETR = "https://testsheepnz.github.io/BasicCalculator.html";
    public static final String ID1 = "number1Field";
    public static final String ID2 = "number2Field";
    public static final String DROPDOWN = "selectOperationDropdown";
    public  static final String CALCBTN = "calculateButton";
    public  static final String RESULT = "numberAnswerField";




    //    public static CharSequence LOCKED;
//    public static final String
    public static WebDriver setProperty(){
        System.setProperty(CHROMEKEY,CHROMEPATH);
        return new ChromeDriver();

    }


}
