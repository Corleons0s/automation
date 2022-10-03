import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import static java.time.Duration.ofSeconds;

public class CombarTest {

    @Test
    public static void aWhatsappLinkAndClickMassage() throws InterruptedException, IOException {
        WebDriver driver = Helper17.setupDriver();
        driver.manage().window().maximize();
        driver.get(Helper17.WZAP_HTTP);
        WebElement loginField1 = driver.findElement(By.xpath(Helper17.XPATH_FON));
        loginField1.sendKeys(Helper17.FON);
        WebElement loginField2 = driver.findElement(By.xpath(Helper17.XPATH_TXT));
        loginField2.sendKeys(Helper17.TXT);
        WebElement login1 = driver.findElement(By.xpath(Helper17.XPATH_COPY_LINK_WZAP));
        Thread.sleep(250);
        login1.click();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Helper17.MY_WHATSUPP_WEB);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper17.XPAT_ARHION))).click();
        driver.get(Helper17.LINK_MAZAL_TOV_RUSITA_WHATSUPP);
        Thread.sleep(6750);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(250);
        File file2 = new File(Helper17.FOLDER + "i1.jpg");
        Thread.sleep(250);
        FileUtils.copyFile(file1, file2);
        driver.close();
        driver.quit();
    }

    @Test
    public static void bWazeLink() throws InterruptedException, IOException {

        WebDriver driver = Helper17.setupDriver();
        driver.manage().window().maximize();
        driver.get(Helper17.COMBAR_WEB);
        WebElement loginField5 = driver.findElement(By.xpath(Helper17.XPAT_WAZE_CLICK));
        loginField5.click();
        WebElement loginField6 = driver.findElement(By.xpath(Helper17.XPAT_WAZE_STREET));
        loginField6.sendKeys(Helper17.WAZE_STREET_FOUNDS);
        WebElement loginField7 = driver.findElement(By.xpath(Helper17.XPAT_WAZE_CITY));
        loginField7.sendKeys(Helper17.WAZE_CITY_FOUNDS);
        WebElement loginField8 = driver.findElement(By.xpath(Helper17.XPAT_POZISHEN_FOUNDS));
        loginField8.click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(250);
        jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(250);
        File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(250);
        File file4 = new File(Helper17.FOLDER + "i2.jpg");
        Thread.sleep(250);
        FileUtils.copyFile(file3, file4);
        driver.quit();
    }

    @Test
    public static void cComboRandomPassword() throws InterruptedException, IOException {

        WebDriver driver = Helper17.setupDriver();
        driver.manage().window().maximize();
        driver.get(Helper17.COMBAR_WEB);
        Thread.sleep(250);
        WebElement loginField10 = driver.findElement(By.xpath(Helper17.XPAT_PASSWORD_KAY_CLIK));
        loginField10.click();
        WebElement loginField11 = driver.findElement(By.xpath(Helper17.XPAT_CKIK_BIFOR_PASSWORD));
        loginField11.sendKeys(Helper17.NUM_TABS_BIFOR_PASSWORD);
        WebElement loginField12 = driver.findElement(By.xpath(Helper17.XPAT_V_CLIK_BIFOR_PASWRD));
        loginField12.click();
        WebElement loginField13 = driver.findElement(By.xpath(Helper17.XPAT_CLIK_MAKE_RANDOM_PASWRD));
        loginField13.click();
        WebElement loginField14 = driver.findElement(By.xpath(Helper17.XPAT_CLIK_NEW_PASWRD));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(250);
        jse.executeScript("window.scrollBy(0,525)");
        Thread.sleep(250);
        File file5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(250);
        File file6 = new File(Helper17.FOLDER + "i3.jpg");
        Thread.sleep(250);
        FileUtils.copyFile(file5, file6);
        driver.quit();
    }

    @Test
    void dCopyWiki() throws IOException {
        WebDriver driver = Helper17.setupDriver();
        driver.manage().window().maximize();
        driver.get(Helper17.WIKI);
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(4));
        String wikiSheets = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper17.XPAT_WIKI_TXT))).getText();
        File file = new File(Helper17.FOLDER + "TXT.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(wikiSheets);
        writer.close();
    }
    public static void createFile(String pathname, String filename, String text){
            File file = new File(pathname + filename);
            try {
                if (file.createNewFile()) {
                    System.out.println("file was created");
                } else {
                    System.out.println("file already exists");
                }
                FileWriter writer = new FileWriter(file);
                writer.write(text);
                writer.close();
            } catch (IOException e) {
                System.out.println(e);
            }
    }
}
