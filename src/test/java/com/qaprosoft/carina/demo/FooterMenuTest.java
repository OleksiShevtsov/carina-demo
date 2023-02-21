package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.enums.Footer;
import com.qaprosoft.carina.demo.gui.pages.*;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import org.testng.asserts.SoftAssert;

public class FooterMenuTest implements IAbstractTest {


//    @FindBy(xpath = "//*[@id='footmenu']/p[1]/a[1]")
//    private ExtendedWebElement home;
//
//    @FindBy(xpath = "//*[@id=\"footmenu\"]/p[1]/a[2]")
//    private ExtendedWebElement news;
//
//    @FindBy(xpath = "//*[@id=\"footmenu\"]/p[1]/a[3]")
//    private ExtendedWebElement reviews;
//
//    @FindBy(xpath = "//*[@id=\"footmenu\"]/p[1]/a[4]")
//    private ExtendedWebElement compare;
//
//    @FindBy(xpath = "//*[@id=\"footmenu\"]/p[1]/a[5]")
//    private ExtendedWebElement coverage;
//
//    @FindBy(xpath = "//*[@id=\"footmenu\"]/p[1]/a[6]")
//    private ExtendedWebElement glossary;
//
//    @FindBy(xpath = "//*[@id=\"footmenu\"]/p[1]/a[7]")
//    private ExtendedWebElement faq;
//
//    @FindBy(xpath = "//*[@id=\"footmenu\"]/p[1]/a[8]")
//    private ExtendedWebElement rss;

    @Test
    @MethodOwner(owner = "qpsdemo")
    public void testFooterMenuHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        FooterMenu footerMenu = homePage.getFooterMenu();
        Assert.assertTrue(footerMenu.isUIObjectPresent(2), "Footer menu wasn't found!");
        HomePage home = footerMenu.openHomePage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.isPageOpened(), "Home page is not opened!");
    }

    @Test
    @MethodOwner(owner = "qpsdemo")
    public void testFooterMenuNewsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        FooterMenu footerMenu = homePage.getFooterMenu();
        Assert.assertTrue(footerMenu.isUIObjectPresent(2), "Footer menu wasn't found!");
        NewsPage news = footerMenu.openNewsPage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(news.isPageOpened(), "News page is not opened!");
    }

    @Test
    @MethodOwner(owner = "qpsdemo")
    public void testFooterMenuReviewsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        FooterMenu footerMenu = homePage.getFooterMenu();
        footerMenu.clickFooterButton(Footer.REVIEWS);
        NetworkCoverage networkCoverage = new NetworkCoverage(getDriver());
        Assert.assertTrue(networkCoverage.isNetworkCoverageTitlePresent(), "Title is not present");
    }
}
