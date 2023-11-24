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
