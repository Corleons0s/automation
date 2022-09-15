import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import static java.time.Duration.ofSeconds;

public class tototest {

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        //   WebDriverManager.operadriver().setup();
        //    WebDriverManager.firefoxdriver().setup();
        // WebDriverManager.edgedriver().setup();
//        driver.close();
    }
    @Test
    public static void testOne() {
//      System.setProperty(Helper.CHROMEKEY, Helper.CHROMEPATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Helper.GOOGLE);
        driver.get("https://www.youtube.com/watch?v=grWRSyptTnk");
        driver.manage().window().minimize();
        driver.close();
        driver.quit();
    }

    @Test
    public static void testThree() throws InterruptedException {
         WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=grWRSyptTnk");
        Thread.sleep(117);
        driver.get("https://github.com/IgalNeeman/QA-Automation-Selenium-/blob/master/OkCupid%20Automation/okcupid.java");
        driver.get("https://github.com/stars/AaronsonRossita/lists/automation-04-07");
        driver.manage().window().minimize();
        driver.close();
        driver.quit();
    }

    @Test
    public static void testFive() throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        Thread.sleep(117);
        WebElement loginFieid = driver.findElement(By.id(Helper.USERNAMEFIELD));
        Thread.sleep(117);
        WebElement passwordFieid = driver.findElement(By.id(Helper.PASSWORDFIELD));
        Thread.sleep(117);
        WebElement loginbtn = driver.findElement(By.id(Helper.LOGINBTN));
        Thread.sleep(117);
        loginFieid.sendKeys(Helper.STANDART);
      Thread.sleep(117);
    passwordFieid.sendKeys(Helper.PASSWORD);
        Thread.sleep(107);
        loginbtn.click();
        Thread.sleep(117);
        File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file2 = new File(Helper.FOLDER + "1.jpg");
        Thread.sleep(117);
        FileUtils.copyFile(file1, file2);
        driver.get(Helper.SAUCE);
        loginFieid = driver.findElement(By.id(Helper.USERNAMEFIELD));
        Thread.sleep(107);
        passwordFieid = driver.findElement(By.id(Helper.PASSWORDFIELD));
        Thread.sleep(117);
        loginbtn = driver.findElement(By.id(Helper.LOGINBTN));
        Thread.sleep(107);
        loginFieid.sendKeys(Helper.LOCK);
        Thread.sleep(117);
        passwordFieid.sendKeys(Helper.PASSWORD);
        loginbtn.click();
        Thread.sleep(107);
        File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file4 = new File(Helper.FOLDER + "2.jpg");
        FileUtils.copyFile(file3, file4);
        driver.get(Helper.SAUCE);
        Thread.sleep(107);
        loginFieid = driver.findElement(By.id(Helper.USERNAMEFIELD));
        Thread.sleep(107);
        passwordFieid = driver.findElement(By.id(Helper.PASSWORDFIELD));
        loginbtn = driver.findElement(By.id(Helper.LOGINBTN));
        loginFieid.sendKeys(Helper.PROBLEM);
        passwordFieid.sendKeys(Helper.PASSWORD);
        loginbtn.click();
        File file5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file6 = new File(Helper.FOLDER + "3.jpg");
        FileUtils.copyFile(file5, file6);
        driver.close();
        driver.quit();
    }
//    @Test
//    public static void testSix() throws IOException {
//// איןן לי כאן כלום בטסט השישי
//    }
    @Test
    public static void testseven() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(177);
        driver.get(Helper.SAUCE);
        Thread.sleep(117);
        WebElement usernamefield = driver.findElement(By.id(Helper.USERNAMEFIELD));
        Thread.sleep(117);
        WebElement passwordfield = driver.findElement(By.id(Helper.PASSWORDFIELD));
        Thread.sleep(117);
        WebElement loginbtn = driver.findElement(By.id(Helper.LOGINBTN));
        Thread.sleep(117);
        usernamefield.sendKeys(Helper.USERS);
        Thread.sleep(117);
        passwordfield.sendKeys(Helper.PASSWORD);
        Thread.sleep(117);
        loginbtn.click();
        Thread.sleep(117);
        File path = new File(Helper.FOLDER);
        Thread.sleep(117);
        driver.navigate().to(Helper.SAUCE);
        Thread.sleep(117);
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(5));
        usernamefield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Helper.USERNAMEFIELD)));
//        driver.close();
//        driver.quit();
        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
        Thread.sleep(111);
        WebElement usernameField2 = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        Thread.sleep(111);
        usernameField.sendKeys("found it SR");
        driver.close();
        driver.quit();
    }
    //   12אף
//    ואז מציאת האלמנט
//    ואז קופי אלמנט
//    ואז זה אמור לעבוד
    @Test
    public static void testNine() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);
        String firstWindow = driver.getWindowHandle();
//     WebDriver driverTwo = new ChromeDriver();
//            driverTwo.get(Helper.GOOGLE);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Helper.GOOGLE);
        String firstWindow1 = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Helper.GOOGLE);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Helper.GOOGLE);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Helper.GOOGLE);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Helper.GOOGLE);
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Helper.GOOGLE);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Helper.GOOGLE);
        String secondWindow = driver.getWindowHandle();
        driver.switchTo().window(firstWindow);
        driver.get(Helper.GOOGLE);
//      driver.close();
//            driver.get("https://www.youtube.com/watch?v=grWRSyptTnk");
            driver.close();
            driver.quit();
//            driver.quit();
    }
