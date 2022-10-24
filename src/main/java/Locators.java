import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "/Users/AbhiBhatt/Downloads/geckodriver");

        driver = new ChromeDriver();

        driver.get("https://login.yahoo.com/");

        driver.manage().window().maximize();
        //   driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //    driver.findElement(By.id("login-username")).sendKeys("abhi.bhatt@gmail.com");
        WebElement username= driver.findElement(By.id("login-username"));
        username.sendKeys("abhi.bhatt100@gmail.com");

        WebElement clickBtn = driver.findElement(By.id("login-signin"));
        clickBtn.click();

        driver.navigate().to("https://amazon.ca");

//Element Locators
//        1.id
//        2.name
//        3.xpath
//        4.cssSelector
//        5.linkText (is represented by "a" html tag)
//        6.partialLinkText: only for links, but not recommended
//        7.className


    }


}
