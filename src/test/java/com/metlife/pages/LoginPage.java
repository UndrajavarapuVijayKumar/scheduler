package com.metlife.pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static By username = By.id("username");
    public static By password = By.id("password");
    public static By login_btn = By.name("Login");
    public static By login_error = By.xpath("//div[@class='loginError']");
    public static String ErrorMessage = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

}
