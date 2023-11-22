package pages.tech;

import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.util.List;

public class WoLabor extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
    WebElement txt_scanEmployeeBadge;

    @FindBy(xpath = "//span[text()='Go']")
    WebElement btn_Go;

    @FindBy(xpath = "//span[text()='More Units']")
    WebElement tab_moreUnits;

    @FindBy(xpath = "//span[text()='Moises Olivas']")
    WebElement label_MoisesOlivas;

    @FindBy(xpath = "//span[text()='Clear Screen']")
    WebElement btn_clearScreen;

    @FindBy(xpath = "//span[text()='End Shift']")
    WebElement btn_endShift;

    @FindBy(xpath = "//span[text()='Lunch / Break']")
    WebElement btn_Lunch;

    @FindBy(xpath = "//div[contains(@id,'ctbAssignedWork')]")
    WebElement btn_assignedWork;

    @FindBy(xpath = "//span[text()='Service Board']")
    WebElement btn_serviceBoard;

    @FindBy(xpath = "(//label[text()='Search Unit:'])[1]")
    WebElement label_searchUnit;

    @FindBy(xpath = "(//label[text()='Search Unit:'])[1]/following::input[1]")
    WebElement txt_searchUnit;

    @FindBy(xpath = "(//span[text()='Owner'])[1]")
    WebElement label_owner;

    @FindBy(xpath = "(//span[text()='Unit Number'])[1]")
    WebElement label_unitNumber;

    @FindBy(xpath = "(//span[text()='VIN / Description'])[1]")
    WebElement label_VIN_Description;

    @FindBy(xpath = "//span[text()='Serial Number']")
    WebElement label_serialNumber;

    @FindBy(xpath = "//span[text()='License Plate']")
    WebElement label_LicensePlate;

    @FindBy(xpath = "//span[text()='Type']")
    WebElement  label_type;

    @FindBy(xpath = "//span[text()='Current Location']")
    WebElement label_currentLocation;

    @FindBy(xpath = "//span[text()='Current Location']/following::th[1]/div")
    WebElement label_column;

    @FindBy(xpath = "//span[text()='Current Location']/following::a[3]/span")
    WebElement btn_select;

    @FindBy(xpath = "(//a[text()='Tech RO'])[2]/following::span[1]")
    WebElement label_technicianPortal;

    @FindBy(xpath = "//span[text()='Technician Portal']/following::td[7]")
    WebElement label_Welcome;

    @FindBy(xpath = "//span[text()='Moises Olivas']")
    WebElement label_moisesOlivas;

    @FindBy(xpath = "//label[text()='Owner:']")
    WebElement label_Owner2;

    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement label_unit2;

    @FindBy(xpath = "//label[text()='Unit #:']/following::a[1]")
    WebElement  hyperlink_unit;

    @FindBy(xpath = "//label[text()='Address:']")
    WebElement label_address;

    @FindBy(xpath = "//td[text()='18298 SLOVER AVE']")
    WebElement label_18298Slover;

    @FindBy(xpath = "//td[text()='BLOOMINGTON CA 92316']")
    WebElement label_Blooming;

    @FindBy(xpath = "//span[text()='Moises Olivas']/following::a[text()='Labour'][1]")
    WebElement btn_labor;

    @FindBy(xpath = "(//a[text()='Unit History'])[1]")
    WebElement btn_UnitHistory;

    @FindBy(xpath = "//h1[text()='Work Required']")
    WebElement label_WorkRequired;

    @FindBy(xpath = "//span[text()='More Work ...']")
    WebElement btn_moreWork;

    @FindBy(xpath = "//h1[text()='Labour - ASAP SHOP']")
    WebElement subtitle_Labor_ASAP;

    @FindBy(xpath = "//span[text()='Show Labour Details']")
    WebElement btn_showLaborDetails;

    @FindBy(xpath = "//span[text()='#']")
    WebElement hash_asap_Shop;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement label_description;

    @FindBy(xpath = "(//span[text()='*'])[2]")
    WebElement asterisk_asap_Shop;

    @FindBy(xpath = "//span[text()='Estimated Hours']")
    WebElement label_estimatedHours;

    @FindBy(xpath = "//span[text()='Actual Hours']")
    WebElement label_ActualHours;

    @FindBy(xpath = "//span[text()='Start']")
    WebElement label_start;

    @FindBy(xpath = "//div[text()='No data to display']")
    WebElement  label_noDataToDisplay;

    @FindBy(xpath = "//td[text()='Total Hours:']")
    WebElement label_TotalHours;

    @FindBy(xpath = "//span[text()='0']")
    WebElement label_zaro;

    @FindBy(xpath = "(//label[text()='Search:'])[1]")
    WebElement label_search;

    @FindBy(xpath = "//span[text()='Date']")
    WebElement label_date;

    @FindBy(xpath = "//span[text()='VMRS']")
    WebElement label_VMRS;

    @FindBy(xpath = "//span[text()='P']")
    WebElement label_p;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement label_description2;

    @FindBy(xpath = "//span[text()='Actual Hours']")
    WebElement label_actualHrs;

    @FindBy(xpath = "//span[text()='Copy']")
    WebElement label_copy;

    @FindBy(xpath = "(//h2[text()='Parts'])[2]")
    WebElement subtitle_parts;

    @FindBy(xpath = "(//span[text()='Part Number'])[2]")
    WebElement label_partNumber;

    @FindBy(xpath = "(//span[text()='Charge Quantity'])[2]")
    WebElement label_chargeQuantity;

    @FindBy(xpath = "(//span[text()='UOM'])[2]")
    WebElement label_UOM;

    @FindBy(xpath = "//div[text()='Labour Guide']")
    WebElement subtitle_LabourGuide;

    @FindBy(xpath = "//div[contains(text(),'Guide')]/following::label[2]")
    WebElement label_unit;

    @FindBy(xpath = "//div[contains(text(),'Guide')]/following::td[6]/span")
    WebElement label_unit_value;

    @FindBy(xpath = "//div[contains(text(),'Guide')]/following::a[2]")
    WebElement tab_VMRS;

    @FindBy(xpath = "(//a[text()='Unit History'])[3]")
    WebElement tab_UnitHistory;

    @FindBy(xpath = "(//label[text()='Search:'])[1]")
    WebElement label_search2;

    @FindBy(xpath = "(//label[text()='Search:'])[1]/following::select[1]")
    WebElement txt_search;

    @FindBy(xpath = "//h2[text()='Labour']")
    WebElement label_labour;

    @FindBy(xpath = "//span[text()='Date']")
    WebElement label_date1;

    @FindBy(xpath = "//span[text()='VMRS']")
    WebElement label_VMRS1;

    @FindBy(xpath = "(//span[text()='Description'])[2]")
    WebElement label_description3;

    @FindBy(xpath = "(//span[text()='Actual Hours'])[2]")
    WebElement label_actualHr;

    @FindBy(xpath = "(//span[text()='Add'])[1]")
    WebElement label_add;

    @FindBy(xpath = "(//h2[text()='Parts'])[1]")
    WebElement label_parts;

    @FindBy(xpath = "(//span[text()='Part Number'])[1]")
    WebElement label_partNumber2;

    @FindBy(xpath = "(//span[text()='Charge Quantity'])[1]")
    WebElement label_chargeQty;

    @FindBy(xpath = "(//span[text()='UOM'])[1]")
    WebElement label_UOM1;

    @FindBy(xpath = "//h1[text()='Selected']")
    WebElement label_selected;

    @FindBy(xpath = "(//span[text()='Description'])[3]")
    WebElement label_description4;

    @FindBy(xpath = "(//span[text()='Qty'])[1]")
    WebElement label_qty;

    @FindBy(xpath = "(//span[text()='Estimated Hours'])[2]")
    WebElement label_estimateHrs;

    @FindBy(xpath = "(//span[text()='Estimated Hours'])[2]/following::div[1]")
    WebElement column_1;

    @FindBy(xpath = "(//span[text()='Estimated Hours'])[2]/following::div[2]")
    WebElement column_2;

    @FindBy(xpath = "(//div[text()='No data to display'])[4]")
    WebElement label_nodatadisplay;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']")
    WebElement subtitle_clickicondrilldown;

    @FindBy(xpath = "//label[text()='Search:']")
    WebElement label_search3;

    @FindBy(xpath = "//label[text()='Search:']/following::input[1]")
    WebElement search_txt;

    @FindBy(xpath = "//label[text()='Search:']/following::a[1]/img")
    WebElement img_aeroDynamic;

    @FindBy(xpath = "//div[text()='Labour Guide']/following::span[text()='Aerodynamic Devices'][1]")
    WebElement hyperlink_aeroDynamic;

    @FindBy(xpath = "//label[text()='Search:']")
    WebElement search;

    @FindBy(xpath = "//label[text()='Search:']/following::input[1]")
    WebElement txtfield_search;

    @FindBy(xpath = "//label[text()='Search:']/following::td[2]/img")
    WebElement search_icon;

    @FindBy(xpath = "(//span[text()='Description'])[2]")
    WebElement description5;

    @FindBy(xpath = "//label[text()='Search:']/preceding::span[2]")
    WebElement deviceAero;

    @FindBy(xpath = "//div[text()='Labour Guide']/following::span[text()='004 000']")
    WebElement label_aero004;

    @FindBy(xpath = "//label[text()='Search:']/following::a[3]/img")
    WebElement plus_icon;

    @FindBy(xpath = "//textarea[text()='Aerodynamic Devices']")
    WebElement txt_aeroDynamic;

    @FindBy(xpath = "//span[text()='1']")
    WebElement value1;

    @FindBy(xpath = "//label[text()='Complaint:']/following::textarea[1]")
    WebElement field_complaint;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement btn_cancle;

    @FindBy(xpath = "(//span[text()='Add'])[1]")
    WebElement btn_add;

    @FindBy(xpath = "//h1[text()='Work Required']/following::a[7]/img")
    WebElement cross_icon;

    @FindBy(xpath = "//span[text()='More Work ...']/following::a[1]/img")
    WebElement delete_icon;

    @FindBy(xpath = "(//span[text()='Aerodynamic Devices']/following::textarea[1])[1]")
    WebElement nodatadisplay_txtarea;

   @FindBy(xpath = "//h1[text()='Selected']/following::th[7]")
    WebElement label_selected_column;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement btn_LabourDetails_VMRS ;

    @FindBy(xpath = "//h1[text()='Work Required']/following::a[8]/img")
    WebElement img_workRequired_AeroDynamic;

 //   @FindBy(xpath = "//h1[text()='Labour - ASAP SHOP']/following::img[7]")
    @FindBy(xpath = "//img[contains(@id,'ciDWoAct1::icon')]")
    List<WebElement> crossIcon_LabourAsapShop1;

   @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement but_cancle;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']/following::a[1]/img")
    WebElement img_Accessories_Group;

   @FindBy(xpath = "(//span[text()='Description'])[3]/following::a[1]/img")
    WebElement plusIcon_LabourDetails;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement btn_add2;

    @FindBy(xpath = "//span[text()='Part Number']/preceding::div[1]")
    WebElement label_DeleteAerodynamicDevice;

    @FindBy(xpath = "//span[text()='Part Number']/following::span[1]")
    WebElement label_Description;

    @FindBy(xpath = "//span[text()='Part Number']")
    WebElement label_PartNumber;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]/following::span[3]")
    List<WebElement> btn_YesdeletelabourParts;

    @FindBy(xpath = "//div[contains(text(),'Delete')]")
    WebElement label_DeleteAero;

    @FindBy(xpath = "//label[text()='Search Work In Progress:']/preceding::h1[1]")
    WebElement label_description_MoveTech;

    @FindBy(xpath = "(//span[text()='Description'])[2]")
    WebElement label_description1;

    @FindBy(xpath = "//span[text()='Hours']")
    WebElement label_hrs;

    @FindBy(xpath = "(//span[text()='Hours'])[1]/following::a[1]/span")
    WebElement btn_select1 ;

    @FindBy(xpath = "//span[text()='Hours']/following::th")
    WebElement select_column;

    @FindBy(xpath = "//a[contains(@id,'ciWoactStartId')]/img")
    List<WebElement> clockIcon;

    @FindBy(xpath = "//h1[text()='Labour - ASAP SHOP']/following::td[5]")
    WebElement column_before_hash;

    @FindBy(xpath = "//span[text()='Start']/following::tr[1]/td[9]")
    WebElement row_one;

    @FindBy(xpath = "//h1[contains(text(),'Working...Please Wait')]")
    List<WebElement> loder;


    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

