package pages.administration;

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

public class CreateVendorPage extends TestDriverActions {

    @FindBy(xpath = "//h1[text()='Vendors List']" )
    WebElement label_vendor_list_1;

    @FindBy(xpath="//label[contains(text(),'Search')]")
    WebElement label_search;

    @FindBy(xpath = "//label[contains(text(),'Search')]/following::input[1]" )
    WebElement txt_search_field;

    @FindBy(xpath = "//label[contains(text(),'Include Inactive')]" )
    WebElement label_include_Inactive;

    @FindBy(xpath = "//label[contains(text(),'Include Inactive')]/following::input[1]" )
    WebElement chckbox_include_Inactive;

    @FindBy(xpath = "//h2[contains(text(),'Vendors List')]" )
    WebElement label_vendor_list_2;

    @FindBy(xpath = "//h2[contains(text(),'Vendors List')]/following::span[1]" )
    WebElement btn_addVendor;

    @FindBy(xpath = "//span[contains(text(),'Name')]" )
    WebElement label_name;

    @FindBy(xpath = "//span[contains(text(),'Code')]" )
    WebElement label_code;

    @FindBy(xpath = "//span[contains(text(),'Phone')]" )
    WebElement label_phone;

    @FindBy(xpath = "//h2[contains(text(),'Vendors List')]/following::span[7]" )
    WebElement label_city;

    @FindBy(xpath = "//span[contains(text(),'Address')]" )
    WebElement label_Address;

    @FindBy(xpath = "//span[contains(text(),'Prov/State')]" )
    WebElement label_prov_state;

    @FindBy(xpath = "//span[contains(text(),'ZIP / Postal')]" )
    WebElement label_zip_postal;

    @FindBy(xpath = "//span[contains(text(),'Country')]" )
    WebElement label_country;

    @FindBy(xpath = "//span[contains(text(),'Type')]" )
    WebElement label_type;

    @FindBy(xpath = "//span[contains(text(),'Active')]" )
    WebElement label_active;

    @FindBy(xpath = "//label[text()='Code:']/following::input[1]" )
    WebElement txt_code_field;

    @FindBy(xpath = "//label[text()='Name:']/following::input[1]" )
    WebElement txt_name_field;

    @FindBy(xpath = "//label[contains(text(),'Payment Term:')]/following::select[1]" )
    WebElement dropdown_payment_term;

    //        @FindBy(xpath = "//option[text()='NET30']")
    //      WebElement select_NET30;

    @FindBy(xpath = "//label[contains(text(),'Tax Exempt')]/following::span[4]" )
    WebElement btn_ok;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    public List<WebElement> loder;


    /**
     * go to Vendors screen
     * @throws InterruptedException
     */
    public void gotoVendorsScreen() throws FileNotFoundException, InterruptedException {

        WaitActions.getWaits().loadingWait(loder);

        ReusableActions.getActions().clickParentMenu("Administration");
        ReusableActions.getActions().clickChildMenu("Vendors");
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Add Vendors button
     */

    public void clickOnAddVendors() throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(btn_addVendor);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_addVendor);
        WebElementActions.getActions().clickElement(btn_addVendor);
        TestListener.saveScreenshotPNG(driver);
    }

    /**Enter code*/
    public void enterVendorCode() throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(txt_code_field);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_code_field);
        String vandorCode = String.valueOf(WebElementActions.getActions().randomAlphaNumeric( 6));
        WebElementActions.getActions().inputText(txt_code_field,vandorCode);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  random vendor name
     */
    String vendorName = WebElementActions.getActions().randomAlphaNumeric( 10);

    /**
     * Enter Name
     */
    public void enterVendorName() throws InterruptedException {
        //WaitActions.getWaits().waitForElementTobeClickable(txt_name_field);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_name_field);
        WebElementActions.getActions().inputText(txt_name_field, vendorName);
        TestListener.saveScreenshotPNG(driver);
    }


    /**
     * click on Ok button
     */
    public void selectPaymentTermsMenu() throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(dropdown_payment_term);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(dropdown_payment_term);
        WebElementActions.getActions().elementSelectByVisibilityText(dropdown_payment_term, prop.getProperty("dropdown"));
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Type Vendors name in search box
     */
    public void vendorNameInSearchBox() throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(txt_search_field);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_search_field);
        WebElementActions.getActions().inputText(txt_search_field, vendorName);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Ok button
     */
    public void clickOnOKbutton() throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(btn_ok);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ok);
        WebElementActions.getActions().clickElement(btn_ok);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * check the elements of Vendors List
     */
    public void vendorsManagerHeader() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_vendor_list_1);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_vendor_list_1);
        Assert.assertTrue(label_vendor_list_1.isDisplayed());
        Assert.assertTrue(label_search.isDisplayed());
        Assert.assertTrue(txt_search_field.isDisplayed());
        Assert.assertTrue(label_include_Inactive.isDisplayed());
        Assert.assertTrue( chckbox_include_Inactive.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     *  Check that Vender List table element
     */
    public void vendorsListTable() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_vendor_list_2);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_vendor_list_2);
        Assert.assertTrue(label_vendor_list_2.isDisplayed());
        Assert.assertTrue(btn_addVendor.isDisplayed());
        Assert.assertTrue(label_name.isDisplayed());
        Assert.assertTrue(label_code.isDisplayed());
        Assert.assertTrue(label_phone.isDisplayed());
        Assert.assertTrue(label_city.isDisplayed());
        Assert.assertTrue(label_Address.isDisplayed());
        Assert.assertTrue(label_prov_state.isDisplayed());
        Assert.assertTrue(label_zip_postal.isDisplayed());
        Assert.assertTrue(label_country.isDisplayed());
        Assert.assertTrue(label_type.isDisplayed());
        Assert.assertTrue(label_active.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     *  click on SignOut button
     *  Check the username field
     */
    public void clickOnSignOut() throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);

        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

        //WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }







}
