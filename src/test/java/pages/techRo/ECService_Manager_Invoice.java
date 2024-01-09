package pages.techRo;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class ECService_Manager_Invoice extends TestDriverActions {

    @FindBy(xpath = "//input[contains(@id,'itSearch::content')]")
    public WebElement input_SearchTextArea;


    @FindBy(xpath = "//a[contains(@id,':0:sfRM:tWoR:0:cl2')]")
    public WebElement input_ReferenceNumber ;

    @FindBy(xpath = "//label[contains(.,'RO Date:')]")
    public WebElement label_RODate;

    @FindBy(xpath = "//a[contains(@id,'idReadingDate::glyph')]")
    public WebElement label_ReadingDateGraph;

    @FindBy(xpath = "//span[text()='Refresh']")
    public WebElement btn_Refresh;


    @FindBy(xpath = "//div[contains(@id,'cbROSM')]/a/span[text()='Invoice']")
    public WebElement btn_Invoice;

    @FindBy(xpath = "//label[text()='RO Date:']")
    public WebElement label_RODate1;

    @FindBy(xpath = "//input[contains(@id,':idReadingDate::content')]")
    public WebElement input_RoDate;


    @FindBy(xpath = "(//span[contains(@id,':0:olWON')]//following::div)[1]")
    public WebElement label_RoNumber;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserNameTextArea;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;




    /**click on complete Ro */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);
    }
    /**wait element present SearchList */
    public void verifyElementPresent () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_ReferenceNumber);
        Assert.assertTrue(input_ReferenceNumber.isDisplayed());

    }

    /** enter Data In Search TextArea */
    public void  enterDataInSearchTextArea () throws InterruptedException {
         if(LoginActions.environmentName.contains("QA")||LoginActions.environmentName.contains("EU"))
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_SearchTextArea);
        WebElementActions.getActions().inputText(input_SearchTextArea,appProp.getProperty("input"));
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /**click On Ro Number */
    public void clickOnRoNumber  () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_ReferenceNumber);
        WebElementActions.getActions().clickElement(input_ReferenceNumber);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /**enter Yesterday Date */
    public void enterYesterdayDate () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_RoDate);
        WebElementActions.getActions().inputText(input_RoDate,appProp.getProperty("YesterdayDate"));

    }

    /**verify RO Date ,ReadingDate Graph */
    public void verifyRODate ()throws InterruptedException {
        if (LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RODate1);
            Assert.assertTrue(label_RODate1.isDisplayed());

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ReadingDateGraph);
            Assert.assertTrue(label_ReadingDateGraph.isDisplayed());
        }
    }

    /** Store Ro Number */
    public void storeRoNumber () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RoNumber);
        System.out.println("RoNumber");

        String originalWindow=driver.getWindowHandle () ;


    }
    /** click Invoice Button */
    public void clickInvoiceButton () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Invoice);

        WebElementActions.getActions().clickElement(btn_Invoice);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click in Sign out Button */
    public void clickSignOut () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);
        TestListener.saveScreenshotPNG(driver);
    }

    /**click UserName TextArea */
    public void ClickUserNameTextArea () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UserNameTextArea);
        Assert.assertTrue(label_UserNameTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

}
