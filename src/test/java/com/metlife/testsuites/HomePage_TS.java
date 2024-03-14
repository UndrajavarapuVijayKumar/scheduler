package com.metlife.testsuites;


import com.metlife.listeners.ReRunAutomationScripts;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import java.io.IOException;

import static com.metlife.pages.HomePage.*;
import static com.metlife.pages.LoginPage.*;
import static com.metlife.utils.ReadXlsxData.StaticIndexesCellValue;
import static com.metlife.utils.WebDriver_Utils.*;
import static com.metlife.utils.jsExcutor_util.clickElementJs;
import static com.metlife.utils.jsExcutor_util.refreshBrowserJs;

@Listeners(com.metlife.listeners.Testlistener.class)
public class HomePage_TS {
    @Test(priority = -1)
    public static void TC_008(){
        refreshBrowserJs();
        try {
            click(SwitchToLightning_btn);
            System.out.println("switching to Lightning experience!");
        } catch (Exception e) {
            System.out.println("Lightning experience is directly launching!");
        }
    }
    @Test(priority = 0)
    public static void TC_009() throws InterruptedException {
        click(Hamurger_btn);
        click(viewAll);
    }
    @Test(priority = 1)
    public static void TC_010() throws InterruptedException {
        refreshBrowserJs();
        click(searchBox_field);
        try {
            type(searchBox_field, "scheduler");
        }catch (Exception e){
            type(searchBox_field,"sc");
        }
        click(Scheduler);
    }
    @Test(priority = 2)
    public static void TC_011() throws InterruptedException {
        click(ScheduleServiceAppoitnment);
    }
    @Test(priority = 3)
    public static void TC_013() throws InterruptedException {
        click(parentRecord);
        type(parentRecord,"Vijay");
        click(Next_SelectServiceResources);
        //Assertion
    }

    @Test(priority = 4)
    public static void TC_012() throws InterruptedException {
        click(parentRecord);
        /*try {
            // Wait until the element is visible and interactable
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(Select_Ajay));

            // Perform actions on the element
            button.click();
        } catch (ElementNotInteractableException e) {
            System.out.println("Element not interactable: " + e.getMessage());
        }*/
        type(parentRecord,"Ajay");
        click(Select_Ajay);
        click(Next_SelectServiceResources);
    }
    @Test(enabled = false)
    public static void TC_015() throws InterruptedException{
        click(Next_WorkTypeGroup);
        //Assertion
    }

    @Test(priority = 6)
    public static void TC_014() throws InterruptedException, IOException {
        clickElementJs(WorkType_GeneralConsultant);
        click(Next_WorkTypeGroup);

    }
    @Test(priority = 7,retryAnalyzer = ReRunAutomationScripts.class)
    public static void TC_016() throws InterruptedException, IOException {
        clickElementJs(VideoCall_appointmentType);
        clickElementJs(Next_AppointmentType);

    }
    @Test(priority = 8,retryAnalyzer = ReRunAutomationScripts.class)
    public static void TC_017() throws InterruptedException, IOException {
        click(Next_ServiceTerritory);
        //blocker
        //Assertion
        HardAssert("Select a service territory.",Validate_ErrorMessage);
    }

    @BeforeClass
    public static void initilizing() throws IOException, InvalidFormatException, InterruptedException {
        init("gc");
        launchBrowser("https://d5g00000kmznieax-dev-ed.develop.lightning.force.com/");
        type(username,StaticIndexesCellValue(8,0));
        type(password,StaticIndexesCellValue(8,1));
        click(login_btn);
    }
    @AfterClass
    public static void TearDown(){
        driver.quit();
    }
}
