package tek.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://facebook.com");
       // String title = chromeDriver.getTitle();
       // System.out.println(title);
       // chromeDriver.quit();
        Thread.sleep(3000);
        By locator = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/h2");
        chromeDriver.findElement(locator).getText();
    }
}
