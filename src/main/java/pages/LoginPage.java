package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //loactors
    private By usernamebox = By.id("username");
    private By passwordbox = By.id("password");
    private By loginbutton = By.className("radius");
    private By errormessage = By.cssSelector(".flash.error");

    //Actions
    public void insertUsername(String username){
        driver.findElement(usernamebox).sendKeys(username);
    }
    public void insertPassword(String password){
        driver.findElement(passwordbox).sendKeys(password);
    }
    public SecureAreaPage clickOnLoginButton(){
        driver.findElement(loginbutton).click();
        return new SecureAreaPage(driver);
    }
    public String geterrormessage(){
      String error =  driver.findElement(errormessage).getText();
      return error;
    }

}
