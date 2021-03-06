package com.yandex_prodject_tests.Tests;

import com.yandex_prodject_tests.FW.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser",BrowserType.CHROME));

    @BeforeClass
    public void setUp() {
        app.init();
    }

    @AfterClass
    public void tearDown(){
        app.stop();
    }

}

