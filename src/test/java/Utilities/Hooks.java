package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {

    WebDriver driver;

    public String driverPath = "C:\\Users\\DriverFiles\\chromedriver.exe";

    @Before
    public WebDriver getDriver(){
        if (driver == null) {

            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();


        }
        return driver;
    }
    @After
    public void tearDown(){

        driver.close();
        driver.quit();
    }
}
