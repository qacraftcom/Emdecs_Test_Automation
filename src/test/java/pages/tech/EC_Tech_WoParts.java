package pages.tech;

import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.util.List;

public class EC_Tech_WoParts extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
    public WebElement TechBadge;

    @FindBy(xpath = "//span[text()='Go']")
    public WebElement go_btn;

    @FindBy(xpath = "//label[text()='Unit #:']/following::a[1]")
    public WebElement unit_Number;

    @FindBy(xpath = "(//a[text()='Parts'])[1]")
    public WebElement parts_tab;

    @FindBy(xpath = "//label[text()='Part #:']/preceding::label[1]")
    public WebElement label_Labour;

    @FindBy(xpath = "//label[text()='Part #:']")
    public WebElement label_part_hash;

    @FindBy(xpath = "//label[text()='Part #:']/following::input[1]")
    public WebElement txt_part;

    @FindBy(xpath = "//label[text()='Part #:']/following::a[1]/img")
    public WebElement search_icon;

    @FindBy(xpath = "//label[text()='Quantity  (EA):']")
    public WebElement label_Quantity;

    @FindBy(xpath = "//label[text()='Quantity  (EA):']/following::input[1]")
    public WebElement txt_quantity;

    @FindBy(xpath = "//span[text()='Non-Catalog Part']/following::th")
    public WebElement column_SR;

    @FindBy(xpath = "//span[text()='#']")
    public WebElement hash;

    @FindBy(xpath = "//span[text()='Part Number']")
    public WebElement label_part_Number;

    @FindBy(xpath = "//span[text()='Core']")
    public WebElement label_core;

    @FindBy(xpath = "//span[text()='Actual Quantity']")
    public WebElement label_ActualQuantity;

    @FindBy(xpath = "//span[text()='Charge Quantity']")
    WebElement label_ChargeQuantity;

    @FindBy(xpath = "//span[text()='Total Charge']")
    WebElement label_TotalCharge;

    @FindBy(xpath = "//span[text()='Total Charge']/following::span[1]")
    WebElement column_attachIcon;

    @FindBy(xpath = "//span[text()='Total Charge']/following::span[2]")
    WebElement column_crossIcon;

    @FindBy(xpath = "//div[text()='No data to display']")
    WebElement label_NodataDisplay;

    @FindBy(xpath = "//ul[@class='AFAutoSuggestItemsContainer']/li")
    WebElement number_15_762;

    @FindBy(xpath = "//label[text()='Warehouse:']")
    WebElement label_warehouse;

    @FindBy(xpath = "//label[text()='Warehouse:']/following::a[1]")
    WebElement txt_warehouse;

    @FindBy(xpath = "//label[text()='Warehouse:']/following::label[1]")
    WebElement label_partDescription;

    @FindBy(xpath = "//label[text()='Part Description:']/following::div[1]")
    WebElement txt_partDescription;

    @FindBy(xpath = "//label[text()='On Hand  (EA):']")
    WebElement label_OnHandEA;

    @FindBy(xpath = "//label[text()='On Hand  (EA):']/following::a[1]")
    WebElement txt_OnHandEA;

    @FindBy(xpath = "//span[text()='Store Room']")
    WebElement label_StoreRoom;

    @FindBy(xpath = "//span[text()='Row Number']")
    WebElement label_RowNumber;

    @FindBy(xpath = "//span[text()='Shelf']")
    WebElement label_Shelf;

    @FindBy(xpath = "//span[text()='Bin Number']")
    WebElement label_BinNumber;

    @FindBy(xpath = "//span[text()='Issue Part']")
    WebElement btn_IssuePart;

    @FindBy(xpath = "//span[text()='Total Charge']/following::td[3]")
    WebElement label_partDescription1;

    @FindBy(xpath = "//span[text()='Total Charge']/following::span[6]")
    WebElement label_EA1;

    @FindBy(xpath = "//span[text()='Total Charge']/following::span[7]/a")
    WebElement EA1;

    @FindBy(xpath = "//span[text()='Total Charge']/following::a[9]/img")
    WebElement crossIcon;

    @FindBy(xpath = "//span[text()='Non-Catalog Part']/following::td[2]/a/img")
    WebElement DeleteIcon;

    @FindBy(xpath = "(//span[text()='Cancel'])[2]")
    WebElement btn_cancle;

    @FindBy(xpath = "//span[text()='Core Return']")
    WebElement btn_coreReturn;

    @FindBy(xpath = "//span[text()='Non-Catalog Part']")
    WebElement btn_NonCatalogPart;

    @FindBy(xpath = "//div[text()='Create and issue Non-Catalog Part']")
    WebElement createIssueNonCatalogPart;

    @FindBy(xpath = "(//label[text()='Part#:'])[1]")
    WebElement label_part1;

    @FindBy(xpath = "(//label[text()='Part#:'])[1]/following::input[1]")
    WebElement txtfield_part;

    @FindBy(xpath = "(//label[text()='Description:'])[1]")
    WebElement label_description1;
    @FindBy(xpath = "(//label[text()='Description:'])[1]/following::input[1]")
    WebElement txtfield_description;

    @FindBy(xpath = "(//label[text()='Quantity:'])[1]")
    WebElement label_Quantity1;

    @FindBy(xpath = "(//label[text()='Quantity:'])[1]/following::input[1]")
    WebElement txtfield_Quantity;

    @FindBy(xpath = "(//label[text()='Quantity:'])[1]/following::span[3]")
    WebElement asterisk_unit;

    @FindBy(xpath = "//label[text()='Unit Cost:']")
    WebElement label_UnitCost;

    @FindBy(xpath = "//label[text()='Unit Cost:']/following::input[1]")
    WebElement txtfield_UnitCost;

   @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    WebElement cancle;

    @FindBy(xpath = "(//span[text()='Issue Part'])[2]")
    WebElement IssuePart;

    @FindBy(xpath = "//span[text()='Total Charge']/following::a[2]")
    WebElement ncpPartName;

    @FindBy(xpath = "//span[text()='Total Charge']/following::a[3]")
    WebElement NCPartDescription;

    @FindBy(xpath = "//span[text()='Total Charge']/following::span[6]")
    WebElement EA1_label;

    @FindBy(xpath = "//span[text()='Total Charge']/following::a[4]")
    WebElement EA1_2;

   @FindBy(xpath = "(//a[text()='Labour'])[1]")
    WebElement btn_Labour;

    @FindBy(xpath = "//span[text()='Start']/following::a[2]")
    WebElement VMRSName_Img;

    @FindBy(xpath = "//label[text()='Complaint:']/following::textarea[1]")
    WebElement complaint_textarea;

    @FindBy(xpath = "//label[text()='Cause/Reason:']/following::textarea[1]")
    WebElement cause_textarea;

    @FindBy(xpath = "//label[text()='Correction/Task:']/following::textarea[1]")
    WebElement task_textarea;

    @FindBy(xpath = "//label[text()='Progress']/following::a[1]")
    WebElement progrss_hyperlink;

    @FindBy(xpath = "//h1[text()='Select Progress']/following::a[1]/span")
    WebElement select_btn;

    @FindBy(xpath = "(//span[text()='OK'])[2]")
    WebElement btn_Ok;

    @FindBy(xpath = "(//a[text()='Summary'])[1]")
    WebElement summary_tab;

    @FindBy(xpath = "(//label[text()='PO Number:'])[1]")
    WebElement label_PoNumber;

    @FindBy(xpath = "(//label[text()='PO Number:'])[1]/following::input[1]")
    WebElement txtfield_PoNumber;

    @FindBy(xpath = "(//label[text()='Internal RO:'])[1]")
    WebElement label_InternalRO;

    @FindBy(xpath = "(//label[text()='Internal RO:'])[1]/following::input[1]")
    WebElement txtfield_RoInternal;

    @FindBy(xpath = "(//label[text()='Internal Notes:'])[1]")
    WebElement InternalNotes;

    @FindBy(xpath = "(//label[text()='Internal Notes:'])[1]/following::a[1]")
    WebElement hyperlink_InternalNotes;

    @FindBy(xpath = "(//label[text()='Notes:'])[1]")
    WebElement notes;
    @FindBy(xpath = "(//label[text()='Notes:'])[1]/following::a[1]")
    WebElement notes_hyperlink;

    @FindBy(xpath = "(//label[text()='RO Date:'])[1]")
    WebElement RoDate;

    @FindBy(xpath = "//span[text()='Reading Type']")
    WebElement ReadingType;

    @FindBy(xpath = "//h1[text()='Labour and Parts']")
    WebElement LabourParts;

    @FindBy(xpath = "//span[text()='Unit Ready']")
    WebElement UnitReady;

    @FindBy(xpath = "//span[text()='Unit Ready']/following::a[1]")
    WebElement AeroDynamicDevice;
      @FindBy(xpath = "//span[text()='Start']/following::a[2]")
    WebElement hyperlink_AeroDynamicDevice;

    @FindBy(xpath = "//span[text()='Unit Ready']/following::a[3]")
    WebElement hyperlink_AccessoriesDevice;

    @FindBy(xpath = "//span[text()='Pause']")
    WebElement btn_pause;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement btn_select;

    @FindBy(xpath = "(//span[text()='OK'])[1]")
    WebElement btn_ok;

    @FindBy(xpath = "//label[text()='Unit #:']/following::a[1]")
    WebElement hyperlink_Unit;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//span[text()='Total Charge']/following::a[7]/img")
    WebElement crossIcon_core;

    @FindBy(xpath = "//span[text()='Non-Catalog Part']/following::td[2]/a/img")
    WebElement deleteIcon_core;

   @FindBy(xpath = "//span[text()='Undo Pause']")
    WebElement undo_pause;  ////span[text()='Moises Olivas']/following::td[3]  //span[text()='Defer Work']

    @FindBy(xpath = "//span[text()='Pause']")
    WebElement pause;

    @FindBy(xpath = "//span[text()='Moises Olivas']/following::a[2]/span")
    WebElement pause_unpause;


    @FindBy(xpath = "//span[text()='Current Location']/following::a[3]/span")
   WebElement select_btn_TechRO;

   @FindBy(xpath = "//span[text()='Clear Screen']")
   WebElement btn_clear;

    @FindBy(xpath = "//h1[contains(text(),'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//span[text()='Start']/following::td[2]")
    WebElement firstrow_cell;

    @FindBy(xpath = "//a[contains(@id,'tWoAct:1:ciDWoAct1')]")
    List<WebElement> crossFirst_Icon;

    @FindBy(xpath = "(//label[text()='Parts#'])[1]/following::input[1]")
    WebElement input_parts;

    @FindBy(xpath = "//span[text()='Search']")
    WebElement search_btn;

    @FindBy(xpath = "//div[contains(@id,'rSPS:3:r6:7:s1:ctbClose')]")
    WebElement cancle_btn;

    @FindBy(xpath = "//div[contains(@id,'cbSelectCus')]/a/span")
    WebElement select_button;

