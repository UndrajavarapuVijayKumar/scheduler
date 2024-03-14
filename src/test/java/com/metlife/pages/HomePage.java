package com.metlife.pages;

import org.openqa.selenium.By;

public class HomePage {
    public static By SwitchToLightning_btn =By.xpath("//a[@class='switch-to-lightning']");

    public static By Hamurger_btn =By.xpath("//div[@class='slds-icon-waffle']");
    public static By viewAll = By.xpath("(//button[@class='slds-button'])[2]");
    public static By searchBox_field =By.xpath("//input[@class='slds-input']");
    public static By Scheduler =By.xpath("(//p[@class='slds-truncate'])[1]");
    public static By ScheduleServiceAppoitnment = By.xpath("//button[@title='Schedule a Service Appointment']");
    public static By parentRecord = By.xpath("//input[@class='slds-combobox__input slds-input']");
    public static By Select_Ajay = By.xpath("//span[@title='Ajay']");
    public static By Next_SelectServiceResources = By.xpath("(//*[contains(text(),'Next')])[2]");
    public static By WorkType_GeneralConsultant= By.xpath("//*[contains(text(),'General Consult')]");
    public static By generalConsultant = By.xpath("//span[@title='General Consult']");
    public static By Next_WorkTypeGroup = By.xpath("(//*[contains(text(),'Next')])[2]");
    public static By VideoCall_appointmentType=By.xpath("//*[contains(text(),'In a Video Call')]");
    public static By Next_AppointmentType = By.xpath("(//*[contains(text(),'Next')])[2]");
    public static By Next_ServiceTerritory = By.xpath("(//*[contains(text(),'Next')])[2]");
    public static By Validate_ErrorMessage =By.xpath("//ul[@class='errorsList']");



}
