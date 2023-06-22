package com.nasscom.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class webdriver {
    static WebDriver driver;
    static String file = "D:\\TSquaredC\\chromedriver.exe";

    public static WebDriver chromeSetup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("use-fake-ui-for-media-stream");
        WebDriver driver = new ChromeDriver(options);
        String baseUrl = "https://portal-nasscom-stg.ken42.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return driver;
    }

    public static void main(String[] args) {
        WebDriver driver = chromeSetup();

        // driver.quit();
    }

}
