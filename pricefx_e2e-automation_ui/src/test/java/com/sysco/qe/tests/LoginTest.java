package com.sysco.qe.tests;


import com.sysco.qe.data.LoginData;
import com.sysco.qe.functions.Login;
import com.sysco.qe.utils.ExcelUtil;
import com.sysco.qe.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @Test
    public void testLogin() throws Exception {
        LoginData loginData = ExcelUtil.getLoginData("$as238l");

        // UI Automation  sample
        Login.loadLoginPage();
        Login.quiteDriver();

    }
}