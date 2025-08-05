package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage {
    WebDriver driver;
    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    private By AddElement = By.xpath("//button[contains(text(),\"Add\")]");
    private By DeleteElement = By.xpath("//button[contains(text(),\"Delete\")]");

    public void clickOnAddElementButton(){
        driver.findElement(AddElement).click();
    }
    public boolean checkDeleteElementButton(){
        /*WebElement DeleteButton = driver.findElement(DeleteElement);
        boolean check = DeleteButton.isDisplayed();

         */
        return driver.findElement(DeleteElement).isDisplayed();

    }
}
