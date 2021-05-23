package pages.Board;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import locators.Board.BoardPageLocators;
import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import pages.Login.LoginPage;

import java.util.ArrayList;
import java.util.Collections;

import static com.codeborne.selenide.Selenide.*;

public class BoardPage {

    BoardPageLocators boardPageLocators;
    
    public BoardPage() {
        this.boardPageLocators = new BoardPageLocators();
    }
    
    @Step("Picker Should Be Visible")
    public BoardPage picker_should_be_visible() throws InterruptedException {
        Thread.sleep(5000);
        boardPageLocators.click_picker_close_button.should(Condition.exist);
        return this;
    }

    @Step("Click Picker Close Button")
    public BoardPage click_picker_close_button() throws InterruptedException {
        Thread.sleep(5000);
        boardPageLocators.click_picker_close_button.click();
        return this;
    }

    @Step("Click Select Stickers")
    public BoardPage click_select_stickers() {
        boardPageLocators.click_select_stickers.click();
        return this;
    }

    @Step("Click Create New Stickers")
    public BoardPage click_create_new_stickers(Integer xOffset, Integer YOffset) {
        actions().moveToElement(boardPageLocators.click_create_new_stickers).moveByOffset(xOffset, YOffset).click().build().perform();
        return this;
    }

    @Step("Get Sticker Id")
    public ArrayList<String> cart_list() throws InterruptedException {
        Thread.sleep(5000);
        return executeJavaScript
                ("let cardIdList = []; let cardlist=await miro.board.widgets.get(); for (let index = 0; index < cardlist.length; index++) {cardIdList.push(cardlist[index].id)} return cardIdList;");
    }

    @Step("Click Share Button")
    public BoardPage click_share_button() {
        boardPageLocators.click_share_button.click();
        return this;
    }

    @Step("\"{boardName}\"Set BoardName")
    public BoardPage setBoardName(String boardName) {
        boardPageLocators.setBoardName.setValue(boardName);
        return this;
    }

    @Step("Click Save Board Name")
    public BoardPage click_save_board_name() {
        boardPageLocators.click_save_board_name.click();
        return this;
    }

    @Step("\"{shareEmail}\"Set ShareEmail")
    public BoardPage setShareEmail(String shareEmail) throws InterruptedException {
        Thread.sleep(1000);
        actions().sendKeys(boardPageLocators.setShareEmail, shareEmail).build().perform();
        return this;
    }

    @Step("\"{setMessageText}\"Set SetMessageText")
    public BoardPage setMessageText(String setMessageText) {
        actions().sendKeys(boardPageLocators.setMessageText, setMessageText).build().perform();
        return this;
    }

    @Step("Click Share Invitation Button")
    public BoardPage click_share_invitation_button() {
        boardPageLocators.click_share_invitation_button.click();
        return this;
    }

    @Step("Click Submit Approved Button")
    public BoardPage click_submit_approved_button() {
        boardPageLocators.click_submit_approved_button.click();
        return this;
    }

    @Step("Click Main Boars Button")
    public BoardPage click_dash_boards_button() {
        boardPageLocators.click_dash_boards_button.click();
        return this;
    }

    @Step("Compare Sticker Id ")
    public BoardPage compare_sticker_id(ArrayList<String> cart_list,ArrayList<String> cart_list2) {
        Collections.sort(cart_list);
        Collections.sort(cart_list2);
        Assert.assertEquals(cart_list.equals(cart_list2),true);

        return this;
    }
}
