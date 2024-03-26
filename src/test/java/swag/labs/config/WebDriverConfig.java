package swag.labs.config;

import org.aeonbits.owner.Config;


import java.net.URL;

@Config.Sources({
        "classpath:config/web.properties"
})
public interface WebDriverConfig extends Config {
    @Key("baseURL")
    String getBaseUrl();

    @Key("browser")
    Browser getBrowser();

    @Key("browserSize")
    String browserSize();

    @Key("remoteUrl")
    URL getRemoteURL();
}