//    @FindBy(xpath = "//img[contains(@id,'ciDWoAct1::icon')]")
//    List<WebElement> crossIcon_All ;

    @FindBy(xpath = "//a[contains(@id,'clPopupWoact')]")
    List<WebElement>  all_Labour;
    @FindBy(xpath ="//a[text()='Accessories Group']")
    public List<WebElement> accessories1accessories_All ;

    @FindBy(xpath = "(//a[text()='Accessories Group'])[1]")
    WebElement accessories1;

    @FindBy(xpath = "//a[contains(@id,'ciDWoAct1')]")
    List<WebElement> crossIcon_All;
    /**
     * Enter TechBadge
     */
    public void enterTechBadge() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(txt_scanEmployeeBadge);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_scanEmployeeBadge);
        WebElementActions.getActions().inputText(txt_scanEmployeeBadge,prop.getProperty("TechBadge"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Go
     */
    public void clickOnGo() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_Go);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Go);
        WebElementActions.getActions().clickElement(btn_Go);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on assigned work button
     */
    public void clickOnAssignedWork() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_assignedWork);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_assignedWork);
        WebElementActions.getActions().clickElement(btn_assignedWork);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on MoreUnit tab
     */
    public void clickOnMoreUnit() throws InterruptedException {
 //          Thread.sleep(2000);
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
     * Verify element present in header
     */
    public void verifyHeaderElement() throws InterruptedException {

// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_MoisesOlivas);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_MoisesOlivas);
        Assert.assertTrue(label_MoisesOlivas.isDisplayed());
        Assert.assertTrue(btn_clearScreen.isDisplayed());
        Assert.assertTrue(btn_endShift.isDisplayed());
        Assert.assertTrue(btn_Lunch.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_searchUnit);
        Assert.assertTrue(label_searchUnit.isDisplayed());
        Assert.assertTrue(txt_searchUnit.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify Element present in table
     */
    public void verifyTableElement() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_owner);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_owner);
        Assert.assertTrue(label_owner.isDisplayed());
        Assert.assertTrue(label_unitNumber.isDisplayed());
        Assert.assertTrue(label_VIN_Description.isDisplayed());
        Assert.assertTrue(label_serialNumber.isDisplayed());
        Assert.assertTrue(label_LicensePlate.isDisplayed());
        Assert.assertTrue(label_type.isDisplayed());
        Assert.assertTrue(label_currentLocation.isDisplayed());
        Assert.assertTrue(label_column.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Enter Unit Number
     */
    public void enterUnitNumber() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(txt_searchUnit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_searchUnit);
        WebElementActions.getActions().inputText(txt_searchUnit,prop.getProperty("UnitNumber"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Click on select button
     */
    public void clickOnSelectBtn() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_select);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_searchUnit);
        Thread.sleep(4000);
        WebElementActions.getActions().clickUsingJS(btn_select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Technician Portal Page Element
     */
    public void verifyTecnicianPortalPage() throws InterruptedException {

// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_technicianPortal);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_technicianPortal);
        Assert.assertTrue(label_technicianPortal.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Welcome);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Welcome);
        Assert.assertTrue(label_Welcome.isDisplayed());
        Assert.assertTrue(label_moisesOlivas.isDisplayed());
        Assert.assertTrue(label_Owner2.isDisplayed());
        Assert.assertTrue(label_unit2.isDisplayed());
        Assert.assertTrue(hyperlink_unit.isDisplayed());
        Assert.assertTrue(label_address.isDisplayed());
        Assert.assertTrue(label_18298Slover.isDisplayed());
        Assert.assertTrue(label_Blooming.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify element of Labour Tab
     */
    public void LabourtabElement() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_labor);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_labor);
        Assert.assertTrue(btn_labor.isDisplayed());
        Assert.assertTrue(btn_UnitHistory.isDisplayed());
        Assert.assertTrue(label_WorkRequired.isDisplayed());
        Assert.assertTrue(btn_moreWork.isDisplayed());
        Assert.assertTrue(subtitle_Labor_ASAP.isDisplayed());
        Assert.assertTrue(btn_showLaborDetails.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify Labour - Asap shop element
     */
    public void labourAsapShopElement() throws InterruptedException {

// WaitActions.getWaits().WaitUntilWebElementIsVisible(hash_asap_Shop);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hash_asap_Shop);
        Assert.assertTrue(hash_asap_Shop.isDisplayed());
// Assert.assertTrue(column_before_hash.isDisplayed());
        Assert.assertTrue(label_description.isDisplayed());
        Assert.assertTrue(asterisk_asap_Shop.isDisplayed());
        Assert.assertTrue(label_estimatedHours.isDisplayed());
        Assert.assertTrue(label_ActualHours.isDisplayed());
        Assert.assertTrue(label_start.isDisplayed());
// Assert.assertTrue(label_noDataToDisplay.isDisplayed());
        Assert.assertTrue(label_TotalHours.isDisplayed());
// Assert.assertTrue(label_zaro.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on Unit History tab
     */
    public void clickOnUnitHistorytab() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_UnitHistory);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_UnitHistory);
        Thread.sleep(4000);
        WebElementActions.getActions().clickElement(btn_UnitHistory);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify Unit Number tab Element
     */
    public void verifyUnitNumberTabElement() throws InterruptedException {

// WaitActions.getWaits().WaitUntilWebElementIsVisible( label_search);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_search);
        Assert.assertTrue(label_search.isDisplayed());
        Assert.assertTrue(label_date.isDisplayed());
        Assert.assertTrue(label_VMRS.isDisplayed());
        Assert.assertTrue(label_p.isDisplayed());
        Assert.assertTrue(label_description2.isDisplayed());
        Assert.assertTrue(label_actualHrs.isDisplayed());
        Assert.assertTrue(label_copy.isDisplayed());
        Assert.assertTrue(subtitle_parts.isDisplayed());
        Assert.assertTrue(label_partNumber.isDisplayed());
        Assert.assertTrue(label_chargeQuantity.isDisplayed());
        Assert.assertTrue(label_UOM.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on Labour tab
     */
    public void clickOnLabourTab() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_labor);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_labor);
        Thread.sleep(5000);
        WebElementActions.getActions().clickElement(btn_labor);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on MoreWork tab
     */
    public void clickOnMoreWorkTab() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(btn_moreWork);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_moreWork);
        Thread.sleep(15000);
        WebElementActions.getActions().clickElement(btn_moreWork);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify more work tab element
     */
    public void verifyMoreWorktabElement() throws InterruptedException {

// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_unit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_unit);
        Assert.assertTrue(label_unit.isDisplayed());
        Assert.assertTrue(label_unit_value.isDisplayed());
        Assert.assertTrue(tab_VMRS.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on VMRS tab
     */
    public void clickOnVMRStab() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(tab_VMRS);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_VMRS);
        Thread.sleep(6000);
        WebElementActions.getActions().clickElement(tab_VMRS);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Unit History tab
     */
    public void clickOnUnitHistoryTab() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(tab_UnitHistory);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_UnitHistory);
        Thread.sleep(4000);
        WebElementActions.getActions().clickElement(tab_UnitHistory);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Unit History tab element
     */
    public void verifyUnitHistoryTabElement() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_search2);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_search2);
        Assert.assertTrue(label_search2.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_search);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_search);
        Assert.assertTrue(txt_search.isDisplayed());
        Assert.assertTrue(label_labour.isDisplayed());
        Assert.assertTrue(label_date1.isDisplayed());
        Assert.assertTrue(label_VMRS1.isDisplayed());
        Assert.assertTrue(label_description3.isDisplayed());
        Assert.assertTrue(label_actualHr.isDisplayed());
        Assert.assertTrue(label_add.isDisplayed());
        Assert.assertTrue(label_parts.isDisplayed());
        Assert.assertTrue(label_partNumber2.isDisplayed());
        Assert.assertTrue(label_chargeQty.isDisplayed());
        Assert.assertTrue(label_UOM1.isDisplayed());
        Assert.assertTrue(label_selected.isDisplayed());
        Assert.assertTrue(label_description4.isDisplayed());
        Assert.assertTrue(label_qty.isDisplayed());
        Assert.assertTrue(label_estimateHrs.isDisplayed());
        Assert.assertTrue(column_1.isDisplayed());
        Assert.assertTrue(column_2.isDisplayed());
