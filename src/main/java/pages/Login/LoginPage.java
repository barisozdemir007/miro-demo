package pages.Login;

import io.qameta.allure.Step;
import locators.Login.LoginPageLocators;

public class LoginPage {

    LoginPageLocators loginPageLocators;


    public LoginPage() {
        this.loginPageLocators = new LoginPageLocators();
    }


    @Step("\"{email}\"Set Email")
    public LoginPage setEmail(String email) {
        loginPageLocators.setEmail.setValue(email);
        return this;
    }

    @Step("\"{password}\"Set Password")
    public LoginPage setPassword(String password) {
        loginPageLocators.setPassword.setValue(password);
        return this;
    }

    @Step("Click Sign In Button")
    public LoginPage click_signIn_button() {
        loginPageLocators.click_signIn_button.click();
        return this;
    }

}
