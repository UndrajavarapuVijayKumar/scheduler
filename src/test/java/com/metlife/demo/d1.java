/*
 *Created By: Undrajavarapu Vijay Kumar
 *Project: Scheduler_Capstone
 *
 */


package com.metlife.demo;

import com.metlife.utils.WebDriver_Utils;
import org.openqa.selenium.By;

import static com.metlife.utils.WebDriver_Utils.*;

public class d1 {
    public static By xp = By.xpath("(//span[@class='header__login-label font-meta-1'])[1]");
    public static void main(String[] args) throws Exception {
        init("gc");
        launchBrowser("https://www.metlife.com/stories/benefits/deductible-vs-out-of-pocket-maximum/#:~:text=Both%20are%20annual%20costs%2C%20meaning,cost%20for%20all%20covered%20services.");
        clickElement(xp);
    }

}
