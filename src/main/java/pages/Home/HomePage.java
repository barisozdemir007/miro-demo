package pages.Home;

import io.qameta.allure.Step;
import locators.Home.HomePageLocators;
import locators.Login.LoginPageLocators;
import pages.Login.LoginPage;

public class HomePage {

    HomePageLocators homePageLocators;


    public HomePage() {
        this.homePageLocators = new HomePageLocators();
    }

    @Step("Click Log In Button")
    public HomePage click_logIn_button() {
        homePageLocators.click_login_button.click();
        return this;
    }
}
