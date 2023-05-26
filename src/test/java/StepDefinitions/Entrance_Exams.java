package StepDefinitions;

import Pages.Yuksel_POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.remote.tracing.Span;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Entrance_Exams {
    Yuksel_POM yp=new Yuksel_POM();
    @And("Click on Entrance Exams parameter")
    public void clickOnEntranceExamsParameter() {

        yp.clickMethod(yp.getEntranceExam1());
    }

    @And("Click on Setup parameter")
    public void clickOnSetupParameter() {
        yp.clickMethod(yp.getSetup());
    }

    @And("Click on Entrance Exams under Setup parameter")
    public void clickOnEntranceExamsUnderSetupParameter() {
        yp.clickMethod(yp.getEntranceExam2());
    }

    @And("Click on Add Button")
    public void clickOnAddButton() {
        yp.clickMethod(yp.getAddButton());
    }

    @And("Fill name field")
    public void fillNameField() {
        yp.waitMethod(1);
        yp.sendKeysMethod(yp.getNameField(), RandomStringUtils.randomAlphanumeric(7));
    }

    @And("Select academic period")
    public void selectAcademicPeriod() {
        yp.waitMethod(1);
        yp.waitUntilVisible(yp.getAcademicPeriod().get(0));
        yp.clickMethod(yp.getAcademicPeriod().get(0));
        yp.clickMethod(yp.getFirstAcademicPeriod());

    }

    @And("Select Grade Level")
    public void selectGradeLevel() {
        yp.waitMethod(1);
        yp.waitUntilVisible(yp.getGradeLevel().get(0));
        yp.clickMethod(yp.getGradeLevel().get(0));
        yp.clickMethod(yp.getGradeLevelFirst());
    }

    @And("Click on Save button")
    public void clickOnSaveButton() {
        yp.clickMethod(yp.getSaveButton());
    }

    @Then("Successfully created message should displayed")
    public void successfullyCreatedMessageShouldDisplayed() {
        yp.waitUntilVisible(yp.getSuccessMessage());
        Assert.assertTrue(yp.getSuccessMessage().isDisplayed());
    }

    @And("Fill Reg Start Date")
    public void fillRegStartDate() {
        yp.sendKeysMethod(yp.getRegStartDate(),"11/02/2022");
    }

    @Then("This field cannot be left blank message should displayed")
    public void thisFieldCannotBeLeftBlankMessageShouldDisplayed() {
        yp.waitUntilVisible(yp.getLeftBlank());
        Assert.assertTrue(yp.getLeftBlank().isDisplayed());
    }

    @And("Click on Edit Button")
    public void clickOnEditButton() {
        yp.waitUntilVisible(yp.getEditButton());
    yp.clickMethod(yp.getEditButton());
    }

    @And("Enter new name")
    public void enterNewName() {
        yp.getNameField().clear();
        yp.waitMethod(1);
        yp.sendKeysMethod(yp.getNameField(),RandomStringUtils.randomAlphanumeric(7));
    }

    @Then("Successfully updated message should displayed")
    public void successfullyUpdatedMessageShouldDisplayed() {
        yp.waitUntilVisible(yp.getUpdatedMessage());
        Assert.assertTrue(yp.getUpdatedMessage().isDisplayed());
    }

    @And("Click on delete button")
    public void clickOnDeleteButton() {
        yp.waitUntilVisible(yp.getDeleteButton());
        yp.clickMethod(yp.getDeleteButton());
    }

    @And("Click on delete button in delete page")
    public void clickOnDeleteButtonInDeletePage() {
        yp.waitUntilVisible(yp.getDeleteButtoninNewPage());
        yp.clickMethod(yp.getDeleteButtoninNewPage());
    }

    @Then("Exam succesfully deleted message should displayed")
    public void examSuccesfullyDeletedMessageShouldDisplayed() {
        yp.waitUntilVisible(yp.getDeletedMessage());
        Assert.assertTrue(yp.getDeletedMessage().isDisplayed());
    }
}
