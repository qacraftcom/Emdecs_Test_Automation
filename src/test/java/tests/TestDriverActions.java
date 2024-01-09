package tests;

import actions.DataActions;
import actions.LoginActions;
import actions.WaitActions;
import constants.SheetConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.mozilla.javascript.tools.shell.Environment;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.Estimate.SubmitAnEstimateServiceManager;
import pages.LoginPage;
import pages.administration.CreateCustomerPage;
import pages.administration.CreateVendorPage;
import pages.estimating.ApproveanEstimateDMSPage;
import pages.estimating.PerformTheWorkOnAnEstimateTech;
import pages.fleet.CreateRedTagDMS;
import pages.fleet.CreateUnitPage;
import pages.fleet.SetUpWorkRequired;


import pages.parts.*;
//import pages.pmWorkFlow.WorkOrderWorkflowPage;
import pages.pmWorkFlow.cGVTechPerformPM;
import pages.service.*;

import pages.techRo.*;
import pages.serviceBoard.SubmitAnEstimate_ServiceManagerPage;
import pages.tech.EC_Tech_WoLabor;
import pages.tech.EC_Tech_WoParts;


import tests.parts.Spotorderparts;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestDriverActions {


    public static WebDriver driver;
    public LoginPage loginPage;
    public CreateUnitPage createUnitPage;
    public CreateRoPage createRoPage;
    public CreateVendorPage vendorsPage;
    public CreateCustomerPage customerPage;
    public CounterSalePage counter;
    public CreatePart relatedItem;
    public SubmitAnEstimate_ServiceManagerPage submit ;
   // public SpotOrderParts order;
    public SetUpWorkRequired setUp;
    public ECServiceManager_ChangeCustomerPOafterInvoicing update;
    public InquireFXG_UnitHistory unit;
    public JournalizePartsInvoice journalize;
    public EC_Tech_WoLabor labor;
    public EC_Tech_WoParts part;
    public ECServiceManager_AddRemoveLabor addRemove;
    public EC_ServiceManager_WoLabor servicelabor;
    public CreateNonRepairBill_ServiceManager nonrepairbills;
    public cGVTech_WoCompliance wocompliance;
    public ECService_Manager_Invoice completeropage;
    public DAFServiceManagerPartsRelatedTasks   servicemanagerpartsrelatedtasks;
    public pages.nonrepair.ApproveNonRepairBill_DMS approveNonRepairBill ;
    public CreateRedTagDMS redtag;
    public ECServiceManager_Journalize journalizepage ;

    public pages.cGVUnitFunctionality.InquireFXG_UnitHistory unithistorypage;

    public ApproveanEstimateDMSPage approveanestimatedmspage;

    public cGVTechPerformPM pmworkorderworkflowpage;

    public PerformTheWorkOnAnEstimateTech performtheworkonanestimatepage;

    public Spotorderpart spotorderparts;
    public ReceivePart  receivepart;
    public JournalizePartsInvoice_konaEU journalizepartinvoice;
    public SubmitAnEstimateServiceManager  submitanestimateservicemanager;




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

    public static Properties prop,configProp,appProp;

    public void property() throws IOException, InterruptedException {
        if(this.getClass().getCanonicalName().contains("LoginTest")){
            filePath = System.getProperty("user.dir")+ "/src/test/java/utils/login.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreateUnit")){
            filePath = System.getProperty("user.dir")+ "/src/test/java/utils/createunitQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CounterSaleTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/countersale.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreateCustomerTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/customer.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreateVendorTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/vendors.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ReceivePartsTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/receviepartkonaQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreatePart")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createpartQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreateRoTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/config.properties";
        }
        else if(this.getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/submitanestimateservicemanagerQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/setupworkrequired.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerchangecustomerpoafterinvoicingQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unitfunctionality.properties";
        }
        else if(this.getClass().getCanonicalName().contains("JournalizePartsInvoice")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/journalizepartsinvoiceQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("TechWoLabor")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/techwolaborQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("TechWoParts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/techwopartsQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/addremove.properties";
        }
        else if(this.getClass().getCanonicalName().contains("EC_ServiceManager_WoLaborTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicelabor.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/NonRepairBills.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerinvoiceQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerpartsrelatedtasksQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approvenonrepair.properties";
        }
        else if(this.getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/wocompliance.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerjournalizeQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/redtag.properties";
        }
        else if(this.getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unithistory.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approveanestimatedms.properties";
        }
        else if(this.getClass().getCanonicalName().contains("cGVTechPerformPMTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/pmworkorderworkflow.properties";
        }
        else if(this.getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/performtheworkonanestimate.properties";
        }
        else if(this.getClass().getCanonicalName().contains("Spotorderpart")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/spotorderpartsEU.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ReceiveParts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/receviepartsEU.properties";
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

            HashMap<String,Object> chromePrefs = new HashMap<String, Object>();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("prefs", chromePrefs);
            WebDriverManager.chromedriver().setup();
            options.addArguments("--start-maximized");
  //          options.addArguments("--headless=new");
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
         if(LoginActions.environmentName.contains("QA")||LoginActions.environmentName.contains("EU")||LoginActions.environmentName.contains("EC")||LoginActions.environmentName.contains("NA")) {

             driver.get(loginActions.getAppUrl1(getMyClassName()));    //new method Akash kadam
         }else{
              driver.get(loginActions.getAppUrl());      //old method
         }


  //      loginPage.selectCountryFromDropDown();


//         driver.manage().timeouts().pageLoadTimeout(timeUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//         driver.manage().timeouts().implicitlyWait(timeUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        createRoPage = PageFactory.initElements(driver, CreateRoPage.class);
        createUnitPage = PageFactory.initElements(driver, CreateUnitPage.class);
        vendorsPage = PageFactory.initElements(driver, CreateVendorPage.class);
        customerPage = PageFactory.initElements(driver, CreateCustomerPage.class);
        counter = PageFactory.initElements(driver, CounterSalePage.class);
        relatedItem = PageFactory.initElements(driver, CreatePart.class);
        submit = PageFactory.initElements(driver, SubmitAnEstimate_ServiceManagerPage.class);
       // order = PageFactory.initElements(driver, SpotOrderParts.class);
        setUp = PageFactory.initElements(driver,SetUpWorkRequired.class);
        update = PageFactory.initElements(driver, ECServiceManager_ChangeCustomerPOafterInvoicing.class);
        unit = PageFactory.initElements(driver, InquireFXG_UnitHistory.class);
        journalize = PageFactory.initElements(driver, JournalizePartsInvoice.class);
        labor = PageFactory.initElements(driver, EC_Tech_WoLabor.class);
        part = PageFactory.initElements(driver, EC_Tech_WoParts.class);
        addRemove = PageFactory.initElements(driver, ECServiceManager_AddRemoveLabor.class);
        servicelabor = PageFactory.initElements(driver, EC_ServiceManager_WoLabor.class);
        nonrepairbills = PageFactory.initElements(driver, CreateNonRepairBill_ServiceManager.class);
        wocompliance = PageFactory.initElements(driver, cGVTech_WoCompliance.class);
        completeropage = PageFactory.initElements(driver, ECService_Manager_Invoice.class);
        servicemanagerpartsrelatedtasks= PageFactory.initElements(driver,DAFServiceManagerPartsRelatedTasks.class);
        approveNonRepairBill = PageFactory.initElements(driver, pages.nonrepair.ApproveNonRepairBill_DMS.class);
        journalizepage = PageFactory.initElements(driver, ECServiceManager_Journalize.class);
        redtag = PageFactory.initElements(driver,CreateRedTagDMS.class);
        unithistorypage = PageFactory.initElements(driver, pages.cGVUnitFunctionality.InquireFXG_UnitHistory.class);
        approveanestimatedmspage = PageFactory.initElements(driver, ApproveanEstimateDMSPage.class);
        pmworkorderworkflowpage = PageFactory.initElements(driver, cGVTechPerformPM.class);
        performtheworkonanestimatepage = PageFactory.initElements(driver, PerformTheWorkOnAnEstimateTech.class);
        spotorderparts = PageFactory.initElements(driver,Spotorderpart.class);
        journalizepartinvoice = PageFactory.initElements(driver, JournalizePartsInvoice_konaEU.class);
        receivepart= PageFactory.initElements(driver, ReceivePart.class);
        submitanestimateservicemanager=PageFactory.initElements(driver, SubmitAnEstimateServiceManager.class);



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
         else if (getClass().getCanonicalName().contains("CreateUnit")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateUnitReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateVendorTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateVendorTestReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateCustomerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateCustomerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CounterSaleTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CounterSaleManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceiveParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("LoginTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/LoginTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreatePart")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreatePartReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SubmitAnEstimate_ServiceManagerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SubmitAnEstimate_ServiceManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Spotorderpart")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SpotorderpartReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SetUpWorkRequiredTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerChangeCustomerPOafterInvoicingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/InquireFXG_UnitHistoryTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizePartsInvoiceTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizePartsInvoiceTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechWoLabor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TechWoLaborReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechWoParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TechWoPartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ECServiceManager_AddRemoveLaborTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("EC_ServiceManager_WoLaborTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/EC_ServiceManager_WoLaborTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateNonRepairBill_ServiceManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/cGVTech_WoComplianceTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerInvoiceReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerPartsRelatedTasksReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveNonRepairBillTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UnitMasterTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerJournalizeReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRedTagDMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/InquireFXG_UnitHistoryTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveNonRepairBill_DMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("cGVTechPerformPMTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/cGVTechPerformPMTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PerformTheWorkOnAnEstimateTechTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Spotorderpart")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SpotorderpartReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizePartsInvoice_konaEUTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizePartsInvoice_konaEUTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceiveParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerPartsRelatedTasksReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreatePart")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreatePartReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceiveParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SubmitAnEstimateServiceManagerReports/" + "__" + currentDateTime;
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
            else if (getClass().getCanonicalName().contains("CreateUnit")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateUnitReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("CreateVendorTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateVendorTestReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("CreateCustomerTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateCustomerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CounterSaleTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CounterSaleTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("LoginTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\LoginTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreatePart")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreatePartReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SubmitAnEstimate_ServiceManagerTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SubmitAnEstimate_ServiceManagerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Spotorderpart")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SpotorderpartReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SetUpWorkRequiredTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerChangeCustomerPOafterInvoicingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\InquireFXG_UnitHistoryTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizePartsInvoiceTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizePartsInvoiceTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechWoLabor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechWoLaborReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechWoParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechWoPartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ECServiceManager_AddRemoveLaborTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("EC_ServiceManager_WoLaborTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\EC_ServiceManager_WoLaborTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            cmd = allurePathWin + " generate" + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateNonRepairBill_ServiceManagerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerInvoiceReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerPartsRelatedTasksReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveNonRepairBillTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnitMasterTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\cGVTech_WoComplianceTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerJournalizeReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRedTagDMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\InquireFXG_UnitHistoryTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveNonRepairBill_DMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("cGVTechPerformPMTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\cGVTechPerformPMTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PerformTheWorkOnAnEstimateTechTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Spotorderpart")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SpotorderpartReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizePartsInvoice_konaEUTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizePartsInvoice_konaEUTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerPartsRelatedTasksReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreatePart")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreatePartReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SubmitAnEstimateServiceManagerReports\\" + theDir.getName();
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

    /** new method Akash */
    public  String  getMyClassName() {

        return this.getClass().getSimpleName();  //To get  Current className
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
