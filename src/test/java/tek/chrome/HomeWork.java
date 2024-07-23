package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.cssSelector("div > div > div a.top-nav__btn"))
                .click();
        driver.findElement(By.cssSelector("input[name=email]"))
                .sendKeys("nasibamehraban1@gmail.com");
        driver.findElement(By.cssSelector("input[name=password]"))
                .sendKeys("Nasiba@123");
        driver.findElement(By.cssSelector("button[type=submit]"))
                .click();
       //Thread.sleep(1000);
       // driver.findElement(By.xpath("//div/div/div[3]/div/div[2]/div/div[2]/div/div/div[2]/p"))
              //  .click();
        driver.findElement(By.className("top-nav__btn")).click();

    }
}