//new added element

    @FindBy(xpath = "(//label[text()='Notes:'])[3]/following::textarea")
    WebElement notes_textarea;

    @FindBy(xpath = "(//span[text()='OK'])[2]")
    WebElement OK_btn;

    @FindBy(xpath = "//a[contains(@id,'clPopupWoact')]")
    WebElement VMRSName_Accessories;

    @FindBy(xpath="//a[contains(@id,'clPopupWoact')]")
    List<WebElement> VMRSName;

//    @FindBy(xpath = "//a[text()='Aerodynamic Devices']")   //(//a[text()='Aerodynamic Devices'])[1]
//    List<WebElement> FirstWorkRequired;

    @FindBy(xpath = "//a[contains(@id,'clPopupWoact')]")
    WebElement FirstWorkRequired_AeroDynamic;

    @FindBy(xpath = "//label[text()='Cause/Reason:']/following::a[1]")
    WebElement cause_reason ;

    @FindBy(xpath = "//label[text()='Task:']/following::a[1]")
    WebElement task ;

    @FindBy(xpath = "//span[text()='Notes']/following::span[5]")
    WebElement select_cause_Reason;

    @FindBy(xpath = "(//span[text()='Cancel'])[2]")
    WebElement cancleBtn ;

    @FindBy(xpath = "//ul[@class='AFAutoSuggestItemsContainer']/li[1]")
    WebElement corePart;

    //(//span[text()='Select'])[1]
    @FindBy(xpath = "(//label[text()='Search Unit:'])[2]/preceding::input[1]")
    WebElement SearchUnit;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement select1;

    @FindBy(xpath = "//span[text()='Defer Work']")
    WebElement Defer_btn;

    @FindBy(xpath = "//label[text()='Please enter your reason:']/following::textarea")
    WebElement defer_input;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement Cancle_btn;

    @FindBy(xpath = "//span[text()='More Units']")
    WebElement MoreUnit_btn;

    @FindBy(xpath = "//div[contains(@id,'ctbAssignedWork')]")
    WebElement btn_assignedWork;

    @FindBy(xpath = "//span[text()='More Units']")
    WebElement tab_moreUnits;


    /**
     * Enter TechBadge in the textfield
     */
    public void enterTechBadge() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(TechBadge);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(TechBadge);
        WebElementActions.getActions().inputText(TechBadge,prop.getProperty("TechBadge"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Go button
     */
    public void clickOnGoBtn() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(go_btn);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(go_btn);
        WebElementActions.getActions().clickElement(go_btn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Extra Step
     * click on Select Tab
     */
    public void clickOnSelectTab() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(select_btn_TechRO);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_btn_TechRO);
        WebElementActions.getActions().clickElement(select_btn_TechRO);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Extra Step
     * click on select button
     * @throws InterruptedException
     */
    public void clickMoreUnit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_assignedWork);
        if(btn_assignedWork.isDisplayed())
        {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_assignedWork);
            //       Thread.sleep(4000);
            WebElementActions.getActions().clickUsingJS(btn_assignedWork);

            WaitActions.getWaits().loadingWait(loder);
        }

