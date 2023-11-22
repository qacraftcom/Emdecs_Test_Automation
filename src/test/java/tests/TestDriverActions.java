package tests;

import actions.DataActions;
import actions.LoginActions;
import actions.WaitActions;
import constants.SheetConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.administration.CustomerPage;
import pages.administration.VendorsPage;
import pages.cGVUnitFunctionality.UnitHistoryPage;
import pages.estimating.ApproveanEstimateDMSPage;
import pages.estimating.PerformTheWorkOnAnEstimatePage;
import pages.fleet.CreateRedTagDMS;
import pages.fleet.CreateUnitPage;
import pages.fleet.SetUpWorkRequired;


import pages.nonrepair.ApproveNonRepairBill;
import pages.parts.*;
//import pages.pmWorkFlow.WorkOrderWorkflowPage;
import pages.pmWorkFlow.PmWorkOrderWorkFlowPage;
import pages.service.*;

import pages.techRo.*;
import pages.serviceBoard.EstimateSubmit;
import pages.tech.WoLabor;
import pages.tech.WoParts;


import utils.TestListener;
import utils.timeUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;

public class TestDriverActions {

    public static WebDriver driver;
    public LoginPage loginPage;
    public CreateUnitPage createUnitPage;
    public CreateRoPage createRoPage;
    public VendorsPage vendorsPage;
    public CustomerPage customerPage;
    public CounterSaleManager counter;
    public ReceiveParts receivePage;
    public PartsRelatedItem relatedItem;
    public EstimateSubmit submit ;
    public OrderParts order;
    public SetUpWorkRequired setUp;
    public UpdatePoNumber update;
    public UnitFunctionality unit;
    public JournalizeParts journalize;
    public WoLabor labor;
    public WoParts part;
    public AddRemoveLabour addRemove;
    public ServiceManagerLabor servicelabor;
    public NonRepairBills nonrepairbills;
    public WoCompliance wocompliance;

    public CompleteRoPage completeropage;
    public CompleteRoPartsPage completeRoPartsPage;
    public ApproveNonRepairBill approveNonRepairBill ;

    public CreateRedTagDMS redtag;
    public JournalizePage journalizepage ;

    public UnitHistoryPage unithistorypage;

    public ApproveanEstimateDMSPage approveanestimatedmspage;

    public PmWorkOrderWorkFlowPage pmworkorderworkflowpage;

    public PerformTheWorkOnAnEstimatePage performtheworkonanestimatepage;

    public Spotorderparts spotorderparts;

    public ReceivePart_konaEU receivepart;
    public JournalizePartsInvoice_konaEU journalizepartinvoice;
    LoginActions loginActions;



    String folderPath, cmd,filePath;

