package tests.serviceBoard;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.awt.*;
import java.io.FileNotFoundException;
@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("EstimateSubmit Test")

public class SubmitAnEstimate_ServiceManagerTest extends TestDriverActions {

    @Test(priority = 0, description="T_001 Login to the page and Go to service board",enabled = true)
    @Description("Test Description : Login the service board and scroll the page horizontally")
    public void goto_service_board() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(prop.getProperty("manager_one_username"),prop.getProperty("manager_one_password"));
        submit.gotoServiceBoard();
      //  submit.clickOnServiceBoard() ;
        submit.moveRightToLeft();

    }

    @Test(priority = 1, description="T_002 Click on Estimate link and verify the elements",enabled = true)
    @Description("Test Description :Click on Estimete link and verify the elements")
    public void scroll_service_board() throws InterruptedException {

      submit.clickOnEstimateLink();
      submit.clickOnYESbutton();
      submit.repairEstimatePage();
      submit.externalNote();


    }

    @Test(priority = 2, description="T_003 Add the labour,save it and delete it",enabled = true)
    @Description("Test Description :Add the labour,save it and delete it ")
    public void add_labour_verify_it_delete_it() throws InterruptedException {
        submit.clickOnAddLabour();
        submit.workRequiredPage();
        submit.clickOnVMRStab();
        submit.clickOnUnitHistoryTab();
        submit.clickOnOtherHistorytab();
        submit.clickOnServiceProgramTab();
        submit.clickOnAmericaBreakingSystemImg();
        submit.clickOnAirDiscBreaksPlusIcon();
        submit.typeExternalNotes();
        submit.clickOnAddButton();
        submit.clickOnCrossIcon();
        submit.clickOnDeleteIcon();
        submit.nodataToDisplay();
    }

    @Test(priority = 3, description="T_004 Again add the same labour and save it",enabled = true)
    @Description("Test Description : Again add the same labour and save it")
     public void add_labour_save_it() throws InterruptedException {
        submit.clickOnAddLabour();
        submit.clickOnAmericaBreakingSystemImg();
        submit.clickOnAirDiscBreaksPlusIcon();
        submit.typeExternalNotes();
        submit.clickOnAddButton();

    }

    @Test(priority = 4, description="T_005 Add accessories group part and save it",enabled = true)
    @Description("Test Description :Add accessories group part and save it ")
    public void add_VMRS_accessories_part() throws InterruptedException {
        submit.clickOnAddLabour();
        submit.clickOnVMRStab();
        submit.clickOnAccessoriesImgVMRS();
        submit.clickOnPlusIconVMRS();
        submit.verifyVMRSElement();
        submit.clickOnCrossIconUnschedule();
        submit.clickOnSelectedReason();
        submit.clickOnSelectButtonAccident();
        submit.clickOnTaskHyperlink();
        submit.clickOnTaskSelectButton();
        submit.clickOnAddButtonVmrs();
    }

    @Test(priority = 5, description="T_006 Add part and send part number",enabled = true)
    @Description("Test Description :Add part and send part number ")
    public void send_part_number() throws InterruptedException {
        submit.clickOnAddParts();
        submit.sendPartNumber();
        submit.clickOnAddPArt2();
        submit.clickOnCloseButton();

    }

    @Test(priority = 6, description="T_007 Click on accessories group and add non-Catalog part",enabled = true)
    @Description("Test Description : Click on accessories group and add non-Catalog part")
    public void add_noncatalog_part_number() throws InterruptedException {

        submit.clickOnAddParts();
        submit.clickOnAccessoriesGrpIMG();
        submit.clickOnNonCatalogPart();
        submit.typeNCPpartNumber();
        submit.typeDescription();
        submit. typeUnitCost();
        submit.clickOnAddPartNCP();
        submit.clickOnCloseBtnAddParts();

    }

     @Test(priority = 7, description="T_008 click on part name and verify elements",enabled = true)
    @Description("Test Description : click on part name and verify elements ")
    public void verify_partname_and_description() throws InterruptedException, AWTException {
         submit.verifyVMRSname();
         submit.clickOnSaveandExitBtn();

    }

    @Test(priority =8 , description="T_009 add core part and delete main part",enabled = true)
    @Description("Test Description :add core part and delete main part ")
    public void add_corepart_delete_mainpart() throws InterruptedException, AWTException {
        submit.clickOnAddParts();
        submit.sendCorePart();
        submit.clickOnCross();
        submit.clickOnTrashButton();
        submit.clickOnCloseButtonCore();

    }

    @Test(priority =9 , description="T_010 click on submit and signout the page",enabled = true)
    @Description("Test Description : click on submit and signout the page")
    public void clickOn_submit_signOut_page() throws InterruptedException {
        submit.clickOnSubmitbutton();
        submit.clickOnSignOut();

    }










}
