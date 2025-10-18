package BankAccounts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankAccounts {
	public WebDriver driver;
	public WebDriverWait wait;

	public BankAccounts(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-automation-id='button1724761']")
	WebElement addNewAccountButton;

	public void waitAddNewAccountButton() {
		addNewAccountButton = wait.until(ExpectedConditions.visibilityOf(addNewAccountButton));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input1025901']")
	WebElement bankNameField;

	public void waitBankNameField() {
		bankNameField = wait.until(ExpectedConditions.visibilityOf(bankNameField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input1035651']")
	WebElement bankCodeField;

	public void waitBankCodeField() {
		bankCodeField = wait.until(ExpectedConditions.visibilityOf(bankCodeField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input1103621']")
	WebElement branchNameField;

	public void waitBranchNameField() {
		branchNameField = wait.until(ExpectedConditions.visibilityOf(branchNameField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input1113371']")
	WebElement branchCodeField;

	public void waitBranchCodeField() {
		branchCodeField = wait.until(ExpectedConditions.visibilityOf(branchCodeField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input2136611']")
	WebElement accountNumberField;

	public void waitAccountNumberField() {
		accountNumberField = wait.until(ExpectedConditions.visibilityOf(accountNumberField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input1404521']")
	WebElement IBANField;

	public void waitIBANField() {
		IBANField = wait.until(ExpectedConditions.visibilityOf(IBANField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button1807721']")
	WebElement currencyField;

	public void waitCurrencyField() {
		currencyField = wait.until(ExpectedConditions.visibilityOf(currencyField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button7498341']")
	WebElement statmentField;

	public void waitStatmentField() {
		statmentField = wait.until(ExpectedConditions.visibilityOf(statmentField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input5329341']")
	WebElement addressField;

	public void waitAddressField() {
		addressField = wait.until(ExpectedConditions.visibilityOf(addressField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button6568121']")
	WebElement statusField;

	public void waitStatusField() {
		statusField = wait.until(ExpectedConditions.visibilityOf(statusField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2984871']")
	WebElement statusFieldInEdit;

	public void waitStatusFieldInEdit() {
		statusFieldInEdit = wait.until(ExpectedConditions.visibilityOf(statusFieldInEdit));
		return;
	}

	@FindBy(xpath = "(//button[@data-automation-id='button1807731'])[2]")
	WebElement addButton;

	public void waitAddButton() {
		addButton = wait.until(ExpectedConditions.visibilityOf(addButton));
		return;
	}

	@FindBy(xpath = "//div[@data-automation-id='div5141611']")
	WebElement confirmationErrorMsg;

	public void waitConfirmationErrorMsg() {
		confirmationErrorMsg = wait.until(ExpectedConditions.visibilityOf(confirmationErrorMsg));
		return;
	}

	@FindBy(xpath = "(//input[@data-automation-id='input1954841'])[2]")
	WebElement searchField;

	public void waitSearchField() {
		searchField = wait.until(ExpectedConditions.visibilityOf(searchField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2051551']")
	WebElement editButton;

	public void waitEditButton() {
		editButton = wait.until(ExpectedConditions.visibilityOf(editButton));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button1753331']")
	WebElement saveChangesButton;

	public void waitSaveChangesButton() {
		saveChangesButton = wait.until(ExpectedConditions.visibilityOf(saveChangesButton));
		return;
	}

	@FindBy(xpath = "//div[@data-automation-id='div1269791']")
	WebElement updateConfirmationErrorMsg;

	public void waitUpdateConfirmationErrorMsg() {
		updateConfirmationErrorMsg = wait.until(ExpectedConditions.visibilityOf(updateConfirmationErrorMsg));
		return;
	}

	@FindBy(xpath = "//*[@id=\"0_status\"]/div/div")
	WebElement columnStatus;

	public void waitColumnStatus() {
		columnStatus = wait.until(ExpectedConditions.visibilityOf(columnStatus));
		return;
	}
}
