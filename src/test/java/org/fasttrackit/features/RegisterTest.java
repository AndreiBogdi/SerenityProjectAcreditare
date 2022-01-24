package org.fasttrackit.features;
import org.fasttrackit.features.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerWithValidCredentialsTest(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToMyAccountPage();
        registerSteps.enterCredentials("","");
        registerSteps.clickRegister();

    }

    @Test
    public void registerWithInvalidCredentials(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToMyAccountPage();
        registerSteps.enterCredentials("sasdaa@yahoo.com","saaxa21sda");
        registerSteps.clickRegister();
    }

    @Test
    public void checkRegisterInvalidCredentials(){
        registerSteps.navigateToMyAccountPage();
        loginSteps.LoggedIn("sasdaa");
    }
}
