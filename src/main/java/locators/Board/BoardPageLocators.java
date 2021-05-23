package locators.Board;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BoardPageLocators {

    public SelenideElement click_picker_close_button = $(By.cssSelector("[data-auto-test-id=template-picker__close-button]"));

    public SelenideElement click_select_stickers = $(By.cssSelector("[data-plugin-id=STICKERS]"));

    public SelenideElement click_create_new_stickers = $(By.id("board-canvas-container"));

    public SelenideElement click_share_button = $(By.cssSelector("[autotest-id=board__share-button--desktop]"));

    public SelenideElement setBoardName = $(By.cssSelector("[data-autotest-id=rename-board-modal__name-input]"));

    public SelenideElement click_save_board_name = $(By.cssSelector("[data-autotest-id=rename-board-modal__submit-button]"));

    public SelenideElement setShareEmail = $(By.cssSelector("[data-auto-test-id=shareMdEmailsEditorInput]"));

    public SelenideElement setMessageText = $(By.cssSelector(".rtb-scroll.no-prevent-default .custom-message-input__input"));

    public SelenideElement click_share_invitation_button = $(By.cssSelector("[data-auto-test-id=shareMdButtonSend]"));

    public SelenideElement click_submit_approved_button = $(By.cssSelector(".rtb-btn.rtb-btn--primary.rtb-btn--small"));

    public SelenideElement click_dash_boards_button = $(By.xpath("//*[@id=\"canvasContainer\"]/div[2]/div[2]/div[1]/div[1]/div[1]"));

    public SelenideElement click_lets_start_button = $(By.cssSelector(".st_slide_letsStart .rtb-btn.rtb-btn--primary.rtb-btn--small"));


}
