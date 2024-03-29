package com.auction.admin.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.ParseException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.auction.init.Common;
import com.auction.pages.SignupPage;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class AdminDashboardPage extends AdminAbstractPage {

	/**
	 * Web Elements
	 * 
	 */
	@FindBy(xpath = "//a[@title='Settings']")
	private WebElement settings;

	@FindBy(xpath = "//a[@title='Manage System Parameters']")
	private WebElement managesystemparameters;

	@FindBy(xpath = "//a[text()='Users options']")
	private WebElement usersoptions;

	@FindBy(xpath = "//input[@id='uof1']")
	private WebElement savechanges;

	@FindBy(xpath = "//div[@class='legend_div'] [text()='Registration Settings ']//a")
	private WebElement registrationsettingsmaximize;

	@FindBy(xpath = "//input[@id='uof2']")
	private WebElement simplifiedsignuppage;

	@FindBy(xpath = "//input[@id='uof10']")
	private WebElement verifyemailuponaccountregistration;

	@FindBy(xpath = "//input[@id='uof11']")
	private WebElement verifycreditcardsignup;

	@FindBy(xpath = "//input[@id='uof13a']")
	private WebElement donotmakeuserbidderonsignup;

	@FindBy(xpath = "//input[@id='uof14']")
	private WebElement AutoassignPreferredbidderprivilegesuponsignup;

	@FindBy(xpath = "//input[@id='uof51']")
	private WebElement AutoassignPreferredbidderprivilegesuponcreditcardupdate;

	@FindBy(xpath = "//input[@id='uof53']")
	private WebElement RevokePreferredbidderprivilegesifCCexpiredmissing;

	@FindBy(xpath = "//input[@id='uof13']")
	private WebElement EnableResellerRegistration;

	@FindBy(xpath = "//input[@id='uof16']")
	private WebElement Enableconsignorpaymentinfo;

	@FindBy(xpath = "//input[@id='uof17']")
	private WebElement Makeoptionalinprofile;

	@FindBy(xpath = "//input[@id='uof19']")
	private WebElement Requireaddressconfirmationuponsaleregistration;

	@FindBy(xpath = "//input[@id='uof20']")
	private WebElement Requireconfirmationofsaletermsconditionsuponsaleregistration;

	@FindBy(xpath = "//input[@id='uof59']")
	private WebElement Enablecompanyname;

	@FindBy(xpath = "//input[@id='uof66']")
	private WebElement Includeuserpreferences;

	@FindBy(xpath = "//input[@id='uof67']")
	private WebElement RequireIdentification;

	@FindBy(xpath = "//input[@id='uof68']")
	private WebElement Agentoption;

	@FindBy(xpath = "//input[@id='uof70']")
	private WebElement Autoincrementcustomer;

	@FindBy(xpath = "//input[@id='uof71']")
	private WebElement Makepermanentbidder;

	@FindBy(xpath = "//input[@id='uof75']")
	private WebElement Autoassignconsignorprivileges;

	@FindBy(xpath = "//input[@id='uof78']")
	private WebElement HideCountryCodeSelection;

	@FindBy(xpath = "//input[@id='uof76']")
	private WebElement Autoassignaccountadminprivileges;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement adminLogout;

	@FindBy(xpath = "//input[@id='alf2']")
	private WebElement createnewauction;

	@FindBy(xpath = "//span[@id='aip0_ctl']/select[@id='aip0']")
	private WebElement auctiontype;

	@FindBy(xpath = "//input[@id='aip35_0']")
	private WebElement clerking;

	@FindBy(xpath = "//input[@id='aef3']")
	private WebElement publish;

	@FindBy(xpath = "//input[@id='aef5']")
	private WebElement newauctionsavechanges;

	@FindBy(xpath = "//a[@title='Auction Lots']")
	private WebElement auctionlots;

	@FindBy(xpath = "//input[@id='alf3']")
	private WebElement addLot;

	@FindBy(xpath = "//input[@id='lid6']")
	private WebElement saveandexit;

	@FindBy(xpath = "//a[text()='Users']")
	private WebElement users;

	@FindBy(xpath = "//input[@id='uof31']")
	private WebElement includebasicinfo;

	@FindBy(xpath = "//input[@id='uof32']")
	private WebElement makebasicinfomandatory;

	@FindBy(xpath = "//input[@id='uof33']")
	private WebElement includeBillingInfo;

	@FindBy(xpath = "//input[@id='uof34']")
	private WebElement makeBillingAddressInfoMandatory;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homebutton;

	@FindBy(xpath = "//input[@id='uof35']")
	private WebElement includeccinfo;

	@FindBy(xpath = "//input[@id='uof36']")
	private WebElement makeccinfomandatory;

	@FindBy(xpath = "//input[@id='uof37']")
	private WebElement includeACHinfo;

	@FindBy(xpath = "//input[@id='uof38']")
	private WebElement makeachinfo;

	@FindBy(xpath = "//input[@id='uof13']")
	private WebElement enablereseller;

	@FindBy(xpath = "//input[@id='uof10']")
	private WebElement enableemailaccout;

	@FindBy(xpath = "//input[@id='uof11']")
	private WebElement enablecreditcardonsignup;

	@FindBy(xpath = "//span[@id='uof63_ctl']/select[@id='uof63']")
	private WebElement select;

	@FindBy(xpath = "//input[@id='uof14']")
	private WebElement bidderprivilegesuponsignup;

	Common common = new Common(driver);

	/**
	 * Constructor
	 * 
	 * @param Dashboard
	 *            driver
	 */
	public AdminDashboardPage(WebDriver driver) {
		super(driver);

	}

	/**
	 * Verify User Profile Page
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public void verifyUserProfilePage() throws InterruptedException {

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

		System.out.println("Click on settings tab.");
		common.log("<br></br> Step :: Click on settings tab. ::");
		common.waitForConditionIsElementPresent("//a[@title='Settings']");
		common.jsClick(settings);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

		System.out.println("Click on manage system parameters.");
		common.log("<br></br> Step :: Click on manage system parameters. ::");
		common.waitForConditionIsElementPresent("//a[@title='Manage System Parameters']");
		common.jsClick(managesystemparameters);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

		System.out.println("Click on user option link.");
		common.log("<br></br> Step :: Click on user option link. ::");
		common.waitForConditionIsElementPresent("//a[text()='Users options']");
		common.jsClick(usersoptions);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

		System.out.println("maximize the registration settings.");
		common.log("<br></br> Step :: \"maximize the registration settings.\" ::");
		common.waitForConditionIsElementPresent("//div[@class='legend_div'] [text()='Registration Settings ']//a");
		common.jsClick(registrationsettingsmaximize);
		common.waitForConditionIsElementPresent("//div[@class='form action-parameters-form']");
	}

	/**
	 * Verify Checked Checkbox On Registration Feature
	 * 
	 * @throws AWTException
	 */
	public void verifyCheckedCheckboxONRegistrationSettingsModule()
			throws AWTException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			common.jsClick(simplifiedsignuppage);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked virify email upon account registration checkbox");
			common.jsClick(verifyemailuponaccountregistration);

		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked virify required credit card signup");
			common.jsClick(verifycreditcardsignup);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common.isElementPresent("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step :: Click on save changes button.");
		common.jsClick(savechanges);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Checked Checkbox Simplyfied Signup
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxSimplyfiedSignup() throws ParseException {

		if (common.isElementPresent("//input[@id='uof2']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			common.jsClick(simplifiedsignuppage);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");
	}

	/**
	 * Verify Checked Checkbox Simplyfied Signup
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxBasicInfoMandatory() throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementDisplayed("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

		}

		else if (common.isElementDisplayed("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);
		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);
		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");
	}

	/**
	 * Verify Checked Checkbox Simplyfied Signup
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxBillingInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);
		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {
			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {
			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Checked Checkbox Simplyfied Signup with CC Infomation Mandatory
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxCCInfoMandatory() throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);
		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

		} else if (common.isElementDisplayed("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof35'][@checked='checked']")) {

		} else if (common.isElementDisplayed("//input[@id='uof35']")) {

			common.jsClick(makeccinfomandatory);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Checked Checkbox Simplyfied Signup with ACH Information Mandatory
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxACHInfoMandatory() throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@type='checkbox']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);
		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

		} else if (common.isElementDisplayed("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

		} else if (common.isElementDisplayed("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) billing address info (not
	 * mandatory)
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryAndBillingAddressInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);
		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);
		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);
		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) billing address info (not
	 * mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryAndBillingAddressInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);
		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);
		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) billing address info (not
	 * mandatory)
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryAndBillingAddressInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);
		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);
		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) billing address info
	 * (mandatory)
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryAndBillingAddressInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);
		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);
		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) billing address info
	 * (mandatory)
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryAndCCInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);
		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);
		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);
		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (Not mandatory) billing address info
	 * (mandatory)
	 * 
	 * @throws ParseException
	 * 
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryAndCCInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);
		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);
		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) billing address info
	 * (mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryAndCCInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);
		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);
		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);
		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) ACH info (Not mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryAndACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);
		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);
		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);
		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);
		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (Not mandatory) ACH info (mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryAndACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			// common.jsClick(simplifiedsignuppage);

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);
		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);
		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);
		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up basic info (Mandatory) ACH info (mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryAndACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);
		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up Billing info (Mandatory) CC info (Not mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoMandatoryAndCCInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up billing info (Not Mandatory) CC info ( mandatory)
	 * 
	 * @throws ParseException
	 */

	public void verifyCheckedCheckboxBillingInfoNotMandatoryAndCCInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up billing info (Mandatory) CC info ( mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoMandatoryAndCCInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up billing info (Mandatory) ACH info (Not mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoMandatoryAndACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up billing info (Not Mandatory) ACH info (mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoNotMandatoryAndACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up billing info (Mandatory) ACH info (mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoMandatoryAndACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up CC (Mandatory) ACH info (Not mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxCCInfoNotMandatoryAndACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up CC (Not Mandatory) ACH info (mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxCCInfoNotMandatoryAndACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular Sign up CC (Mandatory) ACH info (mandatory)
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxCCInfoMandatoryAndACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);
		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info not
	 * Mandatory CC info not mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoNotMandatoryCCInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);
		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}
		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory CC info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoMandatoryCCInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);
		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}
		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Not Mandatory CC info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoNotMandatoryCCInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info
	 * Mandatory CC info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoMandatoryCCInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info Not
	 * andatory CC info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoNotMandatoryCCInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info Not
	 * andatory CC info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoMandatoryCCInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info
	 * Mandatory CC info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoMandatoryCCInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info Not
	 * Mandatory ACH info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoNotMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory ACH info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Not Mandatory ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info
	 * Mandatory ACH info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info Not
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);
		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory CC info Mandatory ACH
	 * info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory CC info Not Mandatory
	 * ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory CC info Mandatory ACH
	 * info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryCCInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory CC info Not Mandatory ACH
	 * info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryCCInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory CC info Mandatory ACH
	 * info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryCCInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory CC info Mandatory ACH
	 * info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryCCInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Billing info Mandatory CC info Not Mandatory
	 * ACH Not info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Billing info Mandatory CC info Not Mandatory
	 * ACH Not info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Billing info Not Mandatory CC info Not
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Billing info Mandatory CC info Mandatory ACH
	 * Not info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Billing info Mandatory CC info Not Mandatory
	 * ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoMandatoryCCInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Billing info not Mandatory CC info Mandatory
	 * ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoNotMandatoryCCInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Billing info Mandatory CC info Mandatory ACH
	 * info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBillingInfoMandatoryCCInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Not
	 * Mandatory CC info Not Mandatory ACH info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info
	 * Mandatory CC info Not Mandatory ACH info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info Not
	 * Mandatory CC info Mandatory ACH info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info Not
	 * Mandatory CC info Not Mandatory ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Mandatory CC
	 * info Not Mandatory ACH info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Not
	 * Mandatory CC info Mandatory ACH info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Not
	 * Mandatory CC info Not Mandatory ACH info Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info
	 * Mandatory CC info Mandatory ACH info Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info
	 * Mandatory CC info Not Mandatory ACH Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info Not
	 * Mandatory CC info Mandatory ACH Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Mandatory CC
	 * info Mandatory ACH Not Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Mandatory CC
	 * info Not Mandatory ACH Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Not
	 * Mandatory CC info Mandatory ACH Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info
	 * Mandatory CC info Mandatory ACH Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Mandatory CC
	 * info Mandatory ACH Mandatory
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoMandatory()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			// common.jsClick(includebasicinfo);

		}

		else if (common.isElementPresent("//input[@id='uof31']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			// common.jsClick(makebasicinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof32']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			// common.jsClick(includeBillingInfo);

		}

		else if (common.isElementPresent("//input[@id='uof33']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			// common.jsClick(makeBillingAddressInfoMandatory);

		}

		else if (common.isElementPresent("//input[@id='uof34']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			// common.jsClick(includeccinfo);
		}

		else if (common.isElementPresent("//input[@id='uof35']")) {

			common.jsClick(includeccinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			// common.jsClick(makeccinfomandatory);

		}

		else if (common.isElementPresent("//input[@id='uof36']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			// common.jsClick(includeACHinfo);

		}

		else if (common.isElementPresent("//input[@id='uof37']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			// common.jsClick(makeachinfo);

		}

		else if (common.isElementPresent("//input[@id='uof38']")) {

			common.jsClick(makeachinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistration
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistration()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

			common.jsClick(enableemailaccout);
		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistration
	 * Verified Email Upon Account Registration Checked
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistrationVerifiedEmailUponAccountRegistrationChecked()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			// common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);
		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

			common.jsClick(enableemailaccout);
		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistration
	 * Verified Email Upon Account Registration Checked
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUp()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof11']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		String OnRegistration = "CAPTURE";
		WebElement option = select.findElement(By
				.xpath("//span[@id='uof63_ctl']//option[contains(text(),'"
						+ OnRegistration + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		this.driver.findElement(By.xpath("//input[@id='uof64']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof64']"))
				.sendKeys("10");

		this.driver.findElement(By.xpath("//input[@id='uof65']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof65']"))
				.sendKeys("-1");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpActiveOnAuthorizeAmount
	 * 
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpActiveOnAuthorizeAmount()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof11']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		String OnRegistration = "AUTHORIZE";
		WebElement option = select.findElement(By
				.xpath("//span[@id='uof63_ctl']//option[contains(text(),'"
						+ OnRegistration + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		this.driver.findElement(By.xpath("//input[@id='uof64']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof64']"))
				.sendKeys("10");

		this.driver.findElement(By.xpath("//input[@id='uof65']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof65']"))
				.sendKeys("-1");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpActiveOnNoneAmount
	 * 
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpActiveOnNoneAmount()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof11']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		String OnRegistration = "NONE";
		WebElement option = select.findElement(By
				.xpath("//span[@id='uof63_ctl']//option[contains(text(),'"
						+ OnRegistration + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		this.driver.findElement(By.xpath("//input[@id='uof64']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof64']"))
				.sendKeys("10");

		this.driver.findElement(By.xpath("//input[@id='uof65']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof65']"))
				.sendKeys("-1");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Admin Logout
	 * 
	 */
	public void adminLogout() {

		common.log("<br></br> Step  :: Click on logout from Admin");
		common.waitForConditionIsElementPresent("//a[text()='Logout']");
		common.jsClick(adminLogout);

	}

	/**
	 * Create New Auction
	 * 
	 * @throws InterruptedException
	 * @throws ParseException
	 */
	public void CreateNewAuction(String Name) throws InterruptedException,
			ParseException {

		String Description = common.generateRandomChars(500);

		common.clickOnAuctionPage();
		common.waitForConditionIsElementPresent("//input[@id='alf2']");
		common.jsClick(createnewauction);
		common.waitForConditionIsElementPresent("//div[text()='Create auction']");

		/**
		 * Select Auction Type
		 * 
		 */
		String AuctionType = "Live";
		WebElement option = auctiontype.findElement(By
				.xpath("//span[@id='aip0_ctl']//option[contains(text(),'"
						+ AuctionType + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		common.jsClick(clerking); // Click on clerking style

		String currentDate = common.currentDate();
		common.type("//input[@id='aip2']", currentDate); // Type Current Type

		common.type("//input[@id='aip30']", "10"); // Number Of Days

		common.type("//input[@id='aip13']", Name); // Enter Name

		driver.switchTo().frame(0);
		// driver.findElement(By.xpath("//iframe[@aria-describedby='cke_38']"));
		WebElement editable = driver.switchTo().activeElement();
		editable.sendKeys(Description);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		// driver.findElement(By.xpath("//iframe[@aria-describedby='cke_38']"));
		WebElement editable1 = driver.switchTo().activeElement();
		editable1.sendKeys(Description);
		driver.switchTo().defaultContent();

		common.checkChkBox(publish); // Check the checkbox on Publish

		common.jsClick(newauctionsavechanges); // Click on save changes button

		// common.type("//html//body", Description);

		common.acceptAlert(); // Accept Alert

		System.out.println(currentDate);
		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpOnExpriedCC
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpOnExpriedCC()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof11']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		String OnRegistration = "AUTHORIZE";
		WebElement option = select.findElement(By
				.xpath("//span[@id='uof63_ctl']//option[contains(text(),'"
						+ OnRegistration + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		this.driver.findElement(By.xpath("//input[@id='uof64']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof64']"))
				.sendKeys("10");

		this.driver.findElement(By.xpath("//input[@id='uof65']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof65']"))
				.sendKeys("-1");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpOnExpriedCCNONECC
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpOnExpriedCCNONECC()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof11']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		String OnRegistration = "NONE";
		WebElement option = select.findElement(By
				.xpath("//span[@id='uof63_ctl']//option[contains(text(),'"
						+ OnRegistration + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		this.driver.findElement(By.xpath("//input[@id='uof64']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof64']"))
				.sendKeys("10");

		this.driver.findElement(By.xpath("//input[@id='uof65']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof65']"))
				.sendKeys("-1");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		// common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistration
	 * Verified Email Upon Account Registration Checked NO CC
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithNoCC()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof11']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		String OnRegistration = "AUTHORIZE";
		WebElement option = select.findElement(By
				.xpath("//span[@id='uof63_ctl']//option[contains(text(),'"
						+ OnRegistration + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		this.driver.findElement(By.xpath("//input[@id='uof64']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof64']"))
				.sendKeys("10");

		this.driver.findElement(By.xpath("//input[@id='uof65']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof65']"))
				.sendKeys("-1");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		// common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistration
	 * Verified Email Upon Account Registration Checked NO CC
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithNoCCNoneCC()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common
				.isElementDisplayed("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common
				.isElementDisplayed("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common
				.isElementDisplayed("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof11']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		String OnRegistration = "NONE";
		WebElement option = select.findElement(By
				.xpath("//span[@id='uof63_ctl']//option[contains(text(),'"
						+ OnRegistration + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		this.driver.findElement(By.xpath("//input[@id='uof64']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof64']"))
				.sendKeys("10");

		this.driver.findElement(By.xpath("//input[@id='uof65']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof65']"))
				.sendKeys("-1");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithCorrectCCNoneModule
	 * 
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithCorrectCCNoneModule()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			// common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common.isElementPresent("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof11']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		String OnRegistration = "NONE";
		WebElement option = select.findElement(By
				.xpath("//span[@id='uof63_ctl']//option[contains(text(),'"
						+ OnRegistration + "')]"));
		System.out.println(option + ">>>>");
		option.click();

		this.driver.findElement(By.xpath("//input[@id='uof64']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof64']"))
				.sendKeys("10");

		this.driver.findElement(By.xpath("//input[@id='uof65']")).clear();
		this.driver.findElement(By.xpath("//input[@id='uof65']")).sendKeys("0");

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

		common.log("BUG: CC automatically checked");

	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithRequireCCOnSignUpBecomesAutomaticallyChecked
	 * 
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithRequireCCOnSignUpBecomesAutomaticallyChecked()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common.isElementPresent("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		if (common.isElementPresent("//input[@id='uof11'][@checked='checked']")) {

		}

		else if (common.isElementPresent("//input[@id='uof11']")) {

			common.jsClick(enablecreditcardonsignup);

		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		String getAmount = common.getValue("//input[@id='uof64']");
		System.out.println(getAmount + "####");

		common.log("Verify Require CC on signup becomes automatically checked with NONE/0/-1");
		common.assertTwoValuesAreEqual(getAmount, "0");
		String getExpiresAmount = common.getValue("//input[@id='uof65']");
		common.assertTwoValuesAreEqual(getExpiresAmount, "-1");

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");
	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithIncludeCCinfomakeCCinforequiredBecomesAutomaticallyCheckedUnderTheSimplifiedSignupSection
	 * 
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithIncludeCCinfomakeCCinforequiredBecomesAutomaticallyCheckedUnderTheSimplifiedSignupSection()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			// common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common.isElementPresent("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.log("Verify Mandatory Fields to become automatically checked under the simplified signup section");
		common.assertElementPresent("//input[@id='uof35'][@checked='checked']");
		common.assertElementPresent("//input[@id='uof36'][@checked='checked']");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");
	}

	/**
	 * verifyCheckedCheckboxRegularSignupWithAutoAssignPreferredBidderPrivilegesUpOnSIgnup
	 * 
	 * 
	 * @throws ParseException
	 */
	public void verifyCheckedCheckboxRegularSignupWithAutoAssignPreferredBidderPrivilegesUpOnSIgnup()
			throws ParseException {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			// common.jsClick(simplifiedsignuppage);

			common.log("Checked simplified signup checkbox");

		}

		else if (common.isElementPresent("//input[@id='uof2']")) {

			common.jsClick(simplifiedsignuppage);

		}

		if (common.isElementPresent("//input[@id='uof31'][@checked='checked']")) {

			common.jsClick(includebasicinfo);

		}

		if (common.isElementPresent("//input[@id='uof32'][@checked='checked']")) {

			common.jsClick(makebasicinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof33'][@checked='checked']")) {

			common.jsClick(includeBillingInfo);

		}

		if (common.isElementPresent("//input[@id='uof34'][@checked='checked']")) {

			common.jsClick(makeBillingAddressInfoMandatory);

		}

		if (common.isElementPresent("//input[@id='uof35'][@checked='checked']")) {

			common.jsClick(includeccinfo);
		}

		if (common.isElementPresent("//input[@id='uof36'][@checked='checked']")) {

			common.jsClick(makeccinfomandatory);

		}

		if (common.isElementPresent("//input[@id='uof37'][@checked='checked']")) {

			common.jsClick(includeACHinfo);

		}

		if (common
				.isElementDisplayed("//input[@id='uof38'][@checked='checked']")) {

			common.jsClick(makeachinfo);

		}

		if (common.isElementPresent("//input[@id='uof10'][@checked='checked']")) {

			common.jsClick(enableemailaccout);

		}

		else if (common.isElementPresent("//input[@id='uof10']")) {

		}

		if (common.isElementPresent("//input[@id='uof13'][@checked='checked']")) {

			common.jsClick(enablereseller);
		}

		if (common.isElementPresent("//input[@id='uof14'][@checked='checked']")) {

		}

		else if (common.isElementPresent("[@checked='checked']")) {

			common.jsClick(bidderprivilegesuponsignup);

		}
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on save changes button.");
		common.jsClick(savechanges);

		common.currentDate();

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br>Step  :: Click on \"Ok \" alert");
		common.acceptAlert();

		common.waitForConditionIsElementPresent("//a[text()='Home']");

		common.log("Verify Mandatory Fields to become automatically checked under the simplified signup section");

		common.jsClick(homebutton);

		common.waitForConditionIsElementPresent("//div[@class='panel-title active-auctions']");

	}

	/**
	 * Add A Lot
	 * 
	 * @return
	 */
	public LotVerificationPage addALot(String lotName) {

		common.waitForConditionIsElementPresent("//a[@title='Auction Lots']");
		common.jsClick(auctionlots); // Click on Auction Lots

		common.waitForConditionIsElementPresent("//input[@id='alf3']");
		common.jsClick(addLot); // Click on Add Lot

		common.waitForConditionIsElementPresent("//input[@id='lip8']");
		common.type("//input[@id='lip8']", "1"); // Lot Number
		common.type("//input[@id='lip9']", lotName); // Unique Lot Name

		common.type("//input[@id='lip16']", "100"); // Low EST
		common.type("//input[@id='lip17']", "300"); // High EST
		common.type("//input[@id='lip18']", "100"); // Starting Bid

		common.jsClick(saveandexit); // Save and Exit

		common.pause(15);
		// return lotName != null;
		// return true;
		return new LotVerificationPage(driver);

	}

	public void verifyRegistrationWithCCNotRequiredInitialSetup() {

		if (common.isElementPresent("//input[@id='uof2'][@checked='checked']")) {

			System.out
					.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");

			common.log("Checked simplified signup checkbox");
			common.jsClick(simplifiedsignuppage);

		}

		common.log("<br></br> Step 10 :: Click on save changes button.");
		common.jsClick(savechanges);

		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step 11 :: Click on \"Ok \" alert");
		common.acceptAlert();
	}

	/**
	 * Go To Front End and Enter Registration Details
	 * 
	 * @return
	 */
	public SignupPage goToFrontEndAndEnterRegistrationDetails() {

		common.pause(4);
		System.out
				.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-");
		common.log("<br></br> Step  :: go to frontend");
		driver.get("https://v2-10.auctionserver.net/signup/");

		return new SignupPage(driver);

	}

	/**
	 * Go To Admin Users Page
	 * 
	 * @return
	 */
	public AdminUsers goToUsersPage() {

		common.waitForConditionIsElementPresent("//a[text()='Users']");
		common.jsClick(users);

		return new AdminUsers(driver);

	}
}
