package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TripadvisorPage;
import pages.TripAdvResultPage;
import pages.TripAdvHotelPage;
import pages.TripAdvHotelReviewPage;
import wdMethods.ProjectMethods;

public class TC007_TripAdvisor extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC007_TripAdvisor";
		testDescription = "Writing Review of the Hotel";
		testNodes = "DuplicateLead";
		authors ="Amarnath";
		category="smoke";
		dataSheetName = "TC007_TripAdvisor";
		
	}
	
	@Test(dataProvider="fetchData")
	public void submitReview (String hotelName,String firstHotel,String reviewTitle,String reviewDetails) {
		new TripadvisorPage().typeHotelName(hotelName).clickHomePageSearchbtn();
		new TripAdvResultPage()
		.clickFirstHotel(firstHotel)
		.clickWriteReviewBtn()		
		.clickOverallRatingBubble()
		.typeTitleReview(reviewTitle)
		.typeReview(reviewDetails)
		.verifyHotelRatings()
		.clickServiceRatingBubble()
		.clickCleanRatingBubble()
		.clickValueRatingBubble()
		.clickCheckBox();
		
	}


}
