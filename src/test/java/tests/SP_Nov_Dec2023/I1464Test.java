package tests.SP_Nov_Dec2023;

import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class I1464Test extends TestDriverActions {
    @Test(priority = 0, description = "Login", enabled = true)
    public void Test_001_gotoReportScreen() throws FileNotFoundException, InterruptedException {

        loginPage.loginWithValidCredentials(prop.getProperty("manager_one_username"), prop.getProperty("manager_one_password"));
        i1464Page.clickOnPartsMenu();
    }

    @Test(priority = 1, description = "AddNewCounterSaleButtonWithoutCustomerPO", enabled = true)
    public void Test_002_AddNewCounterSaleButtonWithoutCustomerPO() throws FileNotFoundException, InterruptedException {
        i1464Page.clickOnAddNewCounterSale();
        i1464Page.AddNewCounterSaleButtonWithoutCustomerPO();
    }
    @Test(priority = 2, description = "AddNewCounterSaleButtonWithCustomerPO", enabled = true)
    public void Test_003_AddNewCounterSaleButtonWithCustomerPO() throws FileNotFoundException, InterruptedException {
        i1464Page.AddNewCounterSaleButtonWithCustomerPO();
    }
    @Test(priority = 3, description = "NonRepairBillButtonWithoutCustomerPO", enabled = true)
    public void Test_004_NonRepairBillButtonWithoutCustomerPO() throws FileNotFoundException, InterruptedException {
        i1464Page.clickOnServiceMenu();
        i1464Page.NonRepairBillButtonWithoutCustomerPO();
        i1464Page.NonRepairBillButtonWithCustomerPO();
    }
    @Test(priority = 4, description = "NonRepairBillButtonWithCustomerPO", enabled = true)
    public void Test_005_NonRepairBillButtonWithCustomerPO() throws FileNotFoundException, InterruptedException {

    }

}
