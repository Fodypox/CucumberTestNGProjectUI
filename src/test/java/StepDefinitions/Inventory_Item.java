package StepDefinitions;

import Pages.Ayse_POM;
import Pages.DialogContent;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Inventory_Item {
    Ayse_POM nv = new Ayse_POM();
    DialogContent dp = new DialogContent();


    @And("Click on Inventory page Scheme")
    public void clickOnInventoryPageScheme() {
        nv.clickMethod(nv.getInventoryButton());
        nv.clickMethod(nv.getSetupButtonUnderInventory());
        nv.clickMethod(nv.getItemTypes());
    }

    @Given("Click on add button to add new item Type")
    public void clickOnAddButtonToAddNewItemType() {
        nv.clickMethod(nv.getAddButton());
        nv.clickMethod(nv.getAddNewButton());

    }

    Actions actions = new Actions(BasicDriver.getDriver());

    @And("Fill up the New Item Type form")
    public void fillUpTheNewItemTypeForm() {

        nv.sendKeysMethod(nv.getInputNameBtn(), "NootteeeEE");
        nv.clickMethod(nv.getItemCategory());
        nv.clickMethod(nv.getSelectItemCategory());
        nv.sendKeysMethod(nv.getDefaultPrice(), "5");

        Action tab = actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        tab.perform();
        nv.sendKeysMethod(nv.getBarcode(), "123456");
        actions.sendKeys(Keys.TAB).build().perform();
        nv.sendKeysMethod(nv.getDescriptionBox(), "These supplies must have");

    }

    @Then("Click on Save button")
    public void clickOnSaveButton() {
        nv.clickMethod(nv.getSaveButton());
    }

    @Then("Validate successfully message is displayed")
    public void validateSuccessfullyMessageIsDisplayed() {
        nv.waitUntilVisible(nv.getSuccessMessage());
        nv.verifyContainsText(nv.getSuccessMessage(), "successfully");
    }


    @When("Change description on item")
    public void changeDescriptionOnItem() {
        nv.sendKeysMethod(nv.getDescriptionBox(), "AYSE SINIR OLURYOR");
    }

    @Then("Warning message should be displayed when saved empty inputs")
    public void warningMessageShouldBeDisplayedWhenSavedEmptyInputs() {
        nv.waitUntilVisible(nv.getWarningMessage());
        nv.verifyContainsText(nv.getWarningMessage(), "invalid");
    }
}

