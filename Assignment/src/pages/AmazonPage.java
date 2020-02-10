package pages;

import org.openqa.selenium.*;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
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

public class AmazonPage extends ProjectMethods {
	
	public AmazonPage() {
		PageFactory.initElements(driver, this);
	}

	// Type iphone XR 64 GB Yellow in search box
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")WebElement eleSearchBox;
	public String typePhone(String data) {
		type(eleSearchBox, data);	
		String amnPhoneName = getText(eleSearchBox);
	    return amnPhoneName;
		
	}
	
	
	//Get Phone name entered text in the search field
	@FindBy(xpath ="//input[@id='twotabsearchtextbox']") WebElement eleSearchBox1;
	public String getPhoneName() {
	//WebElement eleLkUp = locateElement("xpath","//a[@class='linktext']");
	    String amnPhoneName1 = getText(eleSearchBox1);
	    return amnPhoneName1;
	  }	

	
	@FindBy(xpath = "//input[@type='submit']")WebElement eleSearchBtn;
	public AmazonResultPage clickSearchbtn() {
		click(eleSearchBtn);
		return new AmazonResultPage();
	}
	
	
	
	
	

}
