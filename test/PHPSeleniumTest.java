import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class TecAdminSeleniumTest {

        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");

                WebDriver driver = new ChromeDriver(chromeOptions);
        //      driver = new ChromeDriver();

                driver.get("http://13.234.71.156:3001/");
        //      driver.manage().window().maximize();
        //      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

                Thread.sleep(1000);
                driver.findElement(By.id("About Us")).click();

                if (driver.getPageSource().contains("about")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }
                driver.quit();
        }
}
