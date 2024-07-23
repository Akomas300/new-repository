package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='home__category-item-text' and text()='Accessories']")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Wireless Keyboard and Mouse Combo Backlit']")))
                .click();
        WebElement element = driver.findElement(By.cssSelector(".product__select"));
       Select select = new Select(element);
       select.selectByVisibleText("5");
    }
}
