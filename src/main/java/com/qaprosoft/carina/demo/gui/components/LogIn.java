package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LogIn extends AbstractUIObject {

    @FindBy(xpath = "//*[@id=\"login-active\"]/i")
    private ExtendedWebElement logIn;

    public LogIn(WebDriver driver) {
        super(driver);
    }

    public LogIn(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public LogIn openLogInPage() {
        logIn.click();
        return new LogIn(driver);
    }
}
