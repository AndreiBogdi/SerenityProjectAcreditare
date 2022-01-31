package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void LogInWithValidCredentials(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToMyAccountPage();
        loginSteps.enterCredentials("","");
        loginSteps.ClickLogIn();
    }

    @Test
    public void LogInWithInvalidCredentials(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToMyAccountPage();
        loginSteps.enterCredentials("sasda@yahoo.com","dsaa");
        loginSteps.ClickLogIn();
        loginSteps.LoggedIn("sasda");
    }


}
