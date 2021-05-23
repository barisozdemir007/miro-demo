package base;

import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.Board.BoardPage;
import pages.DashBoard.DashBoardPage;
import pages.Home.HomePage;
import pages.Login.LoginPage;
import utils.SelenideWebDriverManager;


import static com.codeborne.selenide.Selenide.closeWebDriver;


public class BaseTest {

    public LoginPage loginPage;
    public HomePage homePage;
    public DashBoardPage dashBoardPage;
    public BoardPage boardPage;
    public SelenideDriver driver;

    @Step("Set Selenide Driver")
    @BeforeClass(alwaysRun = true)
    @Parameters({"url", "browser"})
    public void setup(String url, String browser) {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide().screenshots(true).savePageSource(true));

        driver = new SelenideWebDriverManager().getDriver(url, browser);
        loginPage = new LoginPage();
        homePage = new HomePage();
        dashBoardPage = new DashBoardPage();
        boardPage = new BoardPage();
    }

    @Step("TearDown Selenide Driver")
    @AfterClass(alwaysRun = true)
    public void teardown() {
        closeWebDriver();
    }
}
