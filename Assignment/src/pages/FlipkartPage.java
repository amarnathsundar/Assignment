package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;


public class FlipkartPage extends ProjectMethods {

	public FlipkartPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Type iphone XR 64 GB Yellow in search box
	@FindBy(xpath="//input[@title='Search for products, brands and more']")WebElement eleFkSearchBox;
	public String typePhoneName(String data) {		
		type(eleFkSearchBox, data); 
		String IpPhoneNameFk = getText(eleFkSearchBox);
		return IpPhoneNameFk;
	}	
	
	@FindBy(xpath="//button[@type='submit']") WebElement btnFkSearch;
	public FlipkartResultPage clickSearchProducts() {
		click(btnFkSearch);
		return new FlipkartResultPage();
	}	
	
	
}
