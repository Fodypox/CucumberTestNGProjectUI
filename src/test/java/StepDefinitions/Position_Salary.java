package StepDefinitions;

import Pages.Nur_POM;
import Pages.Utkucan_POM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Position_Salary {

    Utkucan_POM utk = new Utkucan_POM();



    public Position_Salary() throws IOException {
    }

    @And("I go to the Position Salary page")
    public void iGoToTheHumanResourcesPage() {
        utk.clickMethod(utk.getHumanResources());
        utk.clickMethod(utk.getSalary());
        utk.clickMethod(utk.getPositionSalaryUnderHumanResources());
    }

    @And("I click on the add button to create new Position Salary")
    public void iClickOnTheAddButtonToCreateNewPositionSalary() {
        utk.clickMethod(utk.getAddButtonForPositionSalary());
    }

    @And("I fill up by position salary name")
    public void iFillUpByPositionSalaryName() {
        utk.wait.until(ExpectedConditions.visibilityOf(utk.getInputPositionSalaryNameButton()));

        utk.clickMethod(utk.getInputPositionSalaryNameButton());
        utk.sendKeysMethod(utk.getInputPositionSalaryNameButton(), "abcdef");
        
    }

    @And("I click on the save button for Position Salary")
    public void iClickOnTheSaveButtonForPositionSalary() {
        utk.clickMethod(utk.getSaveButtonForPositionSalary());
    }

    @Then("User should see the success message for adding new Position Salary")
    public void userShouldSeeTheSuccessMessageForAddingNewPositionSalary() {
        utk.waitUntilVisible(utk.getSuccessMessageForPositionSalary());
        Assert.assertTrue(utk.getSuccessMessageForPositionSalary().isDisplayed());
    }

    @And("I click on the add button to create new Position Salary again")
    public void iClickOnTheAddButtonToCreateNewPositionSalaryAgain() {
        utk.clickMethod(utk.getAddButtonForPositionSalary());

    }

    @And("I leave the blank new position salary name")
    public void iLeaveTheBlankNewPositionSalaryName() {
        utk.clickMethod(utk.getEmptyPart());
    }

    @Then("User should see the warning message for adding new Position Salary with a created name")
    public void userShouldSeeTheWarningMessageForAddingNewPositionSalaryWithACreatedName() {
       utk.waitUntilVisible(utk.getNameWarning());
       Assert.assertTrue(utk.getNameWarning().isDisplayed());
    }

    @And("I click on the edit button of Position Salary")
    public void iClickOnTheEditButtonOfPositionSalary() {
        utk.clickMethod(utk.getEditButtonForPositionSalary());
    }

    @And("I change the name input with a new name for Position Salary")
    public void iChangeTheNameInputWithANewNameForPositionSalary() {
        Actions actions = new Actions(BasicDriver.getDriver());
        Action clickPriority = actions.moveToElement(utk.getInputPositionSalaryNameButton()).click().build();
        clickPriority.perform();

        Action deletePriority = actions.sendKeys(utk.getInputPositionSalaryNameButton(), Keys.BACK_SPACE).build();
        deletePriority.perform();

        utk.sendKeysMethod(utk.getInputPositionSalaryNameButton(), "sabri sarioglu555555");
    }

    @And("I click on the save button for edited position salary")
    public void iClickOnTheSaveButtonForEditedPositionSalary() {
        utk.clickMethod(utk.getSaveButtonForPositionSalary());

    }

    @Then("User should see the success message for editing new Position Salary")
    public void userShouldSeeTheSuccessMessageForEditingNewPositionSalary() {
        utk.waitUntilVisible(utk.getSuccessMessageForPositionSalary());
        Assert.assertTrue(utk.getSuccessMessageForPositionSalary().isDisplayed());
    }

    @And("I click on the edit button to create new Position Salary")
    public void iClickOnTheEditButtonToCreateNewPositionSalary() {
        utk.clickMethod(utk.getEditButtonForPositionSalary());
    }
    
    @And("I save new position salary as empty name")
    public void iSaveNewPositionSalaryAsEmptyName() {
        utk.clickMethod(utk.getInputPositionSalaryNameButton());
        Actions actions = new Actions(BasicDriver.getDriver());
        Action clickPriority = actions.moveToElement(utk.getInputPositionSalaryNameButton()).click().build();
        clickPriority.perform();

        Action deletePriority = actions.sendKeys(utk.getInputPositionSalaryNameButton(), Keys.BACK_SPACE).build();
        int numberOfBackspaces = 24; // Number of backspace key presses you want to perform

        for (int i = 0; i < numberOfBackspaces; i++) {
            utk.getInputPositionSalaryNameButton().sendKeys(Keys.BACK_SPACE);
        }
        deletePriority.perform();
    }

    @Then("User should see the warning message for editing new Position Salary without any data")
    public void userShouldSeeTheWarningMessageForEditingNewPositionSalaryWithoutAnyData() {
        utk.waitUntilVisible(utk.getNameWarning());
        Assert.assertTrue(utk.getNameWarning().isDisplayed());
    }

    @And("I click on the trash button")
    public void iClickOnTheTrashButton() {
        utk.clickMethod(utk.getDeleteButtonForPositionSalary());
    }

    @And("I click on the delete button")
    public void iClickOnTheDeleteButton() {
        utk.clickMethod(utk.getSureDeleteButtonForPositionSalary());
    }

    @Then("User should see the success message for deleting created Position Salary")
    public void userShouldSeeTheSuccessMessageForDeletingCreatedPositionSalary() {
        utk.waitUntilVisible(utk.getSuccessMessageForPositionSalary());
        Assert.assertTrue(utk.getSuccessMessageForPositionSalary().isDisplayed());
    }
}
