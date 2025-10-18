package Kiosk;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CatalogType.CatalogType;
import Login.GoogleAuthenticatorTC;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KioskTC {
	public static WebDriver driver;
	public SoftAssert softassert = new SoftAssert();

	Random rand = new Random();
	int randomNumber = rand.nextInt(10000);

	public String testString = "Testing" + randomNumber;

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
		CatalogType catalogType = new CatalogType(driver);
		catalogType.preTest();

		driver.navigate().to("");

	}

	@Test(priority = 1)
	public void addNewKiosk() throws InterruptedException, AWTException {
		Kiosk kiosk = new Kiosk(driver);
		kiosk.waitAddNewKioskButton();
		kiosk.addNewKioskButton.click();

		kiosk.waitKioskNameField();
		kiosk.kioskNameField.sendKeys(testString);

		kiosk.waitStatusField();
		kiosk.statusField.click();

		Actions action = new Actions(driver);

		action.moveToElement(kiosk.statusField).sendKeys(Keys.ARROW_DOWN).build().perform();
		action.moveToElement(kiosk.statusField).sendKeys(Keys.ENTER).build().perform();

		kiosk.waitAccessLockField();
		kiosk.accessLockField.click();

		action.moveToElement(kiosk.accessLockField).sendKeys(Keys.ARROW_DOWN).build().perform();
		action.moveToElement(kiosk.accessLockField).sendKeys(Keys.ENTER).build().perform();

		kiosk.waitOrderNumber();
		kiosk.orderNumber.sendKeys("20");

		kiosk.waitValidationMsgInOrderNumberField();
		String actualResult = kiosk.validationMsgInOrderNumberField.getText();
		String expectedResult = "Value must be at most 15";

		softassert.assertEquals(actualResult, expectedResult);
		Thread.sleep(1000);

		action.moveToElement(kiosk.orderNumber).sendKeys(Keys.BACK_SPACE).build().perform();
		action.moveToElement(kiosk.orderNumber).sendKeys(Keys.BACK_SPACE).build().perform();

		Thread.sleep(1000);
		kiosk.orderNumber.sendKeys("0");

		String actualResult1 = kiosk.validationMsgInOrderNumberField.getText();
		String expectedResult1 = "Value must be at least 1";

		softassert.assertEquals(actualResult1, expectedResult1);

		action.moveToElement(kiosk.orderNumber).sendKeys(Keys.BACK_SPACE).build().perform();
		kiosk.orderNumber.sendKeys("9");

		kiosk.waitUnitField();
		kiosk.unitField.click();

		action.moveToElement(kiosk.unitField).sendKeys(Keys.ENTER).build().perform();

		kiosk.waitParentUnitField();
		kiosk.parentUnitField.click();

		action.moveToElement(kiosk.parentUnitField).sendKeys(Keys.ENTER).build().perform();

		kiosk.waitItsVIPField();
		kiosk.itsVIPField.click();

		action.moveToElement(kiosk.itsVIPField).sendKeys(Keys.ARROW_DOWN).build().perform();
		action.moveToElement(kiosk.itsVIPField).sendKeys(Keys.ENTER).build().perform();

		kiosk.waitPlanButton();
		kiosk.planButton.click();

		kiosk.waitUploadFileButton();
		kiosk.uploadFileButton.click();

		Robot rb = new Robot();
		Thread.sleep(3000);

		StringSelection str = new StringSelection(
				"C:\\Users\\mahmo\\OneDrive\\Desktop\\uploadFile\\Conditional Branching.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		kiosk.waitConfirmButtonInPopUp();
		kiosk.confirmButtonInPopUp.click();

		kiosk.waitNextButton();
		kiosk.nextButton.click();

		kiosk.waitKioskField();
		kiosk.kioskField.click();

		WebElement inventoryTab = driver.findElement(By.xpath("(//button[@aria-selected])[2]"));
		String actualInventoryTabIsSelected = inventoryTab.getAttribute("aria-selected");
		String expectedInventoryTabIsSelected = "true";

		softassert.assertEquals(actualInventoryTabIsSelected, expectedInventoryTabIsSelected);

		action.moveToElement(kiosk.kioskField).sendKeys(Keys.ENTER).build().perform();

		kiosk.waitNextButtonInInventoryPage();
		kiosk.nextButtonInInventoryPage.click();

		WebElement productsTab = driver.findElement(By.xpath("(//button[@aria-selected])[3]"));
		String actualProductsTabTabIsSelected = productsTab.getAttribute("aria-selected");
		String expectedProductsTabIsSelected = "true";

		softassert.assertEquals(actualProductsTabTabIsSelected, expectedProductsTabIsSelected);

		List<WebElement> productsItems = driver.findElements(By.xpath("//button[@role='switch']"));

		System.out.println(productsItems.size());

		for (int i = 0; i < productsItems.size(); i++) {
			productsItems.get(i).click();
		}

		kiosk.waitNextButtonInProductsPage();
		kiosk.nextButtonInProductsPage.click();

		WebElement displaySettingTab = driver.findElement(By.xpath("(//button[@aria-selected])[4]"));
		String actualDisplaySettingTabTabTabIsSelected = displaySettingTab.getAttribute("aria-selected");
		String expectedDisplaySettingTabTabIsSelected = "true";

		softassert.assertEquals(actualDisplaySettingTabTabTabIsSelected, expectedDisplaySettingTabTabIsSelected);

		kiosk.waitSettingsTemplate();
		kiosk.settingsTemplate.click();

		action.moveToElement(kiosk.settingsTemplate).sendKeys(Keys.ENTER).build().perform();

		kiosk.waitNextButton();
		kiosk.nextButton.click();

		kiosk.waitSaveButton();
		kiosk.saveButton.click();

		kiosk.waitAddKioskSucceed();
		String actualResultAddNewKiosk = kiosk.addKioskSucceed.getText();
		String expectedResultAddNewKiosk = "Add Kiosk succeed.";

		softassert.assertEquals(actualResultAddNewKiosk, expectedResultAddNewKiosk);

		softassert.assertAll();

	}

	@Test(priority = 2)
	public void verifyStatusAndAccessLockAndVIPIcons() {
		Kiosk kiosk = new Kiosk(driver);
		kiosk.waitVipImage();

		Boolean actualVipImage = kiosk.vipImage.isDisplayed();
		Boolean expectedVipImage = true;

		softassert.assertEquals(actualVipImage, expectedVipImage);

		kiosk.waitActiveInActiveStatus();

		String actualStatus = kiosk.activeInActiveStatus.getText();
		String expectedStatus = "Active";

		softassert.assertEquals(actualStatus, expectedStatus);

		kiosk.waitLockedUnlockedStatus();
		String actualLockedUnlockedStatus = kiosk.lockedUnlockedStatus.getText();
		String expectedLockedUnlockedStatus = "Locked";

		softassert.assertEquals(actualLockedUnlockedStatus, expectedLockedUnlockedStatus);

		softassert.assertAll();
	}

	@Test(priority = 3)
	public void searchWithValidData() {

		Kiosk kiosk = new Kiosk(driver);
		driver.navigate().to("");

		kiosk.waitSearchField();
		kiosk.searchField.sendKeys(testString);

		kiosk.waitDetailsButton();
		kiosk.detailsButton.click();

		kiosk.waitEditButton();
		kiosk.editButton.click();

		kiosk.waitOrderNumber();
		kiosk.orderNumber.click();

		Actions action = new Actions(driver);

		action.moveToElement(kiosk.orderNumber).sendKeys(Keys.BACK_SPACE).build().perform();

		kiosk.orderNumber.sendKeys("10");
		
		kiosk.waitSaveButton();
		kiosk.saveButton.click();
		
		

	}
}
