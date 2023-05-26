package StepDefinitions;

import Pages.SalaryParameters_POM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.reactivex.rxjava3.exceptions.Exceptions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SalaryParameters {
    SalaryParameters_POM sp= new SalaryParameters_POM();
    Actions actions =new Actions(BasicDriver.getDriver());

    @When("Navigate to SalaryParameters Under Human Resource")
    public void navigate_to_salary_parameters_under_human_resource() {
    sp.clickMethod(sp.getHumanResourceButton());
    sp.clickMethod(sp.getSalaryButton());
    sp.clickMethod(sp.getSalaryParameters1Button());
    }

    @And("Add a name as {string}, validFrom, Key as {string}, New value")
    public void addANameAsValidFromKeyAsNewValue(String name, String key) {

        sp.sendKeysMethod(sp.getNameButton(),name+ Keys.TAB+Keys.TAB+Keys.ENTER);
        actions.moveToElement(sp.getDate()).build().perform();
        actions.click().build().perform();
        sp.sendKeysMethod(sp.getKeyButton(),key);
        sp.sendKeysMethod(sp.getValueButton(),"10");
        sp.clickMethod(sp.getSaveButton());

    }
//
//    @And("Add a name as {string}, validFrom, Key as {string}, Same value")
//    public void addANameAsValidFromKeyAsSameValue(String name, String key) {
//        sp.sendKeysMethod(sp.getNameButton(),name+ Keys.TAB+Keys.TAB+Keys.ENTER);
//        actions.moveToElement(sp.getDate()).build().perform();
//        actions.click().build().perform();
//
//        sp.sendKeysMethod(sp.getKeyButton(),key);
//        sp.sendKeysMethod(sp.getValueButton(),"10");
//        sp.clickMethod(sp.getSaveButton());
//    }

    @And("Change the Key as {string}")
    public void changeTheKeyAs(String key) {
        sp.getKeyButton().clear();
        sp.sendKeysMethod(sp.getKeyButton(),key);
        sp.clickMethod(sp.getSaveButton());
    }

    @Then("Required Error message should be displayed")
    public void requiredErrorMessageShouldBeDisplayed() {
        sp.waitUntilVisible(sp.getRequiredErrorMessage());
        sp.verifyContainsText(sp.getRequiredErrorMessage(), "This field is required!");
    }

    @Then("warning message should be displayed")
    public void warningMessageShouldBeDisplayed() {
        sp.waitUntilVisible(sp.getWarningMessage());
        sp.verifyContainsText(sp.getWarningMessage(), "text");
    }
}
