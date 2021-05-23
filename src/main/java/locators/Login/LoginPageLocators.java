package locators.Login;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageLocators {

    public SelenideElement setEmail = $(By.id("email"));

    public SelenideElement setPassword = $(By.id("password"));

    public SelenideElement click_signIn_button = $(By.cssSelector("[data-autotest-id=mr-form-login-btn-signin-1]"));
}
