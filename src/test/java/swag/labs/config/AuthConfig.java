package swag.labs.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/auth.properties"
})
public interface  AuthConfig extends Config {

    @Key("standardUser")
    String getStandardUser();

    @Key("password")
    String getPassword();

}

