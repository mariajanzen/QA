package org.example.herokuapp;

import org.example.pages.HorisontalPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static org.example.pages.Commons.BASE_URL;

public class HorisontalPageTest {

    @Test
    public void sliderTest() {
        String value = "1.5";
        HorisontalPage horisontalPage = open(BASE_URL + "/horizontal_slider", HorisontalPage.class);
        horisontalPage.moveSlider(value);
        horisontalPage.currentSliderValue().shouldHave(text(value));
    }
}
