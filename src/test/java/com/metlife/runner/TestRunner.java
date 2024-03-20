/*
 *Created By: Undrajavarapu Vijay Kumar
 *Project: Scheduler_Capstone
 *
 */


package com.metlife.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/com/metlife/Features/scheduler.feature"},
        glue = {"com.metlife.steps"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
