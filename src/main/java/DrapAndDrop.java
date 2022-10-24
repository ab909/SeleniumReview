import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDrop {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",
                "/Users/AbhiBhatt/Downloads/geckodriver");

        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("http://jqueryui.com/droppable/");

        driver.switchTo().frame(0);//switch to frame if its present

        Actions action = new Actions(driver);

        action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
                .release()
                .build()
                .perform();

    }
}
