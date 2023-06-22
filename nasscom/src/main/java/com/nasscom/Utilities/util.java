package com.nasscom.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class util {
    static WebElement sheet;
    static String logFilePath = "";
    static String screen = "D:\\Office\\LoveWithOutReason\\src\\LoveWithoutReason";
    // static Logger log = Logger.getLogger(util.class);
    static Logger log = Logger.getLogger("util");
    private static util reportingLibrary;

    // private static final Logger log = LogManager.getLogger("util");
    public static void logFiles(String message, WebElement element1) throws FileNotFoundException, IOException {

        PropertyConfigurator.configure("log4j.properties");

        log.info(message + " - " + element1);

        // Properties props = new Properties();
        // props.load(new FileInputStream("Log4j.properties"));
        // PropertyConfigurator.configure(props);
        // log.info(message+" - "+element1);
    }
    // public static String getCredentials(String excelpath, int column)throws
    // IOException{
    //
    // File getExcelpath = new File(excelpath);
    // FileInputStream stream = new FileInputStream(getExcelpath);
    // work_book = new XSSFWorkbook(stream);
    //
    // sheet = (WebElement) work_book.getSheetAt(0);
    // logFiles("Sheet is opened Successfully", sheet);
    // return excelpath;
    //
    // }
    //
    // public static String inputCredentials(XSSFSheet sheet, int column) {
    //
    // return logFilePath;
    //
    // }

    public static void getReport(String rep, WebElement element1) {

        // log.info(rep+element1);
        Reporter.log(rep + "****-****" + element1);

    }

    public static void takescreenShot(WebDriver driver, String filename) throws Exception {
        Date d = new Date();
        String TimeStamp = d.toString().replace(":", "_").replace(" ", "_");
        // DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        // Date date = new Date();
        // String TimeStamp = dateFormat.format(date);
        // File files = new File(filename);

        File folder = new File("D:/Office/LoveWithOutReason/src/LoveWithoutReason/screenshot/");
        String containsName = filename;
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.getName().contains(containsName)) {
                if (file.delete()) {
                    System.out.println(file.getName() + " deleted!");
                } else {
                    System.out.println("Failed to delete " + file.getName());
                }
            }
        }
        String srcfiles = "D:/Office/LoveWithOutReason/src/LoveWithoutReason/screenshot/" + " - " + containsName + "_"
                + TimeStamp + ".png";

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        // File DestFile = new File(srcfiles);

        // FileUtils.copyFile(SrcFile, DestFile);
    }

    // public static String timestamp() {
    // return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    // }
    public static void assertion(String Expectedvalue, String Actualvalue) {
        Assert.assertEquals(Actualvalue, Expectedvalue);

    }

    public static void repscreen(WebDriver driver, WebElement element1, String rep, String actual, String expected,
            String filesrc) throws Exception {
        logFiles(rep, element1);
        getReport(rep, element1);
        assertion(actual, expected);
        // takescreenShot(driver, filesrc);

    }

    public static void logrepscreen1(WebDriver driver, WebElement element, String rep, String log) throws Exception {
        logFiles(rep, element);
        getReport(rep, element);
        takescreenShot(driver, log);
    }

    public static void logAndReport(WebElement element2, String rep) throws FileNotFoundException, IOException {
        logFiles(rep, element2);
        getReport(rep, element2);
    }

    public static void logandrepscreen(WebDriver driver, WebElement element1, String string, String locator,
            String locator2) {
        // TODO Auto-generated method stub

    }

}
