package com.auction.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.auction.init.Common;
import com.auction.pages.auctionregistration.AbstractPage;

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
// ::::::::::::::::::::::::::::::::::::::::::- Xpaths
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-//
// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
/**
 * 
 * @author Rahul
 * 
 * @param <signupUser>
 */
public class SignupPage extends AbstractPage {

	@FindBy(xpath = "//input[@id='pip1']")
	private WebElement signupUsername;

	@FindBy(xpath = "//input[@id='pip2']")
	private WebElement signupPassword;

	@FindBy(xpath = "//*[@id='pip3']")
	private WebElement signupConfirm;

	@FindBy(xpath = "//*[@id='pip6']")
	private WebElement signupEmail;

	@FindBy(xpath = "//*[@id='pip4']")
	private WebElement signupFirstname1;

	@FindBy(xpath = "//*[@id='pip5']")
	private WebElement signupLastname;

	@FindBy(xpath = "//a[@id='bpepip9']")
	private WebElement editBoxOfPhone;

	@FindBy(xpath = "//select[@id='pip11']//option[text()='-Select-']")
	private WebElement signupPhoneType;

	@FindBy(xpath = "//select[@id='rbp25']//option[text()='-Select-']")
	private WebElement signupContactType;

	@FindBy(xpath = "//*[@id='rbp3']")
	private WebElement signupBillFirstname;

	@FindBy(xpath = "//*[@id='rbp4']")
	private WebElement signupLastName;

	@FindBy(xpath = "//a[@id='bperbp5']")
	private WebElement signupPhone;

	@FindBy(xpath = "//span[@id='pip11_ctl']/select[@id='pip11']")
	private WebElement select;

	@FindBy(xpath = "//*[@id='c4']")
	private WebElement terms;

	@FindBy(xpath = "//*[@id='c5']")
	private WebElement signUp;

	@FindBy(xpath = "//*[@id='sip1']")
	private WebElement ship;

	@FindBy(xpath = "//*[@id='bpspip9']")
	private WebElement phoneOk;

	@FindBy(xpath = "//*[@id='bpsrbp5']")
	private WebElement billPhoneOk;

	@FindBy(xpath = "//span[@id='rbp25_ctl']/select[@id='rbp25']")
	private WebElement billingInfoSelect;

	@FindBy(xpath = "//input[@id='c5']")
	private WebElement signup;

	@FindBy(xpath = "//span[@id='rbp7_ctl']/select[@id='rbp7']")
	private WebElement countryselection;

	@FindBy(xpath = "//span[@id='rbp11_ctl']/select[@id='rbp11']")
	private WebElement stateselection;

	@FindBy(xpath = "//a[text()='Auction']")
	private WebElement auctionpage;

	Common common = new Common(driver);

	/**
	 * Constructor
	 * 
	 * @param Dashboard
	 *            driver
	 */
	public SignupPage(WebDriver driver) {
		super(driver);

	}

	/**
	 * Verify Signup Feature
	 * 
	 */
	public void verifySignupFeature() {

		System.out.println("_____________");
		System.out.println("verify signup page elements");
		common.waitForConditionIsElementPresent("//input[@id='pip1']");
		common.log("<br><br>verify username text");

		common.log("Usernam text.");
		common.assertElementPresent("//div[@class='label-input label-input-username']");

		common.log("Verify Password,");
		common.assertElementPresent("//div[text()='label-input label-input-password']");

		common.log("Verify ConfirmPassword,");
		common.assertElementPresent("//div[@class='label-input label-input-confirmpassword']");

		common.log("Verify email,");
		common.assertElementPresent("//div[@class='label-input label-input-email']");

		common.log("Verify firstname,");
		common.assertElementPresent("//div[@class='label-input label-input-firstname']");

		common.log("Verify lastname,");

		common.assertElementPresent("//div[@class='label-input label-input-lastname']");

		common.log("Verify phone,");
		common.assertElementPresent("//div[@class='label-input label-input-phone']");

		common.log("Verify Phone Type,");
		common.assertElementPresent("//div[@class='label-input label-input-phonetype']");

		common.log("Verify Bill Contact Type,");
		common.assertElementPresent("//div[@class='label-input label-input-billcontacttype']/div[@class='label']");

		common.log("Verify BillFirstname,");
		common.assertElementPresent("//div[@class='label-input label-input-billfirstname']/div[@class='label']");

		common.log("Verify BillLastname,");
		common.assertElementPresent("//div[@class='label-input label-input-billlastname']/div[@class='label']");

		common.log("Verify billPhone,");
		common.assertElementPresent("//div[@class='label-input label-input-billphone']/div[@class='label']");

	}

