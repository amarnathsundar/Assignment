package pages;

import org.openqa.selenium.support.PageFactory;
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

public class TripAdvHotelPage extends ProjectMethods {

	public TripAdvHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ui_button primary']")WebElement lnkWriteReview;
	public TripAdvHotelReviewPage clickWriteReviewBtn() {
		click(lnkWriteReview);
		switchToWindow(1);
		return new TripAdvHotelReviewPage();

	}
	

}