// Assert.assertTrue(label_nodatadisplay.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on (Labour Details Page) VMRS tab
     */
    public void clickOnLabourDetailsVMRStab() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(btn_LabourDetails_VMRS);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_LabourDetails_VMRS);
        Thread.sleep(4000);
        WebElementActions.getActions().clickElement(btn_LabourDetails_VMRS);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify vmrs Element
     */
    public void verifyElementofVMRS() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(subtitle_clickicondrilldown);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(subtitle_clickicondrilldown);
        Assert.assertTrue(subtitle_clickicondrilldown.isDisplayed());
        Assert.assertTrue(label_search3.isDisplayed());
        Assert.assertTrue(search_txt.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Enter Aerodynamic Devices
     */
    public void enterAreodynamicDevices() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(search_txt);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_txt);
        Thread.sleep(4000);
        WebElementActions.getActions().inputText(search_txt, prop.getProperty("FirstLaborItem"));


        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on AeroDynamic devices Img
     */
    public void clickOnAeroDynamicDevicesImg() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(img_aeroDynamic);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_aeroDynamic);
        Thread.sleep(8000);
        WebElementActions.getActions().clickElement(img_aeroDynamic);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Aerodunamic device element
     */
    public void verifyAeroDynamicDeviceElement() throws InterruptedException {

// WaitActions.getWaits().WaitUntilWebElementIsVisible(hyperlink_aeroDynamic);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hyperlink_aeroDynamic);
        Assert.assertTrue(hyperlink_aeroDynamic.isDisplayed());
        Assert.assertTrue(search.isDisplayed());
        Assert.assertTrue(txtfield_search.isDisplayed());
        Assert.assertTrue(search_icon.isDisplayed());
        Assert.assertTrue(description5.isDisplayed());
        WaitActions.getWaits().WaitUntilWebElementIsVisible(deviceAero);
        Assert.assertTrue(deviceAero.isDisplayed());
        WaitActions.getWaits().WaitUntilWebElementIsVisible(label_aero004);
        Assert.assertTrue(label_aero004.isDisplayed());
        Assert.assertTrue(plus_icon.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on hyperlink AeroDynamic Devices
     */
    public void clickOnAeroDynamicsDeviceshyperlink() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(hyperlink_aeroDynamic);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_aeroDynamic);
        Thread.sleep(4000);
        WebElementActions.getActions().clickElement(hyperlink_aeroDynamic);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify search text field
     */
    public void verifySearchTextField() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(txtfield_search);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txtfield_search);
        Assert.assertTrue(txtfield_search.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on plus button
     */
    public void clickOnPlusButton() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(plus_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plus_icon);
        Thread.sleep(10000);
        WebElementActions.getActions().clickElement(plus_icon);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Aerodynamic Devices - Selected element
     */
    public void verifyAeroDynamicSelectedElement() throws InterruptedException {

// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_selected);
        Thread.sleep(2000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_selected);
        Assert.assertTrue(label_selected.isDisplayed());
        Assert.assertTrue(label_selected_column.isDisplayed());
        Assert.assertTrue(label_description4.isDisplayed());
        Assert.assertTrue(label_qty.isDisplayed());
        Assert.assertTrue(label_estimateHrs.isDisplayed());
// Assert.assertTrue( value1.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Enter This is the complaint text in textarea
     */
    public void enterText() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(field_complaint);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(field_complaint);
        WebElementActions.getActions().inputText(field_complaint,prop.getProperty("enterText"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Labour Guide Page Element cancle , Add , This is the Complaint
     */
    public void verifyCancleAddComplaintText() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(field_complaint);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(field_complaint);
        Assert.assertTrue(field_complaint.isDisplayed());
        Assert.assertTrue(btn_cancle.isDisplayed());
        Assert.assertTrue(btn_add.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on add button
     */
    public void clickOnAddButton() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_add);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_add);
        Thread.sleep(8000);
        WebElementActions.getActions().clickElement(btn_add);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cross icon
     */
    public void clickOnCrossIcon() throws InterruptedException {


// WaitActions.getWaits().waitForElementTobeClickable(cross_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cross_icon);
        Thread.sleep(4000);
        WebElementActions.getActions().clickElement(cross_icon);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Delete icon
     */
    public void clickOnDeleteIcon() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(delete_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(delete_icon);
        Thread.sleep(4000);
        WebElementActions.getActions().clickElement(delete_icon);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Add Element
     */
    public void verifyAddElement() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_add);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_add);
        Assert.assertTrue(btn_add.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on img Aerodynamic
     */
    public void clickOnWorkRequired() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(img_workRequired_AeroDynamic);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_workRequired_AeroDynamic);
        Thread.sleep(10000);
        WebElementActions.getActions().clickElement(img_workRequired_AeroDynamic);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Element AeroDynamic Devices
     */
    public void verifyAerodynamicDevices004() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(hyperlink_aeroDynamic);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hyperlink_aeroDynamic);
        Assert.assertTrue(hyperlink_aeroDynamic.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(deviceAero);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(deviceAero);
        Assert.assertTrue(deviceAero.isDisplayed());
// Assert.assertTrue(label_aero004.isDisplayed());
        Assert.assertTrue(plus_icon.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Aerodynamic Devices Element
     */
    public void verifyAerodynamicDeviceHyperlink() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(hyperlink_aeroDynamic);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hyperlink_aeroDynamic);
        Assert.assertTrue(hyperlink_aeroDynamic.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Aerodynamic Devices textarea Element
     */
    public void verifyAerodynamicDeviceTextarea() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_aeroDynamic);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_aeroDynamic);
        Assert.assertTrue(txt_aeroDynamic.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
/**
 * verify 'X' icon
 */
/* public void verifyXicon() throws InterruptedException {
// Thread.sleep(2000);

// ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

//row_one
// WebElementActions.getActions().moveOnTargetElement(row_one);

// Thread.sleep(3000);
// WaitActions.getWaits().WaitUntilWebElementIsVisible(crossIcon_LabourAsapShop);
WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(crossIcon_LabourAsapShop.get(0));
Assert.assertTrue(crossIcon_LabourAsapShop.size()>0);

TestListener.saveScreenshotPNG(driver);
} */
    /**
     * click on cross icon
     */
    public void clickOnCrossIconAsapShop() throws InterruptedException {



 //      WebElementActions.getActions().moveOnTargetElement(row_one);

// WaitActions.getWaits().waitForElementTobeClickable(crossIcon_LabourAsapShop);
        Thread.sleep(2000);
 //       WaitActions.getWaits().scrollElementTillView(crossIcon_All.get(0));
 //       WebElementActions.getActions().moveOnTargetElement(crossIcon_All.get(0));
 //       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon_All.get(55));
  //      Thread.sleep(2000);  //crossIcon_All
        System.out.println("Size is"+ crossIcon_All.size());
//        WebElementActions.getActions().clickElement(crossIcon_All.get(55));

         Thread.sleep(8000);
  //      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(crossIcon_All.get(0));


            if (crossIcon_All.size() > 12) {
                WebElementActions.getActions().moveOnTargetElement(crossIcon_All.get(0));

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon_All.get(0));
                Thread.sleep(5000);
                WebElementActions.getActions().clickElement(crossIcon_All.get(0));
            }
            else
            {
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon_All.get(0));
                WebElementActions.getActions().clickElement(crossIcon_All.get(0));
            }

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on cancle button
     */
    public void clickOnCancleButton() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(but_cancle);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(but_cancle);
        Thread.sleep(8000);
        WebElementActions.getActions().clickElement(but_cancle);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
/**
 * verify Accessories group
 */
/* public void verifyAccessoriesGroup()
{
WaitActions.getWaits().WaitUntilWebElementIsVisible();
Assert.assertTrue(.isDisplayed());
} */
    /**
     * click on Accessories Group Img
     */
    public void clickOnAccessoriesGroupImg() throws InterruptedException {

// WaitActions.getWaits().waitForElementTobeClickable(img_Accessories_Group);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_Accessories_Group);
        Thread.sleep(8000);
        WebElementActions.getActions().clickElement(img_Accessories_Group);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on plus icon Labour Details
     */
    public void clickOnPlusIcon_LabourDetails() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(plusIcon_LabourDetails);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plusIcon_LabourDetails);
        Thread.sleep(8000);
        WebElementActions.getActions().clickElement(plusIcon_LabourDetails);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on add button
     */
    public void clickOnAddButton2() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_add2);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_add2);
        Thread.sleep(8000);
        WebElementActions.getActions().clickElement(btn_add2);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify clock icon
     */
    public void verifyClockIcon() throws InterruptedException {
// WaitActions.getWaits().WaitUntilWebElementIsVisible(clockIcon.get(0));
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(clockIcon.get(0));
        Assert.assertTrue(clockIcon.size()>=0);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on select button
     */
    public void clickOnSelectButton2() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_select1);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select1);
        Thread.sleep(8000);
        WebElementActions.getActions().clickElement(btn_select1);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
