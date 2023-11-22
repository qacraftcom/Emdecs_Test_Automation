package pages.parts;

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

public class JournalizePartsInvoice_konaEU extends TestDriverActions{


        @FindBy(xpath = "(//span[text()='Generate Journals'])[1]")
        public WebElement btn_GenerateJournals;

        @FindBy(xpath = "(//input[contains(@id,'sbcAllper::content')])[1]")
        public WebElement label_CloseWorkOrder;

        @FindBy(xpath = "(//input[contains(@id,'sbc1::content')])[1]")
        public WebElement label_SelectCloseWorkOrder;

        @FindBy(xpath = "//div[contains(@id,':pte1:cb3')]//span[text()='Generate Journals']")
        public WebElement label_GenerateButton;

        @FindBy(xpath = "//div[contains(@id,'konamaintab0::ti')]//div[3]//following::div[3]//a[text()='Service Board']")
        public WebElement label_ServiceBoard;

        @FindBy(xpath = "//div[contains(@id,'konamaintab2::ti')]//div[3]//following::div[3]//a[text()='Financial Manager']")
        public WebElement label_FinancialManager;

        @FindBy(xpath="xpath=//div[2]/div/div/div[2]/table/tbody/tr/td")
        WebElement todaysDate;

        @FindBy(xpath = "//a[text()='Sign Out']")
        public WebElement label_SignOut;

        @FindBy(xpath = "//input[contains(@id,'username::content')]")
        public  WebElement label_UserNameTextArea;

        @FindBy(xpath = "//h1[text()='Working...Please Wait']")
        List<WebElement> loder;


        public void gotoFinancials () throws InterruptedException, FileNotFoundException {
            WaitActions.getWaits().loadingWait(loder);
            Thread.sleep(3000);
            ReusableActions.getActions().clickParentMenu("Financials");
            ReusableActions.getActions().clickChildMenu("Financial Manager");
            TestListener.saveScreenshotPNG(driver);

        }

        /** click On Generate Journals Button*/
        public void clickOnGenerateJournals () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GenerateJournals);
            WebElementActions.getActions().clickElement(btn_GenerateJournals);
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On Close Work Order Element*/
        public  void clikOnCloseWorkOrderElement () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_CloseWorkOrder);
            WebElementActions.getActions().clickElement(label_CloseWorkOrder);
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On Select Redio Button Close Work Order*/
        public void clickOnSelectCloseWorkOrder () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SelectCloseWorkOrder);
            WebElementActions.getActions().clickElement(label_SelectCloseWorkOrder);
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
        /**click on Generate Journals Button*/
        public  void clickOnGenerateJournalsButton () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_GenerateButton);
            WebElementActions.getActions().clickElement(label_GenerateButton);
            WaitActions.getWaits().loadingWait(loder);
            Thread.sleep(3000);
            TestListener.saveScreenshotPNG(driver);
        }
    /**click On Service Board */
        public void clickOnServiceBoard () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ServiceBoard);
            WebElementActions.getActions().clickElement(label_ServiceBoard);
            Thread.sleep(5000);
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On Financial Manager */
        public void  clickOnFiancialManager () throws InterruptedException {
            WaitActions.getWaits().loadingWait(loder);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_FinancialManager);
            WebElementActions.getActions().clickUsingJS(label_FinancialManager);
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
    /**
     * verify today's date
     */
    public void verifyTodaysDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(todaysDate);
        Assert.assertTrue(todaysDate.isDisplayed());
    }
    /**click On Sign Out */
        public void clickOnSignOut () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
            WebElementActions.getActions().clickUsingJS(label_SignOut);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On UserName TextArea*/
        public void clickOnUSerNameTextArea () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_UserNameTextArea);
            WebElementActions.getActions().clickElement(label_UserNameTextArea);
            TestListener.saveScreenshotPNG(driver);
        }






    }


