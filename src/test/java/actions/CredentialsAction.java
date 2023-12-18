package actions;

import tests.TestDriverActions;

public class CredentialsAction extends TestDriverActions {


    public String email = "";
    public String password = "";
    public String environmentName = "";


    public CredentialsAction(String Websites) {

        environmentName = "konaqa";
        switch(Websites){
            case "KonaQA":
                switch(environmentName) {
                    case "manager":
                        email = prop.getProperty("manager_one_username");
                        password = prop.getProperty("manager_one_password ");
                        break;

                    case "service" :
                        email = prop.getProperty("service_one_username");
                        password = prop.getProperty("service_one_password");
                        break;

                    case "tech" :
                        email = prop.getProperty("tech_one_username");
                        password = prop.getProperty("tech_one_password");

                    case "Service" :
                        email = prop.getProperty("service_two_username");
                        email = prop.getProperty("service_two_password");

                }
        }

        environmentName = "kona_na";
        switch(Websites){
            case "KonaNA":
                switch(environmentName){
                    case "manager":
                        email = prop.getProperty("username_NA_manager_one");
                        password = prop.getProperty("passward_NA_manager_one ");
                        break;
                    case "service" :
                        email = prop.getProperty("username_NA_service_one");
                        password = prop.getProperty("passward_NA_service_one");
                        break;

                    case "tech" :
                        email = prop.getProperty("username_NA_tech_one");
                        password = prop.getProperty("passward_NA_tech_one");
                }
        }
        environmentName = "kona_ec";
        switch(Websites){
            case "KonaEC":
                switch(environmentName){
                    case "manager":
                        email = prop.getProperty("");
                        password = prop.getProperty("");
                        break;
                    case "service" :
                        email = prop.getProperty("");
                        password = prop.getProperty("");
                        break;

                    case "tech" :
                        email = prop.getProperty("");
                        password = prop.getProperty("");

                    case "" :
                        email = prop.getProperty("");
                        email = prop.getProperty("");

                }
        }
        environmentName = "kona_eu";
        switch(Websites){
            case "KonaEU":
                switch(environmentName){
                    case "manager":
                        email = prop.getProperty("");
                        password = prop.getProperty("");
                        break;
                    case "service" :
                        email = prop.getProperty("");
                        password = prop.getProperty("");
                        break;

                    case "tech" :
                        email = prop.getProperty("");
                        password = prop.getProperty("");

                    case "" :
                        email = prop.getProperty("");
                        email = prop.getProperty("");

                }
        }



    }




}
