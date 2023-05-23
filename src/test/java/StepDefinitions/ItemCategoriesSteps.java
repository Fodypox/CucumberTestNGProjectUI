package StepDefinitions;

import Pages.ItemCategories_POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ItemCategoriesSteps {

    ItemCategories_POM ic = new ItemCategories_POM();
    @When("Navigate to Item Categories under Inventory Setup")
    public void navigateToItemCategoriesUnderInventorySetup() {
        ic.clickMethod(ic.getInventory());
        ic.clickMethod(ic.getSetup());
        ic.clickMethod(ic.getItemCategories());
    }

    @And("Click on add button")
    public void clickOnAddButton() {
        ic.clickMethod(ic.getAddButton());
    }

    @And("Add a name as {string} and user type")
    public void addANameAsAndUserType(String name) {
        ic.sendKeysMethod(ic.getName(), name +
                Keys.TAB + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ENTER + Keys.TAB + Keys.TAB + Keys.ENTER);
    }

    @When("Click on save button")
    public void clickOnSaveButton() {
        ic.clickMethod(ic.getSaveButton());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        ic.waitUntilVisible(ic.getSuccessMessage());
        ic.verifyContainsText(ic.getSuccessMessage(), "successfully");
    }


    @When("Click on edit button")
    public void clickOnEditButton() {
        ic.clickMethod(ic.getEditButton());
    }

    @And("Change the name as {string}")
    public void changeTheNameAs(String name) {
        ic.sendKeysMethod(ic.getName(), name);
    }

    @When("Click on delete button")
    public void clickOnDeleteButton() {
        ic.clickMethod(ic.getDeleteButton());
    }

    @And("Click on delete confirm button")
    public void clickOnDeleteConfirmButton() {
        ic.clickMethod(ic.getDeleteConfirm());
    }

    @Then("Warning message should be displayed")
    public void warningMessageShouldBeDisplayed() {
        ic.waitUntilVisible(ic.getWarningMessage());
        ic.verifyContainsText(ic.getWarningMessage(), "already");
    }

    @Then("Required message should be displayed")
    public void requiredMessageShouldBeDisplayed() {
        ic.waitUntilVisible(ic.getRequiredMessage());
        ic.verifyContainsText(ic.getRequiredMessage(), "required");
    }
}
