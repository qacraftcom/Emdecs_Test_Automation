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

public class JournalizePartsInvoice extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Generate Journals']")
    WebElement btn_GenerateJournals;

    @FindBy(xpath = "//label[text()='All Periods']/preceding::input[1]")
    WebElement checkbox_allPeriods;

    @FindBy(xpath = "//label[text()='Period:']/following::select[1]")
    WebElement period_dropdwn;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_refresh;

    @FindBy(xpath = "//span[text()='Selected']/following::input[1]")
    WebElement checkbox;

    @FindBy(xpath = "(//span[text()='Generate Journals'])[2]")
    WebElement GenerateJournals;

    @FindBy(xpath = "(//a[text()='TV Search Service Board'])[1]")
    WebElement service_board;

    @FindBy(xpath = "(//a[text()='TV Search Service Board'])[2]/preceding::a[2]")
    WebElement financialManager;

    @FindBy(xpath = "(//a[text()='Export Journals'])[1]")
    WebElement ExportJournals;

    @FindBy(xpath = "//span[text()='Posted By']/following::th[1]")
    WebElement date_cell;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;




    /**
     * go to Finance Manager
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void gotoFinanceManager() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Financials");
        ReusableActions.getActions().clickChildMenu("Financial Manager");
        TestListener.saveScreenshotPNG(driver);
    }

    // Added Extra Steps which is not present in script

    /**
     * Extra Steps
     * click on drop dwon
     */
    public void clickOnDropDown() throws InterruptedException {
 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(period_dropdwn);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(period_dropdwn);
        WebElementActions.getActions().elementSelectByVisibilityText(period_dropdwn,"1");
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Extra Steps
     * click on refresh button
     */
    public void clickOnRefreshButton() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_refresh);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(period_dropdwn);
        WebElementActions.getActions().clickElement(btn_refresh);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Generate Journalize tab
     */
    public void clickOnGenerateJournalize() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(btn_GenerateJournals);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GenerateJournals);
        WebElementActions.getActions().clickElement(btn_GenerateJournals);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Check Box
     */
    public void clickOnCheckBoxofPeriod() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(checkbox_allPeriods);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(checkbox_allPeriods);
        WebElementActions.getActions().clickElement(checkbox_allPeriods);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on checkbox
     */
    public void clickOnCheckBox() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(checkbox);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(checkbox);
        WebElementActions.getActions().clickElement(checkbox);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Grnerate Journals
     */
    public void clickOnGenerateJournalsBtn() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(GenerateJournals);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(GenerateJournals);
        WebElementActions.getActions().clickElement(GenerateJournals);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on service board
     */
    public void clickOnServiceBoard() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(service_board);
        WebElementActions.getActions().clickUsingJS(service_board);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    // Missing View Arrival in Service Board tab


    /**
     * click on financial manager
     */
    public void clickOnFinancialManager() throws InterruptedException {
//        Thread.sleep(3000);
 //       WaitActions.getWaits().waitForElementTobeClickable(financialManager);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(financialManager);
        WebElementActions.getActions().clickElement(financialManager);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Export Journals
     */
    public void verifyExportJournals() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(ExportJournals);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ExportJournals);
        WebElementActions.getActions().clickElement(ExportJournals);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Today's Date
     */
    public void verifyTodaysdateColumn() throws InterruptedException {
 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(date_cell);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(date_cell);
        Assert.assertTrue(date_cell.isDisplayed());
    }


    /**
     * click on sign out and verify username
     */
    public void clickOnSignOutVerifyUsername() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(date_cell);
        Assert.assertTrue(inputbox_Username.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }


















}
