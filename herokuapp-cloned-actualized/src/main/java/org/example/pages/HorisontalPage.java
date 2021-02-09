package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HorisontalPage {

    private static final By SLIDER = By.xpath("//input[@type='range']");
    private static final By RANGE_TEXT = By.id("range");

    public void moveSlider(String sliderValue) {
        $(SLIDER).setValue(sliderValue);
    }

    public SelenideElement currentSliderValue() {
        return $(RANGE_TEXT);
    }
}
