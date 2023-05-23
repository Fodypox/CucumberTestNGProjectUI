package Utilities;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Parent_Burak extends BasicDriver {

    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(5));
    JavascriptExecutor js;
    Robot r2d2;

    public void scrollToElement_Tools(WebElement element) {
        js = (JavascriptExecutor) getDriver();

        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickElementFromDOM_I_GUES_IDK_Tools(WebElement element) {
        js = (JavascriptExecutor) getDriver();

        js.executeScript("arguments[0].click();", element);
    }

    public void colorChecker(WebElement element, String RGBcodeNumber){
        waitUntilElementToBeVisible_Tools(element);
        org.testng.Assert.assertEquals(element.getCssValue("color"),RGBcodeNumber, "The code doesnt match");
    }

    public void waitUntilElementToBeVisible_Tools(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable_Tools(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void visibilityOfElementLocated_Tools(By path) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(path));
    }

    public void waitUntilElementToBeClickable_Tools(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickElement_Tools(WebElement element) {
        waitUntilElementToBeClickable_Tools(element);
        scrollToElement_Tools(element);
        element.click();
    }

    public void sendKeysElement_Tools(WebElement element, String value) {
        waitUntilElementToBeVisible_Tools(element);
        scrollToElement_Tools(element);
        element.clear();
        element.sendKeys(value);
    }

    public void r2d2_TAB_AND_ENTER_Tools(int TAB, int Enter) throws AWTException {
        r2d2 = new Robot();

        for (int i = 0; i < TAB; i++) {
            r2d2.keyPress(KeyEvent.VK_TAB);
            r2d2.keyRelease(KeyEvent.VK_TAB);
        }
        for (int i = 0; i < Enter; i++) {
            r2d2.keyPress(KeyEvent.VK_ENTER);
            r2d2.keyRelease(KeyEvent.VK_ENTER);
        }
        r2d2.setAutoDelay(2000);
    }

    public void stringSelection_Tools(String path) {
        StringSelection selection = new StringSelection(path);
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        cb.setContents(selection, selection);

        r2d2.keyPress(KeyEvent.VK_CONTROL);
        r2d2.keyPress(KeyEvent.VK_V);

        r2d2.keyRelease(KeyEvent.VK_CONTROL);
        r2d2.keyRelease((KeyEvent.VK_V));

        r2d2.keyPress(KeyEvent.VK_ENTER);
        r2d2.keyRelease(KeyEvent.VK_ENTER);
    }

    public void verifyElementContainsText_Tools(WebElement element, String text) {
        waitUntilElementToBeVisible_Tools(element);
        Assert.isTrue(element.getText().contains(text), "Does not contain " + "'" + text + "'");

    }

    public void verifyBtnIsDisabled_Tools(WebElement element){
        Assert.isTrue(!element.isEnabled(),"is not true");
        System.out.println(element.isEnabled());
    }

    public WebElement creatElementByXpathWithText(String text) {
        return getDriver().findElement(By.xpath("//span[text()='" + text + "']"));
    }
}