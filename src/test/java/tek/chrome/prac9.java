package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class prac9 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#signinLink")).click();
        driver.findElement(By.id("email")).sendKeys("nasibamehraban1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Nasiba@123");
        driver.findElement(By.id("loginBtn")).click();
        driver.findElement(By.id("accountLink")).click();
        driver.findElement(By.id("personalPhoneInput")).clear();
        driver.findElement(By.id("personalPhoneInput")).sendKeys("5700987692");
        driver.findElement(By.id("personalUpdateBtn")).click();
        String text= driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]")).getText();
        System.out.println(text);
        //driver.quit();
    }
}
