package swag.labs.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import swag.labs.config.WebDriverSettings;

public class BaseTest {

    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        WebDriverSettings.configure();

    }
    @AfterAll
    public static void stop() {
    }
}
