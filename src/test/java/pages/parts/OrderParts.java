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

public class OrderParts extends TestDriverActions {

    @FindBy(xpath ="(//a[text()='Spot Order'])[1]")
    WebElement hyperlink_soptOrder;

    @FindBy(xpath ="//h1[text()='Search Catalog']/following::select[1]")
    WebElement field_dropdown;

    @FindBy(xpath ="//h1[text()='Search Catalog']/following::input[1]")
    WebElement txtfield_search;

    @FindBy(xpath ="//span[text()='New Part']")
    WebElement btn_newPart;

    @FindBy(xpath ="//h1[text()='Order List']")
    WebElement subtitle_orderList;

    @FindBy(xpath ="//label[text()='Warehouse:']")
    WebElement label_warehouse;

    @FindBy(xpath ="//label[text()='Total:']")
    WebElement label_total;

    @FindBy(xpath ="//span[text()='Refresh']")
    WebElement btn_refresh;

    @FindBy(xpath ="//span[text()='Part']")
    WebElement label_part;

    @FindBy(xpath ="//span[text()='UOM']")
    WebElement label_UOM;

    @FindBy(xpath ="//span[text()='Quantity']")
    WebElement label_quantity;

    @FindBy(xpath ="//span[text()='Extended']")
    WebElement label_extended;

    @FindBy(xpath ="//div[text()='Please Add parts from the catalog list.']")
    WebElement label_plzAddPartscatalogList;

    @FindBy(xpath ="//span[text()='Fastening band']")
    WebElement label_fasteningBand;

    @FindBy(xpath ="//label[text()='Part #:']")
    WebElement label_part_hash;

    @FindBy(xpath = "(//label[text()='Part #:']/following::td[1])[1]")
    WebElement label_part_number;

    @FindBy(xpath ="//label[text()='Price:']")
    WebElement label_price;

    @FindBy(xpath ="//label[text()='Price:']/following::td[1]")
    WebElement label_priceValue;

    @FindBy(xpath ="//label[text()='In Stock:']")
    WebElement label_inStock;

    @FindBy(xpath ="//label[text()='In Stock:']/following::td[1]")
    WebElement label_inStock_value;

    @FindBy(xpath ="//label[text()='Notes:']")
    WebElement label_notes;

    @FindBy(xpath ="//label[text()='Notes:']/following::input[1]")
    WebElement txt_1;

    @FindBy(xpath = "(//label[text()='Price:']/following::td[1])[2]")
    WebElement partPrice1;

    @FindBy(xpath ="//span[text()='Add']")
    WebElement btn_add;

    @FindBy(xpath ="(//span[text()='Fastening band'])[2]")
    WebElement label_fasteningband2;

    @FindBy(xpath ="(//span[text()='Fastening band'])[2]/following::td[2]")
    WebElement band_value;

    @FindBy(xpath ="(//span[text()='Fastening band'])[2]/following::input[1]")
    WebElement value_1;

    @FindBy(xpath ="//div[text()='Use the Search box above to search for parts']")
    WebElement label_useSearchBox;

    @FindBy(xpath ="//label[text()='Part #:']/following::td[1]")
    WebElement txtfield_part;

    @FindBy(xpath ="//label[text()='Part #:']/preceding::span[1]")
    WebElement part_name;

    @FindBy(xpath ="//label[text()='Notes:']/following::a[2]")
    WebElement increament_icon;

    @FindBy(xpath ="//label[text()='Notes:']/following::a[3]")
    WebElement decreament_icon;

    @FindBy(xpath = "(//span[text()='SWITCH MICRO'])[2]")
    WebElement switchMicro2;

    @FindBy(xpath = "(//span[text()='SWITCH MICRO'])[2]/following::td[2]")
    WebElement switchMicro_num;

    @FindBy(xpath = "(//label[text()='Price:'])[3]/following::td[1]")
    WebElement partPrice2;

    @FindBy(xpath = "//label[text()='Total:']/following::td[1]/span")
    WebElement orderTotal;

