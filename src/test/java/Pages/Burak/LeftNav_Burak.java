package Pages.Burak;

import Utilities.BasicDriver;
import Utilities.Parent_Burak;
import org.apache.poi.ss.formula.atp.Switch;
import org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Burak {
    public LeftNav_Burak() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Grade Excuse Types']")
    private WebElement gradeExcuseTypes;

    Parent_Burak pb = new Parent_Burak();
    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "Education":
                myElement = education;
                break;
            case "Setup":
                myElement = setup;
                break;
            case "Grade Categories":
                myElement = gradeExcuseTypes;
                break;
        }
        pb.clickElement_Tools(myElement);
    }
}
