package pages;

import org.openqa.selenium.*;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TripAdvResultPage extends ProjectMethods{

	public TripAdvResultPage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "(//div[@class='result-title']//span)[1]")WebElement eleFirstHotel;
	public TripAdvHotelPage clickFirstHotel(String data) {
		click(eleFirstHotel);
		switchToWindow(1);
	    return new TripAdvHotelPage();
	}
	
	
	
	
}
