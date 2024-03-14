package com.metlife.reports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.metlife.utils.WebDriver_Utils;

import java.io.IOException;
import java.util.Date;

public class Reports_Setup extends WebDriver_Utils {

/*

    public static void main(String[] args) throws IOException {
        ssreports(); // Call ssreports() instead of TestMethod()
        TestMethod(); // Now you can call TestMethod() after initializing extent
    }
*/

    public static ExtentReports ssreports() throws IOException {
        Date currentDate = new Date();
        String ssfilename=currentDate.toString().replace(":", " ");
        String reportPath = "C:\\Users\\ukumar35\\IdeaProjects\\Scheduler_Capstone\\src\\test\\Scheduler_reports\\"+"scheduler.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(spark);

        spark.config().setTheme(Theme.STANDARD);
        spark.config().setReportName("Scheduler Report");
        spark.config().setDocumentTitle("SalesforceScheduler Report");

        return extent;
    }

   /* public static void TestMethod() {
        ExtentTest test1 = extent.createTest("Test1");
        test1.log(Status.FAIL, "This is pass");
        extent.flush(); // Move flush here to ensure the report is generated after logging
    }*/
}