/**
 * click on Yes delete labour Parts button
 */
/* public void clickOnYesDeleteLabourParts()
{
WaitActions.getWaits().waitForElementTobeClickable(btn_YesdeletelabourParts);
WebElementActions.getActions().clickUsingJS(btn_YesdeletelabourParts);

TestListener.saveScreenshotPNG(driver);
} */
    /**
     * click on cross icon
     */
    public void clickOnCrossIconAsapShop2() throws InterruptedException {

// WebElementActions.getActions().moveOnTargetElement(row_one);

        Thread.sleep(10000);

        WebElementActions.getActions().moveOnTargetElement(crossIcon_All.get(0));
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(accessories1);
        String assessories = accessories1.getAttribute("title");

           Thread.sleep(3000);

        System.out.println("Size of labour is :"+ all_Labour.size());

        for(int i=0;i<all_Labour.size();i++)
        {
            System.out.println(all_Labour.get(i).getAttribute("title"));
             Thread.sleep(2000);
            if(all_Labour.get(i).getAttribute("title").contains(assessories))
            {
                WebElementActions.getActions().moveOnTargetElement(crossIcon_All.get(i));
     //           Thread.sleep(15000);
                WebElementActions.getActions().clickUsingJS(crossIcon_All.get(i));
                break;
            }
        }



//        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon_All.get(0));
//        WebElementActions.getActions().clickElement(crossIcon_All.get(0));

// Thread.sleep(3000);
// WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon.get(0));
// WebElementActions.getActions().clickElement(crossIcon.get(0));
        TestListener.saveScreenshotPNG(driver);

/* if(btn_YesdeletelabourParts.size()>0)
{
WebElementActions.getActions().clickUsingJS(btn_YesdeletelabourParts.get(0));
} */

    }
    /**
     * verify Delete Aerodynamic Device Page
     */
    public void verifyDeleteAerodynamicDevice() throws InterruptedException {

        Thread.sleep(3000);
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_DeleteAero);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_DeleteAero);
        Assert.assertTrue(label_DeleteAero.isDisplayed());
        Assert.assertTrue(label_description_MoveTech.isDisplayed());
// WaitActions.getWaits().WaitUntilWebElementIsVisible(label_description1);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_description1);
        Assert.assertTrue(label_description1.isDisplayed());
        Assert.assertTrue(label_hrs.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }


    /**
     * click on signOut btn
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {
// WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(4000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

// WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
}

