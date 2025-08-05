package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    //loactors

   private By forumauthenticationlink = By.linkText("Form Authentication");

    private By Adddeletebuttonlink = By.linkText("Add/Remove Elements");

    private By dynamicLoadingloadingLink = By.linkText("Dynamic Loading");

    private By DropDownLink = By.linkText("Dropdown");

    private By JSAlertsLink =By.linkText("JavaScript Alerts");
    //Actions
    public LoginPage clickOnForumAuthenticationLink(){
        driver.findElement(forumauthenticationlink).click();
        return new LoginPage(driver);

    }
    public AddRemovePage clickOnAddDeletebuttonLink(){
        driver.findElement(Adddeletebuttonlink).click();
        return new AddRemovePage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        driver.findElement(dynamicLoadingloadingLink).click();
        return new DynamicLoadingPage(driver);
    }

    public DropDownPage clickOnDropDownLink(){
        driver.findElement(DropDownLink).click();
        return new DropDownPage(driver);
    }
    public JSAlertsPage clickOnJSAlertsLink(){
        driver.findElement(JSAlertsLink).click();
        return new JSAlertsPage(driver);
    }


}
