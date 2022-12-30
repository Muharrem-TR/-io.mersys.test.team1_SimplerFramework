package mersysTest.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import mersysTest.pages.BaseFunctions;
import mersysTest.pages.DialogContent;
import mersysTest.utilities.BaseDriver;
import mersysTest.utilities.ConfigurationReader;

public class LoginSteps extends BaseFunctions {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Mersys Campus")
    public void navigateToCampus() {
        System.out.println(ConfigurationReader.getProperty("url")); // kontrol amaçlı "configuration.properties" 'den okuma
        BaseDriver.getDriver().get(ConfigurationReader.getProperty("url"));
        clickFunction(dc.getAcceptCookies());
        BaseDriver.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        String usernameValue = ConfigurationReader.getProperty("confUsername");
        String passwordValue = ConfigurationReader.getProperty("confPassword");
        sendKeysFunction(dc.getUsername(),usernameValue);
        sendKeysFunction(dc.getPassword(),passwordValue);
        clickFunction(dc.getLoginButton());
    }

    @Then("User should be login successfuly")
    public void userShouldLoginSuccessfuly() {
        verifyContainsText(dc.getDashboard(),"Dashboard");
    }

    @When("Click to login button")
    public void clickToLoginButton() {
        clickFunction(dc.getLoginButton());
    }

//    @Then("User should be seen require username and password")
//    public void userShouldBeSeenRequireUsernameAndPassword() {
//        dc.findAndContainsText("requiredUsernameAndPassword","gereklidir");
//    }
//
//    @When("Enter invalid username and password")
//    public void enterInvalidUsernameAndPassword() {
//        dc.findAndSend("username","abcdef");
//        dc.findAndSend("password","12345!");
//        dc.findAndClick("loginButton");
//    }
//
//    @Then("User should be seen invalid username or password")
//    public void userShouldBeSeenInvalidUsernameOrPassword() {
//        dc.findAndContainsText("invalidUsernameAndPassword","Invalid");
//    }
}
