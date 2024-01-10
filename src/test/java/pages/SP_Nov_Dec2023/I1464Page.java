package pages.SP_Nov_Dec2023;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;

public class I1464Page extends TestDriverActions {

    @FindBy(xpath = "//span[contains(text(),'Add New Counter Sale')]")
    WebElement btn_AddNewCounterSale;

    @FindBy(xpath = "(//label[contains(text(),'Customer')])[1]//following::input[1]")
    WebElement inputBoxCustomer;

    @FindBy(xpath = "(//span[text()='OK'])[1]")
    WebElement btn_Ok;

    @FindBy(xpath = "(//span[text()='OK'])[2]")
    WebElement btn_OK;

    @FindBy(xpath = "//span[text()='Invoice']")
    WebElement btn_Invoice;

    @FindBy(xpath = "//span[contains(text(),'Save / Exit')]")
    WebElement btn_SaveExit;

    @FindBy(xpath = "(//label[contains(text(),'Customer PO#')])[1]//following::input[1]")
    WebElement inputBoxCustomerPO;

    @FindBy(xpath = "//span[contains(text(),'Non Repair Bill')]")
    WebElement btn_NonRepairBill;

    @FindBy(xpath = "(//span[text()='Invoice'])[2]")
    WebElement btn_InvoiceTwo;

    @FindBy(xpath = "//li[contains(text(),'905 Truck and Trailer Repair')]")
    WebElement customerDropdown;

    @FindBy(xpath = "//span[contains(text(),'Customer PO Number is required')]")
    WebElement errorMsg;

    public static void clickOnPartsMenu() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Counter Sale Manager");
        TestListener.saveScreenshotPNG(driver);
    }
    public static void clickOnServiceMenu() throws FileNotFoundException, InterruptedException {
        Thread.sleep(5000);
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickOnAddNewCounterSale() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_AddNewCounterSale);
        WebElementActions.getActions().clickElement(btn_AddNewCounterSale);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputBoxCustomer);
        WebElementActions.getActions().inputText(inputBoxCustomer, "905 Truck and Trailer Repair [905TRUCK]");

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions().clickElement(btn_Ok);
    }
    public void AddNewCounterSaleButtonWithoutCustomerPO () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Invoice);
        WebElementActions.getActions().clickElement(btn_Invoice);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(errorMsg);
        Assert.assertTrue(errorMsg.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions().clickElement(btn_Ok);

    }
    public void AddNewCounterSaleButtonWithCustomerPO () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputBoxCustomerPO);
        WebElementActions.getActions().inputText(inputBoxCustomerPO, "905");

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Invoice);
        WebElementActions.getActions().clickElement(btn_Invoice);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(errorMsg);
        Assert.assertTrue(errorMsg.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    public void NonRepairBillButtonWithoutCustomerPO() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_NonRepairBill);
        WebElementActions.getActions().clickElement(btn_NonRepairBill);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputBoxCustomer);
        WebElementActions.getActions().inputText(inputBoxCustomer, "905");

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputBoxCustomer);
        WebElementActions.getActions().clickElement(customerDropdown);

        Thread.sleep(3000);
        inputBoxCustomerPO.clear();

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_InvoiceTwo);
        WebElementActions.getActions().clickElement(btn_InvoiceTwo);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(errorMsg);
        Assert.assertTrue(errorMsg.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_OK);
        WebElementActions.getActions().clickElement(btn_OK);

    }
    public void NonRepairBillButtonWithCustomerPO() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputBoxCustomerPO);
        WebElementActions.getActions().inputText(inputBoxCustomerPO, "905");

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_InvoiceTwo);
        WebElementActions.getActions().clickElement(btn_InvoiceTwo);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(errorMsg);
        Assert.assertTrue(errorMsg.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_OK);
        WebElementActions.getActions().clickElement(btn_OK);
    }
}
