package StepDefinitions;

import Pages.Nur_POM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class Education_GradingSchemes {
    Nur_POM np = new Nur_POM();
    String path = "src/test/java/ApachePOI/GradingScheme.xlsx";
    FileInputStream inputStream = new FileInputStream(path);
    Workbook workbook = WorkbookFactory.create(inputStream);
    Sheet sheet = workbook.getSheet("Sheet1");
    Row row1;
    Row row2;

    public Education_GradingSchemes() throws IOException {
    }

    @And("I go to the grading Scheme page")
    public void iGoToTheGradingSchemePage() {
        np.clickMethod(np.getEducationBtn());
        np.clickMethod(np.getSetupUnderEducation());
        np.clickMethod(np.getGradingScheme());
    }

    @And("I click on the add button to create new Grading Scheme")
    public void iClickOnTheAddButtonToCreateNewGradingScheme() {
        np.clickMethod(np.getAddBtn());

    }

    @And("I fill up the new grading scheme form")
    public void iFillUpTheNewGradingSchemeForm() throws IOException {
        row1 = sheet.getRow(0);
        np.sendKeysMethod(np.getInputNameBtn(), String.valueOf(row1.getCell(0)));
        np.clickMethod(np.getTypeDropDown());
        np.clickMethod(np.getPointUnderTypeBtn());
        np.clickMethod(np.getSliderEnableBtn());
        workbook.close();

    }

    @And("I click on the save button")
    public void iClickOnTheSaveButton() {
        np.clickMethod(np.getSaveBtn());
    }


    @Then("User should see the success message for adding new grading Scheme")
    public void userShouldSeeTheSuccessMessageForAddingNewGradingScheme() {
        np.waitUntilVisible(np.getSuccessMessage());
        Assert.assertTrue(np.getSuccessMessage().isDisplayed());
    }

    @Then("User should see the warning message for adding new grading Scheme with a created name")
    public void userShouldSeeTheWarningMessageForAddingNewGradingSchemeWithACreatedName() {
        np.waitUntilVisible(np.getWarningMessage());
        Assert.assertTrue(np.getWarningMessage().isDisplayed());
    }

    @And("I click on the edit button of my grading scheme")
    public void iClickOnTheEditButtonOfMyGradingScheme() {
        np.clickMethod(np.getEditBtn());
    }

    @And("I change the name input with a new name")
    public void iChangeTheNameInputWithANewName() throws IOException {
        row1 = sheet.getRow(0);
        np.sendKeysMethod(np.getInputNameBtn(), String.valueOf(row1.getCell(1)));
        workbook.close();
    }

    @Then("User should see the success message for editing new grading Scheme")
    public void userShouldSeeTheSuccessMessageForEditingNewGradingScheme() {
        np.waitUntilVisible(np.getSuccessMessage());
        Assert.assertTrue(np.getSuccessMessage().isDisplayed());
        np.waitUntilVisible(np.getDeleteBtn());
        np.clickMethod(np.getDeleteBtn());
        np.waitUntilVisible(np.getDeleteConfirmationBtn());
        np.clickMethod(np.getDeleteConfirmationBtn());
    }

    @Then("User should see the required message for adding new grading Scheme without data")
    public void userShouldSeeTheRequiredMessageForAddingNewGradingSchemeWithoutData() {
        np.waitUntilVisible(np.getThisFieldRequiredText());
        Assert.assertTrue(np.getThisFieldRequiredText().isDisplayed());

    }

    @And("I click on the type button")
    public void iClickOnTheTypeButton() {
        np.clickMethod(np.getTypeDropDown());
    }

    @And("I fill up the new grading scheme form with new data")
    public void iFillUpTheNewGradingSchemeFormWithNewData() throws IOException {
        row2 = sheet.getRow(1);
        np.sendKeysMethod(np.getInputNameBtn(), String.valueOf(row2.getCell(0)));
        np.clickMethod(np.getTypeDropDown());
        np.clickMethod(np.getPointUnderTypeBtn());
        np.clickMethod(np.getSliderEnableBtn());
        workbook.close();

    }

    @And("i click on the delete buttons")
    public void iClickOnTheDeleteButtons() {
        np.waitUntilVisible(np.getDeleteBtn());
        np.clickMethod(np.getDeleteBtn());
        np.waitUntilVisible(np.getDeleteConfirmationBtn());
        np.clickMethod(np.getDeleteConfirmationBtn());
    }

    @Then("User should see the success message for deleting created grading Scheme")
    public void userShouldSeeTheSuccessMessageForDeletingCreatedGradingScheme() {
        Assert.assertTrue(np.getSuccessMessage().isDisplayed());
    }
}
