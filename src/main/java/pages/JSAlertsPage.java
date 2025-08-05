package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertsPage {
    WebDriver driver;
    public JSAlertsPage(WebDriver driver) {
        this.driver =driver;
    }
    private By JSAlertButton = By.xpath("//button[@onclick=\"jsAlert()\"]");

    public void clickOnJSAlertButton(){
        driver.findElement(JSAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
}
