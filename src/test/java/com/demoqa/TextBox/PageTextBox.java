package com.demoqa.TextBox;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;


 class PageTextBox {
    private final SelenideElement fullName = $x("//div/input[@placeholder='Full Name']");
    private final SelenideElement email = $x("//div/input[@placeholder='name@example.com']");
    private final SelenideElement currentAddress = $x("//div/textarea[@placeholder='Current Address']");
    private final SelenideElement permanentAddress = $x("//div/textarea[@id='permanentAddress']");
    private final SelenideElement submitButton = $x("//div/button[contains(.,'Submit')]");
    private final String url="https://demoqa.com/text-box";

    @Step ("Открыли https://demoqa.com/text-box")
     PageTextBox openPage(){
        open(url);
        return this;
    }

    @Step ("Заполнили FullName")
     PageTextBox setFullName(String fullName) {
        this.fullName.setValue(fullName);
        return this;
    }

    @Step ("Заполнили Email")
     PageTextBox setEmail(String email) {
        this.email.toWebElement().sendKeys(email);
        return this;
    }
    @Step ("Заполнили CurrentAddress")
     PageTextBox setCurrentAddress(String currentAddress) {
        this.currentAddress.toWebElement().sendKeys(currentAddress);
        return this;
    }
    @Step ("Заполнили PermanentAddress")
     PageTextBox setPermanentAddress(String permanentAddress) {
        this.permanentAddress.toWebElement().sendKeys(permanentAddress);
        return this;
    }
    @Step ("Нажали submit")
     PageTextBox submit(){
        submitButton.scrollTo().click();
        return this;
    }

}
