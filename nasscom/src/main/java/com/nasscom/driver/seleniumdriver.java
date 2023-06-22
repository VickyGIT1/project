package com.nasscom.driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import com.nasscom.Utilities.util;

import org.openqa.selenium.WebDriver;

public class seleniumdriver {
    public static By By(WebDriver driver, String locator, String locatorType) {
        // String x = element;
        // String y[] = element.split("_");
        String z = locatorType;

        // System.out.println(y[2]);
        By r = null;

        if (z.equals("id")) {
            r = By.id(locator);
            return r;
        } else if (z.equals("name")) {
            r = By.name(locator);
            return r;
        } else if (z.equals("class")) {
            r = By.className(locator);
            return r;
        } else if (z.equals("xpath")) {
            r = By.xpath(locator);
            return r;
        } else if (z.equals("CSS Selector")) {
            r = By.cssSelector(locator);
            return r;
        }
        return r;

    }

    public static WebElement find(WebDriver driver, String locator, String locatorType, String filesrc)
            throws Exception {

        By x = By(driver, locator, locatorType);

        WebElement element1 = driver.findElement(x);

        // if(element1 != null)
        // {
        // util.repscreen(driver, element1, "Element is visible",
        // locator,locator,filesrc);
        // }else {
        // util.repscreen(driver,element1,"Element is not visible",
        // locator,locator,filesrc);
        // }
        return element1;

    }

    public static WebElement sendKeys(WebDriver driver, String locator, String locatorType, String value,
            String filesrc) throws Exception {
        WebElement element2 = find(driver, locator, locatorType, filesrc);
        element2.clear();
        if (element2 != null) {
            util.repscreen(driver, element2, "Value is Entered", locator, locator, filesrc);
            element2.sendKeys(value);
            Thread.sleep(1000);
        } else {
            util.repscreen(driver, element2, "Value is not Entered", locator, locator, filesrc);
        }
        return element2;
        // TODO Auto-generated method stub

    }

    // public static WebElement sendKeys(WebDriver driver, String locator,String
    // locatorType, String value,String filesrc ) throws Exception {
    // WebElement element2 = find(driver,locator, locatorType, filesrc);
    // if(element2 != null) {
    // util.logrepscreen(driver, element2, "Element is visible",
    // locator,locator,filesrc);
    // element2.sendKeys(value);
    // }else {
    // util.logrepscreen(driver, element2, "Element is visible",
    // locator,locator,filesrc );
    // }
    // return element2;
    // // TODO Auto-generated method stub
    //
    // }
    //
    public static WebElement click(WebDriver driver, String locator, String locatorType, String filesrc)
            throws Exception {

        WebElement element = find(driver, locator, locatorType, filesrc);

        if (element != null) {
            util.repscreen(driver, element, "Element is Clicked", locator, locator, filesrc);
            element.sendKeys(Keys.RETURN);
            Thread.sleep(1000);
        } else {
            util.repscreen(driver, element, "Element is not Clicked", locator, locator, filesrc);
        }

        return element;
    }

    public static WebElement clickXpatheWithJavascript(WebDriver driver, String locator, String locatorType,
            String filesrc) throws Exception {

        WebElement element = find(driver, locator, locatorType, filesrc);

        if (element != null) {
            util.repscreen(driver, element, "Element is Clicked using JS", locator, locator, filesrc);
            JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
            javaScriptExecutor.executeScript("arguments[0].click()", element);
            Thread.sleep(1000);
            // element.sendKeys(Keys.RETURN);
        } else {
            util.repscreen(driver, element, "Element is not Clicked using JS", locator, locator, filesrc);
        }

        return element;
    }

    public static WebElement doubleClick(WebDriver driver, String locator, String locatorType, String filesrc)
            throws Exception {

        WebElement element1 = find(driver, locator, locatorType, filesrc);
        if (element1 != null) {
            util.repscreen(driver, element1, "Element is Doubleclicked", locator, locator, filesrc);
            element1.sendKeys(Keys.RETURN);
            Thread.sleep(1000);
        } else {
            util.repscreen(driver, element1, "Element is not Doubleclicked", locator, locator, filesrc);
        }

        return element1;
    }

    public static WebElement clear(WebDriver driver, String locator, String locatorType, String filesrc)
            throws Exception {

        WebElement element1 = find(driver, locator, locatorType, filesrc);
        if (element1 != null) {
            util.repscreen(driver, element1, "Values are Cleared", locator, locator, filesrc);
            element1.sendKeys(Keys.DELETE);
            Thread.sleep(1000);
        } else {
            util.repscreen(driver, element1, "Values are not Cleared", locator, locator, filesrc);
        }

        return element1;
    }

    // public static WebElement selectByVisibleText(WebDriver driver, String admin)
    // {
    // // TODO Auto-generated method stub
    //
    // WebElement element1 = find(driver, admin);
    // if(element1 != null) {
    // util.logAndReport(element1,"Element is visible", admin );
    // element1.sendKeys(Keys.RETURN);
    // }else {
    // util.logAndReport(element1,"Element is not visible", admin );
    // }
    //
    // return element1;
    // }

    public static WebElement selectByVisibleText(WebDriver driver, String locator, String locatorType, String value,
            String filesrc) throws Exception {
        // TODO Auto-generated method stub
        WebElement element1 = find(driver, locator, locatorType, filesrc);
        if (element1 != null) {
            util.repscreen(driver, element1, "Dropdown is Selected by visible text", locator, locator, filesrc);
            element1.sendKeys(value);
            Thread.sleep(1000);
        } else {
            util.repscreen(driver, element1, "Dropdown is not Selected by visible text", locator, locator, filesrc);
        }

        return element1;
    }

    public static WebElement selectByValue(WebDriver driver, String locator, String locatorType, String value,
            String filesrc) throws Exception {
        // TODO Auto-generated method stub
        WebElement element1 = find(driver, locator, locatorType, filesrc);
        if (element1 != null) {
            util.repscreen(driver, element1, "Dropdown is Selected by visible text", locator, locator, filesrc);
            element1.sendKeys(value);
            Thread.sleep(1000);
        } else {
            util.repscreen(driver, element1, "Dropdown is not Selected by visible text", locator, locator, filesrc);
        }

        return element1;
    }

    public static WebElement getText(WebDriver driver, String locator, String locatorType, String filesrc)
            throws Exception {

        WebElement element1 = find(driver, locator, locatorType, filesrc);

        if (element1 != null) {
            util.repscreen(driver, element1, "The Text were Geted", locator, locator, filesrc);
            element1.sendKeys(Keys.RETURN);
            Thread.sleep(1000);
        } else {
            util.repscreen(driver, element1, "The Text were not Geted", locator, locator, filesrc);
        }

        return element1;

    }

    public static WebElement moveToElement(WebDriver driver, String locator, String locatorType, String filesrc)
            throws Exception {
        WebElement element1 = find(driver, locator, locatorType, filesrc);
        if (element1 != null) {
            util.repscreen(driver, element1, "Element is moved to next element", locator, locator, filesrc);
            element1.sendKeys(Keys.RETURN);
            Thread.sleep(1000);
        } else {
            util.repscreen(driver, element1, "Element is not moved to next element", locator, locator, filesrc);
        }

        return element1;
    }

    // TODO Auto-generated method stub

    public static boolean acceptAlert(WebDriver driver) throws Exception {
        boolean presentFlag = false;
        try {
            Alert element = driver.switchTo().alert();
            presentFlag = true;
            element.accept();
        } catch (NoAlertPresentException ex) {
            ex.printStackTrace();
        }

        return presentFlag;
    }
}