    @FindBy(xpath ="//span[text()='Extended']/following::input[1]")
    WebElement value_3_Quantity;

    @FindBy(xpath ="//span[text()='Extended']/following::a[6]/img")
    WebElement cross_icon;

    @FindBy(xpath = "(//span[text()='Test parent part'])[2]/following::td[2]")
    WebElement test_Parent_part;

    @FindBy(xpath = "//span[text()='Test core']/following::td[2]")
    WebElement test_core;

    @FindBy(xpath ="(//span[text()='SWITCH MICRO']/following::input[3])[1]")
    WebElement txt_switch_3;


    @FindBy(xpath ="//span[text()='Issue PO']")
    WebElement btn_issuePo;

    @FindBy(xpath ="//div[text()='Issue PO']")
    WebElement label_issuePo;

    @FindBy(xpath ="//span[text()='Vendor Name']")
    WebElement label_VendorName;

    @FindBy(xpath ="//span[text()='Amount']")
    WebElement label_amount;

    @FindBy(xpath ="//a[text()='A-1 Business Machines']")
    WebElement label_businessmachines;

    @FindBy(xpath ="//a[text()='A-1 Business Machines']/following::td[1]")
    WebElement issuePo_value;

    @FindBy(xpath ="(//span[text()='Issue PO'])[2]")
    WebElement btn_issuePo2;

    @FindBy(xpath ="//div[text()='Purchase Order']")
    WebElement label_purchaseOrder;

    @FindBy(xpath ="//div[text()='Purchase Order']/following::span[1]")
    WebElement asterisk_location;

    @FindBy(xpath ="//label[text()='Location:']")
    WebElement label_location;

    @FindBy(xpath ="//label[text()='Location:']/following::span[1]")
    WebElement asterisk_vendor;

    @FindBy(xpath ="//label[text()='Vendor:']")
    WebElement label_vendor;

    @FindBy(xpath ="//label[text()='Vendor:']/following::a[1]")
    WebElement hyperlink_vendor;

    @FindBy(xpath ="//label[text()='PO#:']")
    WebElement label_po;

    @FindBy(xpath ="//label[text()='PO#:']/following::td[1]")
    WebElement txt_po;

    @FindBy(xpath ="//label[text()='Reference:']")
    WebElement label_reference;

    @FindBy(xpath ="//label[text()='Reference:']/following::input[1]")
    WebElement txt_reference;

    @FindBy(xpath ="//label[text()='PO Date:']")
    WebElement label_poDate;

    @FindBy(xpath ="//label[text()='PO Date:']/following::a[1]")
    WebElement icon_poDate;

    @FindBy(xpath ="//label[text()='Transport Priority:']")
    WebElement label_transportPriority;

    @FindBy(xpath ="//label[text()='Transport Priority:']/following::select")
    WebElement dropdwn_transportPriority;

    @FindBy(xpath ="(//label[text()='Notes:'])[2]")
    WebElement label_notes1;

    @FindBy(xpath ="(//label[text()='Notes:'])[2]/following::textarea")
    WebElement textarea_notes;

    @FindBy(xpath ="//a[text()='Import Standard Notes']")
    WebElement hyperlink_importStandardNotes;

    @FindBy(xpath ="//label[text()='Ship From:']")
    WebElement label_shipFrom;

    @FindBy(xpath ="//label[text()='Ship From:']/following::a[1]")
    WebElement hyperlink_select;

    @FindBy(xpath ="//label[text()='Ship To:']")
    WebElement label_shipTo;

    @FindBy(xpath ="//label[text()='Ship To:']/following::a[1]")
    WebElement hyperlink_shipTo;

    @FindBy(xpath ="//label[text()='Submitted Date:']")
    WebElement label_submittedDate;

    @FindBy(xpath ="//label[text()='Receiving Info:']")
    WebElement label_receivingInfo;

    @FindBy(xpath ="//label[text()='Receiving Info:']/following::td[1]")
    WebElement label_NotYetReceived;

    @FindBy(xpath ="//a[text()='Import Standard Notes']/following::td[3]/a/img")
    WebElement camera_icon;

