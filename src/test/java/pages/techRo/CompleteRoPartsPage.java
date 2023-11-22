package pages.techRo;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

public class CompleteRoPartsPage extends TestDriverActions {
    @FindBy(xpath = "(//a[text()='Complete RO'])[1]")
    public WebElement label_CompleteRo;

    @FindBy(xpath = "(//div[contains(@id,':sfRM:tWoR::db')]//table//td/child::span/child::a[contains(@id,':sfRM:tWoR:0:')])[1]")
    public WebElement label_ReferenceNumber;


    @FindBy(xpath = "//span[text()='Invoice']")
    public WebElement label_Invoice;


    @FindBy(xpath = "//div[contains(@id,':tParts::db')]")
    public  WebElement label_NoDataDisplay;

    @FindBy(xpath = "//div[contains(@id,'cancel')]//span[text ()='OK']")
    public WebElement  btn_AlertOk;

    @FindBy(xpath = "//span[text()='Add Labor']")
    public  WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    public  WebElement label_VMRS;

    @FindBy(xpath = "//img[@title='Automatic/Manual Chassis Lubricator']")
    public  WebElement label_AutomaticChassis;


    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    public WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement label_AddButton;

    @FindBy(xpath = "//img[@title='Accessories Group']")
    public WebElement label_AccessoriesGroup;

    @FindBy(xpath = "//img[contains(@id,':ciAddVmrs::icon')]")
    public WebElement label_AddGroup;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement label_AddGroupButton;

    @FindBy(xpath = "(//div[contains(@id,':tParts::db')]//table//div//a/child::span[contains(@id,'::text')])[1]")
    public WebElement label_PartsSrNo;

    @FindBy(xpath = "//span[text()='Warehouses']")
    public WebElement label_WareHouse;

    @FindBy(xpath = "//span[text()='On Hand']")
    public WebElement label_OnHand;

    @FindBy(xpath = "//span[text()='Store Room']")
    public WebElement label_StoreRoom;

    @FindBy(xpath = "//span[text()='Row Number']")
    public WebElement label_RowNumber;

    @FindBy(xpath = "//span[text()='Shelf']")
    public WebElement label_Shelf;

    @FindBy(xpath = "//span[text()='Bin Number']")
    public WebElement label_BinNumber;

    @FindBy(xpath = "//label[text()='Part #:']/preceding-sibling::span")
    public WebElement label_PartRequired;

    @FindBy(xpath = "//label[text()='Part #:']")
    public WebElement label_Part;

    @FindBy(xpath = "(//label[text()='Part #:']/parent::span/following::div)[1]")
    public WebElement label_PartTextArea;

    @FindBy(xpath = "//label[text()='Part Description:']")
    public WebElement label_PartDescription;

    @FindBy(xpath = "(//label[text()='Part Description:']/following::div)[1]")
    public WebElement label_PartDescriptionTextArea;

    @FindBy(xpath = "(//label[text()='Part Description:']/parent::span/parent::div//following-sibling::div//span//span)[1]")
    public WebElement label_laborRequired;

    @FindBy(xpath = "(//label[text()='Part Description:']/parent::span/parent::div//following-sibling::div//span//label)[1]")
    public WebElement label_Labor;

    @FindBy(xpath = "(//label[text()='Part Description:']/parent::span/parent::div//following-sibling::div//span//select)[1] ")
    public WebElement label_LaborDropDown;

    @FindBy(xpath = "//label[text()='Part Failure:']/preceding-sibling::span")
    public WebElement label_PartFailureRequired;

    @FindBy(xpath = "//label[text()='Part Failure:']")
    public WebElement label_PartFailure;

    @FindBy(xpath = "//label[text()='Part Failure:']/following::div//span//select")
    public WebElement label_PartFailureDropDown;

    @FindBy(xpath = " //label[text()='Charge Quantity (EA):']/preceding-sibling::span")
    public WebElement label_ChargeQuantityRequired;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']")
    public WebElement label_ChargeQuantity;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']/parent::span/parent::div/following-sibling::div/child::table//div//input")
    public WebElement label_ChargeQuantityTextArea;

    @FindBy(xpath = "//label[text()='Unit Charge:']")
    public WebElement label_UnitCharge;

