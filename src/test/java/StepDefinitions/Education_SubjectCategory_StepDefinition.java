package StepDefinitions;

import Pages.Alex_POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Education_SubjectCategory_StepDefinition {
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
        sc.sendKeysMethod(sc.getInputNameBtn(), "Alex");
        sc.sendKeysMethod(sc.getTypeCode(), "12345");
        sc.clickMethod(sc.getSaveBtn());


    }
}
