package swag.labs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Products {
    SelenideElement titleProducts = $(".title");

    public SelenideElement getTitleProducts() {
        return titleProducts;
    }
}
