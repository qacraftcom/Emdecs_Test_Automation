package pages.techRo;

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


    @FindBy(xpath = "//a[contains(.,'O104')]")
    public WebElement input_ReferenceNumber ;

    @FindBy(xpath = "//span[text()='Refresh']")
    public WebElement btn_Refresh;


    @FindBy(xpath = "//div[contains(@id,'cbROSM')]/a/span[text()='Invoice']")
    public WebElement btn_Invoice;

    @FindBy(xpath = "//label[text()='RO Date:']")
    public WebElement label_RODate;

    @FindBy(xpath = "//input[contains(@id,':idReadingDate::content')]")
    public WebElement input_RoDate;


    @FindBy(xpath = "//span[contains(@id,'olWON')]/child::label/following::div[contains(.,'O1')]")
    public WebElement label_RoNumber;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserNameTextArea;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;




    /**click on complete Ro */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);
    }
    /**wait element present SearchList */
    public void verifyElementPresent () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(input_ReferenceNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_ReferenceNumber);
        Assert.assertTrue(input_ReferenceNumber.isDisplayed());

    }

    /** enter Data In Search TextArea */
    public void  enterDataInSearchTextArea () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(input_SearchTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_SearchTextArea);
        WebElementActions.getActions().inputText(input_SearchTextArea,prop.getProperty("input"));
        TestListener.saveScreenshotPNG(driver);


    }
    /**click On Refersh Button */
    public void clickOnRefresh () throws InterruptedException {
    //    WaitActions.getWaits().waitForElementTobeClickable(btn_Refresh);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Refresh);
        WebElementActions.getActions().clickElement(btn_Refresh);
        TestListener.saveScreenshotPNG(driver);
    }


    /**click On Ro Number */
    public void clickOnRoNumber  () throws InterruptedException {

       // WaitActions.getWaits().waitForElementTobeClickable(input_ReferenceNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_ReferenceNumber);
        WebElementActions.getActions().clickElement(input_ReferenceNumber);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /** verify Invoice Text */
    public void verifyInvoiceText () throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_Invoice);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Invoice);
        Assert.assertTrue(btn_Invoice.isDisplayed());

    }

    /**verify Ro Date */
    public void verifyRoDate () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_RODate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RODate);
        Assert.assertTrue(label_RODate.isDisplayed());


    }

    /** click On Ro Date */
    public void clickOnRoDate () throws InterruptedException {

       // WaitActions.getWaits().waitForElementTobeClickable(input_RoDate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_RoDate);
        WebElementActions.getActions().clickElement(input_RoDate);
        TestListener.saveScreenshotPNG(driver);
    }

    /**enter Yesterday Date */
    public void enterYesterdayDate () throws InterruptedException {

        //WaitActions.getWaits().WaitUntilWebElementIsVisible(input_RoDate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_RoDate);
        WebElementActions.getActions().clickElement(input_RoDate);
        input_RoDate.clear();
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(input_RoDate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_RoDate);
        WebElementActions.getActions().inputText(input_RoDate,prop.getProperty("YesterdayDate"));
        input_RoDate.clear();
        Thread.sleep(1000);
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(input_RoDate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_RoDate);
        WebElementActions.getActions().inputText(input_RoDate,prop.getProperty("Date"));
        input_RoDate.click();
        TestListener.saveScreenshotPNG(driver);


    }
    /** verify Ro Number */
    public void verifyRoNumber () throws InterruptedException {

        Thread.sleep(1000);
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_RoNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RoNumber);
        System.out.println("RoNumber");


    }
    /** click Invoice Button */
    public void clickInvoiceButton () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(btn_Invoice);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Invoice);

        WebElementActions.getActions().clickElement(btn_Invoice);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click in Sign out Button */
    public void clickSignOut () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(label_SignOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);
        TestListener.saveScreenshotPNG(driver);
    }

    /**click UserName TextArea */
    public void ClickUserNameTextArea () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_UserNameTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UserNameTextArea);
        Assert.assertTrue(label_UserNameTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

}
