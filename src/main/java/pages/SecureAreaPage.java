package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private By validtion = By.id("flash");

    //Actions
    public String getValidationMessage(){
        String text = driver.findElement(validtion).getText();
       return text;
    }
}
