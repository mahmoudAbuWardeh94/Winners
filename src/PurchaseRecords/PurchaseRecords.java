package PurchaseRecords;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseRecords {
	public WebDriver driver;
	public WebDriverWait wait;

	public PurchaseRecords(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-automation-id='button4527071']")
	WebElement addNewPurchaseRecordButton;

	public void waitAddNewPurchaseRecordButton() {
		addNewPurchaseRecordButton = wait.until(ExpectedConditions.visibilityOf(addNewPurchaseRecordButton));
		return;
	}

	@FindBy(xpath = "//div[@data-automation-id='div7139601']")
	WebElement productIdField;

	public void waitProductIdField() {
		productIdField = wait.until(ExpectedConditions.visibilityOf(productIdField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input1746641']")
	WebElement manufacturerField;

	public void waitManufacturerField() {
		manufacturerField = wait.until(ExpectedConditions.visibilityOf(manufacturerField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input7944861']")
	WebElement manufacturerYearField;

	public void waitManufacturerYearField() {
		manufacturerYearField = wait.until(ExpectedConditions.visibilityOf(manufacturerYearField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input7615391']")
	WebElement modelField;

	public void waitModelField() {
		modelField = wait.until(ExpectedConditions.visibilityOf(modelField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input5883651']")
	WebElement descriptionField;

	public void waitDescriptionField() {
		descriptionField = wait.until(ExpectedConditions.visibilityOf(descriptionField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input1959461']")
	WebElement pricePerUnitField;

	public void waitPricePerUnitField() {
		pricePerUnitField = wait.until(ExpectedConditions.visibilityOf(pricePerUnitField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input4028691']")
	WebElement quantityField;

	public void waitQuantityField() {
		quantityField = wait.until(ExpectedConditions.visibilityOf(quantityField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2853841']")
	WebElement inputSerialRecordType;

	public void waitInputSerialRecordType() {
		inputSerialRecordType = wait.until(ExpectedConditions.visibilityOf(inputSerialRecordType));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button3691431']")
	WebElement createButton;

	public void waitCreateButton() {
		createButton = wait.until(ExpectedConditions.visibilityOf(createButton));
		return;
	}

	@FindBy(xpath = "//span[@data-automation-id='span5988901']")
	WebElement toasterMessage;

	public void waitToasterMessage() {
		toasterMessage = wait.until(ExpectedConditions.visibilityOf(toasterMessage));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button1277771']")
	WebElement editRecordsButton;

	public void waitEditRecordsButton() {
		editRecordsButton = wait.until(ExpectedConditions.visibilityOf(editRecordsButton));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input2072231']")
	WebElement companySerialNumberField1;

	public void waitCompanySerialNumberField1() {
		companySerialNumberField1 = wait.until(ExpectedConditions.visibilityOf(companySerialNumberField1));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input2072232']")
	WebElement serialNumberField1;

	public void waitSerialNumberField1() {
		serialNumberField1 = wait.until(ExpectedConditions.visibilityOf(serialNumberField1));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input2072233']")
	WebElement macAddressField1;

	public void waitMacAddressField1() {
		macAddressField1 = wait.until(ExpectedConditions.visibilityOf(macAddressField1));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2047411']")
	WebElement saveButton;

	public void waitSaveButton() {
		saveButton = wait.until(ExpectedConditions.visibilityOf(saveButton));
		return;
	}

	@FindBy(xpath = "//span[@data-automation-id='span1341561']")
	WebElement toasterMsgInEditRecords;

	public void waitToasterMsgInEditRecords() {
		toasterMsgInEditRecords = wait.until(ExpectedConditions.visibilityOf(toasterMsgInEditRecords));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2052481']")
	WebElement backButton;

	public void waitBackButton() {
		backButton = wait.until(ExpectedConditions.visibilityOf(backButton));
		return;
	}

	@FindBy(xpath = "(//input[@data-automation-id='input1954841'])[2]")
	WebElement searchField;

	public void waitSearchField() {
		searchField = wait.until(ExpectedConditions.visibilityOf(searchField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2984871']")
	WebElement actionButton;

	public void waitActionButton() {
		actionButton = wait.until(ExpectedConditions.visibilityOf(actionButton));
		return;
	}
	
	@FindBy(xpath = "//span[@data-automation-id='span1182961']")
	WebElement updatePurchaseRecordToasterMsg;
	
	public void waitUpdatePurchaseRecordToasterMsg() {
		updatePurchaseRecordToasterMsg = wait.until(ExpectedConditions.visibilityOf(updatePurchaseRecordToasterMsg));
		return;
	}

}
