package de.telran.herokuApp_MJ;

import de.telran.herokuApp_MJ.pages.HoversPage;
import de.telran.herokuApp_MJ.pages.LoginPage;
import de.telran.herokuApp_MJ.pages.SecureArea;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    LoginPage loginPage;
    SecureArea secureArea;
    private ChromeDriver driver;
    private String validUsername = "tomsmith";
    private String validPassword = "SuperSecretPassword!";
    private String titleText = driver.findElement(By.className("icon-lock")).getText();




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
    public void successfulLogin() {
        loginPage.goToLoginPage();
        loginPage.insertCredentials(validUsername, validPassword);
        loginPage.validClickLogin();

        assertEquals(loginPage.validClickLogin(), new SecureArea(driver));

    }
}
