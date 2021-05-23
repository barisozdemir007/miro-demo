package locators.Home;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePageLocators {

    public SelenideElement click_login_button = $(By.id("header-login-btn"));
}
