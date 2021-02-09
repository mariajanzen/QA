package org.example.herokuapp;

import com.codeborne.selenide.Condition;
import org.example.pages.CheckBoxPage;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.open;
import static org.example.pages.Commons.BASE_URL;

public class CheckBoxPageTest {

    @Test
    public void activateCheckbox1() {
        CheckBoxPage checkBoxPage = open(BASE_URL + "/checkboxes", CheckBoxPage.class);
        checkBoxPage.clickOnCheckbox();
        checkBoxPage.checkboxInput1().shouldHave(Condition.attribute("checked"));
    }
}
