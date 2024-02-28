package com.demoqa;


import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.FindByXpath;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;


public class PageTextBox {
    private final SelenideElement fullName = $x("//div/input[@placeholder='Full Name']");
    private final SelenideElement email = $x("//div/input[@placeholder='name@example.com']");
    private final SelenideElement currentAddress = $x("//div/textarea[@placeholder='Current Address']");
    private final SelenideElement permanentAddress = $x("//div/textarea[@id='permanentAddress']");
    private final SelenideElement submitButton = $x("//div/button[contains(.,'Submit')]");
    private final String url="https://demoqa.com/text-box";

    @Step ("Открыли https://demoqa.com/text-box")
    public void openPage(){
        open(url);
    }

    @Step ("Заполнили FullName")
    public void setFullName(String fullName) {
        this.fullName.setValue(fullName);
    }

    @Step ("Заполнили Email")
    public void setEmail(String email) {
        this.email.toWebElement().sendKeys(email);
    }
    @Step ("Заполнили CurrentAddress")
    public void setCurrentAddress(String currentAddress) {
        this.currentAddress.toWebElement().sendKeys(currentAddress);
    }
    @Step ("Заполнили PermanentAddress")
    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress.toWebElement().sendKeys(permanentAddress);
    }
    @Step ("Нажали submit")
    public void submit(){
        submitButton.click();
    }

}
