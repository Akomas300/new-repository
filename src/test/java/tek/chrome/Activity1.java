package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://retail.tekschool-students.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#signinLink"))).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name=email]")))
               .sendKeys("nmmm@gmail.com");
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/input[@name='password']")))
               .sendKeys("mathias21@");
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div>button.login__valid")))
               .click();
    }
}
