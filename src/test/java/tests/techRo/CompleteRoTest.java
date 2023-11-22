package tests.techRo;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class CompleteRoTest extends TestDriverActions {


    @Test(priority = 0, description = "Test_001_Login the page and Go to CompleteRo Screen")
    @Description("Test Description: Login the page and Go to CompleteRo Screen")
    public void Test_001_gotoCompleteRo() throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(prop.getProperty("service_one_username"), prop.getProperty("service_one_password"));
        completeropage.goToCompleteROScreen();

    }

    @Test(priority = 1, description = "Test_002_verify element Present ")
    @Description("Test Description: verify element Present ")
    public void Test_002_verifyElement() throws InterruptedException, IOException {
        completeropage.verifyElementPresent();

    }
    @Test(priority = 2, description = "Test_003_Input The Ro Number in search TextArea  ")
    @Description("Test Description:Input The Ro Number in search TextArea ")
    public void Test_003_inputRoNumber() throws InterruptedException, IOException {
        completeropage.enterDataInSearchTextArea ();
        completeropage.clickOnRefresh ();

    }
    @Test(priority = 3, description = "Test_004_Click On Reference Number ")
    @Description("Test Description:  Click On Reference Number ")
    public void Test_004_clickReferenceNumber() throws InterruptedException, IOException {
        completeropage.clickOnRoNumber () ;
        completeropage. verifyInvoiceText ();
        completeropage. verifyRoDate ();
        completeropage. clickOnRoDate ();


    }
    @Test(priority = 4, description = "Test_005_Enter the Yesterday Date ")
    @Description("Test Description: Enter the Yesterday Date ")
    public void Test_005_enterYesterdayDate() throws InterruptedException, IOException {
        completeropage.enterYesterdayDate ();
        completeropage.verifyRoNumber ();
        completeropage. clickInvoiceButton ();
        completeropage. clickSignOut ();
        completeropage.ClickUserNameTextArea ();

    }

}