package Kiosk;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kiosk {
	public WebDriver driver;
	public WebDriverWait wait;

	public Kiosk(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-automation-id='button1256721']")
	WebElement addNewKioskButton;

	public void waitAddNewKioskButton() {
		addNewKioskButton = wait.until(ExpectedConditions.visibilityOf(addNewKioskButton));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input2785621']")
	WebElement kioskNameField;

	public void waitKioskNameField() {
		kioskNameField = wait.until(ExpectedConditions.visibilityOf(kioskNameField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2092851']")
	WebElement statusField;

	public void waitStatusField() {
		statusField = wait.until(ExpectedConditions.visibilityOf(statusField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button3876321']")
	WebElement accessLockField;

	public void waitAccessLockField() {
		accessLockField = wait.until(ExpectedConditions.visibilityOf(accessLockField));
		return;
	}

	@FindBy(xpath = "//input[@data-automation-id='input2224741']")
	WebElement orderNumber;

	public void waitOrderNumber() {
		orderNumber = wait.until(ExpectedConditions.visibilityOf(orderNumber));
		return;
	}

	@FindBy(xpath = "//div[@data-automation-id='div7139601']")
	WebElement unitField;

	public void waitUnitField() {
		unitField = wait.until(ExpectedConditions.visibilityOf(unitField));
		return;
	}

	@FindBy(xpath = "//div[@data-automation-id='div7139604']")
	WebElement parentUnitField;

	public void waitParentUnitField() {
		parentUnitField = wait.until(ExpectedConditions.visibilityOf(parentUnitField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button8154165']")
	WebElement itsVIPField;

	public void waitItsVIPField() {
		itsVIPField = wait.until(ExpectedConditions.visibilityOf(itsVIPField));
		return;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/p[1]")
	WebElement validationMsgInOrderNumberField;

	public void waitValidationMsgInOrderNumberField() {
		validationMsgInOrderNumberField = wait.until(ExpectedConditions.visibilityOf(validationMsgInOrderNumberField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button1698781']")
	WebElement planButton;

	public void waitPlanButton() {
		planButton = wait.until(ExpectedConditions.visibilityOf(planButton));
		return;
	}

	@FindBy(xpath = "//div[@data-automation-id='div3715634']")
	WebElement uploadFileButton;

	public void waitUploadFileButton() {
		uploadFileButton = wait.until(ExpectedConditions.visibilityOf(uploadFileButton));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button1518881']")
	WebElement confirmButtonInPopUp;

	public void waitConfirmButtonInPopUp() {
		confirmButtonInPopUp = wait.until(ExpectedConditions.visibilityOf(confirmButtonInPopUp));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2048861']")
	WebElement nextButton;

	public void waitNextButton() {
		nextButton = wait.until(ExpectedConditions.visibilityOf(nextButton));
		return;
	}

	@FindBy(xpath = "//div[@data-automation-id='div8959501']")
	WebElement kioskField;

	public void waitKioskField() {
		kioskField = wait.until(ExpectedConditions.visibilityOf(kioskField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2048861']")
	WebElement nextButtonInInventoryPage;

	public void waitNextButtonInInventoryPage() {
		nextButtonInInventoryPage = wait.until(ExpectedConditions.visibilityOf(nextButtonInInventoryPage));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2048861']")
	WebElement nextButtonInProductsPage;

	public void waitNextButtonInProductsPage() {
		nextButtonInProductsPage = wait.until(ExpectedConditions.visibilityOf(nextButtonInProductsPage));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button8154161']")
	WebElement settingsTemplate;

	public void waitSettingsTemplate() {
		settingsTemplate = wait.until(ExpectedConditions.visibilityOf(settingsTemplate));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2047411']")
	WebElement saveButton;

	public void waitSaveButton() {
		saveButton = wait.until(ExpectedConditions.visibilityOf(saveButton));
		return;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[1]/ol[1]/li[1]/div[2]/div[2]/div[1]/span[1]")
	WebElement addKioskSucceed;

	public void waitAddKioskSucceed() {
		addKioskSucceed = wait.until(ExpectedConditions.visibilityOf(addKioskSucceed));
		return;
	}

	@FindBy(xpath = "//img[@alt='vipImage']")
	WebElement vipImage;

	public void waitVipImage() {
		vipImage = wait.until(ExpectedConditions.visibilityOf(vipImage));
		return;
	}

	@FindBy(xpath = "//span[@data-automation-id='span5079841']")
	WebElement activeInActiveStatus;

	public void waitActiveInActiveStatus() {
		activeInActiveStatus = wait.until(ExpectedConditions.visibilityOf(activeInActiveStatus));
		return;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/span[1]")
	WebElement lockedUnlockedStatus;

	public void waitLockedUnlockedStatus() {
		lockedUnlockedStatus = wait.until(ExpectedConditions.visibilityOf(lockedUnlockedStatus));
		return;
	}

	@FindBy(xpath = "(//input[@data-automation-id='input1954841'])[2]")
	WebElement searchField;

	public void waitSearchField() {
		searchField = wait.until(ExpectedConditions.visibilityOf(searchField));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button9122771']")
	WebElement detailsButton;

	public void waitDetailsButton() {
		detailsButton = wait.until(ExpectedConditions.visibilityOf(detailsButton));
		return;
	}

	@FindBy(xpath = "//button[@data-automation-id='button2051551']")
	WebElement editButton ;

	public void waitEditButton() {
		editButton = wait.until(ExpectedConditions.visibilityOf(editButton));
		return;
	}

//	@FindBy(xpath = "")
//	WebElement ;
//
//	public void wait() {
//		 = wait.until(ExpectedConditions.visibilityOf());
//		return;
//	}

//	@FindBy(xpath = "")
//	WebElement ;
//
//	public void wait() {
//		 = wait.until(ExpectedConditions.visibilityOf());
//		return;
//	}

//	@FindBy(xpath = "")
//	WebElement ;
//
//	public void wait() {
//		 = wait.until(ExpectedConditions.visibilityOf());
//		return;
//	}

//	@FindBy(xpath = "")
//	WebElement ;
//
//	public void wait() {
//		 = wait.until(ExpectedConditions.visibilityOf());
//		return;
//	}

}
