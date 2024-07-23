package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Practice2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/a[text()='Sign in']")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#newAccountBtn")))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name=name]")))
                .sendKeys("Mathias");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div:nth-child(3) input.signup__input")))
                .sendKeys("Mathias@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div:nth-child(4) .signup__input")))
                .sendKeys("Mathias21@#");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div:nth-child(5) .signup__input")))
                .sendKeys("Mathias21@#");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#signupBtn")))
                .click();


    }
}
