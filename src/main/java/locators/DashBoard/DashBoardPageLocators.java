package locators.DashBoard;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashBoardPageLocators {

    public SelenideElement click_create_new_board = $(By.cssSelector("[data-auto-test-id=dashboardTemplatesPanel__createNewBoard]"));

    public SelenideElement click_create_and_share_board = $(By.cssSelector(".rtb-btn.rtb-btn--primary.rtb-btn--medium"));

    public SelenideElement click_user_profile_button = $(By.cssSelector(".dashboard-header--top .user-profile .user-profile__button"));

    public SelenideElement click_log_out_button = $(By.xpath("//*[@id=\"router-container-wrapper\"]/div/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/user-profile/div/div[2]/div[3]/div[2]"));

    public ElementsCollection select_board =  $$(By.cssSelector(".boards-grid .board-item-container"));


}
