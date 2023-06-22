package com.nasscom.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nasscom.Portal.Login;
import com.nasscom.driver.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase {

    static WebDriver driver;

    @BeforeTest
    public void verifywebdriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = webdriver.chromeSetup();

    }

    @Test(priority = 1)
    public void TC_01_login() throws Exception {
        Login.login(driver, "sarath");
    }

    @Test(priority = 2)
    public void TC_02_login() throws Exception {

    }

    @Test(priority = 3)
    public void TC_03_login() throws Exception {

    }

    public static void main(String[] args) throws Exception {
        Testcase test = new Testcase();
        test.verifywebdriver();
        test.TC_01_login();
        test.TC_02_login();
        test.TC_03_login();
        // test.driver.quit();
    }
}