	/**
	 * Mandatory Fields
	 * 
	 */
	public void mandatoryFields() {

		common.waitForElement("//input[@id='c5']");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='pip1_ctl']//span[text()='Required']");
		common.assertElementPresent("//span[@id='pip1_ctl']//span[text()='Required']");
	}

	/**
	 * Sign Up User
	 * 
	 * @return
	 * @throws InterruptedException
	 */

	public LandingPage signupUser() throws InterruptedException {
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.log("<br></br> Step 12 : SignupUSer Details.");
		common.waitForElementIsDisplayed(By.xpath("//input[@id='pip1']"));

		String signUpUser = common.generateRandomChars(6);
		common.type("//input[@id='pip1']", signUpUser);
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out.println("New User >>" + "  " + signUpUser);
		common.type("//input[@id='pip1']", signUpUser);
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Work
		 * 
		 */
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();
		/*
		 * common.log("Billing First Name :"); String contactFirst =
		 * common.generateRandomChars(6); common.type("//*[@id='rbp3']",
		 * contactFirst);
		 * 
		 * common.log("Billing Last Name :"); String contactLast =
		 * common.generateRandomChars(6); common.type("//*[@id='rbp4']",
		 * contactLast);
		 * 
		 * common.log("Billing Phone Button :");
		 * 
		 * common.jsClick(signupPhone);
		 * 
		 * common.pause(10);
		 */

		return new LandingPage(driver);

	}

	/**
	 * Enter Bill Info
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void enterBillInfo() throws InterruptedException {

		common.waitForConditionIsElementPresent("//select[@id='rbp25']");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		// common.wait(PASSED);
		common.pause(5);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);
	}

	/**
	 * Enter Bill Info with "No" Captcha
	 * 
	 */
	public void enterBillInfoWithoutCaptcha() {

		common.waitForConditionIsElementPresent("//select[@id='rbp25']");

		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.log("Billing First Name :");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		common.log("Billing Last Name :");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		common.log("Billing Phone Button :");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");
		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step 13 :: Verify Incorrect text entered \"error message displayed in red next to the missing field\"");
		common.waitForConditionIsElementPresent("//span[text()='Incorrect text entered']");
		common.assertElementPresent("//span[text()='Incorrect text entered']");

	}

	/**
	 * Enter Bill Info with Wrong Captcha
	 * 
	 */
	public void enterBillInfoWrongCaptcha() {

		common.waitForConditionIsElementPresent("//select[@id='rbp25']");

		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.log("Billing First Name :");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		common.log("Billing Last Name :");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		common.log("Billing Phone Button :");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		common.type("//input[@id='rbp8']", "466 green st");

		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		common.type("//input[@id='simrbp5']", "222222222");

		common.type("//input[@id='rbp12']", "94133");

		common.log("Clicking on Shipbox checkbox:");
		common.checkChkBox(ship);
		common.pause(5);

		common.log("Entering Captcha: \" Wrong Value \"");
		common.type("//input[@id='cap']", "PerfectQA Services");

		common.log("Selecting Terms Checkbox :");
		common.checkChkBox(terms);

		common.jsClick(signUp);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step 13 :: Verify Incorrect text entered \"error message displayed in red next to the missing field\" :</br>");
		common.waitForConditionIsElementPresent("//span[text()='Incorrect text entered']");
		common.assertElementPresent("//span[text()='Incorrect text entered']");

	}

	/**
	 * Verify Regular SignUp No Captcha Value
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpNoCaptcha() throws InterruptedException {

		signupUser(); // SignUp User
		enterBillInfoWithoutCaptcha(); // Regular SignUp With No Captcha
	}

	/**
	 * Regular Signup
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUp() throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		// common.jsClick(editBoxOfPhone);
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		enterBillInfo();

		verifyNewUserLoggedProperly(signUpUser);

	}

	/**
	 * Verify Regular SignUp Wrong Captcha Value
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWrongCaptcha() throws InterruptedException {

		signupUser(); // SignUp User
		enterBillInfoWrongCaptcha(); // Regular SignUp With Wrong Captcha
	}

	/**
	 * Verify Regular SignUp Confrimation Is Not Checked
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpConfirmationIsNotChecked()
			throws InterruptedException {

		signupUser(); // SignUp User
		enterBillingInformationWithConfirmationIsNotChecked(); // Confirmation
																// Is Not
																// Checked

	}

	/**
	 * Enter Billing Information With Confirmation Is Not Checked
	 * 
	 */
	public void enterBillingInformationWithConfirmationIsNotChecked() {

		common.waitForConditionIsElementPresent("//select[@id='rbp25']");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Without Selecting Terms Checkbox(Confirmaion).");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='c4_ctl']//span");
		String getCheckboxWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c4_ctl']//span")).getText();
		common.assertTwoValuesAreEqual(getCheckboxWarningMessage, "Required");
	}

	/**
	 * Verify NewUser Logged Properly
	 * 
	 * @param signUpUser
	 * 
	 * @throws InterruptedException
	 */
	public LandingPage verifyNewUserLoggedProperly(String signUpUser)
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step :: Verify New users logged in properly.");
		common.WaitForAjax();
		common.waitForConditionIsElementPresent("//div[@id='welcome']");
		System.out.println("//div[@id='welcome']//a[text()='" + signUpUser
				+ "']");
		common.assertElementPresent("//div[@id='welcome']//a[text()='"

		+ signUpUser + "']");

		return new LandingPage(driver);
	}

	/**
	 * Regular Signup with Existing User
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignupWithExistingUser() throws InterruptedException {

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.log("<br></br> Step 12 : SignupUSer Details.");
		common.pause(4);
		common.waitForConditionIsElementPresent("//a");

		String signUpUser = common.generateRandomChars(6);
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out.println("New User >>" + "  " + signUpUser);
		common.type("//input[@id='pip1']", "rahul");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		enterBillInfo(); // Enter Bill Info

	}

	/**
	 * Regular Signup with Existing Email User
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignupWithExistingEmailUser()
			throws InterruptedException {

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String signUpUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 : SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out.println("New User >>" + "  " + signUpUser);
		common.type("//input[@id='pip1']", signUpUser);
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", "rahul" + "@perfectqaservices.com"); // Enter
																				// Existing
																				// Email
																				// User

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		option.click(); // Select Phone Type
		System.out.println(option + ">>>>");

		enterBillInfo(); // Enter Bill Info

		common.waitForConditionIsElementPresent("//span[@id='pip6_ctl']//span");
		String getEmailAlreadyExitText = this.driver.findElement(
				By.xpath("//span[@id='c7']")).getText();
		System.out.println(getEmailAlreadyExitText + "666");
		common.assertTwoValuesAreEqual(
				getEmailAlreadyExitText,
				"An account with this email already exists. Do you want to login or did you forget your password?");
		String getEmailErrorText = this.driver.findElement(
				By.xpath("//span[@id='pip6_ctl']//span")).getText();
		common.assertTwoValuesAreEqual(getEmailErrorText,
				"Email already exists");

	}

	/**
	 * Regular SignUp With Basic Information Mandatory
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWithBasicInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//select[@id='rbp25']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		// common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		// common.pause(15);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With Billing Information Mandatory
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWithBillingInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);
		// common.pause(15);
		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With CC Information Mandatory
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWithCCInfoMandatory() throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);
		// common.pause(15);
		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With CC Information Mandatory
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWithACHInfoMandatory() throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElementIsDisplayed(By
				.xpath("//span[@id='rbp18_ctl']//span"));

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory And Billing Address Info Not
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryAndBillingAddressInfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		/**
		 * Select Visa
		 * 
		 */
		/*
		 * String CCType = "Visa"; WebElement option = select.findElement(By
		 * .xpath("//span[@id='rbp13_ctl']//option[contains(text(),'" + CCType +
		 * "')]")); System.out.println(option + "####"); option.click();
		 * 
		 * common.type("//input[@id='rbp14']", "4111111111111111");
		 *//**
		 * Select Expiration Month
		 * 
		 */
		/*
		 * String Month = "August"; WebElement augustoption =
		 * select.findElement(By
		 * .xpath("//span[@id='rbp15_ctl']//option[contains(text(),'" + Month +
		 * "')]")); System.out.println(augustoption + ">>>>");
		 * augustoption.click();
		 *//**
		 * Select Expiration Year
		 * 
		 */
		/*
		 * String Year = "2018"; WebElement yearoption = select.findElement(By
		 * .xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year +
		 * "')]")); System.out.println(yearoption + ">>>>"); yearoption.click();
		 * 
		 * common.type("//input[@id='rbp17']", "123");
		 */

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);
		// common.pause(15);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory And Billing Address Info
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryAndBillingAddressInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);
		// common.pause(15);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory And Billing Address Info
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryAndBillingAddressInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp7_ctl']//span")).getText();
		String getAddressWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp8_ctl']//span")).getText();
		String getCityWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp10_ctl']//span")).getText();
		String getZipWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory And Billing Address Info
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWithBasicInfoMandatoryAndBillingAddressInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp7_ctl']//span")).getText();
		String getAddressWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp8_ctl']//span")).getText();
		String getCityWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp10_ctl']//span")).getText();
		String getZipWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory And Billing Address Info
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryAndCCInfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		common.log("<br>Steps : Verify Basic Info Mandatory Fields</br>");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory And CC Info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryAndCCInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='rbp7_ctl']");

		common.log("<br>Steps : Verify CC Info Mandatory Fields</br>");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory And CC Info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryAndCCInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		common.log("<br>Steps : Verify Basic Info Mandatory Fields</br>");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		common.log("<br>Steps : Verify CC Info Mandatory Fields</br>");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCtypeOption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCtypeOption + "####");
		CCtypeOption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory And ACH Info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryAndACHInfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		common.log("<br>Steps : Verify Basic Info Mandatory Fields</br>");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory And ACH Info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryAndACHInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		common.log("<br></br>Step  :: Verifying warning message from bank details(ACH).");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(accountoption + "####");
		accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With Billing info Mandatory And CC Info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoMandatoryAndCCInfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp7_ctl']//span")).getText();
		String getAddressWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp8_ctl']//span")).getText();
		String getCityWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp10_ctl']//span")).getText();
		String getZipWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Billing info Mandatory And CC Info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoNotMandatoryAndCCInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		String getCountryWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp7_ctl']//span")).getText();
		String getAddressWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp8_ctl']//span")).getText();
		String getCityWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp10_ctl']//span")).getText();
		String getZipWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		// common.pause(15);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Billing info Mandatory And ACH Info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoMandatoryAndACHInfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp7_ctl']//span");

		String getCountryWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp7_ctl']//span")).getText();
		String getAddressWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp8_ctl']//span")).getText();
		String getCityWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp10_ctl']//span")).getText();
		String getZipWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(accountoption + "####");
		accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With Billing info Not Mandatory And ACH Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoNotMandatoryAndACHInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		String getCountryWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp7_ctl']//span")).getText();
		String getAddressWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp8_ctl']//span")).getText();
		String getCityWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp10_ctl']//span")).getText();
		String getZipWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With Billing info Mandatory And ACH Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoMandatoryAndACHInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With CC info Mandatory And ACH info NOT Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithCCInfoMandatoryAndACHInfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With CC info Not Mandatory And ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithCCInfoNotMandatoryAndACHInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement ccoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(ccoption + "####");
		ccoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With CC info Mandatory And ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithCCInfoMandatoryAndACHInfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement ccoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(ccoption + "####");
		ccoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}
	}

	/**
	 * Regular SignUp With Basic info Mandatory Billing address info not
	 * Mandatory CC info not mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingAddressInfoNotMandatoryAndCCinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCtypeOption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCtypeOption + "####");
		CCtypeOption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory CC info not mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoMandatoryAndCCinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		String getCountryWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp7_ctl']//span")).getText();
		String getAddressWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp8_ctl']//span")).getText();
		String getCityWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp10_ctl']//span")).getText();
		String getZipWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCtypeOption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCtypeOption + "####");
		CCtypeOption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory Not Billing address info not
	 * Mandatory CC info mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoNotMandatoryAndCCinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCtypeOption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCtypeOption + "####");
		CCtypeOption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory Billing address info Mandatory
	 * CC info Mandatory mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingAddressInfoMandatoryAndCCinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		String getCountryWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp7_ctl']//span")).getText();
		String getAddressWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp8_ctl']//span")).getText();
		String getCityWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp10_ctl']//span")).getText();
		String getZipWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCtypeOption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCtypeOption + "####");
		CCtypeOption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory Billing address info Mandatory
	 * CC info Mandatory mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingAddressInfoNotMandatoryAndCCinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");
		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCtypeOption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCtypeOption + "####");
		CCtypeOption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory CC info Mandatory mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoMandatoryAndCCinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCtypeOption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCtypeOption + "####");
		CCtypeOption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory Billing address info Mandatory
	 * CC info Mandatory mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingAddressInfoMandatoryAndCCinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		// common.waitForElement("//span[@id='rbp7_ctl']");
		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCtypeOption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCtypeOption + "####");
		CCtypeOption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory Billing address info Mandatory
	 * CC info Mandatory mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingAddressInfoNotMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		// common.waitForElement("//span[@id='rbp7_ctl']");
		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Not Mandatory Billing address info Not
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoNotMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='rbp7_ctl']");

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory Billing address info Mandatory
	 * ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingAddressInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");
		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory Billing address info Not
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingAddressInfoNotMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");
		common.waitForElement("//span[@id='rbp7_ctl']");

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");
		common.waitForElement("//span[@id='rbp7_ctl']");

		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory Billing address info Mandatory
	 * ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingAddressInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");
		common.waitForElement("//span[@id='rbp7_ctl']");

		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));

		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory CC info Not Mandatory ACH info
	 * Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Not Mandatory CC info Mandatory ACH info
	 * Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryCCInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Not Mandatory CC info Mandatory ACH info
	 * Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryCCInfoNotMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement option = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(option + "####");
		option.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement ccoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(ccoption + "####");
		ccoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory CC info Not Mandatory ACH info
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryCCInfoNotMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Not Mandatory CC info Mandatory ACH info
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryCCInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic info Mandatory CC info Mandatory ACH info
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryCCInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Billing info Mandatory CC info Not Mandatory ACH info
	 * Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp7_ctl']//span")).getText();
		String getAddressWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp8_ctl']//span")).getText();
		String getCityWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp10_ctl']//span")).getText();
		String getZipWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Billing info Not Mandatory CC info Mandatory ACH info
	 * Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Billing info Not Mandatory CC info Not Mandatory ACH
	 * info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoNotMandatoryCCInfoNotMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Billing info Mandatory CC info Mandatory ACH Not info
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForElement("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Billing info Mandatory CC info Not Mandatory ACH Not
	 * info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Billing info Not Mandatory CC info Mandatory ACH Not
	 * info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Billing info Mandatory CC info Mandatory ACH Not info
	 * Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBillingInfoMandatoryCCInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");
		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory Billing info Not Mandatory CC
	 * info Not Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//input[@id='rbp3']");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required”);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory Billing info Mandatory CC
	 * info Not Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory Billing info Not Mandatory
	 * CC info Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory Billing info Not Mandatory
	 * CC info Not Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory Billing info Mandatory CC info
	 * Not Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required”);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory Billing info Not Mandatory CC
	 * info Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required”);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory Billing info Not Mandatory CC
	 * info Not Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required”);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory Billing info Mandatory CC
	 * info Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory Billing info Mandatory CC
	 * info Not Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory Billing info CC info Mandatory
	 * ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required”);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory Billing info CC info Not
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required”);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory Billing info Not Mandatory CC
	 * info Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required”);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Not Mandatory Billing info Mandatory CC
	 * info Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Regular SignUp With Basic Info Mandatory Billing info Mandatory CC info
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 */
	public void regularSignUpWithBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryAndACHinfoMandatory()
			throws InterruptedException {

		common.waitForConditionIsElementPresent("//div[@id='RegisterShippingPanel_ctl']");

		signupUser(); // SignUp User

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.waitForConditionIsElementPresent("//span[@id='rbp7_ctl']");

		String getCountryWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp7_ctl']//span")).getText();

		String getAddressWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp8_ctl']//span")).getText();

		String getCityWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp10_ctl']//span")).getText();

		String getZipWarningMessage = this.driver.findElement(

		By.xpath("//span[@id='rbp12_ctl']//span[@class='warning']"))

		.getText();

		common.assertTwoValuesAreEqual(getCountryWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getAddressWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getCityWarningMessage, "Required");

		common.assertTwoValuesAreEqual(getZipWarningMessage, "Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

		common.waitForConditionIsElementPresent("//span[@id='rbp18_ctl']//span");

		String getBankRoutingTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp18_ctl']//span")).getText();
		String getBankAccountWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp19_ctl']//span")).getText();
		String getBankAccountTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp20_ctl']//span")).getText();
		String getBankNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp21_ctl']//span[@class='warning']"))
				.getText();
		String getBankAccountNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp22_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getBankRoutingTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankAccountWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountTypeWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getBankNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getBankAccountNameWarningMessage,
				"Required");

		// String getContactTypeWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='rbp25_ctl']//span")).getText();
		String getFirstNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp3_ctl']//span")).getText();
		String getLastNameWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp4_ctl']//span")).getText();
		// String getPhoneWarningMessage = this.driver.findElement(
		// By.xpath("//span[@id='lperbp5_ctl']//span[@class='warning']"))
		// .getText();

		// common.assertTwoValuesAreEqual(getContactTypeWarningMessage,
		// "Required");
		common.assertTwoValuesAreEqual(getFirstNameWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getLastNameWarningMessage, "Required");
		// common.assertTwoValuesAreEqual(getPhoneWarningMessage, "Required”);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Contact Phone Type.");
		String PhoneType = "Work";
		WebElement option = billingInfoSelect.findElement(By
				.xpath("//span[@id='rbp25_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement CCoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(CCoption + "####");
		CCoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		common.type("//input[@id='rbp18']", "123456789");
		common.type("//input[@id='rbp19']", "1234554321");

		/**
		 * Bank Account Type
		 * 
		 */
		String AccoutType = "Checking";
		WebElement Accountoption = select.findElement(By
				.xpath("//span[@id='rbp20_ctl']//option[contains(text(),'"
						+ AccoutType + "')]"));
		System.out.println(Accountoption + "####");
		Accountoption.click();

		common.type("//input[@id='rbp21']", "bank of america");
		common.type("//input[@id='rbp22']", "rahul account");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		if (common.isElementPresent("//ul[@id='messages']")) {

			common.waitForElementIsDisplayed(By.xpath("//ul[@id='messages']"));
			common.assertElementPresent("//li[contains(.,'Congratulations, your account has been created and you are ready to register for sales below!')]");

		}

		else if (common
				.isElementPresent("//span[@class['title']][contains(text(),'Undefined')]")) {

			common.assertElementNotPresent("//span[@class['title']][contains(text(),'Undefined')]");
		}

	}

	/**
	 * Verify Email And Confirmation Email With Account Not Verified
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailandConfirmemailWithAccountNotVerified()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");
		common.type("//input[@id='pip8']", EmailUser + "@perfectqaservices.com");

		// common.jsClick(editBoxOfPhone);
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		enterBillInfo();

		verifyNewUserLoggedProperly(signUpUser);

		common.jsClick(auctionpage);

		common.assertElementPresent("//input[@value='Verify account']");

	}

	/**
	 * Verify Email And Confirmation Email With Account Not Verified And Confirm
	 * Email Does Not Match
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailandConfirmemailWithAccountNotVerifiedAndConfirmEmailDoesNotMatch()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");
		common.type("//input[@id='pip8']", "Wrong" + "@perfectqaservices.com");

		// common.jsClick(editBoxOfPhone);
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		// enterBillInfo();

		common.type("//input[@id='pip8']", EmailUser + "@perfectqaservices.com");

		common.pause(5);

		enterBillInfo();
		verifyNewUserLoggedProperly(signUpUser);

		common.jsClick(auctionpage);

		common.assertElementPresent("//input[@value='Verify account']");

	}

	/**
	 * Verify Email And Confirmation Email With Account Not Verified And Confirm
	 * Email Does Not Match
	 * 
	 * Verified Email Upon Account Registration
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailandConfirmemailWithAccountNotVerifiedAndConfirmEmailDoesNotMatchVerifiedEmailUponAccountRegistrationChecked()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");
		common.type("//input[@id='pip8']", "WrongEmail"
				+ "@perfectqaservices.com");

		// common.jsClick(editBoxOfPhone);
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		common.type("//input[@id='pip8']", EmailUser + "@perfectqaservices.com");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		verifyNewUserLoggedProperly(signUpUser);

		common.jsClick(auctionpage);

		common.waitForConditionIsElementPresent("//input[@value='Verify account']"); // Wait
																						// For
																						// Element
																						// Present
																						// for
																						// "Auction Link."

		common.assertElementPresent("//input[@value='Verify account']"); // Assert
																			// Account
																			// for
																			// "Verify Account"
																			// Button

	}

	/**
	 * Verify Email With Require CreditCard On Signup Active
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailWithRequireCreditCardOnSignUpActive()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement ccoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(ccoption + "####");
		ccoption.click();

		common.type("//input[@id='rbp14']", "4111111111111112");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		common.waitForConditionIsElementPresent("//span[text()='Invalid Credit Card Number']");

		common.assertElementPresent("//span[text()='Invalid Credit Card Number']");

		common.type("//input[@id='rbp14']", "4111111111111111");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		verifyNewUserLoggedProperly(signUpUser);

		common.jsClick(auctionpage);

	}

	/**
	 * Verify Email With Require CreditCard On Signup Active And Expired CC
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailWithRequireCreditCardOnSignUpActiveAndExpiredCC()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement ccoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(ccoption + "####");
		ccoption.click();

		common.type("//input[@id='rbp14']", "4111111111111111");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2014";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		System.out.println("Expiration CC has a BUG");
		common.log("<br></br> :: Expiration CC has a BUG.");

	}

	/**
	 * Verify Email With Require CreditCard On Signup Active And Requried Error
	 * Message Is Displayed In Red Next To All The CC Fields.
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailWithRequireCreditCardOnRequiredErrorMessageIsDisplayedInRedNextToAllTheCCFieldss()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		// Verify Required Fields
		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

	}

	/**
	 * Verify Email With Require CreditCard On Signup Active On Registration
	 * Authorize Amount
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailWithRequireCreditCardOnSignUpActiveOnRegistrationAuthorizeAmount()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement ccoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(ccoption + "####");
		ccoption.click();

		common.type("//input[@id='rbp14']", "4111111111111112");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		common.waitForConditionIsElementPresent("//span[text()='Invalid Credit Card Number']");

		common.assertElementPresent("//span[text()='Invalid Credit Card Number']");

		common.type("//input[@id='rbp14']", "4111111111111111");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		verifyNewUserLoggedProperly(signUpUser);

		common.jsClick(auctionpage);

	}

	/**
	 * Verify Email With Require CreditCard On Signup Active On Registration
	 * Authorize Amount
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailWithRequireCreditCardOnSignUpActiveOnRegistrationNoneAmount()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement ccoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(ccoption + "####");
		ccoption.click();

		common.type("//input[@id='rbp14']", "4111111111111112");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		if (common.isElementPresent("//li[@class='warning']")) {

			common.waitForElementIsDisplayed(By.xpath("//li[@class='warning']"));
			common.assertElementPresent("//div[@id='GENERAL_ERROR_CIM ;User authentication failed due to invalid authentication values.']");

		}

		common.waitForConditionIsElementPresent("//span[text()='Invalid Credit Card Number']");

		common.assertElementPresent("//span[text()='Invalid Credit Card Number']");

		common.type("//input[@id='rbp14']", "4111111111111111");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		if (common.isElementPresent("//li[@class='warning']")) {

			common.waitForElementIsDisplayed(By.xpath("//li[@class='warning']"));
			common.assertElementPresent("//div[@id='GENERAL_ERROR_CIM ;User authentication failed due to invalid authentication values.']");

		}

		else if (common.isElementPresent("//div[@id='welcome']")) {

			verifyNewUserLoggedProperly(signUpUser);

		}

		common.jsClick(auctionpage);

	}

	/**
	 * Verify Email With Require CreditCard On Signup Active And Expired CC
	 * Authorize Amount
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailWithRequireCreditCardOnSignUpActiveAndExpiredCCOnAuthorizeAmount()
			throws InterruptedException {
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement ccoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(ccoption + "####");
		ccoption.click();

		common.type("//input[@id='rbp14']", "4111111111111112");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		if (common.isElementPresent("//li[@class='warning']")) {

			common.waitForElementIsDisplayed(By.xpath("//li[@class='warning']"));
			common.assertElementPresent("//div[@id='GENERAL_ERROR_CIM ;User authentication failed due to invalid authentication values.']");

		}

		common.waitForConditionIsElementPresent("//span[text()='Invalid Credit Card Number']");

		common.assertElementPresent("//span[text()='Invalid Credit Card Number']");

		common.type("//input[@id='rbp14']", "4111111111111111");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		verifyNewUserLoggedProperly(signUpUser);

		common.jsClick(auctionpage);

	}

	/**
	 * Verify Email With Require CreditCard On Signup Active And Expired CC
	 * Authorize Amount
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailWithRequireCreditCardOnSignUpActiveAndExpiredCCOnNoneAmount()
			throws InterruptedException {
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		/**
		 * Select Visa
		 * 
		 */
		String CCType = "Visa";
		WebElement ccoption = select.findElement(By
				.xpath("//span[@id='rbp13_ctl']//option[contains(text(),'"
						+ CCType + "')]"));
		System.out.println(ccoption + "####");
		ccoption.click();

		common.type("//input[@id='rbp14']", "4111111111111112");

		/**
		 * Select Expiration Month
		 * 
		 */
		String Month = "August";
		WebElement augustoption = select.findElement(By
				.xpath("//span[@id='rbp15_ctl']//option[contains(text(),'"
						+ Month + "')]"));
		System.out.println(augustoption + ">>>>");
		augustoption.click();

		/**
		 * Select Expiration Year
		 * 
		 */
		String Year = "2018";
		WebElement yearoption = select.findElement(By
				.xpath("//span[@id='c3_ctl']//option[contains(text(),'" + Year
						+ "')]"));
		System.out.println(yearoption + ">>>>");
		yearoption.click();

		common.type("//input[@id='rbp17']", "123");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		if (common.isElementPresent("//li[@class='warning']")) {

			common.waitForElementIsDisplayed(By.xpath("//li[@class='warning']"));
			common.assertElementPresent("//div[@id='GENERAL_ERROR_CIM ;User authentication failed due to invalid authentication values.']");

		}

		common.waitForConditionIsElementPresent("//span[text()='Invalid Credit Card Number']");

		common.assertElementPresent("//span[text()='Invalid Credit Card Number']");

		common.type("//input[@id='rbp14']", "4111111111111111");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		verifyNewUserLoggedProperly(signUpUser);
		common.jsClick(auctionpage);

	}

	/**
	 * Verify Email With Require CreditCard On Signup Active And Requried Error
	 * Message Is Displayed In Red Next To All The CC Fields. No CC
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailWithRequireCreditCardOnRequiredErrorMessageIsDisplayedInRedNextToAllTheCCFieldssithNoCC()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		// Verify Required Fields
		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

	}

	/**
	 * Verify Email With Require CreditCard On Signup Active And Requried Error
	 * Message Is Displayed In Red Next To All The CC Fields. No CC NONE CC
	 * 
	 * @throws InterruptedException
	 */
	public void verifyemailWithRequireCreditCardOnRequiredErrorMessageIsDisplayedInRedNextToAllTheCCFieldssithNoCCNONECC()
			throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		System.out.println("SignupUser Details");

		String FistName = common.generateRandomChars(6);
		String LastName = common.generateRandomChars(6);
		String EmailUser = common.generateRandomChars(6);

		common.pause(4);
		common.log("<br></br> Step 12 :: SignupUSer Details.");
		common.waitForConditionIsElementPresent(("//a"));

		String signUpUser = common.generateRandomChars(6);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 13 :: Enter User Name");
		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 14 :: Enter Password");
		common.type("//input[@id='pip2']", "rahul123");
		System.out.println("Random Value :" + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 15 :: Enter Confirm Password");
		common.type("//input[@id='pip4']", signUpUser);
		common.type("//input[@id='pip5']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 16 :: Enter Email");
		System.out.println("New User >>" + "  " + signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 17 :: Enter First Name.");

		common.type("//input[@id='pip1']", signUpUser);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 18 :: Enter Last Name.");
		common.type("//input[@id='pip3']", "rahul123");
		common.type("//input[@id='pip6']", EmailUser + "@perfectqaservices.com");

		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Phone Type.");
		String PhoneType = "Work";
		WebElement option = select.findElement(By
				.xpath("//span[@id='pip11_ctl']//option[contains(text(),'"
						+ PhoneType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing First Name.");
		String contactFirst = common.generateRandomChars(8);
		common.type("//*[@id='rbp3']", contactFirst);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Billing Last Name.");
		String contactLast = common.generateRandomChars(8);
		common.type("//*[@id='rbp4']", contactLast);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Phone Number.");
		System.out.println("Enter Phone Number...");
		common.type("//input[@id='simpip9']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Select Country.");
		String Country = "United States";
		WebElement country = countryselection.findElement(By
				.xpath("//span[@id='rbp7_ctl']//option[contains(text(),'"
						+ Country + "')]"));
		country.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Address.");
		common.type("//input[@id='rbp8']", "466 green st");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: City.");
		common.type("//input[@id='rbp10']", "san francisco");

		String State = "California";

		common.type("//input[@id='simrbp5']", "222222222");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: State.");
		WebElement state = countryselection.findElement(By
				.xpath("//span[@id='rbp11_ctl']//option[contains(text(),'"
						+ State + "')]"));
		state.click();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Zip.");
		common.type("//input[@id='rbp12']", "94133");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on Same as billing check box.");
		common.checkChkBox(ship);
		common.pause(5);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Selecting Terms Checkbox(Confirmaion).");
		common.checkChkBox(terms);

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Entring Captcha.");
		common.type("//input[@id='cap']", "azerty-sam-Xchtpac");

		common.pause(10);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on signUp button.");
		common.jsClick(signUp);

		common.pause(20);

		// Verify Required Fields
		common.waitForConditionIsElementPresent("//span[@id='rbp13_ctl']//span");

		String getCCTypeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp13_ctl']//span")).getText();
		String getCCNumberWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp14_ctl']//span")).getText();
		String getExpirationMonthWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='rbp15_ctl']//span")).getText();
		String getExpirationDateWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();
		String getSecurityCodeWarningMessage = this.driver.findElement(
				By.xpath("//span[@id='c3_ctl']//span[@class='warning']"))
				.getText();

		common.assertTwoValuesAreEqual(getCCTypeWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getCCNumberWarningMessage, "Required");
		common.assertTwoValuesAreEqual(getExpirationMonthWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getExpirationDateWarningMessage,
				"Required");
		common.assertTwoValuesAreEqual(getSecurityCodeWarningMessage,
				"Required");

	}
}
