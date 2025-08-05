package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;
    Select select;
    public DropDownPage(WebDriver driver) {
        this.driver=driver;
    }
    private By DropDownList = By.id("dropdown");

    public void selectFromDropDownListVisibleText(String visibletext){
        select = new Select(driver.findElement(DropDownList));
        select.selectByVisibleText(visibletext);

    }
}
