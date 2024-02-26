import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Lesson1 {

    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen=true;
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }

    @DisplayName("неуспешный тест")
    @Test
    void unsuccessfulSearchTest() {
        SelenideLogger.addListener("allure",new AllureSelenide());
        Configuration.holdBrowserOpen=true;
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("unsuccessfulSearchTest"));
    }
}
