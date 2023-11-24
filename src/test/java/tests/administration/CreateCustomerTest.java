package tests.administration;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("Customer Test")

public class CreateCustomerTest extends TestDriverActions {

    @Test(priority=0, description = "Login the page and go to customer screen",enabled = true)
    @Description("Test Description: Login the page and go to customer screen")
    public void Test_001_gotoCustomerScreen() throws FileNotFoundException, InterruptedException {
        driver.get(prop.getProperty("KONA_EU"));
 //          driver.get(SheetConstants.KONA_EU);
//        loginPage.loginWithValidCredentials(prop.getProperty("service_one_username"), prop.getProperty("service_one_password") );
        loginPage.loginWithValidCredentials(prop.getProperty("username_manager_one"), prop.getProperty("password_manager_one") );
        customerPage.gotoCustomerScreen();
        customerPage.clickOnAddCustomer();
    }

    @Test(priority=1, description = "Test_002 verify all elements in the field", enabled = true)
    @Description("Test Description: verify all elements in the field")
    public void Test_002_verifyAllFields() throws InterruptedException {
        customerPage.customerManagerTitle();
        customerPage.customerListTableTitle();
        customerPage.newCustomerPage();
        customerPage.addressTitle();
        customerPage.contractsTitle();
        customerPage.taxExemptTitle();
    }

    @Test(priority=2, description = "Test_003 enter Customer Code and name in the field and click on OK", enabled =true)
    @Description("Test Description: enter Customer Code and name in the field and click on OK")
    public void Test_003_enterfieldsandclickonOK()  throws InterruptedException
    {
        customerPage.enterCode();
        customerPage.entername();
        customerPage.countryavailable();
        customerPage.clickOnOKbutton();

    }

    @Test(priority=3, description= "Check the Customer name in search field and sign out the page", enabled = true )
    @Description("Test Description : Check the Customer name in search field and sign out the page")
    public void Test_004_searchnameandclickonSignout() throws InterruptedException {
        customerPage.CustomerNameInSearchField();
        customerPage.clickOnSignOut();
    }


}
