package de.telran.herokuApp_MJ.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{

    private static final String LOGIN_URL = BASE_URL + "/login";
    private static final By USER_NAME = By.xpath("//*[@id=\"username\"]");
    private static final By PASSWORD = By.xpath("//*[@id=\"password\"]");
    private static final By LOGIN_BUTTON = By.xpath("//*[@id=\"login\"]/button/i");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void insertCredentials(String usernameValue, String passwordValue) {
        driver.findElement(USER_NAME).sendKeys(usernameValue);
        driver.findElement(PASSWORD).sendKeys(passwordValue);
    }

    public void goToUrl() {
        driver.navigate().to(LOGIN_URL);
    }

    public SecureArea validClickLogin(){
        driver.findElement(LOGIN_BUTTON).click();
        return new SecureArea(driver);
    }
}
