package automationtestproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AutoTraderHomePage {

	private Select selector;
	
	@FindBy (css = "#js-header-nav > ul > li.header__nav-listing.header__nav-my-at > div > a")
	private WebElement signInButton;
	
	public void clickSignInButton() {
		signInButton.click();
	}

	@FindBy(id = "postcode")
	private WebElement postcodeTextbox;
	
	public void enterTextIntoPostcode(String text) {
		postcodeTextbox.sendKeys(text);
	}
	
	@FindBy(id = "radius")
	private WebElement radiusSelector;
	
	public void selectRadius(String value)
	{
		selector = new Select(radiusSelector);
		selector.selectByValue(value);
	}
	
	@FindBy(id = "searchVehiclesMake")
	private WebElement makeSelector;
	
	public void selectMake(String value) {
		selector = new Select(makeSelector);
		selector.selectByValue(value);
	}
	
	@FindBy(id = "searchVehiclesModel")
	private WebElement modelSelector;
	
	public void selectModel(String value) {
		selector = new Select(makeSelector);
		selector.selectByValue(value);
	}
	
	@FindBy(id = "searchVehiclesPriceTo")
	private WebElement priceSelector;
	
	public void selectMaxPrice(String value) {
		selector = new Select(priceSelector);
		selector.selectByValue(value);
	}
	
	@FindBy(id = "searchVehiclesCount")
	private WebElement searchCarsButton;
	
	public void clickSearchCars() {
		searchCarsButton.click();
	}
	
	@FindBy(id = "js-more-options")
	private WebElement searchAdvancedButton;
	
	public void clickAdvancedSearch() {
		searchAdvancedButton.click();
	}

}

