package BankAccounts;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CatalogType.CatalogType;
import Login.GoogleAuthenticatorTC;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BankAccountTC {
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
	public void addNewAccount() throws InterruptedException {
		BankAccounts bankAccounts = new BankAccounts(driver);
		bankAccounts.waitAddNewAccountButton();
		bankAccounts.addNewAccountButton.click();

		bankAccounts.waitBankNameField();
		bankAccounts.bankNameField.sendKeys(testString);

		bankAccounts.waitBankCodeField();
		bankAccounts.bankCodeField.sendKeys("0127659");

		bankAccounts.waitBranchNameField();
		bankAccounts.branchNameField.sendKeys("Nadsoft");

		bankAccounts.waitBranchCodeField();
		bankAccounts.branchCodeField.sendKeys("00962");

		bankAccounts.waitAccountNumberField();
		bankAccounts.accountNumberField.sendKeys("0089789588");

		bankAccounts.waitIBANField();
		bankAccounts.IBANField.sendKeys("A88A996G5725125BW");

		bankAccounts.waitStatmentField();
		bankAccounts.statmentField.click();

		Actions action = new Actions(driver);

		action.moveToElement(bankAccounts.statmentField).sendKeys(Keys.ENTER).build().perform();

		bankAccounts.waitAddressField();
		bankAccounts.addressField.sendKeys("Amman - Mecca Street");

		bankAccounts.waitStatusField();
		bankAccounts.statusField.click();

		action.moveToElement(bankAccounts.statusField).sendKeys(Keys.ARROW_DOWN).build().perform();
		action.moveToElement(bankAccounts.statusField).sendKeys(Keys.ENTER).build().perform();

		bankAccounts.waitAddButton();
		bankAccounts.addButton.click();

		bankAccounts.waitConfirmationErrorMsg();
		String actualResult = bankAccounts.confirmationErrorMsg.getText();
		String expectedResult = "Add Bank Account succeed.";

		softassert.assertEquals(actualResult, expectedResult);
		softassert.assertAll();

	}

	@Test(priority = 2)
	public void searchWithValidData() throws InterruptedException {
		BankAccounts bankAccounts = new BankAccounts(driver);

		bankAccounts.waitSearchField();
		bankAccounts.searchField.sendKeys(testString);

		Thread.sleep(3000);
		bankAccounts.waitEditButton();
		boolean actualResult = bankAccounts.editButton.isDisplayed();
		boolean expectedResult = true;

		softassert.assertEquals(actualResult, expectedResult);
		softassert.assertAll();

	}

	@Test(priority = 3)
	public void editBankAccountWithActiveData() {
		BankAccounts bankAccounts = new BankAccounts(driver);

		bankAccounts.waitEditButton();
		bankAccounts.editButton.click();

		bankAccounts.waitBankCodeField();
		bankAccounts.bankCodeField.click();
		bankAccounts.bankCodeField.sendKeys("11");

		bankAccounts.waitSaveChangesButton();
		bankAccounts.saveChangesButton.click();

		bankAccounts.waitUpdateConfirmationErrorMsg();

		String actualResult = bankAccounts.updateConfirmationErrorMsg.getText();
		String expectedResult = "Update Bank Account succeed.";

		softassert.assertEquals(actualResult, expectedResult);

		bankAccounts.waitColumnStatus();

		String actualResult1 = bankAccounts.columnStatus.getText();
		String expectedResult1 = "Active";

		softassert.assertEquals(actualResult1, expectedResult1);
		softassert.assertAll();
	}

	@Test(priority = 4)
	public void editBankAccountWithInActiveData() throws InterruptedException {
		BankAccounts bankAccounts = new BankAccounts(driver);

		bankAccounts.waitEditButton();
		bankAccounts.editButton.click();

		bankAccounts.waitStatusFieldInEdit();
		bankAccounts.statusFieldInEdit.click();

		Thread.sleep(1000);

		Actions action = new Actions(driver);

		action.moveToElement(bankAccounts.statusFieldInEdit).sendKeys(Keys.ENTER).build().perform();

		bankAccounts.waitSaveChangesButton();
		bankAccounts.saveChangesButton.click();

		Thread.sleep(2000);
		bankAccounts.waitColumnStatus();

		String actualResult = bankAccounts.columnStatus.getText();
		String expectedResult = "InActive";

		softassert.assertEquals(actualResult, expectedResult);
		softassert.assertAll();

	}
}
