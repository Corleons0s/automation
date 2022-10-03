import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Helper17 {
    public static final String WZAP_HTTP = "https://www.combar.co.il/tools/whatsapp-link-generator/";
    public static final String XPATH_FON = "//*[@id=\"telephone\"]";
    public static final String FON = "534599976";
    public static final String XPATH_TXT = "//*[@id=\"msg\"]";
    public static final String TXT = "Dear Rosita, we had fun studying with you (still fun).\n" +
            "I want to wish you lots of good luck, lots of health, calmness and \n" +
            "happiness\n";
    public static final String XPATH_COPY_LINK_WZAP =
            "/html/body/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div[2]/div[2]/div/div/button";
    public static final String MY_WHATSUPP_WEB = "https://web.whatsapp.com/";
    public static final String LINK_MAZAL_TOV_RUSITA_WHATSUPP =
            "https://web.whatsapp.com/send?phone=972534599976&text=Dear+Rosita,+" +
                    "we+had+fun+studying+with+you+(still+fun).+I+want+to+wish+you+" +
                    "lots+of+good+luck,+lots+of+health,+" +
                    "calmness+and++happiness️";
    public static final String FOLDER = "C:\\Users\\corlion_italiano\\Desktop\\test\\";
    public static final String COMBAR_WEB = "https://www.combar.co.il/tools/";
    public static final String XPAT_WAZE_CLICK = "/html/body/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/a";
    public static final String XPAT_WAZE_STREET = "//*[@id=\"street\"]";
    public static final String WAZE_STREET_FOUNDS = "אחד העם 9";
    public static final String XPAT_WAZE_CITY = "//*[@id=\"city\"]";
    public static final String XPAT_PASSWORD_KAY_CLIK =
            "/html/body/div[2]/div/div/div/div/div/div[2]/div/div/div/div[3]/a";
    public static final String WAZE_CITY_FOUNDS = "אזור";
    public static final String XPAT_POZISHEN_FOUNDS = "//*[@id=\"submit\"]";
    public static final String  XPAT_CKIK_BIFOR_PASSWORD = "//*[@id=\"length\"]";
    public static final String NUM_TABS_BIFOR_PASSWORD = "20";
    public static final String XPAT_V_CLIK_BIFOR_PASWRD = "//*[@id=\"symbols\"]";
    public static final String XPAT_CLIK_MAKE_RANDOM_PASWRD =
            "/html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/div/input";
    public static final String XPAT_CLIK_NEW_PASWRD =
            "/html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div[2]/button";
    public static final String XPAT_ARHION =
            "//*[@id=\"pane-side\"]/button/div/div[2]/div/div";
    public static  final String WIKI = "https://en.wikipedia.org/wiki/Dog";
    public static final String XPAT_WIKI_TXT = "//*[@id=\"mw-content-text\"]/div[1]/p[5]";
    public static ChromeDriver setupDriver(){
        System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
        return new ChromeDriver();
    }




}