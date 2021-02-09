package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage {

    private static final By CHECKBOX1 = By.xpath("//form/input[1]");

    public void clickOnCheckbox() {
        checkboxInput1().click();
    }

    public SelenideElement checkboxInput1() {
        return $(CHECKBOX1);
    }


}
