import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice {

    static WebDriver driver;

    @BeforeMethod
    public void setup(){

        System.setProperty("webdriver.gecko.driver",
                "/Users/AbhiBhatt/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.ca/");

    }

    @Test
    public void titleTest(){
        String title = driver.getTitle();
        Assert.assertEquals("Amazon.ca: Low Prices – Fast Shipping – Millions of Items",title);

    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
