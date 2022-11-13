import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ElementVisibility {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.gecko.driver",
                "/Users/AbhiBhatt/Downloads/geckodriver");

        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://google.com");

        boolean displayed= driver.findElement(By.cssSelector(".lnXdpd")).isDisplayed();
        System.out.println(displayed);

        boolean enabled = driver.findElement(By.cssSelector(".RNmpXc")).isEnabled();
        System.out.println(enabled);

        driver.navigate().to("https://api.cogmento.com/register/");

        driver.findElement(By.id("terms")).click();
        boolean selected = driver.findElement(By.id("terms")).isSelected();
        System.out.println(selected);


    }
}
