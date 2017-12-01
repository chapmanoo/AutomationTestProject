package automationtestproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AutoTraderAdvancedSearchPage {

	private Select selector;

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__left-search-section > div:nth-child(1) > div.select-style-left.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement yearSelector;

	public void selectYear(String value) {
		selector = new Select(yearSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__left-search-section > div:nth-child(1) > div.select-style.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement milageSelector;

	public void selectMilage(String value) {
		selector = new Select(milageSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__right-search-section > div:nth-child(1) > div.select-style-left.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement fuelSelector;

	public void selectFuel(String value) {
		selector = new Select(fuelSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__right-search-section > div:nth-child(1) > div.select-style.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement engineSizeSelector;

	public void selectEngineSize(String value) {
		selector = new Select(engineSizeSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__right-search-section > div:nth-child(1) > div.select-style.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement mpgSelector;

	public void selectMPG(String value) {
		selector = new Select(mpgSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__left-search-section > div:nth-child(2) > div.select-style.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement accelerationSelector;

	public void selectAcceleration(String value) {
		selector = new Select(accelerationSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__right-search-section > div:nth-child(2) > div.select-style-left.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement gearboxSelector;

	public void selectGearbox(String value) {
		selector = new Select(gearboxSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__right-search-section > div:nth-child(2) > div.select-style.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement emissionSelector;

	public void selectEmmisions(String value) {
		selector = new Select(emissionSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__left-search-section > div:nth-child(3) > div.select-style-left.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement minDoorsSelector;

	public void selectMinDoors(String value) {
		selector = new Select(minDoorsSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__left-search-section > div:nth-child(3) > div.select-style.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement minSeatsSelector;

	public void selectMinSeats(String value) {
		selector = new Select(minSeatsSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__right-search-section > div:nth-child(3) > div.select-style-left.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement maxDoorsSelector;

	public void selectMaxSeats(String value) {
		selector = new Select(maxDoorsSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__right-search-section > div:nth-child(3) > div.select-style.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement insuranceGroupSelector;

	public void selectInsuranceGroup(String value) {
		selector = new Select(insuranceGroupSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__left-search-section > div:nth-child(4) > div.select-style-left.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement taxSelector;

	public void selectTax(String value) {
		selector = new Select(taxSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__left-search-section > div:nth-child(4) > div.select-style.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement colourSelector;

	public void selectColour(String value) {
		selector = new Select(colourSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__right-search-section > div:nth-child(4) > div.select-style-left.dropdown-image-dual-container.arrow-down-with-grey.clear-selection > select")
	private WebElement privateOrTradeSelector;

	public void selectPrivateOrTrade(String value) {
		selector = new Select(privateOrTradeSelector);
		selector.selectByValue(value);
	}

	@FindBy(css = "#js-known-search-advanced > div.known-search-container__left-search-section > input")
	private WebElement additionalKeyword;

	public void enterTextIntoKeyword(String text) {
		additionalKeyword.sendKeys(text);
	}
	
	@FindBy (css = "#js-known-search-advanced > div.known-search-container__quick-search-section > button")
	private WebElement searchButton;
	
	public void clickSearch() {
		searchButton.click();
	}
}
