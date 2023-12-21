package tests;



import org.testng.annotations.Test;
import pages.ReportsPage;
import tests.TestDriverActions;

import java.io.FileNotFoundException;


public class ReportsTest extends TestDriverActions {

    @Test(priority = 0, description = "Login the page and go to Reports page", enabled = true)
    public void Test_001_gotoReportScreen() throws FileNotFoundException, InterruptedException {

        loginPage.loginWithValidCredentials(prop.getProperty("manager_two_username"), prop.getProperty("manager_two_password"));
        reportsPage.clickOnReports();
    }

    @Test(priority = 1, description = "Click on Reports Categories and Available Reports", enabled = true)
    public void Test_002_clickOnReports() throws InterruptedException {
        reportsPage.clickOnReportsCategories();
        reportsPage.clickOnAvailableReports();

    }

    @Test(priority = 2, description = "Enter Date for Generate Reports", enabled = true)
    public void Test_003_subtractMonthsFromCurrentDate() throws Exception {
        String dateToEnter = ReportsPage.subtractMonthsFromCurrentDate(2);
        reportsPage.enterDateInTextBox(dateToEnter);
        reportsPage.readPDF();
//       reportsPage.readExcel();
    }

}

