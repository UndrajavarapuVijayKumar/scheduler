package com.metlife.testsuites;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.metlife.data.ExcelUtil_Reader;
import org.testng.annotations.*;

import java.io.IOException;

import static com.metlife.pages.LoginPage.*;
import static com.metlife.reports.Reports_Setup.extent;
import static com.metlife.reports.Reports_Setup.ssreports;
import static com.metlife.utils.WebDriver_Utils.*;

public class LoginPage_TS {

    @Test(dataProviderClass = ExcelUtil_Reader.class,dataProvider = "validateData")
    public void Login(String UserName_Excel, String Password_Excel) throws InterruptedException, IOException {
        ssreports();
        type(username,UserName_Excel);
        //type(username,StaticIndexesCellValue(2,1));
        type(password,Password_Excel);
        click(login_btn);
//        HardAssert(ErrorMessage,login_error);
        /*try {
            SoftAssert(ErrorMessage,login_error);
        }catch (Exception e){
            System.out.println("No error message, Logging with valid credentials");
        }
*/

        ExtentTest LoginFunctionality = extent.createTest("LoginPage_TS");
        LoginFunctionality.log(Status.PASS, "This is pass");
        extent.flush();
    }
    @BeforeClass
    public static void initilizing(){
        init("gc");
    }
    @BeforeMethod
    public static void browserLaunch(){
        launchBrowser("https://d5g00000kmznieax-dev-ed.develop.lightning.force.com/");
    }
    @AfterClass
    public static void TearDown(){
        driver.quit();
    }



}
