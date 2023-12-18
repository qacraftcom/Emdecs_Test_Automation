package pages.nonRepair;

import actions.DataActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.commons.lang.text.StrSubstitutor;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.TestDriverActions;
import utils.TestListener;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.io.*;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.List;

import static org.apache.pdfbox.cos.COSInteger.get;


public class ReportsPage extends TestDriverActions {

    public Actions action;

    @FindBy(xpath = "(//a[text()='Reports'])[2]")
    WebElement btn_Reports;

    @FindBy(xpath = "//h1[contains(text(),'Report Parameters')]/following::input[1]")
    public  List<WebElement> dateTextBox;

    @FindBy(xpath = "//span[contains(text(),'Run Report')]")
    WebElement btn_RunReport;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//select[contains(@id,'soc9::content')]")
    List<WebElement> year;

    @FindBy(xpath = "//select[contains(@id,'soc1::content')]")
    List<WebElement> accounting_Period;

    @FindBy(xpath = "//*[contains(text(),'%s')]")
    WebElement reports_Categories;

    @FindBy(xpath = "//*[starts-with(text(),'%s')]")
    WebElement available_Reports;

    @FindBy(xpath = "//input[contains(@id,'it1::content')]")
    List<WebElement> credit_Limit;

    @FindBy(xpath ="//select[contains(@name,'socCus')]")
    List<WebElement> unitOwner;

    @FindBy(xpath = "//div[@class='toast-item-text']")
    List<WebElement> queue;

    @FindBy(xpath = "(//a[text()='Report History'])[1]")
    WebElement reportHistory_btn;

    @FindBy(xpath = "//span[contains(text(),'Refresh')]")
    WebElement refresh_btn;

    @FindBy(xpath = "//a[contains(@id,'gl1')]")
    List<WebElement> view;