// WaitActions.getWaits().waitForElementTobeClickable(tab_moreUnits);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_moreUnits);
        Thread.sleep(4000);
        WebElementActions.getActions().clickElement(tab_moreUnits);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Extra Step
     * Enter Unit Number(118888)  //span[text()='More Units']
     */
    public void enterUnitNumber() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchUnit);
        WebElementActions.getActions().inputText(SearchUnit,prop.getProperty("UnitNumber"));
    }

    /**
     * click on select button
     * @throws InterruptedException
     */
    public void clickSelect() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select1);
        WebElementActions.getActions().clickElement(select1);
    }

    public void clickOnUnitNumber() throws InterruptedException {
        Thread.sleep(2000);
// WaitActions.getWaits().WaitUntilWebElementIsVisible(hyperlink_Unit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_Unit);
        WebElementActions.getActions().clickElement(hyperlink_Unit);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify unit number
     */
    public void verifyUnitNumber() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(unit_Number);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(unit_Number);
        Assert.assertTrue(unit_Number.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Parts Tab
     */
    public void clickOnPartsTab() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(parts_tab);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(parts_tab);
        WebElementActions.getActions().clickElement(parts_tab);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify parts tab Element (Check the Generic setup of the screen)
     */
    public void verifyElementOfPart() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Labour);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Labour);
        Assert.assertTrue(label_Labour.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_part_hash);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_part_hash);
        Assert.assertTrue(label_part_hash.isDisplayed());
        Assert.assertTrue(txt_part.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(search_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(search_icon);
        Assert.assertTrue(search_icon.isDisplayed());
        Assert.assertTrue(label_Quantity.isDisplayed());
        Assert.assertTrue(txt_quantity.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Check out the parts list area
     */
    public void verifyPartListArea() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(column_SR);
// Assert.assertTrue(column_SR.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(hash);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hash);
        Assert.assertTrue(hash.isDisplayed());
        Assert.assertTrue(label_part_Number.isDisplayed());
        Assert.assertTrue(label_core.isDisplayed());
        Assert.assertTrue(label_ActualQuantity.isDisplayed());
        Assert.assertTrue(label_ChargeQuantity.isDisplayed());
        Assert.assertTrue(label_TotalCharge.isDisplayed());
// Assert.assertTrue(column_attachIcon.isDisplayed());
// Assert.assertTrue(column_crossIcon.isDisplayed());
// Assert.assertTrue(label_NodataDisplay.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter Part
     */
    public void enterPart() throws InterruptedException {
// Thread.sleep(3000);
// WaitActions.getWaits().waitForElementTobeClickable(txt_part);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_part);
        WebElementActions.getActions().inputText(txt_part,prop.getProperty("PartName"));

        Thread.sleep(3000);
// WaitActions.getWaits().waitForElementTobeClickable(number_15_762);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(number_15_762);
        WebElementActions.getActions().clickElement(number_15_762);
        Thread.sleep(5000);

// WaitActions.getWaits().waitForElementTobeClickable(txt_part);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_part);
        WebElementActions.getActions().inputText(txt_part,prop.getProperty("PartName"));
        Thread.sleep(3000);
        WebElementActions.getActions().inputText(txt_part,prop.getProperty("PartName"));

// WaitActions.getWaits().loadingWait(loder);
        WebElementActions.getActions().clickElement(number_15_762);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Verify Part Details Pannel
     */
    public void verifyPartDetailsPannel() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_warehouse);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_warehouse);
        Assert.assertTrue(label_warehouse.isDisplayed());
        Assert.assertTrue(txt_warehouse.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_partDescription);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_partDescription);
        Assert.assertTrue(label_partDescription.isDisplayed());
        Assert.assertTrue(txt_partDescription.isDisplayed());
        Assert.assertTrue(label_OnHandEA.isDisplayed());
        Assert.assertTrue(txt_OnHandEA.isDisplayed());
        Assert.assertTrue(label_StoreRoom.isDisplayed());
        Assert.assertTrue(label_RowNumber.isDisplayed());
        Assert.assertTrue(label_Shelf.isDisplayed());
        Assert.assertTrue(label_BinNumber.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Issue Part
     */
    public void clickOnIssuePart() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_IssuePart);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_IssuePart);
