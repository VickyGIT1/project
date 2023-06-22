package com.nasscom.Portal;

import org.openqa.selenium.WebDriver;

import com.nasscom.driver.seleniumdriver;
import com.nasscom.testcase.Testcase;

public class Login {

    static String log = "//*[contains(@placeholder,'Enter your User ID')]";

    public static void login(WebDriver driver, String sarath) throws Exception {
        Thread.sleep(3000);
        seleniumdriver.sendKeys(driver, log, "xpath", sarath, "Parent_name_edit");

    }

}