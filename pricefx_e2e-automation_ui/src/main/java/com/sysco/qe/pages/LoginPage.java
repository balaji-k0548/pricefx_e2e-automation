package com.sysco.qe.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rifad on 5/21/18.
 */
public class LoginPage {
    protected static SyscoLabUI syscoLabUI;
    private By txtGoogleSearch = By.id("lst-ib");


    public static void loadLoginPage(Capabilities capabilities, String url) {
        syscoLabUI = new SyscoLabWUI(capabilities,"CHROME");
        syscoLabUI.driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        syscoLabUI.navigateTo(url);
        syscoLabUI.driver.manage().window().maximize();
    }

    public void quitDriver() {
        if (syscoLabUI != null) {
            syscoLabUI.quit();
        }
    }


    public void enterText(String searchString) {
        syscoLabUI.sendKeys(txtGoogleSearch, searchString);
    }

}
