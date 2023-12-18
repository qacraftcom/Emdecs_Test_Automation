package tests.parts;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})


public class ReceivePartsTest extends TestDriverActions {


    @Test(priority=0 , description ="Test001: go to receiveParts ",enabled = true)
    @Description("Test Description : Go to receive parts")
    public void goto_receive_parts() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(prop.getProperty("manager_one_username"), prop.getProperty("manager_one_password") );
        receivePage.gotoReceiveParts();
        receivePage.enterDateClickrefresh();
    }

    @Test(priority=1, description="Test002: click on PO number and verify page",enabled = true)
    @Description("Test Description : Click on PO number and Verify page")
     public void clickOn_PoNumber_Verify_Page() throws InterruptedException {
        receivePage.clickOnPONumber();
        receivePage.displayAllLabels();

    }

    @Test(priority=2, description="Test003: click on link button and verify the elements",enabled = true)
    @Description("Test Description : Click on link button and verify the elements")
    public void clickOn_link_button() throws InterruptedException {
        receivePage.clickOnLinkButton();
        receivePage.repairOrderActivityTable();
        receivePage.openCounterSaleButton() ;
        receivePage.openCounterSaleTable();
        receivePage.clickOnCancleButtonOpenCounter();
        receivePage.canclePOscreen() ;

    }

    @Test(priority=3, description="Test004: click on ReceivePo and add invoice number",enabled = true)
    @Description("Test Description : Send invoice number")
    public void clickOn_ReceivePo_Send_Invoice_Number() throws InterruptedException {
        receivePage.clickOnReceivePO();
        receivePage.clickOnReceiveParts();
 //       receivePage.clickOnReceivePO();
        receivePage.clickOnSignOut();
    }
}
