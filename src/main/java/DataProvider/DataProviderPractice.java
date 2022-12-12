package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

   static WebDriver driver;

    @BeforeMethod
    public void setUp(){
    System.setProperty("webdriver.gecko.driver",
            "/Users/AbhiBhatt/Downloads/geckodriver");
    driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/");
}
    @Test (dataProvider = "getData")
    public void dataTest(String username, String password){
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);


    }

   @DataProvider ()
    public Object[][] getData(){
        Object [][] data = new Object[3][2];

        data[0][0] = "test@testmail.com";
        data[0][1] = "testpassword";

        data[1][0] = "test1@testmail.com";
        data[1][1] = "testpassword1";

        data[2][0] = "test2@testmail.com";
        data[2][1] = "testpassword2";

        return data;
    }

}