    @FindBy(xpath = "//input[contains(@id,':itUnitChargeCurrency::content')]")
    public  WebElement txt_UnitChargeTextBox;

    @FindBy(xpath = "//label[text()='Total Charge:']")
    public WebElement label_TotalCharge;

    @FindBy(xpath = "(//div[contains(@id,'pslStockOnHand::b')]//a//span)[1]")
    public WebElement label_CancelButton;

    @FindBy(xpath = "(//div[contains(@id,'pslStockOnHand::b')]//table//div//following::div//a/span[text()='OK'])[1]")
    public WebElement label_OkButton;

    @FindBy(xpath = "//span[text()='Add Parts']")
    public  WebElement label_AddPart;

    @FindBy(xpath = "//span[text()='Please select an Activity first']")
    public List <WebElement> txt_AlertMessage;

    @FindBy(xpath = "//img[contains(@id,':tWa:0:vmrImage')]")
    public WebElement  label_Img;


    @FindBy(xpath = "//input[contains(@id,':itSearchPartSelect::content')]")
    public WebElement txt_PartTextArea;


    @FindBy(xpath = "//li[contains(@id,':itSearchPartSelect::su0')]")
    public WebElement label_PartNumber;

    @FindBy(xpath = "//span[text()='Issue Part']")
    public WebElement btn_IssuePartBtn;

    @FindBy(xpath = "(//a[contains(@id,':clPartsStockOnHand')])[1]")
    public WebElement label_OnHandValue;


    @FindBy(xpath = "//img[contains(@id,':tWa:1:vmrImage::icon')]")
    public  WebElement img_NewPart;


    @FindBy(xpath = "//span[text()='Issue Part']")
    public WebElement btn_IssuePartButton;

    @FindBy(xpath = "//label[contains(.,'Quantity')]")
    public WebElement txt_QuantityText;

    @FindBy(xpath = "//div[contains(@id,':ctbncp')]//a//img/following-sibling::span")
    public WebElement btn_NonCatalogPart;

    @FindBy(xpath = "//input[contains(@id,':itItemasCode::content')]")
    public WebElement input_PartTextArea;
    @FindBy(xpath = "//input[contains(@id,'itItemasDescription::content')]")
    public WebElement input_DescriptionTextArea;

    @FindBy(xpath = "//label[text()='Unit Cost: (Required)']/preceding-sibling::input")
    public WebElement input_UnitTextArea;

    @FindBy(xpath = "//div[contains(@id,':cbOK')]//span[text()='Issue Part']")
    public WebElement btn_IssuePart;

    @FindBy(xpath = "(//div[contains(@id,':tWAP::db')]//table//td//div//a[contains(@id,':clPartsStockOnHand')])[1]")
    public WebElement  txt_PartOnHand;

    @FindBy(xpath = " (//table[contains(@id,':pgRTWAP')]//tbody//a/child::img)[1]")
    public WebElement img_CrossIcon;

    @FindBy(xpath = "//img[contains(@id,':cilWAP::icon')]")
    public WebElement img_DeleteIcon;

    @FindBy(xpath = "//div[contains(@id,':ocb1:ctbClose')]//child::a/span[text()='Close']")
    public WebElement btn_Close;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;



