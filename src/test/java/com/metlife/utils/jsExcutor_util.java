package com.metlife.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jsExcutor_util extends WebDriver_Utils{
    public static void flash(WebElement element) {

        String bgcolor = element.getCssValue("backgroundColor");

        for(int i=0; i<500; i++) {
            changeColor("#000000", element);
            changeColor(bgcolor, element );
        }
    }
    public static void changeColor(String color, WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + color+ " ' ", element);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {

        }
    }
    public static void drawBorder(WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }
    public static String getTitilebyJSEx() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String title = js.executeScript("return document.title;").toString();
        return title;

    }
    public static void clickElementJs(By element) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", driver.findElement(element));
    }
    public static void generateAlert( String message) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("alert('" +message+ "')");
    }
    public static void refreshBrowserJs() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("history.go[0]");
        System.out.println("Page Refresh!");

    }
    public static void ScrollintoView(WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        System.out.println("scroll!");
    }

}
