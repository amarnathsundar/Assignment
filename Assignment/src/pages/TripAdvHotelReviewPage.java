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
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TripAdvHotelReviewPage extends ProjectMethods {

	public TripAdvHotelReviewPage() {
		PageFactory.initElements(driver, this);
	}

	// Mouse hover to the overall rating stars and clicking the 5th Bubble
	@FindBy(xpath = "(//span[contains(@class,'ui_bubble_rating fl bubble_50')])[1]")
	WebElement eleOverallRating;

	public TripAdvHotelReviewPage clickOverallRatingBubble() {
		click(eleOverallRating);
		return this;
	}

	// Enter text in Title of your review
	@FindBy(xpath = "//input[@class='text']")
	WebElement eleTitleReview;

	public TripAdvHotelReviewPage typeTitleReview(String data) {
		type(eleTitleReview, data);
		return this;
	}

	// Enter text in Your Review text area
	@FindBy(xpath = "//textarea[@class='text expandTextarea']")
	WebElement eleReviewText;

	public TripAdvHotelReviewPage typeReview(String data) {
		type(eleReviewText, data);
		return this;
	}

	// Verify whether the Hotel ratings is available or not
	@FindBy(xpath = "(//div[@class='labelHeader'])[3]")
	WebElement eleHotelRatings;

	public TripAdvHotelReviewPage verifyHotelRatings() {
		verifyDisplayed(eleHotelRatings);
		return this;
	}

	// Mouse hover to the Service rating Bubble and clicking the 5th Bubble
	@FindBy(xpath = "//span[@data-name='Service']")
	WebElement eleServiceRating;

	public TripAdvHotelReviewPage clickServiceRatingBubble() {
		click(eleServiceRating);
		return this;
	}

	// Mouse hover to the Cleanliness rating Bubble and clicking the 5th Bubble
	@FindBy(xpath = "//span[@data-name='Cleanliness']")WebElement eleCleanRating;
	public TripAdvHotelReviewPage clickCleanRatingBubble() {
		click(eleCleanRating);
		return this;
	}
	
	// Mouse hover to the Value rating Bubble and clicking the 5th Bubble
	@FindBy(xpath = "//span[@data-name='Value']")WebElement eleValueRating;
	public TripAdvHotelReviewPage clickValueRatingBubble() {
		click(eleValueRating);
		return this;
	}
	
	// Check box Submit review
	@FindBy(xpath = "//input[@type='checkbox']")WebElement eleCheckBox;
	public TripAdvHotelReviewPage clickCheckBox() {
		click(eleCheckBox);
		return this;
	}
	

}
