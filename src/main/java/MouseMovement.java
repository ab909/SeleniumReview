import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver",
                "/Users/AbhiBhatt/Downloads/geckodriver");

        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://amazon.ca");

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".nav-a")).click();



    }

    }
