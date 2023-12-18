package actions;

import constants.SheetConstants;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginActions extends TestDriverActions {

    public LoginActions() throws FileNotFoundException {
        super();
    }

    public String getAppUrl() throws IOException {

        String appUrl = null;

        appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForFrameworkConfig, SheetConstants.columnForTestEnv, SheetConstants.envRowNumber);


    /*    if (System.getProperty("env").equalsIgnoreCase("TEST")) {

            appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEnv, SheetConstants.envRowNumber);


        } else if (System.getProperty("env").equalsIgnoreCase("QA")) {
            //appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForEmail, SheetConstants.role_admin_credentials_rowNumber);


        } else if (System.getProperty("env").equalsIgnoreCase("FXG")) {
            //appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForEmail, SheetConstants.role_admin_credentials_rowNumber);

        }*/

        return appUrl;


    }

    public String[] getUserCredentials() throws IOException {

        String userRole = System.getProperty("role");
        String[] credentials = new String[2];

        credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_manager_credentials_rowNumber);
        credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestPassword, SheetConstants.role_manager_credentials_rowNumber);


/*
        if (System.getProperty("env").equalsIgnoreCase("TEST") && userRole.equalsIgnoreCase("ADMIN")) {
            credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_admin_credentials_rowNumber);
            credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestPassword, SheetConstants.role_admin_credentials_rowNumber);

        } else if (System.getProperty("env").equalsIgnoreCase("TEST") && userRole.equalsIgnoreCase("MANAGER")) {
            credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_manager_credentials_rowNumber);
            credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_manager_credentials_rowNumber);

        } else if (System.getProperty("env").equalsIgnoreCase("TEST") && userRole.equalsIgnoreCase("PFUSER")) {
            credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_admin_credentials_rowNumber);
            credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_admin_credentials_rowNumber);


        }*/

        return credentials;

    }

}