    static {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

  /*  @BeforeSuite
    public void logSuite() {
        System.getProperty(("user.dir") + "\\log4j.xml");
        //DOMConfigurator.configure("log4j.xml");
    } */
    public String allurePathWin = System.getProperty("user.dir") + "\\allure-2.13.6\\bin\\allure.bat";

    public static Properties prop,configProp;

    public void property() throws IOException, InterruptedException {
        if(this.getClass().getCanonicalName().contains("LoginTest")){
            filePath = System.getProperty("user.dir")+ "/src/test/java/utils/login.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreateUnitTest")){
            filePath = System.getProperty("user.dir")+ "/src/test/java/utils/createunit.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CounterSaleManagerTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/countersale.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CustomerTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/customer.properties";
        }
        else if(this.getClass().getCanonicalName().contains("VendorsTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/vendors.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ReceivePartsTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/receive.properties";
        }
        else if(this.getClass().getCanonicalName().contains("PartsRelatedItemTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/partrelated.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreateRoTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/config.properties";
        }
        else if(this.getClass().getCanonicalName().contains("EstimateSubmitTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/estimatesubmit.properties";
        }
        else if(this.getClass().getCanonicalName().contains("OrderPartsTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/orderparts.properties";
        }
        else if(this.getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/setupworkrequired.properties";
        }
        else if(this.getClass().getCanonicalName().contains("UpdatePoNumberTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/updatepo.properties";
        }
        else if(this.getClass().getCanonicalName().contains("UnitFunctionalityTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unitfunctionality.properties";
        }
        else if(this.getClass().getCanonicalName().contains("JournalizePartsTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/journalizeparts.properties";
        }
        else if(this.getClass().getCanonicalName().contains("WoLaborTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/labor.properties";
        }
        else if(this.getClass().getCanonicalName().contains("WoPartsTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/woparts.properties";
        }
        else if(this.getClass().getCanonicalName().contains("AddRemoveLabourTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/addremove.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ServiceManagerLaborTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicelabor.properties";
        }
        else if(this.getClass().getCanonicalName().contains("NonRepairBillsTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/NonRepairBills.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CompleteRoTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/completero.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CompleteRoPartsTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/completeroparts.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approvenonrepair.properties";
        }

        else if(this.getClass().getCanonicalName().contains("WoComplianceTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/wocompliance.properties";
        }
        else if(this.getClass().getCanonicalName().contains("JournalizeTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/journalize.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/redtag.properties";
        }
        else if(this.getClass().getCanonicalName().contains("UnitHistoryTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unithistory.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ApproveanEstimateDMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approveanestimatedms.properties";
        }
        else if(this.getClass().getCanonicalName().contains("PmWorkOrderWorkFlowTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/pmworkorderworkflow.properties";
        }
        else if(this.getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/performtheworkonanestimate.properties";
        }
        else if(this.getClass().getCanonicalName().contains("SpotorderpartsTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/spotorderparts.properties";
        }
        else if(this.getClass().getCanonicalName().contains("JournalizePartsInvoice_konaEUTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/journalizepartkonaeu.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ReceivePart_konaEUTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/receviepartkonaeu.properties";
        }

        try {
            prop = new Properties();
            FileInputStream fip = new FileInputStream(filePath);
            try {
                prop.load(fip);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    /**
     * Initialization of Framework
     */

    @BeforeClass(alwaysRun = true)
    public void initialization() throws IOException, InterruptedException {


  //      property();


        String browserName = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForFrameworkConfig, SheetConstants.columnForBrowser, SheetConstants.browserRowNumber);

//        System.getProperty(("user.dir") +"\\log4j.xml");
//        DOMConfigurator.configure("D:\\intellij\\latest_OfficeWork\\WorkingProject\\Emdecs_Test_Automation\\log4j.xml");

        if (browserName.equalsIgnoreCase(browserName)) {

            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("prefs", chromePrefs);
            WebDriverManager.chromedriver().setup();
            options.addArguments("--start-maximized");
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1366,768");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--dns-prefetch-disable");
            options.addArguments("--always-authorize-plugins");
            options.addArguments("enable-automation");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-extensions");
            options.addArguments("--allow-running-insecure-content");
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(options);
            //  driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().window().maximize();


        } else if (browserName.equalsIgnoreCase("Firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        LoginActions loginActions = new LoginActions();
        driver.get(loginActions.getAppUrl());

  //      loginPage.selectCountryFromDropDown();


//         driver.manage().timeouts().pageLoadTimeout(timeUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//         driver.manage().timeouts().implicitlyWait(timeUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        createRoPage = PageFactory.initElements(driver, CreateRoPage.class);
        createUnitPage = PageFactory.initElements(driver, CreateUnitPage.class);
        vendorsPage = PageFactory.initElements(driver, VendorsPage.class);
        customerPage = PageFactory.initElements(driver, CustomerPage.class);
        counter = PageFactory.initElements(driver, CounterSaleManager.class);
        receivePage = PageFactory.initElements(driver,ReceiveParts.class);
        relatedItem = PageFactory.initElements(driver,PartsRelatedItem.class);
        submit = PageFactory.initElements(driver,EstimateSubmit.class);
        order = PageFactory.initElements(driver,OrderParts.class);
        setUp = PageFactory.initElements(driver,SetUpWorkRequired.class);
        update = PageFactory.initElements(driver,UpdatePoNumber.class);
        unit = PageFactory.initElements(driver,UnitFunctionality.class);
        journalize = PageFactory.initElements(driver,JournalizeParts.class);
        labor = PageFactory.initElements(driver,WoLabor.class);
        part = PageFactory.initElements(driver,WoParts.class);
        addRemove = PageFactory.initElements(driver,AddRemoveLabour.class);
        servicelabor = PageFactory.initElements(driver,ServiceManagerLabor.class);
        nonrepairbills = PageFactory.initElements(driver, NonRepairBills.class);
        wocompliance = PageFactory.initElements(driver, WoCompliance.class);
        completeropage = PageFactory.initElements(driver, CompleteRoPage.class);
        completeRoPartsPage = PageFactory.initElements(driver, CompleteRoPartsPage.class);
        approveNonRepairBill = PageFactory.initElements(driver, ApproveNonRepairBill.class);
        journalizepage = PageFactory.initElements(driver, JournalizePage.class);
        redtag = PageFactory.initElements(driver,CreateRedTagDMS.class);
        unithistorypage = PageFactory.initElements(driver,UnitHistoryPage.class);
        approveanestimatedmspage = PageFactory.initElements(driver, ApproveanEstimateDMSPage.class);
        pmworkorderworkflowpage = PageFactory.initElements(driver,PmWorkOrderWorkFlowPage.class);
        performtheworkonanestimatepage = PageFactory.initElements(driver,PerformTheWorkOnAnEstimatePage.class);
        spotorderparts = PageFactory.initElements(driver, Spotorderparts.class);
        journalizepartinvoice = PageFactory.initElements(driver, JournalizePartsInvoice_konaEU.class);
        receivepart = PageFactory.initElements(driver, ReceivePart_konaEU.class);




        loginPage.selectCountryFromDropDown();

        property();

        configProp  = new Properties();
        FileInputStream fip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/utils/config.properties");
        try {
            configProp.load(fip);
        } catch (IOException e) {
            e.printStackTrace();
        }

 /*       if(getClass().getCanonicalName().contains("LoginTest")){
            LoginActions loginActions = new LoginActions();
            driver.get(loginActions.getAppUrl());
            loginPage.selectCountryFromDropDown();
        }
        else{
         //   loginToSystem();
        }  */



    }


 /*   public void loginToSystem() throws InterruptedException, IOException {
        LoginActions loginActions = new LoginActions();

        driver.get(loginActions.getAppUrl());

//        loginPage.enterUserName(loginActions.getUserCredentials()[0]);
//        loginPage.enterPassword(loginActions.getUserCredentials()[1]);

        loginPage.selectCountryFromDropDown();
//        loginPage.enterUserName("c2357service2");
//        loginPage.enterPassword("Password");

         loginPage.enterUserName(username);
         loginPage.enterPassword(password);

//        loginPage.enterUserName((configProp.getProperty("username")));
//        loginPage.enterPassword((configProp.getProperty("password")));

        loginPage.clickLoginButton();
        Thread.sleep(8000);


    }   */


    /**
     * It generates test execution report in Html Format (Including Test steps, Screenshots and Pass/Fail Status)
     */
    public void generateHtmlReport() {


    }

    /**
     * Quit Browser after all execution completed
     */

    public void emptyResults() {
        try {
            for (File file : new java.io.File(System.getProperty("user.dir") + "/allure-results").listFiles())
                if (!file.isDirectory()) {
                    file.delete();
                }
        } catch (Exception E) {

        }
    }

    @AfterSuite(alwaysRun = true)
    public void generateAllure() throws Exception {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH.mm.ss");
        String currentDateTime = format.format(date);
      /*  if (getClass().getCanonicalName().contains("CreateRoTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRoTestReports/" + "__" + currentDateTime;
        } */
        if (getClass().getCanonicalName().contains("CreateRoTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRoTestReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateUnitTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateUnitTestReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("VendorsTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/VendorsTestReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CustomerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CustomerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CounterSaleManagerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CounterSaleManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceivePartsTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("LoginTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/LoginTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PartsRelatedItemTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PartsRelatedItemTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("EstimateSubmitTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/EstimateSubmitTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("OrderPartsTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/OrderPartsTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SetUpWorkRequiredTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UpdatePoNumberTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UpdatePoNumberTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnitFunctionalityTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UnitFunctionalityTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizePartsTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizePartsTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("WoLaborTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/WoLaborTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("WoPartsTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/WoPartsTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("AddRemoveLabourTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/AddRemoveLabourTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerLaborTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerLaborTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("NonRepairBillsTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/NonRepairBillsTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("WoComplianceTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/WoComplianceTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CompleteRoTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CompleteRoTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CompleteRoPartsTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CompleteRoPartsTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveNonRepairBillTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UnitMasterTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizeTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizeTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRedTagDMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnitHistoryTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UnitHistoryTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveanEstimateDMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveanEstimateDMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PmWorkOrderWorkFlowTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PmWorkOrderWorkFlowTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PerformTheWorkOnAnEstimateTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SpotorderpartsTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SpotorderpartsTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizePartsInvoice_konaEUTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizePartsInvoice_konaEUTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceivePart_konaEUTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePart_konaEUTestReports/" + "__" + currentDateTime;
        }



        File theDir = new File(folderPath);

            // if the directory does not exist, create it

            if (!theDir.exists()) {
                System.out.println("creating directory: " + theDir.getName());
                boolean result = false;
                try {
                    theDir.mkdirs();
                    result = true;
                } catch (SecurityException se) {
                    // handle it
                    System.out.println(se.getMessage());
                }
                if (result) {
                    System.out.println("Folder created");
                }
            } else if (theDir.exists()) {
                System.out.println("Folder exist");
            }

      /*  if (getClass().getCanonicalName().contains("CreateRoTest")) {
            cmd = allurePathWin + " generate" + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRoTestReports\\" + theDir.getName();
        } */
            if (getClass().getCanonicalName().contains("CreateRoTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRoTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateUnitTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateUnitTestReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("VendorsTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\VendorsTestReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("CustomerTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CustomerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CounterSaleManagerTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CounterSaleManagerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceivePartsTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("LoginTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\LoginTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PartsRelatedItemTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PartsRelatedItemTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("EstimateSubmitTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\EstimateSubmitTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("OrderPartsTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\OrderPartsTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SetUpWorkRequiredTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UpdatePoNumberTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UpdatePoNumberTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnitFunctionalityTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnitFunctionalityTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizePartsTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizePartsTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("WoLaborTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\WoLaborTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("WoPartsTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\WoPartsTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("AddRemoveLabourTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AddRemoveLabourTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerLaborTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerLaborTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("NonRepairBillsTest")) {
            cmd = allurePathWin + " generate" + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\NonRepairBillsTest\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CompleteRoTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CompleteRoTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CompleteRoPartsTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CompleteRoPartsTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveNonRepairBillTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnitMasterTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains(" WoComplianceTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\WoComplianceTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizeTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizeTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRedTagDMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnitHistoryTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnitHistoryTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveanEstimateDMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveanEstimateDMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PmWorkOrderWorkFlowTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PmWorkOrderWorkFlowTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PerformTheWorkOnAnEstimateTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SpotorderpartsTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SpotorderpartsTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizePartsInvoice_konaEUTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizePartsInvoice_konaEUTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceivePart_konaEUTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePart_konaEUTestReports\\" + theDir.getName();
            }



        System.out.println("Before Report Process");
                System.out.println("This is CMD : " + cmd);
                Process process = Runtime.getRuntime().exec(cmd);
                Thread.sleep(5000);
                System.out.println("Generating Report");
                process.waitFor(60, TimeUnit.SECONDS);
                System.out.println("After Report Process");
                Thread.sleep(5000);
                System.out.println("End Time: " + WaitActions.getWaits().getDateTime());
                emptyResults();

            }

           @AfterMethod(alwaysRun = true)
           public void afterMethodTakeScreenShot(ITestResult result) {
           TestListener.saveScreenshotPNG(driver);

           }


 /*   public static class Log {
        //Initialize Log4j instance
        private static Logger Log = Logger.getLogger(TestDriverActions.Log.class.getName());

        //Info Level Logs
        public static void info(String message) {
            Log.info(message);
        }

        //Error Level Logs
        public static void error(String message) {
            Log.error(message);
        }
    }     */



        /*   @AfterTest(alwaysRun = true)
            public void tearDown () {
                   driver.quit();
            }  */
        }
