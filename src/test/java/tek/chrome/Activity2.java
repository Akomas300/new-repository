package tek.chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://dev.insurance.tekschool-students.com/");
        String title = chromeDriver.getTitle();
        System.out.println(title);
        chromeDriver.quit();
    }
}
