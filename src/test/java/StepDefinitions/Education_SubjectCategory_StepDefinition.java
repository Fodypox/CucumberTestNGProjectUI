package StepDefinitions;

import Pages.Alex_POM;
import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Education_SubjectCategory_StepDefinition {
//    DialogContent dc = new DialogContent();
    Alex_POM sc = new Alex_POM();

    @And("I go to the Subject Category")
    public void iGoToTheGradingSubjectCategory() {
        sc.clickMethod(sc.getEducationBtn());
        sc.clickMethod(sc.getSetupUnderEducation());
        sc.clickMethod(sc.getSubjectCategories());    // where i get getSubjectCategories())??
    }

    @Given("Add new Subject Category")
    public void addNewSubjectCategory() {
        sc.clickMethod(sc.getAddBtn());
        sc.sendKeysMethod(sc.getInputNameBtn(), "Alex1");
        sc.sendKeysMethod(sc.getTypeCode(), "a12345");
        sc.clickMethod(sc.getSaveBtn());


    }

    @When("Have verify success message")
    public void haveVerifySuccessMessage() {
        sc.waitUntilVisible(sc.getSuccessMessage());
        Assert.assertTrue(sc.getSuccessMessage().isDisplayed());
    }

    @Then("Find added Subject Category")
    public void findAddedSubjectCategory() {
        sc.sendKeysMethod(sc.getSearchExistAccountByName(), "Alex1");
        sc.sendKeysMethod(sc.getSearchExistAccountByCode(), "a12345");
        sc.clickMethod(sc.getSearchBtn());

    }

    @And("Delete added Subject Category")
    public void deleteAddedSubjectCategory() {
//        st.waitMethod(3);
//        st.clickMethod(st.getDeleteButton());
//        st.clickMethod(st.getDeleteInDialogWindow());

    }
}