    /**
     * Click On Reports
     */
    public void clickOnReports() throws InterruptedException {
        Thread.sleep(3000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Reports);
        WebElementActions.getActions().clickElement(btn_Reports);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click On Reports Categories
     */
    String reportName = "System Security";
    String allReports = String.format("//span[contains(text(),'%s')]", reportName);

    public void clickOnReportsCategories() throws InterruptedException {
        Thread.sleep(20000);
        WebElement dyelement = driver.findElement(By.xpath(allReports));
        dyelement.click();
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /**
     * Click On Available Reports
     */
    String availReportName = "User Security Export";
    String allAvailReports = String.format("//span[starts-with(text(),'%s')]", availReportName);

    public void clickOnAvailableReports() throws InterruptedException {
        Thread.sleep(20000);
        if(availReportName.contains("Export")) {
            WebElement dyelement1 = driver.findElement(By.xpath(allAvailReports));
            dyelement1.click();
            WaitActions.getWaits().loadingWait(loder);
        }
        else {
            WebElement dyelement1 = driver.findElement(By.xpath(allAvailReports));
            dyelement1.click();
            WaitActions.getWaits().loadingWait(loder);
        }
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter Month in TO Date
     */
    public  String subtractMonthsFromCurrentDate(int monthsToSubtract) throws InterruptedException {
        Thread.sleep(5000);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -monthsToSubtract);

        Date resultDate = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm a");

        if (dateTextBox.get(0).getAttribute("placeholder").contains("h:mm a")) {
            return dateFormat1.format(resultDate);
        } else {
            return dateFormat.format(resultDate);
        }
    }
    public void creditLimit() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(credit_Limit.get(0));
        WebElementActions.getActions().inputText(credit_Limit.get(0), "10");
;    }

    public void enterDateInTextBox(String dateToEnter) throws InterruptedException {
        Thread.sleep(5000);

    //    if (dateTextBox.size()>=1 && unitOwner.size()>=1)
        if (dateTextBox.size()> 1 ){
            dateTextBox.get(0).clear();
            dateTextBox.get(0).sendKeys(dateToEnter);
            dateTextBox.get(0).sendKeys(Keys.TAB);
//            Thread.sleep(2000);
//            Select unitDropdown = new Select(unitOwner.get(0));
//            unitDropdown.selectByVisibleText("0304 - 0304");
//            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_RunReport);
//            WebElementActions.getActions().clickElement(btn_RunReport);
            TestListener.saveScreenshotPNG(driver);

        } else if (year.size() > 1 && accounting_Period.size()> 1 ){
            Select yearDropdown = new Select(year.get(0));
            yearDropdown.selectByVisibleText("2021");
            Select priodeDropdown = new Select(accounting_Period.get(0));
            priodeDropdown.selectByVisibleText("2");

//            Thread.sleep(3000);
//            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_RunReport);
//            WebElementActions.getActions().clickElement(btn_RunReport);
            TestListener.saveScreenshotPNG(driver);
        } else if (credit_Limit.size() > 1) {
            this.creditLimit();
            TestListener.saveScreenshotPNG(driver);
        }
        else
        ReusableActions.deleteDownloadedFile();
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_RunReport);
        WebElementActions.getActions().clickElement(btn_RunReport);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

        int count = 0;
        while(count<20)
        {
 //           System.out.println("Size of queue is :"+queue.size());
            Thread.sleep(1000);
            count++;
            if(queue.size()>0) {

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reportHistory_btn);
                WebElementActions.getActions().clickElement(reportHistory_btn);
     //           Thread.sleep(2000);
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(refresh_btn);
                WebElementActions.getActions().clickUsingJS(refresh_btn);
                  Thread.sleep(8000);
        //        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(view.get(0));
                WebElementActions.getActions().clickElement(view.get(0));

                TestListener.saveScreenshotPNG(driver);

                break;
            }
        }
    }

    public void readPDF() throws IOException, InterruptedException {
        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        File file = new File(url);
        FileInputStream fis = new FileInputStream(file);
        PDDocument document = null;
        document = PDDocument.load(fis);
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String pdfFullText = pdfStripper.getText(document);
        System.out.println(pdfFullText);
        fis.close();
        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();

        TestListener.saveScreenshotPNG(driver);
    }

    public void readExcel() throws InterruptedException, IOException {

        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir")+"\\downloadFiles");
        File[] dirContents= dir.listFiles();
        String fileName= dirContents[0].getName();
        String url= System.getProperty("user.dir")+"\\downloadFiles\\" + fileName;
        File file = new File(url);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook= new HSSFWorkbook(fis);
        Sheet sheet= workbook.getSheetAt(0);
        //Iterate through rows and columns to read data
        for(Row row:sheet)
        {
            for(Cell cell: row)
            {
                System.out.print(cell.toString()+"\t");
            }
            System.out.println();  //move to next row
        }
        fis.close();
        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();

        TestListener.saveScreenshotPNG(driver);

    }
 /*       Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir")+"\\downloadFiles");
        File[] dirContents= dir.listFiles();
        String fileName= dirContents[0].getName();
        String url= System.getProperty("user.dir")+"\\downloadFiles\\" + fileName;
        File file = new File(url);
 //       FileInputStream fis = new FileInputStream(file);
        FileInputStream fis =null;
        Workbook workbook = null;
//        File file = new File(url);
        if (!file.exists()) {
            if (file.toString().endsWith(".xlsx")) {
                workbook = new XSSFWorkbook();
            } else {
                workbook = new HSSFWorkbook();
            }
        } else {
            workbook = WorkbookFactory.create(new FileInputStream(file));
        }
 //       Workbook workbook= new HSSFWorkbook(fis);
        Sheet sheet= workbook.getSheetAt(0);
        //Iterate through rows and columns to read data
        for(Row row:sheet)
        {
            for(Cell cell: row)
            {
                System.out.print(cell.toString()+"\t");
            }
            System.out.println();  //move to next row
        }
        fis.close();
        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();

        TestListener.saveScreenshotPNG(driver);

    }
    /*
     Workbook workbook = new XSSFWorkbook(fis)) {

                // Assuming the data is in the first sheet
                Sheet sheet = workbook.getSheetAt(0);

                // Iterate through rows and columns to read data
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println(); // Move to the next row
                }
     */

}






  /*      // Method to get the latest downloaded file in a directory
        public String getLatestDownloadedFileName () {
            File dir = new File(folderPath);
            File[] files = dir.listFiles((d, name) -> name.endsWith(".xls"));
            if (files != null && files.length > 0) {
                return files[files.length - 1].getName();
            } else {
                return null;
            }
        } */
       //Thread.sleep(5000);

        // Get Latest file
        //      String folderPath = "C:\\Users\\pc5-q\\Downloads";
        //       String folderPath = "C:\\Users\\pc5-q\\Downloads";

     /*  File folder = new File(folderPath);

        File[] files = folder.listFiles();
        System.out.println("List of File:" + files.length);
        System.out.println("Latest File Name:" + getLatestFile(files).getName());  */

      /*  File latestFile = getLatestFile(fileNames); */

//        if (fileNames != null) {
        /*        try (BufferedReader br = new BufferedReader(new FileReader(fileNames))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
           else if (latestFile == null) {
            System.out.println("File is empty");

            Assert.fail("File is empty");
        }


    } */

















//    private static boolean latest(File file) throws IOException {
//        FileInputStream fis = new FileInputStream(file);
//        Workbook workbook = WorkbookFactory.create(fis);
//        Sheet sheet = workbook.getSheetAt(0); // Assuming there is only one sheet
//        fis.close();
//        return sheet.getPhysicalNumberOfRows() <= 0;
//    }


// Read PDF form New TAB



// Verify the content of the PDF
//    String pdfUrl = driver.getCurrentUrl();
//    String pdfContent = getPDFContent(pdfUrl);
//
//    // Perform verifications based on the PDF content
//        System.out.println("PDF Content:\n" + pdfContent);
//
//
//    private static <InputStream> String getPDFContent(String pdfUrl) {
//        try (InputStream inputStream = new URL(pdfUrl).openStream()) {
//            PDDocument document = PDDocument.load(inputStream);
//            PDFTextStripper pdfTextStripper = new PDFTextStripper();
//            return pdfTextStripper.getText(document);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }

