package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideDriver;

import static com.codeborne.selenide.Selenide.open;


public class SelenideWebDriverManager {

    private SelenideDriver driver;

    public SelenideDriver createDriver(String url,String browser) {
        Configuration.browser = browser;
        Configuration.startMaximized = true;
        open(url);
        return driver;
    }

    public SelenideDriver getDriver(String url , String browser) {
        if (driver == null) driver = createDriver(url,browser);
        return driver;
    }
}
