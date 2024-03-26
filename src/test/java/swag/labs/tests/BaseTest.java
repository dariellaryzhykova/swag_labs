package swag.labs.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import swag.labs.config.WebDriverSettings;

public class BaseTest {

    @BeforeAll
    public static void setUp() {
        WebDriverSettings.configure();

    }
    @AfterAll
    public static void stop() {
    }
}
