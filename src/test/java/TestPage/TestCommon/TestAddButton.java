package TestPage.TestCommon;

import Helpers.Helper;
import TestPage.EnvContainer;
import TestPageLocator.Common.GeneralLocators;
import java.util.Arrays;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAddButton extends EnvContainer {
    private WebDriver _driver;

    public String _url,receivedLink;
    private GeneralLocators _page;

    @BeforeClass
    public void suiteSetUp()
    {

        _driver = EnvContainer.Driver;
        _page = PageFactory.initElements(_driver, GeneralLocators.class);

        openUrl();
    }

    private void openUrl() {
		 
        _url = EnvContainer.URL+"?page=personnel&aspect=personnel";
       _ctx.openUrl(_url);
        EnvContainer.interceptionJSonPage(_driver);
        Helper.waitUpdate(_driver);
    }

    // WHEN Click on the button "Add - Create Unit" THEN Unit Creation Card Opens
    @Test( enabled = true, priority = 1)
    public void testCreateUnit() {


    }

}