    /**go to complete RO Screen */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);


    }
    /**click On Reference Number */
    public void clickOnReferenceNumber() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ReferenceNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ReferenceNumber);
        WebElementActions.getActions().clickElement(label_ReferenceNumber);
        TestListener.saveScreenshotPNG(driver);

    }
    /**wait Element Is visible */
    public void waitElementIsVisible() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Invoice);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Invoice);
        Assert.assertTrue(label_Invoice.isDisplayed());

    }
    public void verifyDataPresent () throws InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        if (label_NoDataDisplay.isDisplayed()) {
          //  WaitActions.getWaits().waitForElementTobeClickable(label_AddPart);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddPart);
            WebElementActions.getActions().clickElement(label_AddPart);
            if(txt_AlertMessage.size()>0) {
                String Alert = new String("  String Alert = new String ");
              //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_AlertOk);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_AlertOk);
                WebElementActions.getActions().clickElement(btn_AlertOk);
                WebElementActions.getActions().clickElement(label_AddLabor);
              //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_VMRS);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_VMRS);
                WebElementActions.getActions().clickElement(label_VMRS);
             //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_AutomaticChassis);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AutomaticChassis);
                WebElementActions.getActions().clickElement(label_AutomaticChassis);
              //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Add);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Add);
                WebElementActions.getActions().clickElement(label_Add);
              //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_AddButton);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddButton);
                WebElementActions.getActions().clickElement(label_AddButton);
                WaitActions.getWaits().loadingWait(loder);
                WebElementActions.getActions().clickElement(label_AddLabor);
              //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_AccessoriesGroup);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AccessoriesGroup);
                WebElementActions.getActions().clickElement(label_AccessoriesGroup);
                WaitActions.getWaits().loadingWait(loder);
              //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_AddGroup);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddGroup);
                WebElementActions.getActions().clickElement(label_AddGroup);
              //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_AddGroupButton);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddGroupButton);
                WebElementActions.getActions().clickElement(label_AddGroupButton);
            }else{
             //   WaitActions.getWaits().waitForElementTobeClickable(label_AddPart);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddPart);
                WebElementActions.getActions().clickUsingJS(label_AddPart);
                WaitActions.getWaits().loadingWait(loder);
             //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Img);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Img);
                WebElementActions.getActions().clickElement(label_Img);
                WaitActions.getWaits().loadingWait(loder);
              //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_PartTextArea);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_PartTextArea);
                WebElementActions.getActions().inputText(txt_PartTextArea, prop.getProperty("PartValue"));
                txt_PartTextArea.sendKeys(Keys.ENTER);
                WaitActions.getWaits().loadingWait(loder);
              //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PartNumber);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_PartNumber);
                WebElementActions.getActions().clickElement(label_PartNumber);
                WebElementActions.getActions().clickElement(btn_IssuePartBtn);
                WaitActions.getWaits().loadingWait(loder);
             //   WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_Close);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Close);
                WebElementActions.getActions().clickElement(btn_Close);
                WaitActions.getWaits().loadingWait(loder);

            }
        } else{

        }
    }




    /**click on Part number */
    public void clickOnPartNo() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PartsSrNo);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_PartsSrNo);
        WebElementActions.getActions().clickElement(label_PartsSrNo);
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify text Warehouse*/
    public void verifyWareHouse() throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_WareHouse);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_WareHouse);
        Assert.assertTrue(label_WareHouse.isDisplayed());

    }

    /**verify text On Hand */
    public void verifyOnHand() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_OnHand);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_OnHand);
        Assert.assertTrue(label_OnHand.isDisplayed());
    }
    /**verify text StoreRoom */
    public void verifyStoreRoom() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_StoreRoom);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_StoreRoom);
        Assert.assertTrue(label_StoreRoom.isDisplayed());

    }
    /**verify text Row Number */

    public void verifyRowNumber() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_RowNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RowNumber);
        Assert.assertTrue(label_RowNumber.isDisplayed());

    }
    /**verify text Shelf*/
    public void verifyShelf() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Shelf);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Shelf);
        Assert.assertTrue(label_Shelf.isDisplayed());

    }
    /** verify text Bin Number*/
    public void verifyBinNumber() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_BinNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_BinNumber);
        Assert.assertTrue(label_BinNumber.isDisplayed());

    }
    /**verify text Part Required */

    public void verifyPartRequired() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PartRequired);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartRequired);
        Assert.assertTrue(label_PartRequired.isDisplayed());

    }
    /** verify text Part */

    public void verifyPart() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Part);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Part);
        Assert.assertTrue(label_Part.isDisplayed());
    }
    /**verify part Text Area */
    public void verifyPartTextArea() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PartTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartTextArea);
        Assert.assertTrue(label_PartTextArea.isDisplayed());

    }
    /**verify text Part Description */

    public void verifyPartDescription() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PartDescription);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartDescription);
        Assert.assertTrue(label_PartDescription.isDisplayed());

    }
    /**verify PartDescription TextArea*/
    public void verifyPartDescriptionTextArea() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PartDescriptionTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartDescriptionTextArea);
        Assert.assertTrue(label_PartDescriptionTextArea.isDisplayed());

    }
    /** verify labor Required */
    public void verifyLaborRequired() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_laborRequired);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_laborRequired);
        Assert.assertTrue(label_laborRequired.isDisplayed());

    }
    /** verify text labor */
    public void verifyLabor() throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Labor);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Labor);
        Assert.assertTrue(label_Labor.isDisplayed());

    }
    /** verify labor Dropdown */
    public void verifyLaborDropDown() throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_LaborDropDown);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LaborDropDown);
        Assert.assertTrue(label_LaborDropDown.isDisplayed());


    }
    /** verify text part failure Required */

    public void verifyPartFailureRequired() throws InterruptedException {
    //    WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PartFailureRequired);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartFailureRequired);
        Assert.assertTrue(label_PartFailureRequired.isDisplayed());

    }
    /**verify Text Part Failure */
    public void verifyPartFailure() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PartFailure);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartFailure);
        Assert.assertTrue(label_PartFailure.isDisplayed());

    }
    /**verify Part failure Dropdown*/
    public void verifyPartFailureDropDown() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PartFailureDropDown);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartFailureDropDown);
        Assert.assertTrue(label_PartFailureDropDown.isDisplayed());

    }
    /**verify Text ChargeQuantity Required */
    public void verifyChargeQuantityRequired() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ChargeQuantityRequired);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityRequired);
        Assert.assertTrue(label_ChargeQuantityRequired.isDisplayed());
    }
    /**verify Text  Charge Quantity */
    public void verifyChargeQuantity() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ChargeQuantity);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantity);
        Assert.assertTrue(label_ChargeQuantity.isDisplayed());

    }
    /**verify Charge Quantity TextArea */
    public void verifyChargeQuantityTextArea() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ChargeQuantityTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityTextArea);
        Assert.assertTrue(label_ChargeQuantityTextArea.isDisplayed());

    }
    /**verify Text Unit Charge */
    public void verifyUnitCharge() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_UnitCharge);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitCharge);
        Assert.assertTrue(label_UnitCharge.isDisplayed());
    }
    /** verify Unit Charge TextBox */
    public void verifyUnitChargeTextBox () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(txt_UnitChargeTextBox);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_UnitChargeTextBox);
        Assert.assertTrue(txt_UnitChargeTextBox.isDisplayed());
    }
    /** verify Text Total Charge*/
    public void verifyTotalCharge() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_TotalCharge);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TotalCharge);
        Assert.assertTrue(label_TotalCharge.isDisplayed());

    }
    /**verify Text Cancel Button */
    public void verifyCancelButton() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_CancelButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_CancelButton);
        Assert.assertTrue(label_CancelButton.isDisplayed());

    }
    /**verify Text Ok Button */
    public void verifyOkButton() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_OkButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_OkButton) ;
        Assert.assertTrue(label_OkButton.isDisplayed());

    }
    /** verify Charge Quantity Editable*/
    public void verifyChargeQuantityEditable() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ChargeQuantityTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ChargeQuantityTextArea);
        WebElementActions.getActions().inputText(label_ChargeQuantityTextArea,prop.getProperty("ChargeQuantity"));
        label_ChargeQuantityTextArea.sendKeys(Keys.ENTER);
        Assert.assertTrue(label_ChargeQuantityTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Unit Charge Text Area */
    public void verifyUnitChargeTextArea () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_UnitChargeTextBox);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_UnitChargeTextBox);
        WebElementActions.getActions().inputText(txt_UnitChargeTextBox,prop.getProperty("UnitQuantity"));
        txt_UnitChargeTextBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(txt_UnitChargeTextBox.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**click on Ok Button */
    public void clickOnoKButton () throws InterruptedException {

       // WaitActions.getWaits().waitForElementTobeClickable(label_OkButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_OkButton);
        WebElementActions.getActions().clickElement(label_OkButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click On Add Part */
    public void clickOnAddPart () throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(label_AddPart);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddPart);
        WebElementActions.getActions().clickElement(label_AddPart);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);



    }
    /**click on IMG */
    public void clickOnImg () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Img);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Img);
        WebElementActions.getActions().clickElement(label_Img);

    }
    /**verify Text Part Area */
    public void verifyTextPartTextArea () throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_PartTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_PartTextArea);
        WebElementActions.getActions().inputText(txt_PartTextArea,prop.getProperty("PartValue"));
        txt_PartTextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);
        Assert.assertTrue(txt_PartTextArea.isDisplayed());

    }
    /**click On Part Number */
    public void clickOnPartNumber () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(label_PartNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_PartNumber);
        WebElementActions.getActions().clickElement(label_PartNumber);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click on issue Part */
    public void clickOnIssuePart () throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_IssuePartBtn);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_IssuePartBtn);
        WebElementActions.getActions().clickElement(btn_IssuePartBtn);
        TestListener.saveScreenshotPNG(driver);


    }

    /**verify On Hand on Value */
    public void verifyOnHandValue () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_OnHandValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_OnHandValue);
        Assert.assertTrue(label_OnHandValue.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /**click new Part Image */
    public void clickNewImg () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(img_NewPart);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_NewPart);
        WebElementActions.getActions().clickElement(img_NewPart);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** store and type  New Part */
    public void clickTextPartNumber () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(txt_PartTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_PartTextArea);
        WebElementActions.getActions().inputText(txt_PartTextArea,prop.getProperty("newPartNumber"));
        txt_PartTextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Issue Part button*/
    public void clickOnIssuePartButton () throws InterruptedException {

       // WaitActions.getWaits().waitForElementTobeClickable(btn_IssuePartButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_IssuePartButton);
        WebElementActions.getActions().clickElement(btn_IssuePartButton);
        TestListener.saveScreenshotPNG(driver);


    }

    /** verify Text Quantity Text */
    public void verifyQuantityText () throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_QuantityText);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_QuantityText);
        Assert.assertTrue(txt_QuantityText.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click on Non-CatalogPart*/
    public void clickOnNonCatalogPart () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(btn_NonCatalogPart);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_NonCatalogPart);
        WebElementActions.getActions().clickElement(btn_NonCatalogPart);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter Part  and Description Text Area */
    public void inputPartTextArea () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(input_PartTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_PartTextArea);
        WebElementActions.getActions().clickUsingJS(input_PartTextArea);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        input_PartTextArea.sendKeys("DiskBreak" + randomInt );

     //   WaitActions.getWaits().waitForElementTobeClickable(input_DescriptionTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_DescriptionTextArea);
        WebElementActions.getActions().clickUsingJS(input_DescriptionTextArea);
        input_DescriptionTextArea.sendKeys("DiskBreak" + randomInt );
        System.out.println("DiskBreak" + randomInt );

    }
    /**enter the Input Text Area */
    public void inputUnitTextArea () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(input_UnitTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_UnitTextArea);
        WebElementActions.getActions().inputText(input_UnitTextArea, prop.getProperty("Unit"));


    }
    /**click on Issue PArt Button */
    public void clickIssuePart () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(btn_IssuePart);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_IssuePart);
        WebElementActions.getActions().clickElement(btn_IssuePart);
        WaitActions.getWaits().loadingWait(loder);


    }
    /**verify part stock On Hand*/
    public void verifyPartOnHand () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_PartOnHand);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PartOnHand);
        Assert.assertTrue(txt_PartOnHand.isDisplayed());


    }
    /**click on image Cross Icon */
    public void clickImageCrossIcon () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(img_CrossIcon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_CrossIcon);
        WebElementActions.getActions().clickElement(img_CrossIcon);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on Image Delete Icon */
    public void clickImageDeleteIcon () throws InterruptedException {

    //    WaitActions.getWaits().WaitUntilWebElementIsVisible(img_DeleteIcon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_DeleteIcon);
        WebElementActions.getActions().clickElement(img_DeleteIcon);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On close Button */
    public void clickOnCloseButton () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_Close);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Close) ;
        WebElementActions.getActions().clickElement(btn_Close);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Sign Out */

    public void clickOnSignOut () throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_SignOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickUsingJS(label_SignOut);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on UserName */
    public void clickOnUsername () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_UserName);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UserName);
        Assert.assertTrue(label_UserName.isDisplayed());

    }
}
