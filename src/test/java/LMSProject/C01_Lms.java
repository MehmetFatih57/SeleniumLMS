package LMSProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Lms {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //TechproEducation sayfasina git
        driver.get("https://techproeducation.com");
        Thread.sleep(2000);

        //Cikan reklami kapat
        WebElement reklam = driver.findElement(By.xpath("//i[@class='eicon-close']"));
        Thread.sleep(1000);
        reklam.click();
        Thread.sleep(2000);

        //LmsLogin butonuna tikla
        WebElement lmsLogin = driver.findElement(By.xpath("(//a[@class='elementor-item'])[4]"));
        lmsLogin.click();
        Thread.sleep(2000);

        //Login butonuna tikla
        WebElement login = driver.findElement(By.xpath("//a[@data-ccn='button_text_1']"));
        login.click();

        //Username ve Password bilgilerini gir
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("mehmetfatihh57gmailcom" , Keys.ENTER , Keys.TAB , "YJArAXHAQ-27" , Keys.ENTER);
        Thread.sleep(2000);

        //Automation Engineer bolumune gir
        WebElement automationEngineer = driver.findElement(By.xpath("(//span[@class='ccn_dashnav_item'])[15]"));
        automationEngineer.click();
        Thread.sleep(2000);

        //Zoom toplantisini baslat
        WebElement goToZoom = driver.findElement(By.xpath("//a[@class='banner-btn']"));
        goToZoom.click();
        Thread.sleep(2000);

       //WebElement acceptCookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
       //acceptCookies.click();
       //Thread.sleep(2000);

       //WebElement launchMeeting = driver.findElement(By.xpath("//div[@class='mbTuDeF1']"));
       //launchMeeting.click();
    }
}