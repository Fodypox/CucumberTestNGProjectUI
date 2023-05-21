package Pages.Burak;

import Utilities.BasicDriver;
import Utilities.Parent_Burak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Burak {


    public DialogContent_Burak() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    Parent_Burak pb = new Parent_Burak();
    WebElement myElement;

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement addBtn;

    @FindBy(css = "input[type='text']")
    private WebElement name;

    @FindBy(xpath = "//span[text()='Active']")
    private WebElement activeToggleBtn;

    @FindBy(xpath = "//div[text()=' Affect to Total ']")
    private WebElement affectToTotalToggleBtn;

    @FindBy(css = "textarea[id*=ms-textarea]")
    private WebElement descriptionArea;

    @FindBy(xpath = "//ms-save-button//button[@color='accent']")
    private WebElement saveBtn;

    @FindBy(css = ".hot-toast-bar-base>div>div>dynamic-view>div")
    private WebElement message;

    @FindBy(css = "svg[data-icon=\"pen-to-square\"]")
    private WebElement editBtn;

    @FindBy(css = "[id*='mat-error']>mat-error")
    private WebElement nameRedMessage;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-icon-button mat-button-base mat-warn ng-star-inserted']")
    private WebElement deleteBtn;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//div")
    private WebElement checkDeleteText;

    @FindBy(css = "[class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-accent']")
    private WebElement popUpDelete;

    public void clickElementDialogContect(String strElement) {
        switch (strElement) {
            case "addBtn":
                myElement = addBtn;
                break;
            case "activeToggleBtn":
                myElement = activeToggleBtn;
                break;
            case "Affect to Total":
                myElement = affectToTotalToggleBtn;
                break;
            case "saveBtn":
                myElement = saveBtn;
                break;
            case "editBtn":
                myElement = editBtn;
                break;
            case "deleteBtn":
                myElement = deleteBtn;
                break;
            case "popUpDelete":
                myElement = popUpDelete;
                break;
        }
        pb.clickElement_Tools(myElement);
    }

    public void sendKeyDialogContent(String strElement, String text) {
        switch (strElement) {
            case "name":
                myElement = name;
                break;
            case "descriptionArea":
                myElement = descriptionArea;
                break;
        }
        pb.sendKeysElement_Tools(myElement, text);
    }

    public void verifyElementContainsText(String strElement, String text) {
        switch (strElement) {
            case "message":
                myElement = message;
                break;
            case "checkDeleteText":
                myElement = checkDeleteText;
                break;
        }
        pb.verifyElementContainsText_Tools(myElement, text);
    }

    public void colorCheckerDB(String strElement, String RGBcode) {
        switch (strElement) {
            case "nameRedMessage":
                myElement = nameRedMessage;
                break;
        }
        pb.colorChecker(myElement, RGBcode);
    }

    public void verifyBtnIsDisabledDB(String strElement) {
        switch (strElement) {
            case "saveBtn":
                myElement = saveBtn;
                break;
        }
        pb.verifyBtnIsDisabled_Tools(myElement);
    }
}
