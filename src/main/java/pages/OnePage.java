package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnePage {
    WebDriver driver;
    WebDriverWait wait;
    public OnePage(WebDriver driver) {
        this.driver=driver;
    }
    private By StartButton = By.xpath("//button[contains(text(),\"Start\")]");
    private By ValidationMessage = By.xpath("//h4[contains(text(),\"Hello\")]");
    private By Loading = By.id("loading");

    public void clickOnStartButton(){
        driver.findElement(StartButton).click();
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(Loading)));

    }
    public String getValidationMessage(){
        /*wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(ValidationMessage)));

         */



       return driver.findElement(ValidationMessage).getText();
    }
}
