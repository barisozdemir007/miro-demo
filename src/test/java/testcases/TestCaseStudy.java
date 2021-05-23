package testcases;


import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class TestCaseStudy extends BaseTest {

    ArrayList<String> cart_list;
    ArrayList<String> cart_list2;

    @Description("Test Case Study")
    @Test(description = "Test Case Study")

    public void Test_Case() throws InterruptedException {
        homePage.
                click_logIn_button();
        loginPage.
                setEmail("user1mirolink@gmail.com").
                setPassword("Mirouser1").
                click_signIn_button();
        dashBoardPage.
                click_create_new_board().
                click_create_and_share_board();
        cart_list = boardPage.
                picker_should_be_visible().
                click_picker_close_button().
                click_select_stickers().
                click_create_new_stickers(10, 10).
                click_share_button().
                setBoardName("Board").
                click_save_board_name().
                setShareEmail("user2mirolink@gmail.com").
                setMessageText("Test Case Study").
                click_share_invitation_button().
                click_submit_approved_button().
                cart_list();
        boardPage.
                click_dash_boards_button();
        dashBoardPage.
                click_user_profile_button().
                click_log_out_button();
        loginPage.
                setEmail("user2mirolink@gmail.com").
                setPassword("Mirouser2").
                click_signIn_button();
        dashBoardPage.
                select_board("Board");
        cart_list2 = boardPage.
                cart_list();
        boardPage.
                compare_sticker_id(cart_list, cart_list2);

    }
}
