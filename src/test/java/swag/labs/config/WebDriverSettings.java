package swag.labs.config;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;;import static com.codeborne.selenide.Selenide.open;
import static swag.labs.config.Browser.CHROME;
import static swag.labs.config.Browser.FIREFOX;

public class WebDriverSettings {
    public static WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());;

    public static void configure() {
        Configuration.baseUrl = webDriverConfig.getBaseUrl();
        Configuration.browserSize = webDriverConfig.browserSize();
        switch (webDriverConfig.getBrowser()) {
            case CHROME: {
                WebDriverManager.chromedriver().setup();
                Configuration.browser = CHROME.toString();
                break;
            }
            case FIREFOX: {
                WebDriverManager.firefoxdriver().setup();
                Configuration.browser = FIREFOX.toString();
                break;
            }
            default: {
                throw new RuntimeException("No such driver");
            }
        }
    }
}
