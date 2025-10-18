package PurchaseRecords;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Login.GoogleAuthenticatorTC;
import Warehouses.Warehouses;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseRecordTC {
	public static WebDriver driver;

	public SoftAssert softassert = new SoftAssert();

	Random rand = new Random();
	int randomNumber = rand.nextInt(100000);

	public String testString = "Test" + randomNumber;

	public String testData = "M" + randomNumber;

	public String testData2 = "Z" + randomNumber;

	public static WebDriver getDriver() {

		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}

	@BeforeTest
	public void preTest() throws InterruptedException {
		driver = GoogleAuthenticatorTC.getDriver();
		driver.get("");
		driver.manage().window().maximize();

		Warehouses warehouses = new Warehouses(driver);
		warehouses.preTest();

		driver.navigate().to("");
	}

	@Test(priority = 1)
	public void addNewPurchaseRecord() {
		PurchaseRecord purchaseRecord = new PurchaseRecord(driver);

		purchaseRecord.waitAddNewPurchaseRecordButton();
		purchaseRecord.addNewPurchaseRecordButton.click();

		purchaseRecord.waitProductIdField();
		purchaseRecord.productIdField.click();

		Actions actions = new Actions(driver);
		actions.moveToElement(purchaseRecord.productIdField).sendKeys(Keys.ENTER).build().perform();

		purchaseRecord.waitManufacturerField();
		purchaseRecord.manufacturerField.sendKeys(testString);

		purchaseRecord.waitManufacturerYearField();
		purchaseRecord.manufacturerYearField.sendKeys("2009");

		purchaseRecord.waitModelField();
		purchaseRecord.modelField.sendKeys("2010");

		purchaseRecord.waitDescriptionField();
		purchaseRecord.descriptionField.sendKeys("Test Description");

		purchaseRecord.waitPricePerUnitField();
		purchaseRecord.pricePerUnitField.sendKeys("1000");

		purchaseRecord.waitQuantityField();
		purchaseRecord.quantityField.sendKeys("1 ");

		purchaseRecord.waitInputSerialRecordType();
		purchaseRecord.inputSerialRecordType.click();

		actions.moveToElement(purchaseRecord.inputSerialRecordType).sendKeys(Keys.ENTER).build().perform();

		purchaseRecord.waitCreateButton();
		purchaseRecord.createButton.click();

		purchaseRecord.waitToasterMessage();
		String actualResult = purchaseRecord.toasterMessage.getText();
		String expectedResult = "Add purchase record succeed.";

		softassert.assertEquals(actualResult, expectedResult);
		softassert.assertAll();

	}

	@Test(priority = 2)
	public void editRecords() throws InterruptedException {
		PurchaseRecord purchaseRecord = new PurchaseRecord(driver);

		purchaseRecord.waitEditRecordsButton();
		purchaseRecord.editRecordsButton.click();

		purchaseRecord.waitCompanySerialNumberField1();
		purchaseRecord.companySerialNumberField1.sendKeys(testString);

		purchaseRecord.waitSerialNumberField1();
		purchaseRecord.serialNumberField1.sendKeys(testData);

		purchaseRecord.waitMacAddressField1();
		purchaseRecord.macAddressField1.sendKeys(testData2);

		purchaseRecord.waitEditRecordsButton();
		purchaseRecord.editRecordsButton.click();

		Thread.sleep(1000);

		purchaseRecord.waitToasterMsgInEditRecords();
		String actualResult = purchaseRecord.toasterMsgInEditRecords.getText();
		String expectedResult = "Update purchase records serial records succeed.";

		softassert.assertEquals(actualResult, expectedResult);
		softassert.assertAll();
	}

	@Test(priority = 3)
	public void UpdatePurchaseRecord() throws InterruptedException {
		PurchaseRecord purchaseRecord = new PurchaseRecord(driver);
		purchaseRecord.waitBackButton();
		purchaseRecord.backButton.click();

		purchaseRecord.waitSearchField();
		purchaseRecord.searchField.sendKeys(testString);

		purchaseRecord.waitActionButton();
		purchaseRecord.actionButton.click();

		Actions action = new Actions(driver);

		action.moveToElement(purchaseRecord.actionButton).sendKeys(Keys.ARROW_DOWN).build().perform();
		action.moveToElement(purchaseRecord.actionButton).sendKeys(Keys.ENTER).build().perform();

		purchaseRecord.waitDescriptionField();

		action.doubleClick(purchaseRecord.descriptionField).build().perform();
		action.moveToElement(purchaseRecord.actionButton).sendKeys(Keys.BACK_SPACE).build().perform();

		purchaseRecord.descriptionField.sendKeys("123");

		purchaseRecord.waitSaveButton();
		purchaseRecord.saveButton.click();

		Thread.sleep(1000);

		purchaseRecord.waitUpdatePurchaseRecordToasterMsg();
		String actualResult = purchaseRecord.updatePurchaseRecordToasterMsg.getText();
		String expectedResul = "Update purchase record succeed.";

		softassert.assertEquals(actualResult, expectedResul);
		softassert.assertAll();

	}

}
