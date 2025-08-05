package stepsdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();


    }


    @After
    public void closeBrowser(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
