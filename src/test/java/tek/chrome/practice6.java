package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver gamePlayer=new ChromeDriver();
        gamePlayer.manage().window().maximize();
        gamePlayer.get("https://retail.tekschool-students.com/");
        Thread.sleep(3000);
        gamePlayer.findElement(By.xpath("//img[@alt='Video Games']")).click();
                Thread.sleep(2000);
        gamePlayer.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
        Thread.sleep(5000);
        gamePlayer.findElement(By.xpath("//button[@id='addToCartBtn']")).click();
    }
}
