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


public class TripadvisorPage extends ProjectMethods{
	
	public TripadvisorPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Clicking Home Search Box
	@FindBy(xpath = "//span[text()='Search']")WebElement eleHomeSearchBox;
	public TripadvisorPage clickHomePageSearchbtn() {
		click(eleHomeSearchBox);
		return this;
	}
	
	//Entering "Club Mahindra" in the Prompt window search Text Box
	@FindBy(xpath = "//div[text()='Search']")WebElement eleSearchBtn;
	public TripadvisorPage typeHotelName(String data) {
		type(eleSearchBtn, data);
	    return this;
	}
	
	//Clicking Search button in the Prompt window
	@FindBy(xpath = "//input[@placeholder='Search Tripadvisor']")WebElement eleSearchBox;
	public TripAdvResultPage clickSearchbtn() {
		click(eleSearchBox);
		switchToWindow(1);
		return new TripAdvResultPage();
	}
		
	
	
		
}
