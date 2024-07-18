package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver gamePlayer=new ChromeDriver();
        gamePlayer.manage().window().maximize();
        gamePlayer.get("https://fireflyworlds.com/categories/all-games/");

        Thread.sleep(5000);
        gamePlayer.findElement(By.xpath("//div[@class='home-boxes-info-container']/div[1]/a[2]")).click();
    }
}
