package tests;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
 
public class BaseTest {
    public WebDriver driver;
 
    @BeforeClass
    public void setup () { //Metodo donde inicializo mi driver
    	
    	//Especifico donde se encuentra mi driver
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\elizabeth.benitez\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	 
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();
 
        //Maximize Window
        driver.manage().window().maximize();
    }
 
    @AfterClass
    public void teardown () {
        driver.quit();
    }
}