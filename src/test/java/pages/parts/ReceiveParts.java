package pages.parts;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class ReceiveParts extends TestDriverActions {


    @FindBy(xpath = "//a[text()='Parts']")
    WebElement label_parts1;

    @FindBy(xpath = "//td[text()='Receive Parts']")
    WebElement label_receiveParts;

    @FindBy(xpath = "//label[text()='Warehouse:']/following::select")
    WebElement dropdown;

    @FindBy(xpath = "//label[text()='From Date:']/following::input[1]")
    WebElement txt_adddate;

    @FindBy(xpath = "//label[text()='From Date:']/following::a[2]/span")
    WebElement btn_refresh;

    //@FindBy(xpath = "//span[text()='Total Amount']/following::tr[4]/td[1]/span/a/span")
    @FindBy(xpath = "//a[contains(@id,'cil4')]")
    List<WebElement> PONumber;


    @FindBy(xpath = "//span[text()='Extended Cost']/following::span[2]")
    WebElement label_Link_Delink_Labor;

    @FindBy(xpath = "//div[text()='Purchase Order']")
    WebElement label_PurchaseOrder;

    @FindBy(xpath = "//div[text()='Purchase Order']/following::span[1]")
    WebElement asterisk_location;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement label_location;

    @FindBy(xpath = "//label[text()='Location:']/following::td[1]")
    WebElement txt_location;

    @FindBy(xpath = "//label[text()='Location:']/following::span[1]")
    WebElement asterisk_vendor;

    @FindBy(xpath = "(//label[text()='Vendor:'])[2]")
    WebElement label_vendor;

    @FindBy(xpath = "(//label[text()='Vendor:'])[2]/following::td[1]")
    WebElement txt_vendor;

    @FindBy(xpath = "//label[text()='PO#:']")
    WebElement label_PO;

    @FindBy(xpath = "//label[text()='PO#:']/following::td[1]")
    WebElement txt_PO;

    @FindBy(xpath = "//label[text()='Reference:']")
    WebElement label_reference;

    @FindBy(xpath = "(//label[text()='PO Date:'])[2]")
    WebElement label_PO_Date;

    @FindBy(xpath = "//label[text()='Transport Priority:']")
    WebElement label_transportPriority;

    @FindBy(xpath = "//label[text()='Notes:']")
    WebElement label_notes;

    @FindBy(xpath = "//label[text()='Notes:']/following::img[2]")
    WebElement icon_camera;

    @FindBy(xpath = "//label[text()='Notes:']/following::a[2]")
    WebElement hyperlink_zero;

    @FindBy(xpath = "//label[text()='Ship From:']")
    WebElement label_shipFrom;

    @FindBy(xpath = "//label[text()='Ship To:']")
    WebElement label_shipTo;

    @FindBy(xpath = "//label[text()='Submitted Date:']")
    WebElement label_submitDate;

    @FindBy(xpath = "//label[text()='Receiving Info:']")
    WebElement label_receiveInfo;

    @FindBy(xpath = "//label[text()='Voided Date:']")
    WebElement label_voidedDate;

    @FindBy(xpath = "//label[text()='Closed Date:']")
    WebElement label_closedDate;

    @FindBy(xpath = "//span[text()='Parts PO']")
    WebElement label_partsPo;

    @FindBy(xpath = "//label[text()='Parts:']")
    WebElement label_parts;

    @FindBy(xpath = "//label[text()='Parts:']/following::td[4]/span")
    WebElement txt_partsPrice;

    @FindBy(xpath = "(//label[text()='Added Cost:'])[2]")
    WebElement label_addedCost;

    @FindBy(xpath = "(//label[text()='Added Cost:'])[2]/following::td[4]/a/span[2]")
    WebElement txt_addedCost;

    @FindBy(xpath = "(//label[text()='Sub Total:'])[2]")
    WebElement label_subTotal;

    @FindBy(xpath = "(//label[text()='Sub Total:'])[2]/following::td[4]/span")
    WebElement txt_subTotal;

    @FindBy(xpath = "(//label[text()='Taxes:'])[2]")
    WebElement label_taxes;

    @FindBy(xpath = "(//label[text()='Taxes:'])[2]/following::td[4]/a/span[2]")
    WebElement txt_taxesPrice;

    @FindBy(xpath = "//label[text()='Total:']")
    WebElement label_total;

    @FindBy(xpath = "//label[text()='Total:']/following::td[4]/span")
    WebElement txt_totalPrice;

    @FindBy(xpath = "//span[text()='Part #']")
    WebElement label_parts_table;

    @FindBy(xpath = "//span[text()='Vendor Part #']")
    WebElement label_vendorPart;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement label_description;

    @FindBy(xpath = "//span[text()='Order Quantity']")
    WebElement label_orderQuantity;

    @FindBy(xpath = "//span[text()='UOM']")
    WebElement label_UOM;

    @FindBy(xpath = "//span[text()='Stock UOM']")
    WebElement label_StockUOM;

    @FindBy(xpath = "//span[text()='Conv']")
    WebElement label_conv;

    @FindBy(xpath = "//span[text()='Unit Cost']")
    WebElement label_UnitCost;

    @FindBy(xpath = "//span[text()='Core']")
    WebElement label_core;

    @FindBy(xpath = "//span[text()='Extended Cost']")
    WebElement label_extendedCost;

    @FindBy(xpath = "//span[text()='Extended Cost']/following::span[2]")
    WebElement label_link;

    //@FindBy(xpath = "//span[text()='Link']")
    @FindBy(xpath = "//span[text()='Link']/ancestor::div[1]")
    List<WebElement> btn_link;
//    WebElement btn_link;

    @FindBy(xpath = "//span[text()='Yes']")
    WebElement btn_yes;
    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement label_cancle;

    @FindBy(xpath = "//div[contains(@id,'cbClose')]")
    WebElement btn_cancle1;

    @FindBy(xpath = "(//span[text()='Re-Open'])")
    WebElement btn_reopn;

    @FindBy(xpath = "//span[text()='Re-Open']/following::span[2]")
    WebElement btn_receiveParts;

    @FindBy(xpath = "//div[text()='Link Part to RO Activity or Counter Sale']")
    WebElement label_LinkPartToRO;

    @FindBy(xpath = "//label[text()='Part #:']")
    WebElement label_part2;

    @FindBy(xpath = "//label[text()='Part #:']/following::td[1]")
    WebElement txt_part2;

    @FindBy(xpath = "//label[text()='Part #:']/following::input[1]")
    WebElement radio_repairOrderAct;

    @FindBy(xpath = "//label[text()='Repair Order Activity']")
    WebElement label_repairOrderAct;

    @FindBy(xpath = "//label[text()='Repair Order Activity']/following::input[1]")
    WebElement radio_CounterSale;

    @FindBy(xpath = "//label[text()='Repair Order Activity']/following::input[2]")
    WebElement txt_searchField;

    @FindBy(xpath = "//span[text()='RO Number']")
    WebElement label_RoNumber;

    @FindBy(xpath = "//span[text()='RO Date']")
    WebElement label_RoDate;

    @FindBy(xpath = "//span[text()='Unit #']")
    WebElement label_Unit;

    @FindBy(xpath = "//span[text()='Unit #']/following::span[1]")
    WebElement label_description1;

    @FindBy(xpath = "//span[text()='Customer Name']")
    WebElement label_customername;

    @FindBy(xpath = "//span[text()='#']")
    WebElement label_hash;

    @FindBy(xpath = "//span[text()='VMRS']")
    WebElement label_VMRS;

    @FindBy(xpath = "//span[text()='VMRS']/following::span[1]")
    WebElement label_description3;

    @FindBy(xpath = "//span[text()='VMRS']/following::th[2]/div")
    WebElement label_selectColumn1;

    @FindBy(xpath = "//span[text()='VMRS']/following::a[3]/span")
    WebElement label_select1;

    @FindBy(xpath = "//span[text()='Open Counter Sale #']")
    WebElement label_openCounterSale;

    @FindBy(xpath = "(//span[text()='Date'])[2]")
    WebElement label_Date2;

    @FindBy(xpath = "//span[text()='Customer']")
    WebElement label_customer;

    @FindBy(xpath = "//span[text()='Open Counter Sale #']/following::th[3]/div")
    WebElement label_select2;

    @FindBy(xpath = "//label[text()='Counter Sale']/following::span[text()='Cancel'][1]")
    WebElement btn_cancleLinkPartRoSale;


    @FindBy(xpath = "(//div[text()='Purchase Order']/following::span[text()='Cancel'])[4]")
    WebElement btn_cancle3;

    @FindBy(xpath = "//h1[text()='Order Summary']/following::a[2]/span")
    WebElement btn_receivePO;

    @FindBy(xpath = "//span[text()='Change Preferred Vendor']/following::a[4]/span")
    WebElement btn_receiveParts1;

    @FindBy(xpath = "//label[text()='Invoice Number:']/following::input[1]")
    WebElement txt_invoiceNumber;

    @FindBy(xpath = "//label[text()='Invoice Number:']/following::a[7]/span")
    WebElement btn_receiveParts2;

    @FindBy(xpath = "//span[text()='Re-Open']/preceding::span[text()='Cancel'][1]")
    WebElement btn_canclePOScreen;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//span[text()='Create New Receiving']")
    WebElement createNewReceiving;




    public static void gotoReceiveParts() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Receive Parts");
    }

    /**
     * Extra steps add - not mention in script
     */

    public void enterDateClickrefresh() throws InterruptedException {

//        WaitActions.getWaits().WaitUntilWebElementIsVisible(dropdown);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(dropdown);
        WebElementActions.getActions().elementSelectByVisibilityText(dropdown,prop.getProperty("warehouse"));

//       WaitActions.getWaits().waitForElementTobeClickable(txt_adddate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_adddate);
       txt_adddate.clear();
       Thread.sleep(1000);
       txt_adddate.sendKeys(prop.getProperty("date"));

//       WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_refresh);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_refresh);
       WebElementActions.getActions().clickElement(btn_refresh);
 //        Thread.sleep(2000);
        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on PO number
     */
    public void clickOnPONumber() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(PONumber);
 /*       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PONumber);
        WebElementActions.getActions().clickElement(PONumber);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);  */



//        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PONumber.get(0));
        for (int i = 0; i <= PONumber.size(); i++) {
 //           WaitActions.getWaits().fluentWait(PONumber.get(i),60);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PONumber.get(i));
            WebElementActions.getActions().clickElement(PONumber.get(i));
 //           Thread.sleep(2000);
 //           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_link.get(0));
 //           System.out.println("Size of Link :"+btn_link.size());
 //           for (int j = 0; j < btn_link.size(); j++) {
               WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_parts);
     //           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_link.get(i));
            Thread.sleep(2000);
     //           System.out.println("Size of Link :"+btn_link.size());
               if(btn_link.size()>0) {

                   if (btn_link.get(i).getAttribute("class").contains("p_AFDisabled")) {
                       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_cancle1);
                       WebElementActions.getActions().clickElement(btn_cancle1);

                   } else {
                       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_link.get(i));
                       WebElementActions.getActions().clickElement(btn_link.get(i));
                       break;
                   }
               }
               else {
                   WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_cancle1);
                   WebElementActions.getActions().clickElement(btn_cancle1);
               }
 //                   break;
            }

 //       }

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify all the element of Purchase order page
     */
 /*   public void displayAllLabels() throws InterruptedException {
//        WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Link_Delink_Labor);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Link_Delink_Labor);
       Assert.assertTrue(label_Link_Delink_Labor.isDisplayed());
//        WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PurchaseOrder);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PurchaseOrder);
        Assert.assertTrue(label_PurchaseOrder.isDisplayed());
        Assert.assertTrue(asterisk_location.isDisplayed());
        Assert.assertTrue(label_location.isDisplayed());
        Assert.assertTrue(txt_location.isDisplayed());
        Assert.assertTrue(asterisk_vendor.isDisplayed());
        Assert.assertTrue(label_vendor.isDisplayed());
        Assert.assertTrue(txt_vendor.isDisplayed());
        Assert.assertTrue(label_PO.isDisplayed());
        Assert.assertTrue(txt_PO.isDisplayed());
        Assert.assertTrue(label_reference.isDisplayed());
        Assert.assertTrue(label_PO_Date.isDisplayed());
        Assert.assertTrue(label_transportPriority.isDisplayed());
        Assert.assertTrue(label_notes.isDisplayed());
        try {
            Assert.assertTrue(icon_camera.isDisplayed());
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(hyperlink_zero.isDisplayed());
        Assert.assertTrue(label_shipFrom.isDisplayed());
        Assert.assertTrue(label_shipTo.isDisplayed());
        Assert.assertTrue(label_submitDate.isDisplayed());
        Assert.assertTrue(label_receiveInfo.isDisplayed());
        Assert.assertTrue(label_voidedDate.isDisplayed());
        Assert.assertTrue(label_closedDate.isDisplayed());
        Assert.assertTrue(label_partsPo.isDisplayed());
        Assert.assertTrue(label_parts.isDisplayed());
//        Assert.assertTrue(txt_partsPrice.isDisplayed());
        Assert.assertTrue(label_addedCost.isDisplayed());
 //       Assert.assertTrue(txt_addedCost.isDisplayed());
        Assert.assertTrue(label_subTotal.isDisplayed());
 //       Assert.assertTrue(txt_subTotal.isDisplayed());
        Assert.assertTrue(label_taxes.isDisplayed());
//        Assert.assertTrue(txt_taxesPrice.isDisplayed());
        Assert.assertTrue(label_total.isDisplayed());
//        Assert.assertTrue(txt_totalPrice.isDisplayed());
        Assert.assertTrue(label_parts_table.isDisplayed());
        Assert.assertTrue(label_vendorPart.isDisplayed());
        Assert.assertTrue(label_description.isDisplayed());
        Assert.assertTrue(label_orderQuantity.isDisplayed());
        Assert.assertTrue(label_UOM.isDisplayed());
        Assert.assertTrue(label_StockUOM.isDisplayed());
        Assert.assertTrue(label_conv.isDisplayed());
        Assert.assertTrue(label_UnitCost.isDisplayed());
        Assert.assertTrue(label_core.isDisplayed());
        Assert.assertTrue(label_extendedCost.isDisplayed());
        Assert.assertTrue(label_link.isDisplayed());
        Assert.assertTrue(label_cancle.isDisplayed());
       Assert.assertTrue(btn_canclePOScreen.isDisplayed());
        Assert.assertTrue(btn_reopn.isDisplayed());
        Assert.assertTrue(btn_receiveParts.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }  */

    /**
     * click on link button
     *
     */
 /*   public void clickOnLinkButton() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_link);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_link);
        WebElementActions.getActions().clickElement(btn_link);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }  */

    /**
     * verify element in Link part to RO Activity or counter sale Page
     */
    public void repairOrderActivityTable() throws InterruptedException {
//        WaitActions.getWaits().WaitUntilWebElementIsVisible(label_LinkPartToRO);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LinkPartToRO);
        Assert.assertTrue(label_LinkPartToRO.isDisplayed());
        Assert.assertTrue(label_part2.isDisplayed());
        Assert.assertTrue(txt_part2.isDisplayed());
        Assert.assertTrue(radio_repairOrderAct.isDisplayed());
        Assert.assertTrue(label_repairOrderAct.isDisplayed());
        Assert.assertTrue(radio_CounterSale.isDisplayed());
        Assert.assertTrue(txt_searchField.isDisplayed());
        Assert.assertTrue(label_RoNumber.isDisplayed());
        Assert.assertTrue(label_RoDate.isDisplayed());
        Assert.assertTrue(label_Unit.isDisplayed());
        Assert.assertTrue(label_description1.isDisplayed());
        Assert.assertTrue(label_customername.isDisplayed());
        Assert.assertTrue(label_hash.isDisplayed());
        Assert.assertTrue(label_VMRS.isDisplayed());
        Assert.assertTrue(label_description3.isDisplayed());
        Assert.assertTrue(label_selectColumn1.isDisplayed());
        Assert.assertTrue(label_select1.isDisplayed());

        }

    /**
     *  click on Counter sale radio button
     */
    public void openCounterSaleButton() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(radio_CounterSale);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radio_CounterSale);
        WebElementActions.getActions().clickElement(radio_CounterSale);

        TestListener.saveScreenshotPNG(driver);
    }

    public void openCounterSaleTable() {
        try {
//            WaitActions.getWaits().WaitUntilWebElementIsVisible(label_openCounterSale);
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_openCounterSale);
            Assert.assertTrue(label_openCounterSale.isDisplayed());
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(label_Date2.isDisplayed());
        Assert.assertTrue(label_customer.isDisplayed());
        Assert.assertTrue(label_select2.isDisplayed());
        Assert.assertTrue(btn_cancleLinkPartRoSale.isDisplayed());
    }

    /**
     * click on cancle button of Link part to RO Activity or counter sale Page
     */
    public void clickOnCancleButtonOpenCounter() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_cancleLinkPartRoSale);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_cancleLinkPartRoSale);
        WebElementActions.getActions().clickElement(btn_cancleLinkPartRoSale);

    }

    /**
     *  click on cancle button of PO screen
     * @throws InterruptedException
     */
      public void canclePOscreen() throws InterruptedException {
          Thread.sleep(2000);
//          WaitActions.getWaits().waitForElementTobeClickable(btn_canclePOScreen);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_canclePOScreen);
          WebElementActions.getActions().clickElement(btn_canclePOScreen);

          WaitActions.getWaits().loadingWait(loder);
      }

    /**
     * click on Receive PO button
     */
    public void clickOnReceivePO() throws InterruptedException {
 //       try
//          WaitActions.getWaits().waitForElementTobeClickable(btn_receivePO);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_receivePO);
          WebElementActions.getActions().clickElement(btn_receivePO);

//          WaitActions.getWaits().waitForElementTobeClickable(createNewReceiving);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(createNewReceiving);
          WebElementActions.getActions().clickElement(createNewReceiving);

          WaitActions.getWaits().loadingWait(loder);
      }

    /**
     * click on receive parts button
     */
    public void clickOnReceiveParts() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(btn_receiveParts1);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_receiveParts1);
        WebElementActions.getActions().clickElement(btn_receiveParts1);

//        WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_invoiceNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_invoiceNumber);
        String invoiceNum = String.valueOf(WebElementActions.getActions().randomNumber(10,1000));
        WebElementActions.getActions().inputText(txt_invoiceNumber,invoiceNum);

//        WaitActions.getWaits().waitForElementTobeClickable(btn_receiveParts2);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_receiveParts2);
        WebElementActions.getActions().clickElement(btn_receiveParts2);

    }

    /**
     * click on sign out button
     * verify username field
     * @throws InterruptedException
     */
    public void clickOnSignOut () throws InterruptedException {
 //              Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

//        WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());
    }






}
