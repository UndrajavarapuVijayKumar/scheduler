/*
 *Author: Undrajavarapu Vijay Kumar
 *Project: Capstone project
 *
 */

package com.metlife.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;

public class WebDriver_Utils {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest eXtTest;
    public static WebDriverWait wait;
    public static FileInputStream fis;
    /*public static Properties p;

    public static void init() throws IOException {
        fis = new FileInputStream("C:\\Users\\lenovo\\Downloads\\picocontainer\\src\\test\\resources\\Features\\Data.properties");
        p = new Properties();
        p.load(fis);
    }*/
    public static void init(String browser){
        switch (browser){
            case "ff": case "firefox":
                driver = new FirefoxDriver();
                break;
            case "gc": case  "chrome":
                driver = new ChromeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
    }
    public static void launchBrowser(String URL){
//        driver.get(String.valueOf(p.getProperty("ixigo").equals(URL)));
        driver.navigate().to(URL);
    }
    public static void type(By locator, String value){
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        driver.findElement(locator).sendKeys(value);
//        we.clear();

    }
    public static void click(By locator) throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        driver.findElement(locator).click();
        Thread.sleep(3000);
    }
    public static void HardAssert(String ErrorValue, By ActualValue){
        Assert.assertEquals(ErrorValue,driver.findElement(ActualValue).getText());
    }
    public static String gettext(By locator){
        String text= driver.findElement(locator).getText();
        return  text;
    }
    public static void clickUsingActions(By locator) throws Exception {
        try{
            Actions actions = new Actions(driver);
            WebElement webButton =driver.findElement(locator);

        }catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
    public void selectClass( WebElement parentElement, String elementToSelect) throws Exception {
        try {
            Select dropdown = new Select(parentElement);
            dropdown.selectByVisibleText(elementToSelect);
//            Extent_Reporting.Log_Pass_Screenshot("selectClass ", "Selected " + elementToSelect + "in " + parent, driver);
        } catch (Exception e) {
//            Extent_Reporting.Log_Fail("selectClass", "Failed to Select" + elementName + driver);
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
    public void selectCheckBox( By locator) throws Exception {
        try {
            WebElement checkBox = driver.findElement(locator);
            checkBox.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    public void selectRadio(By locator) throws Exception {
        try {
            WebElement radioButton = driver.findElement(locator);
            radioButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
    public String decryptPassword(String encodedString) throws Exception {
        try {
            byte[] decodedString = Base64.getDecoder().decode(encodedString);
            String decodedStringValue = new String(decodedString);
            return decodedStringValue;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public static String screenshot() throws IOException {
        Date currentDate = new Date();
        String ssfilename=currentDate.toString().replace(":", " ");
        File f1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f1,new File("C:\\Users\\ukumar35\\IdeaProjects\\Scheduler_Capstone\\src\\test\\Screenshots\\"+ssfilename+".png")  );
        return ssfilename;
    }
    public static void SoftAssert(String Actual, By Expected){
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Actual,driver.findElement(Expected).getText());
    }
    public static String captureScreenshot(String Filename){
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\ukumar35\\IdeaProjects\\Scheduler_Capstone\\src\\test\\Screenshots\\"+Filename);
        try{
            FileUtils.copyFile(srcFile,destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Screenshot saved sucessfully!");
        return destFile.getAbsolutePath();
    }
    public static String captureScreenshot(){
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        String Base64Code = takesScreenshot.getScreenshotAs(OutputType.BASE64);

        System.out.println("Screenshot saved sucessfully!");
        return Base64Code;
    }

}
//"C:\\Users\\ukumar35\\IdeaProjects\\Scheduler_Capstone\\src\\test\\Scheduler_Screenshots\\"+"scheduler: "+ssfilename+ ".png"