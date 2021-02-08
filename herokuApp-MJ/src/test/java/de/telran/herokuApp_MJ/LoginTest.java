package de.telran.herokuApp_MJ;

import de.telran.herokuApp_MJ.pages.HoversPage;
import de.telran.herokuApp_MJ.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {
    LoginPage loginPage;
    private ChromeDriver driver;


    @BeforeEach
    public void initPageObjects() {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testSuccessfulLogin() {
        loginPage.insertCredentials("tomsmith", "SuperSecretPassword!");
        loginPage.validClickLogin();
        String titleText = driver.findElement(By.className("icon-lock")).getText();
        Assertions.assertEquals(titleText, "Secure Area");
    }
}
