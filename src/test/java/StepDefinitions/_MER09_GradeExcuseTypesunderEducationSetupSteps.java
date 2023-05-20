package StepDefinitions;

import Pages.Burak.DialogContent_Burak;
import Pages.Burak.LeftNav_Burak;
import Utilities.Parent_Burak;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;


import java.util.List;

public class _MER09_GradeExcuseTypesunderEducationSetupSteps {
    Parent_Burak pb = new Parent_Burak();
    LeftNav_Burak lnb = new LeftNav_Burak();
    DialogContent_Burak db = new DialogContent_Burak();
    private static String randomName ;

    @Before
    public void setup() {
        if (randomName == null) {
            randomName = RandomStringUtils.randomAlphanumeric(4);
        }
    }

    @Given("As an admin user I would like to click these steps.")
    public void asAnAdminUserIWouldLikeToClickTheseSteps(DataTable table) {
        List<String> elements = table.asList(String.class);

        for (String element : elements) {
            lnb.findAndClick(element);
        }
    }

    @When("The admin clicks the Add button.")
    public void theAdminClicksTheAddButton() {
        db.clickElementDialogContect("addBtn");
    }

    @And("Enter a name.")
    public void enterAName() {
        db.sendKeyDialogContent("name", randomName);
    }

    @And("Click on Active toggle button.")
    public void clikOnActiveToggleButton() {
        db.clickElementDialogContect("activeToggleBtn");
    }

    @And("Click on Affect to Total.")
    public void clickOnAffectToTotal() {
        db.clickElementDialogContect("Affect to Total");
    }

    @And("Type on Description.")
    public void typeOnDescription() {
        db.sendKeyDialogContent("descriptionArea", "testing 12 12");
    }

    @And("Click on Save button.")
    public void clickOnSaveButton() {
        db.clickElementDialogContect("saveBtn");
    }

    @Then("Grade Excuse Type successfully created success message should be visible.")
    public void gradeExcuseTypeSuccessfullyCreatedSuccessMessageShouldBeVisible() {
        db.verifyElementContainsText("successMessage", "Grade Excuse Type successfully created");
    }

    @And("Enter a name that already exist.")
    public void enterANameThatAlreadyExist() {
        db.sendKeyDialogContent("name", randomName);
    }

    @Then("Unsuccessful message should be visible.")
    public void unsuccessfulMessageShouldBeVisible() {
        db.verifyElementContainsText("unsuccessMessage", "There is already Grade Exception with " + randomName + " name!");
    }
}
