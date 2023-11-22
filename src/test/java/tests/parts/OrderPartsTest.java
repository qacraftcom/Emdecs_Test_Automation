package tests.parts;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("OrderParts Test")


public class OrderPartsTest extends TestDriverActions {

    @Test(priority=0, description="T_001 Login the page and go to order parts",enabled = true)
    @Description("Test Description :Login the page and go to order parts ")
    public void gotoOrderParts() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(prop.getProperty("manager_one_username"),prop.getProperty("manager_one_password") );
        order.gotoOrderParts();
    }

    @Test(priority=1, description="T_002 Verify the search catalog and enter the partial part number",enabled = true)
    @Description("Test Description :Verify the search catalog and enter the partial part number ")
    public void searchCatalog_enterPartialPartNumber() throws InterruptedException {
       order.clickOnSpotOrder();
       order.verifySearchCatalog();
       order.enterNumber();
       order.searchCatalog();
       order.clickOnAddButton();
    }

   @Test(priority=2, description="T_003 Verify order list and enter search part description",enabled = true)
    @Description("Test Description :Verify order list and enter search part description ")
    public void enter_search_part_description() throws InterruptedException {
        order.verifyOrderListSection();
        order.enterSwitchMicro();
        order.selectDropDown();
        order.verifysearchpartdescription();
        order.clickOnAddButton();
       order.verifysearchpartdescription2();

    }

    @Test(priority=3, description="T_004 Enter full part number and delete search part description",enabled = true)
    @Description("Test Description : Enter full part number and delete search part description")
    public void enter_fullPart_delete_searchPart() throws InterruptedException {
        order.selectDropDown2();
        order.addFullpartNumber();
        order.clickOnIncreamentDecreament();
        order.clickOnAddButton();
        order.clickOnCrossIcon();
    }

     @Test(priority=4, description="T_005 Enter Core Parent Part number and click on issue Po ",enabled = true)
    @Description("Test Description : Enter Core Parent Part number and click on issue Po ")
    public void enterCoreParentPartNumber() throws InterruptedException {
        order.addCoreParentPartNumber();
        order.clickOnAddButton();
 //       order.verifyParentandCorepart();
        order.clickOnIssuePo();
        order.verifyIssuePOPopup();
        order.clickOnIssuePoBtn();

    }

    @Test(priority=5, description="T_006 Verify purchase order and check PO number",enabled = true)
    @Description("Test Description : Verify purchase order and check PO number ")
    public void verification_Of_PO_Number() throws InterruptedException {
        order.verifyPurchaseOrder();
        order.clickOnOKbtn();
        order.clickWIPPobtn();
        order.verifyWIPPoElement();
        order.clickOnPONumber();
        order.clickOnSubmitPrintPO();
        order.clickOnSignOut();
//changes
    }

















}
