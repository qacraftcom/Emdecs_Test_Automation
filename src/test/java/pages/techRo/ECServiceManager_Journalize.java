package pages.techRo;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class ECServiceManager_Journalize extends TestDriverActions {
    @FindBy(xpath = "(//a[text()='Financials']//..//following::td/child::div[@class='x193'])[1]")
    public WebElement label_Financial;

    @FindBy(xpath = "//td[text()='Financial Manager']")
    public WebElement label_FinancialManger;

    @FindBy(xpath = "//span[text()='Generate Journals']")
    public WebElement btn_GenerateJournals;

    @FindBy(xpath = "(//input[contains(@id,'2:sbc1::content')])[1]")
    public WebElement txt_AssertDisposal;

    @FindBy(xpath = "//div[contains(@id,':pte1:cb3')]//span[text()='Generate Journals']")
    public WebElement label_GenerateButton;

    @FindBy(xpath = "(//div[contains(@id,'::db')]/child::table)[1]")
    public WebElement label_NoDataPresent;

    @FindBy(xpath = "(//a[contains(text(),'Service Board')]/parent::div)[1]")
    public WebElement label_ServiceBoard;

    @FindBy(xpath = "(//a[contains(text(),'Financial Manager')])[1]")
    public WebElement txt_FinancialManager;

    @FindBy(xpath = "//a[text()='Journal Sources']/parent::div[contains(@id,'::_afrTabCnt')]")
    public WebElement label_JournalSources;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;







    /**goto Financials */
    public void gotoFinancials () throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Financials");
        ReusableActions.getActions().clickChildMenu("Financial Manager");
        TestListener.saveScreenshotPNG(driver);

    }


    /** click On Generate Journals Button*/
    public void clickOnGenerateJournals () throws InterruptedException {
     //   WaitActions.getWaits().waitForElementTobeClickable(btn_GenerateJournals);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GenerateJournals);
        WebElementActions.getActions().clickElement(btn_GenerateJournals);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** select  On Assert Disposal Boolean*/
    public void clickOnAssertDisposal () throws InterruptedException {
     //   WaitActions.getWaits().waitForElementTobeClickable(txt_AssertDisposal);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_AssertDisposal);
        WebElementActions.getActions().clickElement(txt_AssertDisposal);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Table Generate Journals Button */
    public void clickOnTableGenerateJournalsButton () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(label_GenerateButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_GenerateButton);
        WebElementActions.getActions().clickElement(label_GenerateButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** verify Element not Present */
    public void verifyElementNotPresent () throws InterruptedException {
        Assert.assertFalse(label_NoDataPresent.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click On Service Board */
    public void clickOnServiceBoard () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(label_ServiceBoard);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ServiceBoard);
        WebElementActions.getActions().clickElement(label_ServiceBoard);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On Financial Manager */
    public void clickOnFinancialManagerText () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(txt_FinancialManager);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_FinancialManager);
        WebElementActions.getActions().clickElement(txt_FinancialManager);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click On  Journal Sources */
    public void clickOnJournalSources () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(label_JournalSources);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_JournalSources);
        WebElementActions.getActions().clickElement(label_JournalSources);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Sign Out */

    public void clickOnSignOut () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(label_SignOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);
        TestListener.saveScreenshotPNG(driver);
    }



}


