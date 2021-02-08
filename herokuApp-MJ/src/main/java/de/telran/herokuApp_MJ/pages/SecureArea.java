package de.telran.herokuApp_MJ.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea extends Page{
    private static final String LOGOUT_URL = BASE_URL + "/logout";
    private static final By LOGOUT_BUTTON = By.cssSelector("button secondary radius");


    public SecureArea(WebDriver driver) {
        super(driver);

        //String titleText = driver.findElement(By.className("icon-lock")).getText();
        //Assertions.assertEquals(titleText, "Secure Area");
    }

    public LoginPage clickLogout(){
        driver.findElement(LOGOUT_BUTTON).click();
        return new LoginPage(driver);
    }


}