//        Thread.sleep(2000);
        WebElementActions.getActions().clickElement(btn_IssuePart);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * The part should now show with a quantity of 1
     */
    public void verifyPartAdded() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_partDescription1);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_partDescription1);
        Assert.assertTrue(label_partDescription1.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_EA1);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_EA1);
        Assert.assertTrue(label_EA1.isDisplayed());
// Assert.assertTrue(EA1.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(crossIcon);
        Assert.assertTrue(crossIcon.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(DeleteIcon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DeleteIcon);
        Assert.assertTrue(DeleteIcon.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cross button
     */
    public void clickOnCrossBtn() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(crossIcon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon);
        WebElementActions.getActions().clickElement(crossIcon);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Delete button
     */
    public void clickOnDeleteBtn() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(DeleteIcon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(DeleteIcon);
        WebElementActions.getActions().clickElement(DeleteIcon);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify No data display
     */
    public void verifyNoDataDisplay() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_NodataDisplay);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NodataDisplay);
        Assert.assertTrue(label_NodataDisplay.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter Core Part
     */
    public void enterCorePart() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(txt_part);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_part);
        WebElementActions.getActions().inputText(txt_part,prop.getProperty("CorePart"));

        Thread.sleep(3000);
        WebElementActions.getActions().clickElement(corePart);
        Thread.sleep(5000);

        WebElementActions.getActions().inputText(txt_part,prop.getProperty("CorePart"));
        Thread.sleep(3000);
        WebElementActions.getActions().inputText(txt_part,prop.getProperty("CorePart"));
        Thread.sleep(3000);
        WebElementActions.getActions().clickElement(corePart);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on Search icon
     */
    public void clickOnSearchIcon() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(search_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_icon);
        WebElementActions.getActions().clickUsingJS(search_icon);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * type core part
     */
    public void typeCorePart()
    {
        WebElementActions.getActions().inputText(input_parts,prop.getProperty("CorePart"));
    }
    /**
     * click on search button
     */
    public void clickOnSearchBtn() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(search_btn);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_btn);
        WebElementActions.getActions().clickElement(search_btn);
        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * click on select button
     */
    public void selectButton() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(select_button);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_button);
        WebElementActions.getActions().clickElement(select_button);
        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * click on cancle button
     */
    public void clickOnCancleButton() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(cancle_btn);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cancle_btn);
        WebElementActions.getActions().clickElement(cancle_btn);
        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * click on Core Return button
     */
    public void clickOnCoreReturn() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(btn_coreReturn);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_coreReturn);
        Thread.sleep(2000);
        WebElementActions.getActions().clickElement(btn_coreReturn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on cross button
     */
    public void clickOnCrossBtnCore() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(crossIcon_core);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon_core);
        WebElementActions.getActions().clickElement(crossIcon_core);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Delete button
     */
    public void clickOnDeleteBtnCore() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(deleteIcon_core);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(deleteIcon_core);
        WebElementActions.getActions().clickElement(deleteIcon_core);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *again enter CorePart
     */
    public void againEnterCorePart() throws InterruptedException {

// Thread.sleep(3000);
        WebElementActions.getActions().inputText(txt_part,prop.getProperty("CorePart"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cancle button
     */
    public void clickOnCancleBtn() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_cancle);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_cancle);
        WebElementActions.getActions().clickElement(btn_cancle);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Non-catalog part
     */
    public void clickOnNonCatalogPart() throws InterruptedException {
// Thread.sleep(2000);

        WebElementActions.getActions().clickElement(btn_NonCatalogPart);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify element of Non-catalog part
     */
    public void verifyNonCatalogPartElement() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(createIssueNonCatalogPart);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(createIssueNonCatalogPart);
        Assert.assertTrue(createIssueNonCatalogPart.isDisplayed());
        Assert.assertTrue(label_part1.isDisplayed());
        Assert.assertTrue(txtfield_part.isDisplayed());
        Assert.assertTrue(label_description1.isDisplayed());
        Assert.assertTrue(txtfield_description.isDisplayed());
        Assert.assertTrue(label_Quantity1.isDisplayed());
        Assert.assertTrue(txtfield_Quantity.isDisplayed());
        Assert.assertTrue(asterisk_unit.isDisplayed());
        Assert.assertTrue(label_UnitCost.isDisplayed());
        Assert.assertTrue(txtfield_UnitCost.isDisplayed());
        Assert.assertTrue(cancle.isDisplayed());
        Assert.assertTrue(IssuePart.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * random NCPartName
     */
    String NCPartName= WebElementActions.getActions().randomAlphaNumeric(10);
    /**
     * type NCPartName
     */
    public void typeNCPartName()
    {

        WebElementActions.getActions().inputText(txtfield_part,NCPartName);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * type NCPartDescription
     */
    public void typeNCPartDescription() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(txtfield_description);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_description);
        WebElementActions.getActions().inputText( txtfield_description,prop.getProperty("NCPartDescription"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * type Unit cost
     */
    public void typeUnitcost() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(txtfield_UnitCost);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_UnitCost);
        WebElementActions.getActions().inputText(txtfield_UnitCost,prop.getProperty("Unitcost"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Issue Part
     */
    public void clickOnIssuePart2() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(IssuePart);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(IssuePart);
        WebElementActions.getActions().clickElement(IssuePart);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * The part should now show with a quantity of 1
     */
    public void verifyNonCatalogPartAdded() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(ncpPartName);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ncpPartName);
        Assert.assertTrue(ncpPartName.isDisplayed());
        Assert.assertTrue(NCPartDescription.isDisplayed());
        WaitActions.getWaits().WaitUntilWebElementIsVisible(EA1_label);
        Assert.assertTrue(EA1_label.isDisplayed());
        Assert.assertTrue(EA1_2.isDisplayed());
        Assert.assertTrue(crossIcon.isDisplayed());
        Assert.assertTrue(DeleteIcon.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify name NCPartDescription
     */
    public void verifyNCPartDescription() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(NCPartDescription);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(NCPartDescription);
        Assert.assertTrue(NCPartDescription.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Labour Tab
     */
    public void clickOnLabour() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_Labour);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Labour);
        WebElementActions.getActions().clickElement(btn_Labour);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on VMRSName (Aerodynamic Device)
     */
    public void clickOnVMRSName() throws InterruptedException {
         Thread.sleep(10000);
        WebElementActions.getActions().moveOnTargetElement(VMRSName.get(0));
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(VMRSName_Accessories);

        String accessories1= VMRSName_Accessories.getAttribute("title");

        for(int i=0;i< VMRSName.size();i++) {
            System.out.println(VMRSName.get(i).getAttribute("title"));
            if (VMRSName.get(i).getAttribute("title").contains(accessories1)) {
                WebElementActions.getActions().moveOnTargetElement(VMRSName.get(i));

                //         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(VMRSName.get(i));
                WebElementActions.getActions().clickElement(VMRSName.get(i));
                break;
            }
        }

 /*       for(int i=0;i<VMRSName.size();i++)
        {
            if(VMRSName.contains("Accessories Group"))
            {
                WebElementActions.getActions().moveOnTargetElement(VMRSName.get(i));

                WebElementActions.getActions().clickElement(VMRSName.get(i));
                break;
            }
        } */
/* WebElementActions.getActions().moveOnTargetElement(firstrow_cell);

// WaitActions.getWaits().WaitUntilWebElementIsVisible(VMRSName_Img);
WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(VMRSName_Img);
WebElementActions.getActions().clickElement(VMRSName_Img); */

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter notes notes_textarea
     */
    public void typeNotes() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(complaint_textarea);
        Thread.sleep(3000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(notes_textarea);
        WebElementActions.getActions().inputText(notes_textarea,"Complaint");
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on cause/Reason
     */
    public void click_Cause_Reason() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(complaint_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cause_reason);
        WebElementActions.getActions().clickElement(cause_reason);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on select
     */
    public void clickOnSelect() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(complaint_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_cause_Reason);
        WebElementActions.getActions().clickElement(select_cause_Reason);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on cancle button
     */
    public void clickOnCancle() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(complaint_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cancleBtn);
        WebElementActions.getActions().clickElement(cancleBtn);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *  click on  task
     */
     public void clickOnTask() throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(task);
         WebElementActions.getActions().clickElement(task);
     }
    /**
     * Click on Ok button OK_btn
     */
    public void clickOk() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_Ok);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(OK_btn);
        WebElementActions.getActions().clickElement(OK_btn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /** ***********************************************************************
     * Enter complaint notes
     */
    public void typeComplaintNote1() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(complaint_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(complaint_textarea);
        WebElementActions.getActions().inputText(complaint_textarea,"Complaint");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter Cause/Reason
     */
    public void typeCause_Reason() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(cause_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cause_textarea);
        WebElementActions.getActions().inputText(cause_textarea,"Cause/Reason");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter Correction/Task
     */
    public void typeCorrection_Task()throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(task_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(task_textarea);
        WebElementActions.getActions().inputText(task_textarea,"Correction/Task");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on "0% by Moises Olivas on" hyperlink
     */
    public void clickOnMoisesOlivashyperlink() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(progrss_hyperlink);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(progrss_hyperlink);
        WebElementActions.getActions().clickElement(progrss_hyperlink);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cause/reason hyperlink hyperlink_breakdown
     */
    public void cause_reason_hyperlink() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(progrss_hyperlink);
//        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_breakdown);
//        WebElementActions.getActions().clickElement(hyperlink_breakdown);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on select button selectBtn
     */
    public void clickOnSelectbutton() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(select_btn);
// WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_btn);
// WebElementActions.getActions().clickElement(select_btn);

//        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(selectBtn);
//        WebElementActions.getActions().clickElement(selectBtn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click ok button
     */
    public void clickOkbutton() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_Ok);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions().clickElement(btn_Ok);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**   **********************************************************************
     * click on FirstLaborItem (Aerodynamic Devices)
     */
    public void clickOnFirstLaborItem() throws InterruptedException {  //FirstWorkRequired_AeroDynamic
        Thread.sleep(10000);

        WebElementActions.getActions().moveOnTargetElement(VMRSName.get(0));
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FirstWorkRequired_AeroDynamic);
        String aeroDynamic = FirstWorkRequired_AeroDynamic.getAttribute("title");

        for(int i=0;i<VMRSName.size();i++) {
            System.out.println(VMRSName.get(i).getAttribute("title"));
            if (VMRSName.get(i).getAttribute("title").contains(aeroDynamic)) {
                WebElementActions.getActions().moveOnTargetElement(VMRSName.get(i));

                //       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(VMRSName.get(0));
                WebElementActions.getActions().clickElement(VMRSName.get(i));
                break;
            }
        }
// WaitActions.getWaits().waitForElementTobeClickable(hyperlink_AeroDynamicDevice);

/* WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_AeroDynamicDevice);
WebElementActions.getActions().clickElement(hyperlink_AeroDynamicDevice); */

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

/**
 * click on
 */


    /**
     * Enter complaint notes
     */
    public void typeComplaintNote2() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(complaint_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(complaint_textarea);
        WebElementActions.getActions().inputText(complaint_textarea,"Complaint2");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter Cause/Reason
     */
    public void typeCause_Reason2() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(cause_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cause_textarea);
        WebElementActions.getActions().inputText(cause_textarea,"Cause/Reason2");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter Correction/Task
     */
    public void typeCorrection_Task2()throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(task_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(task_textarea);
        WebElementActions.getActions().inputText(task_textarea,"Correction/Task2");
        TestListener.saveScreenshotPNG(driver);
    }
/**
 * new Added Steps
 *
 */
    /**
     * click on Summary tab
     */
    public void clickOkSummaryTab() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(summary_tab);
        Thread.sleep(2000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(summary_tab);
        WebElementActions.getActions().clickElement(summary_tab);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify the element of Summary tab
     */
    public void verifySummaryTabElement() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PoNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PoNumber);
        Assert.assertTrue(label_PoNumber.isDisplayed());
        Assert.assertTrue(txtfield_PoNumber.isDisplayed());
        Assert.assertTrue(label_InternalRO.isDisplayed());
        Assert.assertTrue(txtfield_RoInternal.isDisplayed());
        Assert.assertTrue(InternalNotes.isDisplayed());
        Assert.assertTrue(hyperlink_InternalNotes.isDisplayed());
        Assert.assertTrue(notes.isDisplayed());
        Assert.assertTrue(notes_hyperlink.isDisplayed());
        Assert.assertTrue(RoDate.isDisplayed());
        Assert.assertTrue(ReadingType.isDisplayed());
        Assert.assertTrue(LabourParts.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(UnitReady);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitReady);
        Assert.assertTrue(UnitReady.isDisplayed());
// Assert.assertTrue(hyperlink_AeroDynamicDevice.isDisplayed());
        Assert.assertTrue(hyperlink_AccessoriesDevice.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Extrea Step
     * click on UndoPause Button
     */
    public void clickOnUnPause_Pause_Button() throws InterruptedException {

    /*    if(pause.isDisplayed())  pause_unpause
        {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(pause);
            WebElementActions.getActions().clickElement(pause);
        }
        else {
// WaitActions.getWaits().waitForElementTobeClickable(undo_pause);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(undo_pause);
            WebElementActions.getActions().clickElement(undo_pause);
        } */

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(pause_unpause);
        WebElementActions.getActions().clickElement(pause_unpause);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on pause button
     */
    public void clickOnPauseButton() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(pause);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(pause);
        WebElementActions.getActions().clickElement(pause);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Clear button
     */
    public void clickOnClearButton() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(btn_clear);
        Thread.sleep(2000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_clear);
        WebElementActions.getActions().clickElement(btn_clear);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Select button
     */
    public void clickOnSelectButton() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_select);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions().clickElement(btn_select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Unit Ready button
     */
    public void clickOnUnitReadyButton() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(UnitReady);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UnitReady);
        WebElementActions.getActions().clickElement(UnitReady);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Ok button
     */
    public void clickOnOkButton() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_ok);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ok);
        WebElementActions.getActions().clickElement(btn_ok);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cancle button
     */
    public void clickOnCancleBtn1() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_ok);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Cancle_btn);
        WebElementActions.getActions().clickElement(Cancle_btn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter defer reason button
     */
    public void inputDeferReason() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_ok);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(defer_input);
        WebElementActions.getActions().inputText(defer_input,prop.getProperty("DefereReason"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on defer button
     */
    public void clickOnDefere() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_ok);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Defer_btn);
        WebElementActions.getActions().clickElement(Defer_btn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

// WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }


}