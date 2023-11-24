package pages.serviceBoard;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class SubmitAnEstimate_ServiceManagerPage extends TestDriverActions {

    @FindBy(xpath = "(//a[text()='Service Board'])[1]")
    WebElement btn_serviceBoard;

    @FindBy(xpath = "(//span[text()='Estimate'])[2]")
    WebElement btn_estimate;

    @FindBy(xpath = "//span[text()='Yes']")
    WebElement btn_yes;

    @FindBy(xpath = "//h1[text()='Repair Estimate']")
    WebElement title_repairEstimate;

    @FindBy(xpath = "//h1[text()='Repair Estimate']/following::span[4]")
    WebElement asterisk_location;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement label_location;

    @FindBy(xpath = "//label[text()='Location:']/following::a[1]")
    WebElement hyperlink_location;

    @FindBy(xpath = "//label[text()='Owner:']")
    WebElement label_owner;

    @FindBy(xpath = "//label[text()='Owner:']/following::td[1]/span")
    WebElement txt_owner;

    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement label_unit;

    @FindBy(xpath = "//label[text()='Unit #:']/following::div[1]")
    WebElement txt_unit;

    @FindBy(xpath = "//label[text()='Year:']")
    WebElement label_year;

    @FindBy(xpath = "//label[text()='Year:']/following::div[1]")
    WebElement txt_year;

    @FindBy(xpath = "//label[text()='Make & Model:']")
    WebElement label_makeModel;

    @FindBy(xpath = "//label[text()='Make & Model:']/following::div[1]")
    WebElement txt_makeModel;

    @FindBy(xpath = "//label[text()='Estimate#:']")
    WebElement label_estimate;

    @FindBy(xpath = "(//label[text()='Notes:'])[1]")
    WebElement label_notes;

    @FindBy(xpath = "(//label[text()='Notes:'])[1]/following::textarea[1]")
    WebElement txt_notes;

    @FindBy(xpath = "//label[text()='VIN:']")
    WebElement label_vin;

    @FindBy(xpath = "//label[text()='VIN:']/following::div[1]")
    WebElement txt_vin;

    @FindBy(xpath = "//label[text()='Date:']/preceding-sibling::span")
    WebElement asterisk_date;

    @FindBy(xpath = "//label[text()='Date:']")
    WebElement label_date;

    @FindBy(xpath = "//label[text()='Date:']/following::span[3]")
    WebElement txt_date;

    @FindBy(xpath = "(//label[text()='Internal Ref#:'])[1]")
    WebElement label_internalRef;

    @FindBy(xpath = "(//label[text()='Internal Ref#:'])[1]/following::input[1]")
    WebElement txt_internalRef;

    @FindBy(xpath = "(//label[text()='Internal Notes:'])[1]")
    WebElement label_internalNotes;

    @FindBy(xpath = "(//label[text()='Internal Notes:'])[1]/following::textarea")
    WebElement txt_internalNotes;

    @FindBy(xpath = "//label[text()='Labour:']")
    WebElement label_labour;

    @FindBy(xpath = "//label[text()='Labour:']/following::td[2]")
    WebElement txt_labour;

    @FindBy(xpath = "//label[text()='Parts:']")
    WebElement label_parts;

    @FindBy(xpath = "//label[text()='Parts:']/following::td[2]")
    WebElement txt_parts;

    @FindBy(xpath = "//label[text()='Shop Charges:']")
    WebElement label_shopCharges;

    @FindBy(xpath = "//label[text()='Shop Charges:']/following::td[2]")
    WebElement txt_shopCharges;

    @FindBy(xpath = "//label[text()='Surcharge:']")
    WebElement label_surcharge;

    @FindBy(xpath = "//label[text()='Surcharge:']/following::td[2]/a")
    WebElement txt_surcharge;

    @FindBy(xpath = "//label[text()='Sub Total:']")
    WebElement label_subTotal;

    @FindBy(xpath = "//label[text()='Sub Total:']/following::td[2]")
    WebElement txt_subTotal;

    @FindBy(xpath = "//label[text()='Tax:']")
    WebElement label_tax;

    @FindBy(xpath = "//label[text()='Tax:']/following::td[2]/a")
    WebElement txt_tax;

    @FindBy(xpath = "//label[text()='Total:']")
    WebElement label_total;

    @FindBy(xpath = "//label[text()='Total:']/following::td[2]")
    WebElement txt_total;

    @FindBy(xpath = "//span[text()='Void']")
    WebElement btn_void;

    @FindBy(xpath = "//span[text()='Submit']")
    WebElement btn_submit;

    @FindBy(xpath = "(//div[@class='xfn p_AFLeading'])[1]/a/img")
    WebElement attachment_icon;

    @FindBy(xpath = "(//div[@class='xfn p_AFLeading'])[1]/a/img/following-sibling::span")
    WebElement attachmentIcon_zero;

    @FindBy(xpath = "//span[text()='Repair Estimate']")
    WebElement label_repairEstimate;

    @FindBy(xpath = "//h2[text()='Labour']")
    WebElement label_labourtable;

    @FindBy(xpath = "//span[text()='Add Labour']/preceding-sibling::img")
    WebElement icon_plus;

    @FindBy(xpath = "(//span[text()='#'])[1]")
    WebElement icon_hash;

    @FindBy(xpath = "(//span[text()='Description'])[1]")
    WebElement label_description;

    @FindBy(xpath = "(//span[text()='Estimated Hours'])[1]")
    WebElement label_estimateHrs;

    @FindBy(xpath = "(//span[text()='Hourly Charge'])[1]")
    WebElement label_hrlyCharges;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]")
    WebElement label_totalCharges;

    @FindBy(xpath = "(//div[text()='No data to display'])[1]")
    WebElement label_NoDataToDispaly;

    @FindBy(xpath = "//span[text()='Add Parts']")
    WebElement label_addParts;

    @FindBy(xpath = "(//span[text()='#'])[2]")
    WebElement icon_hash2;

    @FindBy(xpath = "//span[text()='Part #']")
    WebElement label_part2;

    @FindBy(xpath = "//span[text()='Core']")
    WebElement label_core;

    @FindBy(xpath = "//span[text()='Estimated Quantity']")
    WebElement label_estimateQuantity;

    @FindBy(xpath = "//span[text()='Unit Charge']")
    WebElement label_unitCharge;

    @FindBy(xpath = "//span[text()='Total Charge']")
    WebElement label_totalCharge;

    @FindBy(xpath = "//span[text()='Add Labour']")
    WebElement btn_addLabour;

    @FindBy(xpath = "//div[text()='Work Required']")
    WebElement label_workRequired;

    @FindBy(xpath = "(//label[text()='Owner:'])[2]")
    WebElement label_owner2;

    @FindBy(xpath = "(//label[text()='Owner:'])[2]/following::td[1]/span")
    WebElement txt_owner2;

    @FindBy(xpath = "(//label[text()='Unit #:'])[2]")
    WebElement label_unit2;

    @FindBy(xpath = "(//label[text()='Unit #:'])[2]/following::td[1]/span")
    WebElement txt_unit2;

    @FindBy(xpath = "(//a[text()='Service Programs'])[1]")
    WebElement btn_serviceProgram;

    @FindBy(xpath = "(//a[text()='MOTOR'])[1]")
    WebElement btn_motor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement btn_vmrs;

    @FindBy(xpath = "(//a[text()='Unit History'])[1]")
    WebElement btn_unitHistory;

    @FindBy(xpath = "(//a[text()='Other History'])[1]")
    WebElement btn_otherHistory;

    @FindBy(xpath = "(//label[text()='Search:'])[1]/following::td[3]/a/img")
    WebElement icon_accessoriGroup;

    @FindBy(xpath = "(//h2[text()='Labour'])[2]")
    WebElement label_UnitHistory_labour;

    @FindBy(xpath = "(//h2[text()='Parts'])[1]")
    WebElement label_unitHistory_parts;

    @FindBy(xpath = "(//h1[text()='Selected'])[1]")
    WebElement label_unithistory_selected;

    @FindBy(xpath = "//label[text()='Search:']/following::td[3]/a/img")
    WebElement img_America_Breacking_system;

    @FindBy(xpath = "(//span[text()='Description'])[2]/following::a[1]")
    WebElement icon_Plus_airDiscBreaks;

    @FindBy(xpath ="//label[text()='Standard Hours:']/following::textarea[1]")
    WebElement note_ExternalNote_ServiceProgram;

    @FindBy(xpath = "//textarea[text()='Air Disc Brakes']")
    WebElement label_airDiscBreakes;

    @FindBy(xpath = "//label[text()='Complaint:']/following::textarea[1]")
    WebElement complaint_externalNote;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement btn_add;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]/following::a[5]/img")
    WebElement icon_redCross_labour;

    @FindBy(xpath = "//span[text()='Add Labour']/following::a[1]/img")
    WebElement icon_delete1;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]/following::div[3]")
    WebElement noDataToDisplay1;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']/following::a[1]/img")
    WebElement VMRS_accessoriesImg;


    @FindBy(xpath = "//span[text()='Add Labour']")
    WebElement btn_addLabour2;

    @FindBy(xpath = "(//span[text()='Description'])[2]/following::td[2]/span/a/img")
    WebElement plusicon_vmrs_accessories;

    @FindBy(xpath = "//textarea[text()='Accessories Group']")
    WebElement label_VMRSName;

    @FindBy(xpath = "//label[text()='Cause/Reason:']")
    WebElement label_cause_Reason;

    @FindBy(xpath = "//label[text()='Cause/Reason:']/following::a[1]")
    WebElement label_unscheduleService;

    @FindBy(xpath = "//label[text()='Task:']")
    WebElement label_task;

    @FindBy(xpath = "//label[text()='Task:']/following::a[1]")
    WebElement label_risk;

    @FindBy(xpath = "//label[text()='Cause/Reason:']/following::td[3]/a/img")
    WebElement crossIcon_unscheduleService;

    @FindBy(xpath = "//label[text()='Cause/Reason:']/following::td[2]/a")
    WebElement hyperlink_selectReason;

    @FindBy(xpath = "//span[text()='Notes']/following::a[1]/span")
    WebElement btn_select;

    @FindBy(xpath = "//label[text()='Task:']/following::a[1]")
    WebElement task_hyperlink;

    @FindBy(xpath = "//span[text()='Notes']/following::a[1]/span")
    WebElement btn_select1;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement workRequird_add_btn;

    @FindBy(xpath = "//span[text()='Add Parts']")
    WebElement btn_addParts;

    @FindBy(xpath = "(//label[text()='Part #:']/following::input)[1]")
    WebElement txt_parts_AirdiscBrakes;

    @FindBy(xpath = "//ul[@class='AFAutoSuggestItemsContainer']//li")
    WebElement autoList;

    @FindBy(xpath = "(//tboli)[1]dy/tr/td/ul/")
    WebElement list_number;

    @FindBy(xpath = "//label[text()='Quantity:']/following::input[1]")
    WebElement txt_quantity;

    @FindBy(xpath = "//span[text()='Add Part']")
    WebElement btn_addParts_AddParts;

    @FindBy(xpath = "(//span[text()='Estimated Quantity'])[2]/following::a[3]/span[2]")
    WebElement verify_2;

    @FindBy(xpath = "//span[text()='Close']")
    WebElement btn_close;

    @FindBy(xpath = "(//span[text()='Total Charge'])[2]/following::td[2]/span")
    WebElement label_partNumber;

    @FindBy(xpath = "//div[text()='Add Parts']/following::a[2]/img")
    WebElement Img_Accessories_Grp;

    @FindBy(xpath = "//span[text()='Non-Catalog Part']")
    WebElement btn_nonCatalogPart;

    @FindBy(xpath = "(//label[text()='Part#:'])[1]/following::input[1]")
    WebElement txt_partNumber;

    @FindBy(xpath = "(//label[text()='Description:'])[1]/following::input[1]")
    WebElement txt_description;

    @FindBy(xpath = "(//label[text()='Unit Cost:'])[1]/following::input[1]")
    WebElement txt_unitCost;

    @FindBy(xpath = "(//span[text()='Add Part'])[2]")
    WebElement btn_addpart_NCP;

    @FindBy(xpath = "(//span[text()='Description'])[2]/following::td[3]/span/a")
    WebElement txt_description_NCP_part;

    @FindBy(xpath = "//div[contains(@id,'cbClosePopupAddParts')]")
    WebElement btn_close_addpart;

    @FindBy(xpath = "(//span[text()='Total Charge'])[2]/following::a[1]")
    WebElement hyperlink_NMC_number;

    @FindBy(xpath = "//label[text()='Description:']/preceding::div[1]")
    WebElement ncp_part;

    @FindBy(xpath = "//label[text()='Description:']")
    WebElement ncp_description;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement btn_saveAndExit;

    @FindBy(xpath = "//span[text()='Core Return']")
    WebElement btn_coreReturn;

    @FindBy(xpath = "//span[text()='Total']/following::a[7]/img")
    WebElement crossicon_ncp;

    @FindBy(xpath = "//h2[text()='Parts']/following::a[1]/img")
    WebElement deleteicon_ncp;

    @FindBy(xpath = "//span[text()='Close']")
    WebElement btn_close_ncp;

    @FindBy(xpath = "//span[text()='Location']")
    WebElement ele_Location;


    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "(//span[text()='OK'])[1]")
    public WebElement okBtn;

    @FindBy(xpath = "//tr[@class='p_AFFocused p_AFSelected x17d']/td[2]")
    WebElement accessories_grp_row;

    @FindBy(xpath = "//label[text()='Status:']/following::div[1]")
    WebElement label_draft;

    @FindBy(xpath = "(//span[text()='Total Charge']/following::th[1])[1]")
    WebElement labour_attachment_icon_column;

    @FindBy(xpath = "(//span[text()='Total Charge']/following::th[2])[1]")
    WebElement labour_delete_icon_column;

    @FindBy(xpath = "(//span[text()='Total Charge']/following::th[1])[2]")
    WebElement part_attachment_icon_column;

    @FindBy(xpath = "(//span[text()='Total Charge']/following::th[2])[2]")
    WebElement part_delete_icon_column;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    public void gotoServiceBoard() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Service Board");

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Service Board tab
     */
    public void clickOnServiceBoard() throws InterruptedException {

        WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_serviceBoard);
        WebElementActions.getActions().clickElement(btn_serviceBoard);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
     }

    /**
     * move to right side horizontally
     * move to left side horizontally
     */
      public void moveRightToLeft() throws InterruptedException {
          Thread.sleep(2000);
          WebElementActions.getActions().moveOnTargetElement(btn_estimate);
          Thread.sleep(3000);
          WebElementActions.getActions().moveOnTargetElement(ele_Location);

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on estimate link
     */
      public void clickOnEstimateLink() throws InterruptedException {
          WebElementActions.getActions().moveOnTargetElement(btn_estimate);
          WebElementActions.getActions().clickElement(btn_estimate);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on YES button
     */
     public void clickOnYESbutton() throws InterruptedException {
 //        WaitActions.getWaits().waitForElementTobeClickable(btn_yes);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_yes);
         WebElementActions.getActions().clickElement(btn_yes);

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }

    /**
     * verify element of Repair Estimate Page
     */
    public void repairEstimatePage() throws InterruptedException {
 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(asterisk_location);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(asterisk_location);
        Assert.assertTrue(asterisk_location.isDisplayed());
        Assert.assertTrue(label_location.isDisplayed());
        Assert.assertTrue(hyperlink_location.isDisplayed());
        Assert.assertTrue(label_owner.isDisplayed());
        Assert.assertTrue(txt_owner.isDisplayed());
        Assert.assertTrue(label_unit.isDisplayed());
        Assert.assertTrue(txt_unit.isDisplayed());
        Assert.assertTrue(label_year.isDisplayed());
        Assert.assertTrue(txt_year.isDisplayed());
        Assert.assertTrue(label_makeModel.isDisplayed());
        Assert.assertTrue(txt_makeModel.isDisplayed());
        Assert.assertTrue(label_estimate.isDisplayed());
        Assert.assertTrue(label_notes.isDisplayed());
        Assert.assertTrue(txt_notes.isDisplayed());
        Assert.assertTrue(label_vin.isDisplayed());
        Assert.assertTrue(txt_vin.isDisplayed());
        Assert.assertTrue(asterisk_date.isDisplayed());
        Assert.assertTrue(label_date.isDisplayed());
        Assert.assertTrue(txt_date.isDisplayed());
        Assert.assertTrue(label_internalRef.isDisplayed());
        Assert.assertTrue(txt_internalRef.isDisplayed());
        Assert.assertTrue(label_internalNotes.isDisplayed());
        Assert.assertTrue(txt_internalNotes.isDisplayed());
        Assert.assertTrue(label_labour.isDisplayed());
        Assert.assertTrue(txt_labour.isDisplayed());
        Assert.assertTrue(label_parts.isDisplayed());
        Assert.assertTrue(txt_parts.isDisplayed());
        Assert.assertTrue(label_shopCharges.isDisplayed());
        Assert.assertTrue(txt_shopCharges.isDisplayed());
        Assert.assertTrue(label_surcharge.isDisplayed());
        Assert.assertTrue(txt_surcharge.isDisplayed());
        Assert.assertTrue(label_subTotal.isDisplayed());
        Assert.assertTrue(txt_subTotal.isDisplayed());
        Assert.assertTrue(label_tax.isDisplayed());
        Assert.assertTrue(txt_tax.isDisplayed());
        Assert.assertTrue(label_total.isDisplayed());
        Assert.assertTrue(txt_total.isDisplayed());
        Assert.assertTrue(btn_void.isDisplayed());
        Assert.assertTrue(btn_submit.isDisplayed());
        WaitActions.getWaits().WaitUntilWebElementIsVisible(attachment_icon);
        Assert.assertTrue(attachment_icon.isDisplayed());
        Assert.assertTrue(attachmentIcon_zero.isDisplayed());
        Assert.assertTrue(label_repairEstimate.isDisplayed());
        Assert.assertTrue(label_labourtable.isDisplayed());
        Assert.assertTrue(icon_plus.isDisplayed());
        Assert.assertTrue(icon_hash.isDisplayed());
        Assert.assertTrue(label_description.isDisplayed());
        Assert.assertTrue(label_estimateHrs.isDisplayed());
        Assert.assertTrue(label_hrlyCharges.isDisplayed());
        Assert.assertTrue(label_totalCharges.isDisplayed());
        Assert.assertTrue(labour_attachment_icon_column.isDisplayed());
        Assert.assertTrue(labour_delete_icon_column.isDisplayed());
        Assert.assertTrue(label_NoDataToDispaly.isDisplayed());
        Assert.assertTrue(label_addParts.isDisplayed());
        Assert.assertTrue(icon_hash2.isDisplayed());
        Assert.assertTrue(label_part2.isDisplayed());
        Assert.assertTrue(label_core.isDisplayed());
        Assert.assertTrue(label_estimateQuantity.isDisplayed());
        Assert.assertTrue(label_unitCharge.isDisplayed());
        Assert.assertTrue(label_totalCharge.isDisplayed());
        Assert.assertTrue(part_attachment_icon_column.isDisplayed());
        Assert.assertTrue(part_delete_icon_column.isDisplayed());
        Assert.assertTrue(label_draft.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * Type external note
     */
     public void externalNote() throws InterruptedException {
//         Thread.sleep(2000);
//         WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_notes);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_notes);
         WebElementActions.getActions().inputText(txt_notes,"External note");

         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on Add Labour
     */
    public void clickOnAddLabour() throws InterruptedException {
//        Thread.sleep(3000);
//        try {
//            WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_addLabour);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_addLabour);
            WebElementActions.getActions().clickElement(btn_addLabour);
//        }
/*        catch(Throwable e)
        {
            e.printStackTrace();
        }  */
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * element verify on work requird page
     */
     public void workRequiredPage() throws InterruptedException {

 //        WaitActions.getWaits().WaitUntilWebElementIsVisible(label_owner2);
         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_owner2);
         Assert.assertTrue(label_owner2.isDisplayed());
         Assert.assertTrue(txt_owner2.isDisplayed());
         Assert.assertTrue(label_unit2.isDisplayed());
         Assert.assertTrue(txt_unit2.isDisplayed());
         Assert.assertTrue(btn_serviceProgram.isDisplayed());
         Assert.assertTrue(btn_motor.isDisplayed());
         Assert.assertTrue(btn_vmrs.isDisplayed());
         Assert.assertTrue(btn_unitHistory.isDisplayed());
         Assert.assertTrue(btn_otherHistory.isDisplayed());

         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on VMRS Tab
     */
    public void clickOnVMRStab() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(btn_vmrs);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_vmrs);
        WebElementActions.getActions().clickElement(btn_vmrs);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Unit History tab
     */
     public void clickOnUnitHistoryTab() throws InterruptedException {
//         Thread.sleep(2000);
//         WaitActions.getWaits().waitForElementTobeClickable(btn_unitHistory);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_unitHistory);
         WebElementActions.getActions().clickElement(btn_unitHistory);

         WaitActions.getWaits().loadingWait(loder);

         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * Click on Other History Tab
     */
    public void clickOnOtherHistorytab() throws InterruptedException {
//         Thread.sleep(3000);
//        try {
 //           WaitActions.getWaits().waitForElementTobeClickable(btn_otherHistory);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_otherHistory);
            WebElementActions.getActions().clickElement(btn_otherHistory);
 /*       }
        catch(Throwable e)
        {
            e.printStackTrace();
        }  */

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Service Program
     */
     public void clickOnServiceProgramTab() throws InterruptedException {
//         Thread.sleep(2000);
//         try {
  //           WaitActions.getWaits().waitForElementTobeClickable(btn_serviceProgram);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_serviceProgram);
             WebElementActions.getActions().clickElement(btn_serviceProgram);
 /*        }
         catch(Throwable e)
         {
             e.printStackTrace();
         }  */

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * Click on America Breacking System img
     */
    public void clickOnAmericaBreakingSystemImg() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(img_America_Breacking_system);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_America_Breacking_system);
        WebElementActions.getActions().clickElement(img_America_Breacking_system);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Air Disc Breaks + icon
     */
     public void clickOnAirDiscBreaksPlusIcon() throws InterruptedException {
          Thread.sleep(3000);
//         WaitActions.getWaits().waitForElementTobeClickable(icon_Plus_airDiscBreaks);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(icon_Plus_airDiscBreaks);
         WebElementActions.getActions().clickElement(icon_Plus_airDiscBreaks);

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);

//         WaitActions.getWaits().WaitUntilWebElementIsVisible(label_airDiscBreakes);
//         Assert.assertTrue(label_airDiscBreakes.isDisplayed());
     }
    /**
     * Type - External Notes
     */
      public void typeExternalNotes() throws InterruptedException {
//          Thread.sleep(2000);
//          WaitActions.getWaits().waitForElementTobeClickable(note_ExternalNote_ServiceProgram);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(note_ExternalNote_ServiceProgram);
          WebElementActions.getActions().inputText(note_ExternalNote_ServiceProgram,prop.getProperty("notes") );

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on Add button
     */
      public void clickOnAddButton() throws InterruptedException {
//          Thread.sleep(2000);
//          WaitActions.getWaits().waitForElementTobeClickable(btn_add);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_add);
          WebElementActions.getActions().clickElement(btn_add);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on cross icon
     */
    public void clickOnCrossIcon() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(icon_redCross_labour);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(icon_redCross_labour);
        WebElementActions.getActions().clickElement(icon_redCross_labour);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Delete Icon
     */
     public void clickOnDeleteIcon() throws InterruptedException {
//        Thread.sleep(2000);
//         try {
//             WaitActions.getWaits().waitForElementTobeClickable(icon_delete1);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(icon_delete1);
             WebElementActions.getActions().clickElement(icon_delete1);
 /*        }
         catch(Throwable e)
         {
             e.printStackTrace();
         }   */
         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * verify message No Data To Display
     */
      public void nodataToDisplay() throws InterruptedException {
//          WaitActions.getWaits().WaitUntilWebElementIsVisible(noDataToDisplay1);
//          Thread.sleep(2000);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(noDataToDisplay1);
          Assert.assertTrue(noDataToDisplay1.isDisplayed());

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on  Accessories Group img (VMRS)
     */
      public void clickOnAccessoriesImgVMRS() throws InterruptedException {
//          Thread.sleep(2000);
//          WaitActions.getWaits().waitForElementTobeClickable(VMRS_accessoriesImg);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(VMRS_accessoriesImg);
          WebElementActions.getActions().clickElement(VMRS_accessoriesImg);

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on Plus icon Accessories group VMRS
     */
      public void clickOnPlusIconVMRS() throws InterruptedException {
          Thread.sleep(2000);
//          WaitActions.getWaits().waitForElementTobeClickable(plusicon_vmrs_accessories);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plusicon_vmrs_accessories);
          WebElementActions.getActions().clickElement(plusicon_vmrs_accessories);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * Verify element present on VMRS Tab
     */
      public void verifyVMRSElement() throws InterruptedException {
 //         WaitActions.getWaits().WaitUntilWebElementIsVisible(label_VMRSName);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VMRSName);
          Assert.assertTrue(label_VMRSName.isDisplayed());
          Assert.assertTrue(label_cause_Reason.isDisplayed());
          Assert.assertTrue(label_unscheduleService.isDisplayed());
          Assert.assertTrue(label_task.isDisplayed());
          Assert.assertTrue(label_risk.isDisplayed());

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on Remove icon of Unschedule service
     */
      public void clickOnCrossIconUnschedule() throws InterruptedException {
//          Thread.sleep(2000);
//          WaitActions.getWaits().waitForElementTobeClickable(crossIcon_unscheduleService);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon_unscheduleService);
          WebElementActions.getActions().clickElement(crossIcon_unscheduleService);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on Selected Reason
     */
      public void clickOnSelectedReason() throws InterruptedException {
//          Thread.sleep(2000);
//          WaitActions.getWaits().waitForElementTobeClickable(hyperlink_selectReason);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_selectReason);
          WebElementActions.getActions().clickElement(hyperlink_selectReason);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on select button of Accident
     */
    public void clickOnSelectButtonAccident() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(btn_select);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions().clickElement(btn_select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Task Hyperlink
     */
    public void clickOnTaskHyperlink() throws InterruptedException {
 //       Thread.sleep(2000);
 //       WaitActions.getWaits().waitForElementTobeClickable(task_hyperlink);
 //       Thread.sleep(2000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(task_hyperlink);
        WebElementActions.getActions().clickElement(task_hyperlink);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on select button (open after task)
     */
     public void clickOnTaskSelectButton() throws InterruptedException {
//         Thread.sleep(2000);
//         WaitActions.getWaits().waitForElementTobeClickable(btn_select1);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select1);
         WebElementActions.getActions().clickElement(btn_select1);

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on Add button
     */
    public void clickOnAddButtonVmrs() throws InterruptedException {

 //       Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(okBtn);   //extra pop up generated
//        WebElementActions.getActions().clickElement(okBtn);

//        WaitActions.getWaits().waitForElementTobeClickable(workRequird_add_btn);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(workRequird_add_btn);
        WebElementActions.getActions().clickElement(workRequird_add_btn);

        if(okBtn.isDisplayed()) {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(okBtn);   //extra pop up generated
            WebElementActions.getActions().clickElement(okBtn);
        }


        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Add Parts
     */
     public void clickOnAddParts() throws InterruptedException {
//         try {
//             WaitActions.getWaits().waitForElementTobeClickable(btn_addParts);
         Thread.sleep(2000);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_addParts);
             WebElementActions.getActions().clickElement(btn_addParts);
  /*        }
        catch(Throwable e)
         {
             e.printStackTrace();
         }   */

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * Send Part number
     */
    public void sendPartNumber() throws InterruptedException {

//            Thread.sleep(10000);
//            WaitActions.getWaits().waitForElementTobeClickable(txt_parts_AirdiscBrakes);
     //       txt_parts_AirdiscBrakes.sendKeys(prop.getProperty("partNumber"));
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_parts_AirdiscBrakes);
            WebElementActions.getActions().inputText(txt_parts_AirdiscBrakes,prop.getProperty("partNumber"));
  //          Thread.sleep(2000);
 //       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(autoList);
            WebElementActions.getActions().clickElement(autoList);
            Thread.sleep(2000);
            txt_parts_AirdiscBrakes.clear();
            Thread.sleep(5000);

            WebElementActions.getActions().inputText(txt_parts_AirdiscBrakes, prop.getProperty("partNumber"));
            Thread.sleep(3000);
            WebElementActions.getActions().clickElement(autoList);

            Thread.sleep(1000);
            WebElementActions.getActions().inputText(txt_quantity, prop.getProperty("quantity"));

            TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Add Button to add Parts
     * Verify the quantity no 2
     */
    public void clickOnAddPArt2() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable( btn_addParts_AddParts);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_addParts_AddParts);
        WebElementActions.getActions().clickElement( btn_addParts_AddParts);
        Thread.sleep(2000);
//        WaitActions.getWaits().WaitUntilWebElementIsVisible(verify_2);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(verify_2);
        Assert.assertTrue(verify_2.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on close button
     */
     public void clickOnCloseButton() throws InterruptedException {
//         Thread.sleep(2000);
//         WaitActions.getWaits().waitForElementTobeClickable(btn_close);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_close);
         WebElementActions.getActions().clickElement(btn_close);

         WaitActions.getWaits().loadingWait(loder);

//         WaitActions.getWaits().WaitUntilWebElementIsVisible(label_partNumber);
         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_partNumber);
         Assert.assertTrue(label_partNumber.isDisplayed());

         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on Accessories Group IMG
     */
      public void clickOnAccessoriesGrpIMG() throws InterruptedException {
//          Thread.sleep(2000);
//          WaitActions.getWaits().waitForElementTobeClickable( Img_Accessories_Grp);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Img_Accessories_Grp);
          WebElementActions.getActions().clickElement( Img_Accessories_Grp);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on Non-Catalog Part
     */
    public void clickOnNonCatalogPart() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(btn_nonCatalogPart);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_nonCatalogPart);
        WebElementActions.getActions().clickElement(btn_nonCatalogPart);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  Type NCPpartNumber
     */
    public void typeNCPpartNumber() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(txt_partNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_partNumber);
       String NCPpartNumber= WebElementActions.getActions().randomAlphaNumeric(10);
       WebElementActions.getActions().inputText(txt_partNumber,NCPpartNumber);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Type description
     */
    public void typeDescription() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(txt_description);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_description);
        WebElementActions.getActions().inputText(txt_description,prop.getProperty("ncpPartDescription"));

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Type Unit Cost
     */
    public void typeUnitCost() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(txt_unitCost);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_unitCost);
        WebElementActions.getActions().inputText(txt_unitCost,prop.getProperty("unitCost"));

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Add Part
     */
    public void clickOnAddPartNCP() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(btn_addpart_NCP);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_addpart_NCP);
        WebElementActions.getActions().clickElement(btn_addpart_NCP);

        WaitActions.getWaits().loadingWait(loder);

//        WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_description_NCP_part);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_description_NCP_part);
        Assert.assertTrue(txt_description_NCP_part.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on close button
     */
    public void clickOnCloseBtnAddParts() throws InterruptedException {
//        try {
//            WaitActions.getWaits().waitForElementTobeClickable(btn_close_addpart);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_close_addpart);
            WebElementActions.getActions().clickElement(btn_close_addpart);
 /*       }
        catch(Throwable e)
        {
            e.printStackTrace();
        }  */

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click On VMRS name
     * verify text NCPpartNumber
     * verify text NCPpart Description
     */
    public void verifyVMRSname() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(hyperlink_NMC_number);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_NMC_number);
        WebElementActions.getActions().clickElement(hyperlink_NMC_number);

 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(ncp_part);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ncp_part);
          Assert.assertTrue(ncp_part.isDisplayed());
        Assert.assertTrue(ncp_description.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Extra Step - Click on save/Exit button
     */
    public void clickOnSaveandExitBtn() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(btn_saveAndExit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_saveAndExit);
        WebElementActions.getActions().clickElement(btn_saveAndExit);

 //       WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * send core part
     * click on core return button
     */
     public void sendCorePart() throws InterruptedException {
//         Thread.sleep(3000);
//         WaitActions.getWaits().waitForElementTobeClickable(txt_parts_AirdiscBrakes);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_parts_AirdiscBrakes);
         txt_parts_AirdiscBrakes.sendKeys(prop.getProperty("CorePart"));
         Thread.sleep(2000);
         WebElementActions.getActions().clickElement(autoList);
         Thread.sleep(2000);

         Assert.assertTrue(btn_coreReturn.isDisplayed());
 //        WaitActions.getWaits().waitForElementTobeClickable(btn_coreReturn);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_coreReturn);
         WebElementActions.getActions().clickElement(btn_coreReturn);

         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * Delete cross icon of part
     */
      public void clickOnCross() throws InterruptedException {
  //        WaitActions.getWaits().waitForElementTobeClickable(crossicon_ncp);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossicon_ncp);
          WebElementActions.getActions().clickElement(crossicon_ncp);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * Delete trash button
     */
      public void clickOnTrashButton() throws InterruptedException {
 //         WaitActions.getWaits().waitForElementTobeClickable(deleteicon_ncp);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(deleteicon_ncp);
          WebElementActions.getActions().clickElement(deleteicon_ncp);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on close button
     */
    public void clickOnCloseButtonCore() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(btn_close_ncp);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_close_ncp);
        WebElementActions.getActions().clickElement(btn_close_ncp);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on submit button
     */
    public void clickOnSubmitbutton() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(btn_submit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_submit);
        WebElementActions.getActions().clickElement(btn_submit);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Click on Sign out button
     * Verify Username
     */
    public void clickOnSignOut() throws InterruptedException {
        WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

        WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }








////ul[@class='AFAutoSuggestItemsContainer']/li[1]

//(//tboli)[1]dy/tr/td/ul/
}
