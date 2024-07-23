package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Practice3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.findElement(By.id("countrySelect"));
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.cssSelector("#countrySelect"));
        Select select = new Select(element);
        Thread.sleep(1000);
        select.selectByValue("India");
    }
}
