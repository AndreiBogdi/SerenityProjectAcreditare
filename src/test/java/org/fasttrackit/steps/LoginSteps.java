package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomePage(){homePage.open();}

    @Step
    public void navigateToMyAccountPage(){
        homePage.clickAccountLink();
    }

    @Step
    public void enterCredentials(String username, String pass){
        myAccountPage.setEmailFieldLogIn(username);
        myAccountPage.setPasswordFieldLogIn(pass);

    }
    @Step
    public void ClickLogIn() {myAccountPage.clickLogInButton();}

    @Step
    public void checkUserIsLoggedIn(String userName){
        myAccountPage.checkUserLoggedIn(userName);
    }

    @Step
    public void LoggedIn(String userName){
        Assert.assertTrue("failed",myAccountPage.checkUserLoggedIn("sasda"));
    }

}
