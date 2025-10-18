package CashWithdrawalFromBank;

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

public class CashWithdrawalFromBankTC {

	public static WebDriver driver;
	public SoftAssert softassert = new SoftAssert();

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
	public void withdrawalWithValidDataAndInvalidOTP() throws InterruptedException {
		CashWithdrawalFromBank cashWithdrawalFromBank = new CashWithdrawalFromBank(driver);
		cashWithdrawalFromBank.waitfromBankAccountField();
		cashWithdrawalFromBank.fromBankAccountField.click();

		cashWithdrawalFromBank.waitSearchFieldInFromBankAccountField();
		cashWithdrawalFromBank.searchFieldInFromBankAccountField.sendKeys("GN BAnk Winners--00-112-586672");

		Actions actions = new Actions(driver);
		actions.moveToElement(cashWithdrawalFromBank.searchFieldInFromBankAccountField).sendKeys(Keys.ENTER).build()
				.perform();

		cashWithdrawalFromBank.waitAmountField();
		cashWithdrawalFromBank.amountField.sendKeys("100");

		cashWithdrawalFromBank.waitToEmployeeField();
		cashWithdrawalFromBank.toEmployeeField.click();

		cashWithdrawalFromBank.waitSearchFieldInToEmployeeField();
		cashWithdrawalFromBank.searchFieldInToEmployeeField.sendKeys("tony dev testing");
		Thread.sleep(1000);
		actions.moveToElement(cashWithdrawalFromBank.searchFieldInToEmployeeField).sendKeys(Keys.ENTER).build()
				.perform();

		cashWithdrawalFromBank.waitSlipField();
		cashWithdrawalFromBank.slipField.sendKeys("10");

		cashWithdrawalFromBank.waitNoteField();
		cashWithdrawalFromBank.noteField.sendKeys("Test Data");

		cashWithdrawalFromBank.waitWithdrawalButton();
		cashWithdrawalFromBank.withdrawalButton.click();

		cashWithdrawalFromBank.waitCodeDigitField();
		cashWithdrawalFromBank.codeDigitField.sendKeys("222222");

		cashWithdrawalFromBank.waitVerifyButton();
		cashWithdrawalFromBank.verifyButton.click();

		Thread.sleep(3000);
		cashWithdrawalFromBank.waitGetMessage();

		String actualResult = cashWithdrawalFromBank.getMessage.getText();
		String expectedResult = "The Code Does Not Match, Please Try Again";

		cashWithdrawalFromBank.waitOkButton();
		cashWithdrawalFromBank.okButton.click();

		cashWithdrawalFromBank.waitXButton();
		cashWithdrawalFromBank.xButton.click();

		softassert.assertEquals(actualResult, expectedResult);
		softassert.assertAll();

	}

	@Test(priority = 2)
	public void withdrawalWithValidDataAndValidOTP() throws InterruptedException {
		CashWithdrawalFromBank cashWithdrawalFromBank = new CashWithdrawalFromBank(driver);

		cashWithdrawalFromBank.waitWithdrawalButton();
		cashWithdrawalFromBank.withdrawalButton.click();

		cashWithdrawalFromBank.waitCodeDigitField();
		cashWithdrawalFromBank.codeDigitField.sendKeys("444555");

		cashWithdrawalFromBank.waitVerifyButton();
		cashWithdrawalFromBank.verifyButton.click();

		Thread.sleep(1000);
		cashWithdrawalFromBank.waitGetMessage();

		String actualResult = cashWithdrawalFromBank.getMessage.getText();
		String expectedResult = "Insert Withdrawal From Bank Succeed.";

		softassert.assertEquals(actualResult, expectedResult);
		softassert.assertAll();

	}
}