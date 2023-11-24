package tests.parts;

import constants.SheetConstants;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class JournalizePartsInvoice_konaEUTest extends TestDriverActions{


        @Test(priority = 0, description = "Test_001_Login the page and Go to Financial Manager Screen ")
        @Description("Test Description: Login the page and Go to Financials ")
        public void Test_001_gotoFinancials() throws InterruptedException, IOException {
            driver.get(SheetConstants.KONA_NA);
            loginPage.loginWithValidCredentials(prop.getProperty("manager_three_username"), prop.getProperty("manager_three_password"));
            journalizepartinvoice.gotoFinancials();
        }

        @Test(priority = 1, description = "Test_002_Click OnGenerate Journals Button  ")
        @Description("Test Description: Click OnGenerate Journals Button ")
        public void Test_002_clickOnGenerateJournals() throws InterruptedException, IOException {
            journalizepartinvoice.clickOnGenerateJournals();
            journalizepartinvoice.clikOnCloseWorkOrderElement();
            journalizepartinvoice.clickOnSelectCloseWorkOrder();
            journalizepartinvoice.clickOnGenerateJournalsButton ();
        }
        @Test(priority = 2, description = "Test_003_Click On Service Board   ")
        @Description("Test Description: Click On Service Board  ")
        public void Test_003_clickOnServiceBoard ()  throws InterruptedException, IOException {
            journalizepartinvoice.clickOnServiceBoard();
            journalizepartinvoice.clickOnFiancialManager();
        }
        @Test(priority = 3, description = "Test_004_Sign Out And Username ")
        @Description("Test Description: Sign Out And Username")
        public void Test_004_clickOnSignOut () throws InterruptedException, IOException {

    //        journalizepartinvoice.verifyTodaysDate();
            journalizepartinvoice.clickOnSignOut () ;
            journalizepartinvoice.clickOnUSerNameTextArea ();

        }


}
