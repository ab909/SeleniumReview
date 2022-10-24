import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsAndPopsUps {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/Users/AbhiBhatt/Downloads/geckodriver");

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.name("proceed")).click(); //click on Go btn

        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert();

        String text = alert.getText();

        System.out.println(text);

        alert.accept();



    }
}
