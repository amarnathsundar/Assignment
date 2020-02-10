package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AmazonPage;
import pages.AmazonResultPage;
import pages.FindLeadsPopupPage;
import pages.FlipkartPage;
import pages.FlipkartResultPage;

import wdMethods.ProjectMethods;

public class TC006_AmazonFlipkart extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC006_AmazonFlipkart";
		testDescription = "Comparing the Phone Price in Amazon and Flipkart";
		testNodes = "DuplicateLead";
		authors ="Amarnath";
		category="smoke";
		dataSheetName = "TC006_AmazonFlipkart";
		
	}
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String amnPhoneName,String fkPhoneName) {
		
		new AmazonPage().typePhone(amnPhoneName).clickSearchbtn();
		String amnPhonePrice = new AmazonResultPage().verifyPhoneName().getPhonePrice();
		
		new FlipkartPage().typePhoneName(fkPhoneName).clickSearchProducts();
		String fkPhonePrice = new FlipkartResultPage().verifyFkPhoneName().getFkPhonePrice();	
		
		if (amnPhonePrice>fkPhonePrice) {
			System.out.println("Amazon Phone price is Costly");
		} else { System.out.println("Amazon Phone price is Costly");

		}
		
	}
	
	
	
	
	
	
}
