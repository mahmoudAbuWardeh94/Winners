package CashWithdrawalFromBank;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CashWithdrawalFromBank {
	public WebDriver driver;
	public WebDriverWait wait;

	public CashWithdrawalFromBank(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@data-automation-id='div1812231']")
	WebElement fromBankAccountField;

	public void waitfromBankAccountField() {
		fromBankAccountField = wait.until(ExpectedConditions.visibilityOf(fromBankAccountField));
		return;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/input[1]")
	WebElement searchFieldInFromBankAccountField;

	public void waitSearchFieldInFromBankAccountField() {
		searchFieldInFromBankAccountField = wait
				.until(ExpectedConditions.visibilityOf(searchFieldInFromBankAccountField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input6852801']")
	WebElement amountField;

	public void waitAmountField() {
		amountField = wait.until(ExpectedConditions.visibilityOf(amountField));
		return;
	}

	@FindBy(xpath = "//div[@data-automation-id='div6195441']")
	WebElement toEmployeeField;

	public void waitToEmployeeField() {
		toEmployeeField = wait.until(ExpectedConditions.visibilityOf(toEmployeeField));
		return;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[3]/input[1]")
	WebElement searchFieldInToEmployeeField;

	public void waitSearchFieldInToEmployeeField() {
		searchFieldInToEmployeeField = wait.until(ExpectedConditions.visibilityOf(searchFieldInToEmployeeField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input1394981']")
	WebElement slipField;

	public void waitSlipField() {
		slipField = wait.until(ExpectedConditions.visibilityOf(slipField));
		return;
	}

	@FindBy(xpath = "//textarea")
	WebElement noteField;

	public void waitNoteField() {
		noteField = wait.until(ExpectedConditions.visibilityOf(noteField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button3117391']")
	WebElement withdrawalButton;

	public void waitWithdrawalButton() {
		withdrawalButton = wait.until(ExpectedConditions.visibilityOf(withdrawalButton));
		return;
	}

	@FindBy(xpath = "//input[@aria-label='Character 1.']")
	WebElement codeDigitField;

	public void waitCodeDigitField() {
		codeDigitField = wait.until(ExpectedConditions.visibilityOf(codeDigitField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button9014861']")
	WebElement verifyButton;

	public void waitVerifyButton() {
		verifyButton = wait.until(ExpectedConditions.visibilityOf(verifyButton));
		return;
	}

	@FindBy(xpath = "//*[@id=\"radix-:r10:\"]/div[2]/div[2]/p")
	WebElement getMessage;

	public void waitGetMessage() {
		getMessage = wait.until(ExpectedConditions.visibilityOf(getMessage));
		return;
	}

	@FindBy(xpath = "(//button[@data-automation-id='button3573281'])[2]")
	WebElement okButton;

	public void waitOkButton() {
		okButton = wait.until(ExpectedConditions.visibilityOf(okButton));
		return;
	}

	@FindBy(xpath = "(//div[@data-automation-id='div9559492'])[3]")
	WebElement xButton;

	public void waitXButton() {
		xButton = wait.until(ExpectedConditions.visibilityOf(xButton));
		return;
	}

}
