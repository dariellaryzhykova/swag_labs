package swag.labs.pages;

import com.codeborne.selenide.SelenideElement;
import org.aeonbits.owner.ConfigFactory;
import swag.labs.config.AuthConfig;

import static com.codeborne.selenide.Selenide.$;

public class LogIn {

    private static AuthConfig authConfig = ConfigFactory.create(AuthConfig.class, System.getProperties());
    SelenideElement user = $("#user-name");
    SelenideElement password = $("#password");
    SelenideElement signIn = $("#login-button");
    SelenideElement loginLogo = $(".login_logo");
    public static String standardUser = authConfig.getStandardUser();
    public static String userPassword = authConfig.getPassword();

    public void typeUserName(String userName) {
        user.setValue(userName);
    }

    public void typePassword(String userPass) {
        password.setValue(userPass);
    }

    public void pressSignIn() {
        signIn.click();
    }

    public SelenideElement getLoginLogo() {
        return loginLogo;
    }

    public void logInAsStandardUser(){
        typeUserName(standardUser);
        typePassword(userPassword);
    }
}
