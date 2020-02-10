package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AmazonResultPage extends ProjectMethods {

	public AmazonResultPage() {
		PageFactory.initElements(driver, this);
	} 
		
	@FindBy(xpath="//a[@class='a-link-normal a-text-normal']//span)[1]") WebElement eleVerifyPhone;
	public String verifyPhoneName() {
	String OutPhoneName= getText(eleVerifyPhone);
	verifyExactText(eleVerifyPhone, OutPhoneName);
	return OutPhoneName;
	
	  }	
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]") WebElement elePhonePrice;
	public String getPhonePrice() {
	String phonePrice = getText(elePhonePrice);
	verifyExactText(elePhonePrice, phonePrice);
	return phonePrice;
	
	  }	
	
	
	
}
