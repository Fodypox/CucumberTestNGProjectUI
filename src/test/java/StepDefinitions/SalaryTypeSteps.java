package StepDefinitions;

import Pages.Salary_Type;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SalaryTypeSteps {

    Salary_Type st = new Salary_Type();

    String nameOfType = "QA Automation Engineer in Test";
    String nameOfType2 = "QA Automation in Test";

    @Given("My preconditions steps are get Salary Type ander Salary")
    public void myPreconditionsStepsAreGetSalaryTypeAnderSalary() {
        st.clickMethod(st.getHumRes());
        st.clickMethod(st.getSalary());
        st.clickMethod(st.getSalaryType());

    }


    @When("I add new Salary Type")
    public void iAddNewSalaryType() {
        st.clickMethod(st.getPlusButton());
        st.sendKeysMethod(st.getInputName(),nameOfType);
        st.clickMethod(st.getUserType());
        st.clickMethod(st.getEveryone());
        st.clickMethod(st.getSaveButton());
    }

    String successMessage = "Salary Type successfully created";
    String successDelete= "Salary Type successfully deleted";

    @Then("I have verify success message")
    public void iHaveVerifySuccessMessage() {
        st.verifyContainsText(st.getSuccessMessage(),successMessage);
    }

    @And("find added salary type")
    public void findAddedSalaryType() {
        st.waitMethod(3);
        st.sendKeysMethod(st.getNameInSearch(),nameOfType);
        st.clickMethod(st.getSearchButton());

    }

    @And("delete added salary type")
    public void deleteAddedSalaryType() {
        st.waitMethod(3);
        st.clickMethod(st.getDeleteButton());
        st.clickMethod(st.getDeleteInDialogWindow());
    }

    String successEditedMessage = "Salary Type successfully updated";

    @And("I edit added salary type")
    public void iEditAddedSalaryType() {
        st.clickMethod(st.getEditButton());
        st.sendKeysMethod(st.getInputName(),nameOfType2);
        st.clickMethod(st.getSaveButton());

    }

    @Then("I have verify success edited message")
    public void iHaveVerifySuccessEditedMessage() {
        st.verifyContainsText(st.getEditedSuccessMessage(),successEditedMessage);
    }

    @And("delete updated salary type")
    public void deleteUpdatedSalaryType() {
        st.waitMethod(3);
        st.clickMethod(st.getDeleteButton());
        st.clickMethod(st.getDeleteInDialogWindow());
    }

    @And("find updated salary type")
    public void findUpdatedSalaryType() {
        st.waitMethod(3);
        st.sendKeysMethod(st.getNameInSearch(),nameOfType2);
        st.clickMethod(st.getSearchButton());
    }


    String deleteMessage = "Salary Type successfully deleted";

    @Then("I have verify success deleted message")
    public void iHaveVerifySuccessDeletedMessage() {
        st.verifyContainsText(st.getSuccessDeletedMessage(),deleteMessage);
    }

    @And("I try to add new Salary Type with the same parameters")
    public void iTryToAddNewSalaryTypeWithTheSameParameters() {
        st.waitMethod(3);
        iAddNewSalaryType();
    }

    String existedMessage = "The Salary Type with Name";
    @Then("I have verify already exist message")
    public void iHaveVerifyAlreadyExistMessage() {

        st.verifyContainsText(st.getExistedMessage(),existedMessage);
    }

    @Then("find and delete")
    public void findAndDelete() {
        st.clickMethod(st.getClosDialog());
        st.waitMethod(2);
        findAddedSalaryType();
        deleteAddedSalaryType();
    }

    @Then("i should be able to see no data message")
    public void iShouldBeAbleToSeeNoDataMessage() {
        Assert.assertTrue(st.getNoDataToDisplay().isDisplayed());
    }

}
