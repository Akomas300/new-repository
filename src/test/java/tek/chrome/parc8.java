package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parc8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#signinLink")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".login__input")).sendKeys("nasibamehraban1@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#password")).sendKeys("Nasiba@123");
        driver.findElement(By.cssSelector("#loginBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#accountLink")).click();
        String text= driver.findElement(By.cssSelector(".account__information-email")).getText();
        System.out.println(text);
        driver.quit();
    }
}
