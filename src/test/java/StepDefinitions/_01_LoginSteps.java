package StepDefinitions;

import Pages.DialogContent;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps extends MyMethods{
    DialogContent elements = new DialogContent();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        BasicDriver.getDriver().get("https://test.mersys.io/");
        BasicDriver.getDriver().manage().window().maximize();

    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        sendKeysMethod(elements.getLoginUsername(), "turkeyts");
        sendKeysMethod(elements.getLoginPassword(), "TechnoStudy123");
        /*wait.until(ExpectedConditions.visibilityOf(elements.getLoginUsername()));
        elements.getLoginUsername().sendKeys("turkeyts");
        elements.getLoginPassword().sendKeys("TechnoStudy123");*/
    }
    @When("Click on Login Button")
    public void click_on_login_button() {
        elements.getLoginBtn().click();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        wait.until(ExpectedConditions.visibilityOf(elements.getDashBoardHeader()));
        Assert.assertTrue(elements.getDashBoardHeader().isDisplayed());

    }
}