    @FindBy(xpath ="//a[text()='Import Standard Notes']/following::td[5]/a")
    WebElement camera_0;

    @FindBy(xpath ="//label[text()='Voided Date:']")
    WebElement label_voidedDate;

    @FindBy(xpath ="//label[text()='Closed Date:']")
    WebElement label_closedDate;

    @FindBy(xpath ="//label[text()='Parts:']")
    WebElement label_parts2;

    @FindBy(xpath ="//label[text()='Added Cost:']")
    WebElement label_addCost;

    @FindBy(xpath ="//label[text()='Added Cost:']/following::span[2]")
    WebElement txt_addCost;

    @FindBy(xpath ="//label[text()='Sub Total:']")
    WebElement label_subTotal;

    @FindBy(xpath = "//label[text()='Sub Total:']/following::td[3]/span")
    WebElement  label_poPartsCost;

    @FindBy(xpath = "//label[text()='Sub Total:']/following::td[3]/span")
    WebElement  label_ordertotal_subtotal;

    @FindBy(xpath ="//label[text()='Taxes:']")
    WebElement label_taxes;

    @FindBy(xpath ="//label[text()='Taxes:']/following::td[4]")
    WebElement txt_taxes;

    @FindBy(xpath ="(//label[text()='Total:'])[2]")
    WebElement label_table2;

    @FindBy(xpath ="(//label[text()='Part #:'])[2]/preceding::span[1]")
    WebElement asterisk_part2;

    @FindBy(xpath ="(//label[text()='Part #:'])[2]")
    WebElement label_part2;

    @FindBy(xpath ="(//label[text()='Part #:'])[2]/following::input[1]")
    WebElement txt_part2;

    @FindBy(xpath ="(//label[text()='Part #:'])[2]/following::td[2]/a/img")
    WebElement search_icon;

    @FindBy(xpath ="(//label[text()='Qty:'])[1]")
    WebElement label_Qty;

    @FindBy(xpath ="(//label[text()='Qty:'])[1]/following::input[1]")
    WebElement txt_Qty;

    @FindBy(xpath ="//span[text()='Add Part']")
    WebElement btn_addPart;

    @FindBy(xpath ="//span[text()='Part #']")
    WebElement label_part3;

    @FindBy(xpath ="//span[text()='Vendor Part #']")
    WebElement label_vendor_part;

    @FindBy(xpath ="//span[text()='Description']")
    WebElement label_description;

    @FindBy(xpath ="//span[text()='Order Quantity']")
    WebElement label_order_Quantity;

    @FindBy(xpath ="(//span[text()='UOM'])[2]")
    WebElement label_UOM2;

    @FindBy(xpath ="//span[text()='Stock UOM']")
    WebElement label_stockUOM;

    @FindBy(xpath ="//span[text()='Conv']")
    WebElement label_conv;

    @FindBy(xpath ="//span[text()='Unit Cost']")
    WebElement label_unitCost;

    @FindBy(xpath ="//span[text()='Core']")
    WebElement label_core;

    @FindBy(xpath ="//span[text()='Extended Cost']")
    WebElement label_extebdedCost;

    @FindBy(xpath ="//span[text()='Link/Delink Labour']")
    WebElement label_link_delink;

    @FindBy(xpath ="(//span[text()='Fastening band'])[2]")
    WebElement label_fasteningBand3;

    @FindBy(xpath ="(//span[text()='Fastening band'])[2]/following::td[1]")
    WebElement value_3;

    @FindBy(xpath ="(//span[text()='Fastening band'])[2]/following::td[9]/span/a/img")
    WebElement crossIcon;

    @FindBy(xpath ="(//span[text()='Link'])[1]")
    WebElement btn_link;

    @FindBy(xpath ="(//span[text()='Copy PO'])[1]")
    WebElement btn_copyPo;

    @FindBy(xpath ="(//span[text()='Void'])[1]")
    WebElement btn_void;

    @FindBy(xpath ="(//span[text()='OK'])[2]")
    WebElement btn_ok;

