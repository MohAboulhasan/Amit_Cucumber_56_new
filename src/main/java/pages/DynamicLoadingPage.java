package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    private By Example1Link= By.partialLinkText("Example 1");

    public OnePage clickOnExample1(){
        driver.findElement(Example1Link).click();
        return new OnePage(driver);
    }
}
