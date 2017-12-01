package automationtestproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AutoTraderTests {

	private List<String> inputList;
	private WebDriver webDriver;
	private SpreadSheetReader spreadSheetReader;
	private static ExtentReports report;
	private ScreenShot screenShot;
	private AutoTraderHomePage autotraderHome;

	@BeforeClass
	public static void init() {
		report = new ExtentReports();
		String fileName = "AutoTrader - Test Results" + ".html";
		String filePath = System.getProperty("user.dir") + File.separatorChar + fileName;
		report.attachReporter(new ExtentHtmlReporter(filePath));

	}

	@Before
	public void setUp() {
		spreadSheetReader = new SpreadSheetReader("inputData.xlsx");
		inputList = new ArrayList<String>();
		webDriver = new ChromeDriver();
		screenShot = new ScreenShot();

		autotraderHome = PageFactory.initElements(webDriver, AutoTraderHomePage.class);

	}

	@After
	public void tearDown() {
		webDriver.quit();
	}

	@AfterClass
	public static void cleanUp() {
		report.flush();
	}

	@Test
	public void fullSearchTest() {
		ExtentTest test = report.createTest("Full conditions search");
		test.log(Status.INFO, "Full Conditions search starting");
		inputList = spreadSheetReader.readRow(0, "general");
		
		String url = inputList.get(1);
		
		test.log(Status.INFO, "navigating to : " + url);
		webDriver.navigate().to(url);
		
		try {
			String sShot1 = screenShot.take(webDriver, "Homepage");
			test.addScreenCaptureFromPath(sShot1);
			test.log(Status.INFO, "ScreenShot of homepage before any manipulation");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		inputList = spreadSheetReader.readRow(1, "testData");
		
		String postcode = inputList.get(1);
		String make = inputList.get(2);
		//String model = inputList.get(3);
		String maxPrice =  inputList.get(4).substring(0, inputList.get(4).length() - 2);
		String yearFrom  = inputList.get(5).substring(0, inputList.get(5).length() - 2);
		String milage = inputList.get(6).substring(0, inputList.get(6).length() - 2);
		String fuelType = inputList.get(7);
		String engineSize =inputList.get(8).substring(0, inputList.get(8).length() - 1);;
		//String fuelConsumption = inputList.get(9);
		String gearboxType = inputList.get(10);
		String co2Emissions = inputList.get(11);
		String minNumberOfDoors = inputList.get(12).substring(0, inputList.get(12).length() - 2);
		String minSeats = inputList.get(13).substring(0, inputList.get(13).length() - 2);
		String maxSeats = inputList.get(14).substring(0, inputList.get(14).length() - 2);
		String insuranceGroup = inputList.get(15);
		String annualTax = inputList.get(16);
		String colour = inputList.get(17);
		String privateOrTraders = inputList.get(18);
		String additionalKeyword = inputList.get(19);
		String radius = inputList.get(20).substring(0, inputList.get(20).length() - 2);
		
		
		autotraderHome.enterTextIntoPostcode(postcode);
		test.log(Status.DEBUG, "Postcode: " + postcode);
		autotraderHome.selectRadius(radius);
		test.log(Status.DEBUG, "Radius: " + radius);
		autotraderHome.selectMake(make);
		test.log(Status.DEBUG, "Make: " + make);
		
		//autotraderHome.selectModel(model);
		//test.log(Status.DEBUG, "Model: " + model);
		
		autotraderHome.selectMaxPrice(maxPrice);
		test.log(Status.DEBUG, "Max price: " + maxPrice);
		
		
		test.log(Status.INFO, "Advanced search button clicked after all data input");
		autotraderHome.clickAdvancedSearch();
		
		AutoTraderAdvancedSearchPage autotraderAdvanced = PageFactory.initElements(webDriver, AutoTraderAdvancedSearchPage.class);
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		autotraderAdvanced.selectYear(yearFrom);
		autotraderAdvanced.selectMilage(milage);
		autotraderAdvanced.selectFuel(fuelType);
		autotraderAdvanced.selectEngineSize(engineSize);
		//autotraderAdvanced.selectMPG(fuelConsumption);
		autotraderAdvanced.selectGearbox(gearboxType);
		autotraderAdvanced.selectEmmisions(co2Emissions);
		autotraderAdvanced.selectMinDoors(minNumberOfDoors);
		autotraderAdvanced.selectMinSeats(minSeats);
		autotraderAdvanced.selectMaxSeats(maxSeats);
		autotraderAdvanced.selectInsuranceGroup(insuranceGroup);
		autotraderAdvanced.selectTax(annualTax);
		if (colour != "");
		{
		autotraderAdvanced.selectColour(colour);
		}
		if (privateOrTraders!= "");
		{
		autotraderAdvanced.selectPrivateOrTrade(privateOrTraders);
		}
		if (!additionalKeyword.equals(""))
		{
			autotraderAdvanced.enterTextIntoKeyword(additionalKeyword);
		}
		
		test.log(Status.INFO, "All info added to search criteria");
		
		test.log(Status.INFO, "Clicked search");
		autotraderAdvanced.clickSearch();
	}
}
