/*
 *Created By: Undrajavarapu Vijay Kumar
 *Project: Scheduler_Capstone
 *
 */


package com.metlife.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;

import java.io.IOException;

import static com.metlife.pages.LoginPage.*;
import static com.metlife.utils.ReadXlsxData.StaticIndexesCellValue;
import static com.metlife.utils.WebDriver_Utils.*;

//@Listeners(com.metlife.listeners.Testlistener.class)
public class SchedulerDefinition {
    @Given("user have a browser with salesforce application")
    public void user_have_a_browser_with_salesforce_application() {
        init("gc");
        launchBrowser("https://d5g00000kmznieax-dev-ed.develop.lightning.force.com/");

    }
    @When("user gave username")
    public void user_gave_username() throws IOException, InvalidFormatException {

        type(username,StaticIndexesCellValue(8,0));
    }
    @When("user gave password")
    public void user_gave_password() throws IOException, InvalidFormatException {

        type(password,StaticIndexesCellValue(8,1));
    }
    @When("user clicked on login")
    public void user_clicked_on_login() throws InterruptedException {
            click(login_btn);

    }
    @Then("user should able to login")
    public void user_should_able_to_login() {

    }

}
