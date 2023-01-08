package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    WebDriverWait wait;
   public String baseUrl="https://rahulshettyacademy.com/locatorspractice/";
   public String username ="arif";
   public String password1 ="123456";
    public String password2 ="rahulshettyacademy";
   public String name ="atif";
   public String email ="arifatif163@gmail.com";
   public String phoneNum ="01772921632";


    @BeforeClass
    public void SetUp(){

        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver_win32/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--headed");
        driver= new ChromeDriver();
        //maximize window size
        driver.manage().window().maximize();
        //timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
