package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class MyAccountPage extends BasePage {

    @FindBy(id ="reg_email")
    private WebElementFacade EmailField;

    @FindBy(id ="reg_password")
    private WebElementFacade PassField;

    @FindBy(css =".woocommerce-FormRow > button:nth-child(3)")
    private WebElementFacade RegisterButton;

    @FindBy(id ="username")
    private WebElementFacade EmailFieldLogIn;

    @FindBy(id ="password")
    private WebElementFacade PassFieldLogIn;

    @FindBy(css = ".woocommerce-form > p:nth-child(3) > button:nth-child(3)")
    private WebElementFacade LogInButton;

    @FindBy(css = ".hello strong")
    private WebElementFacade loginHelloMessageElement;

    public boolean checkUserLoggedIn(String userName) {
        loginHelloMessageElement.shouldContainOnlyText("Hello, " + userName + "!");
        return false;
    }

    public void setEmailField(String email){
        waitFor(EmailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(EmailField);
        typeInto(EmailField,email);

    }

    public void setEmailFieldLogIn(String username){
        waitFor(EmailFieldLogIn);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(EmailFieldLogIn);
        typeInto(EmailFieldLogIn,username);

    }


    public void setPasswordField(String pass){
        typeInto(PassField, pass);
    }
    public void setPasswordFieldLogIn(String pass){
        typeInto(PassFieldLogIn, pass);
    }

    public void clickRegisterButton(){
        clickOn(RegisterButton);
    }
    public void clickLogInButton(){
        clickOn(LogInButton);
    }
}
