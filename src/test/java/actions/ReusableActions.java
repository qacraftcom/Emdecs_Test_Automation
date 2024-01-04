package actions;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableActions extends TestDriverActions {

    private static ReusableActions reusableActions;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    public static synchronized ReusableActions getActions() throws FileNotFoundException {
        if (reusableActions == null) {
            reusableActions = new ReusableActions();
        }
        return reusableActions;
    }


    public void clickParentMenu(String menuText) throws InterruptedException {
        WaitActions.getWaits().waitForElementTobeClickable(driver.findElement(By.xpath("//table[@class='af_menuBar_items']//table//td//a[text()='" + menuText + "']")));
        WebElement element = driver.findElement(By.xpath("//table[@class='af_menuBar_items']//table//td//a[text()='" + menuText + "']"));
        WaitActions.getWaits().waitForElementTobeClickable(element);
        element.click();
        Thread.sleep(1000);
    }

    public void clickChildMenu(String childMenuText) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//div[@class='AFPopupMenuContent']//td[text()='" + childMenuText + "']"));
        WaitActions.getWaits().waitForElementTobeClickable(element);
        element.click();
        Thread.sleep(5000);

    }

    public String getRandom(int len) {
        StringBuilder sb = new StringBuilder();
        String character = "1234567890";
        for (int i = 0; i < len; i++) {
            int index = (int) (Math.random() * character.length());
            sb.append(character.charAt(index));
        }
        return sb.toString();
    }

    public static String returnCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd HH:mm:ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
        return dateFormat.format(new Date());
    }

    public static String todaysdate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
        return dateFormat.format(new Date());
    }

    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {
        WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        WebElementActions.getActions().clickElement(btn_signOut);

        WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());
    }


    public static void deleteDownloadedFile() throws InterruptedException {
        int i;
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        if (dirContents.length > 0) {
            for (i = 0; i < dirContents.length; i++) {
                System.out.println("File name" + dirContents[i].getName());
                dirContents[i].delete();
            }
        }
    }

 /*   public String verifydownloadFile() throws InterruptedException {
        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
//        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        return System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
    }

    public void readPDF() throws IOException {
//        if (url.contains(".pdf")) {
            File file = new File(url);
            FileInputStream fis = new FileInputStream(file);
            PDDocument document = null;
            document = PDDocument.load(fis);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String pdfFullText = pdfStripper.getText(document);
            System.out.println(pdfFullText);
            fis.close();

//        }
    }



    public void readExcel() throws IOException {
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
    }   */
}