    @FindBy(xpath ="//span[text()='Submit / Print PO']")
    WebElement btn_submit_printPo;

    @FindBy(xpath ="(//a[text()='WIP POs'])[2]")
    WebElement btn_WIp;

    @FindBy(xpath ="//h1[text()='WIP POs']")
    WebElement label_wipPos;

    @FindBy(xpath ="//label[text()='Warehouse:']")
    WebElement label_wareHouse;

    @FindBy(xpath ="//label[text()='Warehouse:']/following::select[1]")
    WebElement txt_warehouse;

    @FindBy(xpath ="//label[text()='Search:']")
    WebElement label_search;

    @FindBy(xpath ="//label[text()='Search:']/following::input[1]")
    WebElement txt_search;

    @FindBy(xpath ="//span[text()='Refresh']")
    WebElement btn_Refresh;

    @FindBy(xpath ="//span[text()='Order #']")
    WebElement label_order_hash;

    @FindBy(xpath ="//span[text()='Date']")
    WebElement label_date;

    @FindBy(xpath ="//span[text()='Vendor']")
    WebElement label_vendor2;

    @FindBy(xpath ="//span[text()='Warehouse']")
    WebElement label_warehouse2;

    @FindBy(xpath ="//span[text()='Reference']")
    WebElement label_reference2;

    @FindBy(xpath ="//span[text()='Status']")
    WebElement label_status2;

    @FindBy(xpath ="//span[text()='Status']/following::td[1]")
    WebElement poNumber;

    @FindBy(xpath ="//span[text()='Status']/following::td[1]/span/a/span")
    WebElement hyperlink_poNumber;

    @FindBy(xpath ="//span[text()='Status']/following::td[6]")
    WebElement status_open;

    @FindBy(xpath ="//h1[text()='Order Summary']")
    WebElement label_openSummary;

    @FindBy(xpath ="(//span[text()='Void'])[1]")
    WebElement btn_void2;

    @FindBy(xpath ="(//span[text()='Submit / Print PO'])[1]")
    WebElement btn_submit_printPO2;

    @FindBy(xpath ="(//label[text()='Vendor:'])[1]")
    WebElement label_vendor1;

    @FindBy(xpath ="(//label[text()='Vendor:'])[1]/following::td[1]/span")
    WebElement label_vendor1_name;

    @FindBy(xpath ="(//label[text()='Address:'])[1]")
    WebElement label_address1;

    @FindBy(xpath ="(//label[text()='PO Date:'])[1]")
    WebElement PoDate;
    @FindBy(xpath ="(//span[text()='Status'])/following::a[1]/span")
    WebElement Po_num;

    @FindBy(xpath ="(//label[text()='PO#:'])[2]/following::td[1]")
    WebElement po_hash_number;

    @FindBy(xpath ="(//span[text()='Submit / Print PO'])[3]")
    WebElement btn_submitprintPo;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;



