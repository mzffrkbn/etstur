package Base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static String baseUrl="https://www.etstur.com/";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/Driver/chromedriver1");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public void close(){
        //driver.quit();
        //driver=null;
    }
}
