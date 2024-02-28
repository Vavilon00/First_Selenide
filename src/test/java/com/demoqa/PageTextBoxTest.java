package com.demoqa;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class PageTextBoxTest {
    @BeforeAll
    public static void setUp(){
//        Configuration.headless = true;
        Configuration.pageLoadTimeout=60000;
        SelenideLogger.addListener("allure",new AllureSelenide());
    }
    @Test
    @Tag("UI")
    void successfulTest()  {
        Configuration.holdBrowserOpen=true;
 //       Configuration.browserSize = "1920x1080";

        PageTextBox pageTextBox = new PageTextBox();
        pageTextBox.openPage();
        pageTextBox.setFullName("setFullName");
        pageTextBox.setEmail("email@email.com");
        pageTextBox.setCurrentAddress("setCurrentAddress");
        pageTextBox.setPermanentAddress("setPermanentAddress");
        pageTextBox.submit();

    }

}
