package stepsdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginSteps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage;
    SecureAreaPage secureAreaPage;



    @Given("User opens home page and click on Forum Authentication")
    public void user_opens_home_page_and_click_on_forum_authentication() {
       loginPage = homePage.clickOnForumAuthenticationLink();


    }

    @When("User enter valid username and password and click on login button")
    public void userEnterValidUsernameAndPasswordAndClickOnLoginButton() {
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
       secureAreaPage =loginPage.clickOnLoginButton();
    }

    @Then("User is directed to Secure Area Page and success message appears")
    public void userIsDirectedToSecureAreaPageAndSuccessMessageAppears() {
       String success = secureAreaPage.getValidationMessage();
       String msg = "You logged into a secure area!";
        Assert.assertTrue(success.contains(msg));
    }



    @Then("Error message appears")
    public void errorMessageAppears() {
       String error = loginPage.geterrormessage();
       String msg= "Your username is invalid!";
       Assert.assertTrue(error.contains(msg));
    }

    @When("User enter invalid {string} and {string} and click on login button")
    public void userEnterInvalidAndAndClickOnLoginButton(String username, String password) {
        loginPage.insertUsername(username);
        loginPage.insertPassword(password);
        loginPage.clickOnLoginButton();

    }


}
