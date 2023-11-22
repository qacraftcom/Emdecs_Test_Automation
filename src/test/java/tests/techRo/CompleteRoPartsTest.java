package tests.techRo;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class CompleteRoPartsTest extends TestDriverActions {

    @Test(priority = 0, description = "Test_001_Login the page and Go to CompleteRo Screen")
    @Description("Test Description: Login the page and Go to CompleteRo Screen")
    public void Test_001_gotoCompleteRo() throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(prop.getProperty("service_one_username"), prop.getProperty("service_one_password"));
        completeRoPartsPage.goToCompleteROScreen();


    }

    @Test(priority = 0, description = "Test_002_click On Reference Number")
    @Description("Test Description: click On Reference Number")
    public void Test_002_clickOnReference() throws InterruptedException, IOException {
        completeRoPartsPage.clickOnReferenceNumber();
        completeRoPartsPage.waitElementIsVisible();

    }

    @Test(priority = 0, description = "Test_003_click On part Number")
    @Description("Test Description: click On part Number")
    public void Test_003_clickOnPart() throws InterruptedException, IOException {
        completeRoPartsPage.clickOnPartNo();
        completeRoPartsPage.verifyWareHouse();
        completeRoPartsPage.verifyOnHand();
        completeRoPartsPage.verifyStoreRoom();
        completeRoPartsPage.verifyRowNumber();
        completeRoPartsPage.verifyShelf();
        completeRoPartsPage.verifyBinNumber();
        completeRoPartsPage.verifyPartRequired();
        completeRoPartsPage.verifyPart();
        completeRoPartsPage.verifyPartTextArea();
        completeRoPartsPage.verifyPartDescription();
        completeRoPartsPage.verifyPartDescriptionTextArea();
    }

    @Test(priority = 0, description = "Test_003_verify Labor Text ")
    @Description("Test Description: verify Labor Text ")
    public void Test_004_verifyLabor() throws InterruptedException, IOException {
        completeRoPartsPage.verifyLaborRequired();
        completeRoPartsPage.verifyLabor();
        completeRoPartsPage.verifyLaborDropDown();
        completeRoPartsPage.verifyPartFailureRequired();
        completeRoPartsPage.verifyPartFailure();
        completeRoPartsPage.verifyPartFailureDropDown();
        completeRoPartsPage.verifyChargeQuantityRequired();
        completeRoPartsPage.verifyChargeQuantity();
        completeRoPartsPage.verifyChargeQuantityTextArea();
        completeRoPartsPage.verifyUnitCharge();
        completeRoPartsPage.verifyUnitChargeTextBox();
        completeRoPartsPage.verifyTotalCharge();
        completeRoPartsPage.verifyCancelButton();
        completeRoPartsPage.verifyOkButton();

    }

    @Test(priority = 0, description = "Test_004_verify Charge Quantity Editable  ")
    @Description("Test Description: verify Charge Quantity Editable  ")
    public void Test_005_verifyChargeQuantityEditable() throws InterruptedException, IOException {

        completeRoPartsPage.verifyChargeQuantityEditable();
        completeRoPartsPage.verifyUnitChargeTextArea();
        completeRoPartsPage.clickOnoKButton();
    }

    @Test(priority = 0, description = "Test_005_click On Add Part ")
    @Description("Test Description: click On Add Part   ")
    public void Test_006_clickOnAddPart() throws InterruptedException, IOException {

        completeRoPartsPage.clickOnAddPart();
        completeRoPartsPage.clickOnImg();
        completeRoPartsPage.verifyTextPartTextArea();
        completeRoPartsPage.clickOnPartNumber();
        completeRoPartsPage.clickOnIssuePart();
        completeRoPartsPage.verifyOnHandValue();

    }

    @Test(priority = 0, description = "Test_005_click On New Image ")
    @Description("Test Description: click On New Image   ")
    public void Test_007_clickOnNewImg() throws InterruptedException, IOException {

        completeRoPartsPage.clickNewImg();
        completeRoPartsPage.clickTextPartNumber();
        completeRoPartsPage.clickOnIssuePartButton();
        completeRoPartsPage.verifyQuantityText();


    }

    @Test(priority = 0, description = "Test_005_click On Non-Catalog Part ")
    @Description("Test Description: click On Non-Catalog Part ")
    public void Test_008_clickOnNonCatalogPart() throws InterruptedException, IOException {
        completeRoPartsPage.clickOnNonCatalogPart();
        completeRoPartsPage.inputPartTextArea();
        completeRoPartsPage.inputUnitTextArea();
        completeRoPartsPage.clickIssuePart();
        completeRoPartsPage.verifyPartOnHand();
        completeRoPartsPage.clickImageCrossIcon();
        completeRoPartsPage.clickImageDeleteIcon();
    }

    @Test(priority = 0, description = "Test_005_click On Close Button ")
    @Description("Test Description: click On Close Button  ")
    public void Test_009_clickOnCloseButton() throws InterruptedException, IOException {
        completeRoPartsPage.clickOnCloseButton();
        completeRoPartsPage.clickOnSignOut();
        completeRoPartsPage.clickOnUsername();
    }
}