//                @Test
//    public static void testTen() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get(Helper.SAUCE);
//      }
    @Test
    public static void testTen() throws InterruptedException {// driver = new ChromeDriver();// driver.get(Helper.GOOGLE);
        WebDriver driver = new ChromeDriver();
        Thread.sleep(117);
        driver.get(Helper.INTERNETHERS);
        Thread.sleep(117);
        driver.manage().window().maximize();
        Thread.sleep(117);
        WebElement loginbtn = driver.findElement(By.xpath(Helper.XPTCHAKBOX));
        Thread.sleep(111);
        loginbtn.click();
        WebElement loginbtn2 = driver.findElement(By.xpath(Helper.XPTCHAKBOX2));

        loginbtn2.click();
      driver.close();
      driver.quit();
}
    //דומת רוסיטה
    @Test
    public static void testIleven() throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get(Helper.INTERNETHERS);
        Thread.sleep(117);
     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Thread.sleep(117);
     wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("")));
        Thread.sleep(117);
        driver.close();
        driver.quit();
    }
    @Test
    public static void testTWELVE() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(117);
        driver.get(Helper.SAUCE);
        Thread.sleep(117);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")));
        Thread.sleep(117);
        WebElement acceptedText = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4"));
        Thread.sleep(117);
        driver.close();
        driver.quit();
    }
//@Test
//    public static void testsurtin (){
//        WebDriver driver = new ChromeDriver();
//        driver.get(Helper.CALCULETR);
//         driver.manage().window().maximize();
//         WebDriverWait wait = WebDriverWait()
//        WebElement acceptedText = driver.findElement(By.id("number1Field"));


     // שיעורי בית
//TARGIL

/* המון חוסר ידע בתגריל .. כמו 1) קליק
2) לגשת לאתר
וכולי ......*/
//    public static void seventeenclub () throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        Thread.sleep(117);
//        driver.get(HELPER2.PETSTORE);
//        Thread.sleep(117);
//        driver.manage().window().maximize();
//
//
//        //    driver.close();
//        //   driver.quit();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(HELPER2.XPTPETSTORE));

    @Test
    public static void test17seventeen17Teen() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HELPER2.PETSTORE);
        WebElement loginbtn = driver.findElement(By.xpath(HELPER2.XPTPETSTORE));
        loginbtn.click();
        WebElement loginbtn2 = driver.findElement(By.xpath(HELPER2.XPTPETSTORE2));
        loginbtn2.click();
        WebElement loginbtn3 = driver.findElement(By.xpath(HELPER2.XPTPETSTORE3));
        loginbtn3.click();
        WebElement loginFieid4 = driver.findElement(By.name(HELPER2.userid));
        loginFieid4.sendKeys(HELPER2.USERID);
        WebElement loginFieid5 = driver.findElement(By.name(HELPER2.password));
        loginFieid5.sendKeys(HELPER2.PASSWORD);
        WebElement loginFieid6 = driver.findElement(By.name(HELPER2.password2));
        loginFieid6.sendKeys(HELPER2.PASSWORD2);
        WebElement loginFieid7 = driver.findElement(By.name(HELPER2.firstname));
        loginFieid7.sendKeys(HELPER2.FIRSTNAME);
        WebElement loginFieid8 = driver.findElement(By.name(HELPER2.lastname));
        loginFieid8.sendKeys(HELPER2.LASTNAME);
        WebElement loginFieid9 = driver.findElement(By.name(HELPER2.email));
        loginFieid9.sendKeys(HELPER2.EMAIL);
        WebElement loginFieid10 = driver.findElement(By.name(HELPER2.phone));
        loginFieid10.sendKeys(HELPER2.PHONE);
        WebElement loginFieid11 = driver.findElement(By.name(HELPER2.address));
        loginFieid11.sendKeys(HELPER2.ADDRESS);
        WebElement loginFieid12 = driver.findElement(By.name(HELPER2.address2));
        loginFieid12.sendKeys(HELPER2.ADDRESS2);
        WebElement loginFieid13 = driver.findElement(By.name(HELPER2.city));
        loginFieid13.sendKeys(HELPER2.CITY);
        WebElement loginFieid14 = driver.findElement(By.name(HELPER2.state));
        loginFieid14.sendKeys(HELPER2.STATE);
        WebElement loginFieid15 = driver.findElement(By.name(HELPER2.zip));
        loginFieid15.sendKeys(HELPER2.ZIP);
        WebElement loginFieid16 = driver.findElement(By.name(HELPER2.country));
        loginFieid16.sendKeys(HELPER2.COUNTRY);
        WebElement loginbtn17 = driver.findElement(By.name(HELPER2.language));
        loginbtn17.click();
        WebElement loginbtn18 = driver.findElement(By.xpath(HELPER2.language_jappanis_xpt));
        loginbtn18.click();
        Thread.sleep(310);
        WebElement loginbtn19 = driver.findElement(By.name(HELPER2.Favourite_Category));
        loginbtn19.click();
        WebElement loginbtn20 = driver.findElement(By.xpath(HELPER2.Favourite_Category_birs_xpt));
        loginbtn20.click();
        Thread.sleep(310);

        WebElement loginbtn21 = driver.findElement(By.xpath(HELPER2.enable));
        loginbtn21.click();
        Thread.sleep(310);
        WebElement loginbtn22 = driver.findElement(By.xpath(HELPER2.Enable_MyBanner));
        loginbtn22.click();
        WebElement loginbtn23 = driver.findElement(By.xpath(HELPER2.save));
        loginbtn23.click();
        Thread.sleep(310);
        Thread.sleep(310);
        //     driver.quit();
//      driver.close();

    }
}