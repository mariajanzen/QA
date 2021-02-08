package de.telran.herokuApp_MJ.pages;

import org.openqa.selenium.WebDriver;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

    protected WebDriver driver;

    /*
     * Constructor injecting the WebDriver interface
     *
     * @param webDriver
     */
    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public static String BASE_URL = "http://the-internet.herokuapp.com";
}
