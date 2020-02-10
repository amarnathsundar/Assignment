package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FlipkartResultPage extends ProjectMethods {

	//Initializing web elements through page factory
	public FlipkartResultPage() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "(//div[@class='col col-7-12']//div)[1]")WebElement eleFkPhoneName;
	public String verifyFkPhoneName() {
		String fkOutPhoneName = getText(eleFkPhoneName);
		verifyExactText(eleFkPhoneName, fkOutPhoneName);
		return fkOutPhoneName;
	}

	@FindBy(xpath = "(//div[@class='_1uv9Cb']//div)[1]")WebElement eleFkPhonePrice;
	public String getFkPhonePrice() {
		String fkPhonePrice = getText(eleFkPhonePrice);
		return fkPhonePrice;
	}
	
}
