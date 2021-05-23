package pages.DashBoard;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import locators.DashBoard.DashBoardPageLocators;

public class DashBoardPage {

    DashBoardPageLocators dashBoardPageLocators;


    public DashBoardPage() {
        this.dashBoardPageLocators = new DashBoardPageLocators();
    }

    @Step("Click Create New Board")
    public DashBoardPage click_create_new_board() {
        dashBoardPageLocators.click_create_new_board.click();
        return this;
    }

    @Step("Click Create And Share Board")
    public DashBoardPage click_create_and_share_board() {
        dashBoardPageLocators.click_create_and_share_board.click();
        return this;
    }

    @Step("Click User Profile Button")
    public DashBoardPage click_user_profile_button() {
        dashBoardPageLocators.click_user_profile_button.click();
        return this;
    }

    @Step("Click LogOut Button")
    public DashBoardPage click_log_out_button() {
        dashBoardPageLocators.click_log_out_button.click();
        return this;
    }

    @Step("Select Board")
    public DashBoardPage select_board(String boardName) {
        dashBoardPageLocators.select_board.findBy(Condition.text(boardName)).click();
        return this;
    }
}