    /**
     * Go to Order parts
     */
      public static void gotoOrderParts() throws FileNotFoundException, InterruptedException {
          ReusableActions.getActions().clickParentMenu("Parts");
          ReusableActions.getActions().clickChildMenu("Order Parts");

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on spot order
     */
      public void clickOnSpotOrder() throws InterruptedException {

//          WaitActions.getWaits().loadingWait(loder);

//          WaitActions.getWaits().waitForElementTobeClickable(hyperlink_soptOrder);
          Thread.sleep(3000);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_soptOrder);
          WebElementActions.getActions().clickElement(hyperlink_soptOrder);

          WaitActions.getWaits().loadingWait(loder);

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * verify the  element
     */
    public void verifySearchCatalog() throws InterruptedException {
 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(field_dropdown);
  //      Thread.sleep(2000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(field_dropdown);
        Assert.assertTrue(field_dropdown.isDisplayed());
        Assert.assertTrue(txtfield_search.isDisplayed());
        Assert.assertTrue(btn_newPart.isDisplayed());
        Assert.assertTrue(subtitle_orderList.isDisplayed());
        Assert.assertTrue(label_warehouse.isDisplayed());
        Assert.assertTrue(label_total.isDisplayed());
        Assert.assertTrue(btn_refresh.isDisplayed());
        Assert.assertTrue(label_part.isDisplayed());
        Assert.assertTrue(label_UOM.isDisplayed());
        Assert.assertTrue(label_quantity.isDisplayed());
        Assert.assertTrue(label_extended.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_plzAddPartscatalogList);
        Assert.assertTrue(label_plzAddPartscatalogList.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter Partial part number
     */
    public void enterNumber() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(txtfield_search);
        Thread.sleep(3000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_search);
        WebElementActions.getActions().inputText(txtfield_search,prop.getProperty("PartialPartNumber"));
 //       Thread.sleep(3000);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);


    }
    /**
     * verify search catalog element
     */
     public void searchCatalog() throws InterruptedException {
  //       try {
 //        WaitActions.getWaits().WaitUntilWebElementIsVisible(label_part_number);
 //        Thread.sleep(2000);

         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_part_number);
         Assert.assertTrue(label_part_number.isDisplayed());
         Assert.assertTrue(label_part_number.isDisplayed());

         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_fasteningBand);
         Assert.assertTrue(label_fasteningBand.isDisplayed());
 //        }
 /*        catch(Throwable e)
         {
             e.printStackTrace();
         }  */
         Assert.assertTrue(label_part_hash.isDisplayed());
         Assert.assertTrue(label_price.isDisplayed());
         Assert.assertTrue(label_priceValue.isDisplayed());
         Assert.assertTrue(label_inStock.isDisplayed());
         Assert.assertTrue(label_inStock_value.isDisplayed());
         Assert.assertTrue(label_notes.isDisplayed());
         Assert.assertTrue(txt_1.isDisplayed());

         TestListener.saveScreenshotPNG(driver);


     }
    /**
     * click on Add button
     */
    public void clickOnAddButton() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(btn_add);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_add);
        WebElementActions.getActions().clickUsingJS(btn_add);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify order list section
     */
      public void verifyOrderListSection() throws InterruptedException {
//          try {
//              WaitActions.getWaits().WaitUntilWebElementIsVisible(label_fasteningband2);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_fasteningband2);
              Assert.assertTrue(label_fasteningband2.isDisplayed());
//          }
  /*        catch(Throwable e)
          {
              e.printStackTrace();
          }   */
 //         WaitActions.getWaits().WaitUntilWebElementIsVisible(band_value);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(band_value);
          Assert.assertTrue(band_value.isDisplayed());
          Assert.assertTrue(value_1.isDisplayed());

          Assert.assertTrue(partPrice1.isDisplayed());
          Assert.assertTrue(partPrice1.isDisplayed());

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * Enter search part description in textbox
     */
      public void enterSwitchMicro() throws InterruptedException {
//          WaitActions.getWaits().waitForElementTobeClickable(txtfield_search);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_search);
          WebElementActions.getActions().inputText(txtfield_search,prop.getProperty("SearchPartDescription"));
  //         Thread.sleep(3000);
  //        WaitActions.getWaits().WaitUntilWebElementIsVisible(label_useSearchBox);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_useSearchBox);
          Assert.assertTrue(label_useSearchBox.isDisplayed());

          TestListener.saveScreenshotPNG(driver);

      }
    /**
     * select description from dropdown
     */
      public void selectDropDown() throws InterruptedException {
//          WaitActions.getWaits().waitForElementTobeClickable(field_dropdown);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(field_dropdown);
          WebElementActions.getActions().elementSelectByVisibilityText(field_dropdown,prop.getProperty("dropdown1"));
          Thread.sleep(3000);

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * verify element Switch Micro(search part description)
     */
      public void verifysearchpartdescription() throws InterruptedException {
 //         WaitActions.getWaits().WaitUntilWebElementIsVisible(txtfield_part);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txtfield_part);
          Assert.assertTrue(txtfield_part.isDisplayed());
          Assert.assertTrue(part_name.isDisplayed());

          TestListener.saveScreenshotPNG(driver);


      }
    /**
     * verify element Switch Micro(search part description)
     */
    public void verifysearchpartdescription2() throws InterruptedException {
 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(switchMicro2);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(switchMicro2);
        Assert.assertTrue(switchMicro2.isDisplayed());
        Assert.assertTrue(switchMicro_num.isDisplayed());

        Assert.assertTrue(partPrice2.isDisplayed());
        Assert.assertTrue(orderTotal.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * select dropdown Exact part
     */
    public void selectDropDown2() throws InterruptedException {
 //       WaitActions.getWaits().waitForElementTobeClickable(field_dropdown);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(field_dropdown);
        WebElementActions.getActions().elementSelectByVisibilityText(field_dropdown,prop.getProperty("dropdown2"));

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * add full part number
     */
    public void addFullpartNumber() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(txtfield_search);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_search);
        WebElementActions.getActions().inputText(txtfield_search,prop.getProperty("FullPartNumber"));
        try {
//            WaitActions.getWaits().WaitUntilWebElementIsVisible(label_part_number);
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_part_number);
            Assert.assertTrue(label_part_number.isDisplayed());
        } catch(Throwable e)
        {
            e.printStackTrace();
        }
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_part_number);
 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(label_part_number);
        Assert.assertTrue(label_part_number.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on increament and decreament icon
     */
    public void clickOnIncreamentDecreament() throws InterruptedException {
 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(value_1);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(value_1);
        Assert.assertTrue(value_1.isDisplayed());

//        WaitActions.getWaits().waitForElementTobeClickable(txt_1);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_1);
        WebElementActions.getActions().inputText(txt_1,prop.getProperty("value"));

//        WaitActions.getWaits().waitForElementTobeClickable(increament_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(increament_icon);
        WebElementActions.getActions().clickElement(increament_icon);

//        WaitActions.getWaits().waitForElementTobeClickable(decreament_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(decreament_icon);
        WebElementActions.getActions().clickElement(decreament_icon);

        Assert.assertTrue(orderTotal.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cross icon
     */
    public void clickOnCrossIcon() throws InterruptedException {
 //       Thread.sleep(3000);
        Assert.assertTrue(value_3_Quantity.isDisplayed());

 //       WaitActions.getWaits().waitForElementTobeClickable(cross_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cross_icon);
        WebElementActions.getActions().clickElement(cross_icon);

        Assert.assertTrue(orderTotal.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Add Core Parent Part
     */
      public void addCoreParentPartNumber() throws InterruptedException {
 //         WaitActions.getWaits().waitForElementTobeClickable(txtfield_search);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_search);
          WebElementActions.getActions().inputText(txtfield_search,prop.getProperty("CoreParentPart"));
          Thread.sleep(3000);

          TestListener.saveScreenshotPNG(driver);

      }
    /**
     * verify parent part number and core part number
     */
    public void verifyParentandCorepart() throws InterruptedException {
//        WaitActions.getWaits().WaitUntilWebElementIsVisible(test_Parent_part);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(test_Parent_part);
        Assert.assertTrue(test_Parent_part.isDisplayed());
        Assert.assertTrue(test_core.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Issue Po
     */
      public void clickOnIssuePo() throws InterruptedException {
 //         WaitActions.getWaits().waitForElementTobeClickable(btn_issuePo);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_issuePo);
          WebElementActions.getActions().clickElement(btn_issuePo);

          WaitActions.getWaits().loadingWait(loder);

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * verify issue Po pop up
     */
      public void verifyIssuePOPopup() throws InterruptedException {
 //         WaitActions.getWaits().WaitUntilWebElementIsVisible( label_issuePo);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_issuePo);
          Assert.assertTrue( label_issuePo.isDisplayed());
 //         WaitActions.getWaits().WaitUntilWebElementIsVisible(label_VendorName);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VendorName);
          Assert.assertTrue(label_VendorName.isDisplayed());
          Assert.assertTrue(label_amount.isDisplayed());
          Assert.assertTrue(label_businessmachines.isDisplayed());
          Assert.assertTrue(issuePo_value.isDisplayed());

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on issue po button present in pop up
     */
    public void clickOnIssuePoBtn() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_issuePo2);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_issuePo2);
        WebElementActions.getActions().clickElement(btn_issuePo2);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify element of  purchase order page
     */
     public void verifyPurchaseOrder() throws InterruptedException {
 //        WaitActions.getWaits().WaitUntilWebElementIsVisible(label_purchaseOrder);
         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_purchaseOrder);
         Assert.assertTrue(label_purchaseOrder.isDisplayed());
 //        WaitActions.getWaits().WaitUntilWebElementIsVisible(asterisk_location);
         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(asterisk_location);
         Assert.assertTrue(asterisk_location.isDisplayed());
         Assert.assertTrue(label_location.isDisplayed());
         Assert.assertTrue(asterisk_vendor.isDisplayed());
         Assert.assertTrue(label_vendor.isDisplayed());
         Assert.assertTrue(hyperlink_vendor.isDisplayed());

         Assert.assertTrue(label_po.isDisplayed());
         Assert.assertTrue(txt_po.isDisplayed());
         Assert.assertTrue(label_reference.isDisplayed());
         Assert.assertTrue(txt_reference.isDisplayed());
         Assert.assertTrue(label_poDate.isDisplayed());

         Assert.assertTrue(icon_poDate.isDisplayed());
         Assert.assertTrue(label_transportPriority.isDisplayed());
         Assert.assertTrue(dropdwn_transportPriority.isDisplayed());
         Assert.assertTrue(label_notes1.isDisplayed());
         Assert.assertTrue(textarea_notes.isDisplayed());

         Assert.assertTrue(hyperlink_importStandardNotes.isDisplayed());
         Assert.assertTrue(label_shipFrom.isDisplayed());
         Assert.assertTrue(hyperlink_select.isDisplayed());
         Assert.assertTrue(label_shipTo.isDisplayed());
         Assert.assertTrue(hyperlink_shipTo.isDisplayed());
         Assert.assertTrue(label_submittedDate.isDisplayed());
         Assert.assertTrue(label_receivingInfo.isDisplayed());
         Assert.assertTrue(label_NotYetReceived.isDisplayed());
         Assert.assertTrue(camera_icon.isDisplayed());
         Assert.assertTrue(camera_0.isDisplayed());

         Assert.assertTrue(label_voidedDate.isDisplayed());

         Assert.assertTrue(label_closedDate.isDisplayed());
         Assert.assertTrue(label_parts2.isDisplayed());
         Assert.assertTrue(orderTotal.isDisplayed());
         Assert.assertTrue(label_addCost.isDisplayed());
         Assert.assertTrue(txt_addCost.isDisplayed());
         Assert.assertTrue(label_subTotal.isDisplayed());

         Assert.assertTrue(label_taxes.isDisplayed());
         Assert.assertTrue(txt_taxes.isDisplayed());
         Assert.assertTrue(label_table2.isDisplayed());
         Assert.assertTrue(asterisk_part2.isDisplayed());
         Assert.assertTrue(label_part2.isDisplayed());
         Assert.assertTrue(txt_part2.isDisplayed());
         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(search_icon);
         Assert.assertTrue(search_icon.isDisplayed());
         Assert.assertTrue(label_Qty.isDisplayed());
         Assert.assertTrue(txt_Qty.isDisplayed());

         Assert.assertTrue(label_part3.isDisplayed());
         Assert.assertTrue(label_vendor_part.isDisplayed());
         Assert.assertTrue(label_description.isDisplayed());
         Assert.assertTrue(label_order_Quantity.isDisplayed());
         Assert.assertTrue(label_UOM2.isDisplayed());

         Assert.assertTrue(label_stockUOM.isDisplayed());
         Assert.assertTrue(label_conv.isDisplayed());
         Assert.assertTrue(label_unitCost.isDisplayed());
         Assert.assertTrue(label_core.isDisplayed());
         Assert.assertTrue(label_extebdedCost.isDisplayed());

         Assert.assertTrue(label_link_delink.isDisplayed());
         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_fasteningBand3);
         Assert.assertTrue(label_fasteningBand3.isDisplayed());
         Assert.assertTrue(value_3.isDisplayed());
         Assert.assertTrue(crossIcon.isDisplayed());
         Assert.assertTrue(btn_link.isDisplayed());

         Assert.assertTrue(btn_copyPo.isDisplayed());
         Assert.assertTrue(btn_void.isDisplayed());
         Assert.assertTrue(btn_ok.isDisplayed());
         Assert.assertTrue(btn_submit_printPo.isDisplayed());

         TestListener.saveScreenshotPNG(driver);

     }

    /**
     * click on Ok button
     */
      public void clickOnOKbtn() throws InterruptedException {
//          WaitActions.getWaits().waitForElementTobeClickable(btn_ok);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ok);
          WebElementActions.getActions().clickElement(btn_ok);

          WaitActions.getWaits().loadingWait(loder);

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on WIP PO button
     */
    public void clickWIPPobtn() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_WIp);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_WIp);
        WebElementActions.getActions().clickElement(btn_WIp);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify WIP Po's element
     */
      public void verifyWIPPoElement() throws InterruptedException {
         Assert.assertTrue(btn_WIp.isDisplayed());
 //        try {
 //            WaitActions.getWaits().waitForElementTobeClickable(label_wipPos);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_wipPos);
             Assert.assertTrue(label_wipPos.isDisplayed());
  //       }
 /*        catch(Throwable e)
         {
             e.printStackTrace();
         }  */
         Assert.assertTrue(label_wareHouse.isDisplayed());
         Assert.assertTrue(txt_warehouse.isDisplayed());
         Assert.assertTrue(label_search.isDisplayed());
         Assert.assertTrue(txt_search.isDisplayed());

         Assert.assertTrue(btn_Refresh.isDisplayed());
         Assert.assertTrue(label_order_hash.isDisplayed());
         Assert.assertTrue(label_date.isDisplayed());
         Assert.assertTrue(label_vendor2.isDisplayed());
         Assert.assertTrue(label_warehouse2.isDisplayed());

         Assert.assertTrue(label_reference2.isDisplayed());
         Assert.assertTrue(label_status2.isDisplayed());
         Assert.assertTrue(poNumber.isDisplayed());
         Assert.assertTrue(hyperlink_poNumber.isDisplayed());
         Assert.assertTrue(status_open.isDisplayed());

         Assert.assertTrue(label_openSummary.isDisplayed());
         Assert.assertTrue(btn_void2.isDisplayed());
         Assert.assertTrue(btn_submit_printPO2.isDisplayed());
         Assert.assertTrue(label_vendor1.isDisplayed());
         Assert.assertTrue(label_vendor1_name.isDisplayed());
         Assert.assertTrue(label_address1.isDisplayed());

         Assert.assertTrue(PoDate.isDisplayed());
         Assert.assertTrue(label_poPartsCost.isDisplayed());
         Assert.assertTrue(label_ordertotal_subtotal.isDisplayed());

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on PO number
     */
      public void clickOnPONumber() throws InterruptedException {
 //         WaitActions.getWaits().waitForElementTobeClickable(Po_num);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Po_num);
          WebElementActions.getActions().clickElement(Po_num);

 //         WaitActions.getWaits().WaitUntilWebElementIsVisible(po_hash_number);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(po_hash_number);
          Assert.assertTrue( po_hash_number.isDisplayed());

          WaitActions.getWaits().loadingWait(loder);

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on submit/print Po
     */
      public void clickOnSubmitPrintPO() throws InterruptedException {
 //         WaitActions.getWaits().waitForElementTobeClickable(btn_submitprintPo);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_submitprintPo);
          WebElementActions.getActions().clickElement(btn_submitprintPo);

          WaitActions.getWaits().loadingWait(loder);
  //        Thread.sleep(3000);

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on signOut btn
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {
        WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

        WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    }




































