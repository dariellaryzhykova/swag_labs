package swag.labs.tests;

import com.codeborne.selenide.Configuration.*;
import org.junit.jupiter.api.Test;
import swag.labs.pages.LogIn;
import swag.labs.pages.Products;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class LogInTest extends BaseTest {

    @Test
    public void verifyLogin() {
        LogIn logIn = new LogIn();
        step("Open login:", () -> {
            open("/");
            logIn.getLoginLogo().shouldHave(text("Swag Labs"));
        });

        step("Check if the user can log in: ", () -> {
            logIn.logInAsStandardUser();
            logIn.pressSignIn();
            Products products = new Products();
            products.getTitleProducts().shouldHave(text("Products"));
        });
    }
}
