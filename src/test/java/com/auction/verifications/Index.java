package com.auction.verifications;

import java.awt.AWTException;
import java.text.ParseException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.auction.init.Common;
import com.auction.init.SeleniumInit;

public class Index extends SeleniumInit {

	Common common = new Common(driver);

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Login Method
	// -------------------------------------------------------------//
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Verify Login Feature
	 * 
	 * @throws InterruptedException
	 */
	@Test(dataProvider = "login")
	public void loginFeature(String username, String password) {
		log("Feature" + "-" + "UAT"
				+ "\"Login Feature,TestCase Name: 1.1 Login Feature.");
		log("<br></br> Step :: Enter the URL in browser address bar and hit enter.");

		loginPage = indexPage.clickOnLoginLink(); // click on login link
		loginPage.verifyLoginPageElements(); // Verify Login Page Elements
		dashboardPage = loginPage.LoginUser(username, password); // Login with
																	// valid
																	// credentials

	}

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Regular Signup
	// ------------------------------------------------------------//
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Verify Regular Sign up
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignUp(String adminUserName, String adminPassword)
			throws InterruptedException, AWTException {
		log("Feature" + "-" + "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.1 RegularSignUp");
		log("<br></br> Step :: Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxONRegistrationSettingsModule(); // Verify
																				// Checked
																				// Check
																				// box
																				// On
																				// Registration
																				// Settings
																				// Module
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUp(); // Regular Sign Up
		driver.quit();

	}

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Regular Signup with Email
	// Already Exist In The System
	// ------------------------------------------------------------//
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Verify Regular Sign up With Username Already Exist
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupalreadyEmailExist(String adminUserName,
			String adminPassword) throws InterruptedException, AWTException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp with email already exist in the system Name: 1.3 regularSignupalreadyEmailExist");
		log("<br></br> Step 1 :: Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxONRegistrationSettingsModule(); // Verify
																				// Checked
																				// Check
																				// box
																				// On
																				// Registration
																				// Settings
																				// Module
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignupWithExistingEmailUser(); // Regular Sign Up with
		// existing user
		driver.quit();

	}

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Regular Signup With Username
	// Already Exist
	// ------------------------------------------------------------//
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Verify Regular Sign up With Username Already Exist
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignUpWithUsernameAlreadyExist(String adminUserName,
			String adminPassword) throws InterruptedException, AWTException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp with username already exist feature,TestCase Name: 1.2 regularSignUpWithUsernameAlreadyExist");
		log("<br></br> Step 1 :: Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxONRegistrationSettingsModule(); // Verify
																				// Checked
																				// Check
																				// box
																				// On
																				// Registration
																				// Settings
																				// Module
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignupWithExistingUser(); // Regular Sign Up with
													// existing user
		driver.quit();

	}

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Regular Signup With No
	// Captcha --------------------------------------------//
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Verify Regular Sign up No Captcha Feature
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupNoCaptcha(String adminUserName,
			String adminPassword) throws InterruptedException, AWTException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.31 RegularSignUp No Captcha Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxONRegistrationSettingsModule(); // Verify
																				// Checked
																				// Check
																				// box
																				// On
																				// Registration
																				// Settings
																				// Module
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpNoCaptcha(); // Regular Sign Up No Captcha Value
		driver.quit();
	}

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Regualr Signup With Wrong
	// Capcha -----------------------------------------//
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Verify Regular Sign up Wrong Captcha Feature
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWrongCaptcha(String adminUserName,
			String adminPassword) throws InterruptedException, AWTException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.32 RegularSignUp Wrong Captcha Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxONRegistrationSettingsModule(); // Verify
																				// Checked
																				// Check
																				// box
																				// on
																				// Registration
																				// Settings
																				// Module
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWrongCaptcha(); // Regular Sign Up with Wrong
												// Captcha Value
		driver.quit();
	}

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Regualr Signup With
	// Confirmation Is Not Checked
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Verify Regular Sign up Confirmation is not checked
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupConfirmationIsNotChecked(String adminUserName,
			String adminPassword) throws InterruptedException, AWTException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.33 RegularSignUp Confirmation Is Not Checked Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxONRegistrationSettingsModule(); // Verify
																				// Checked
																				// Check
																				// box
																				// on
																				// Registration
																				// Settings
																				// Module
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpConfirmationIsNotChecked(); // Regular Sign Up
															// with Confirmation
															// Is Not Checked
		driver.quit();
	}

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Regualr Signup With
	// Basic Information Mandatory
	// All filled out
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Verify Regular Sign up Confirmation is not checked
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatory(String adminUserName,
			String adminPassword) throws InterruptedException, AWTException,
			ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.74 Regular SignUp With Basic Information Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxBasicInfoMandatory(); // Verify
																		// Checked
																		// Check
																		// box
																		// on
																		// Simplyfied
																		// with
																		// Signup
																		// basic
																		// info
																		// mandatory
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithBasicInfoMandatory(); // Regular Sign Up
		// with Basic Information
		// Mandatory
		driver.quit();

	}

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Regualr Signup With
	// Billing Information Mandatory
	// All filled out
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Verify Regular Sign up Billing Information
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoMandatory(String adminUserName,
			String adminPassword) throws InterruptedException, AWTException,
			ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.75 Regular SignUp With Billing Information Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxBillingInfoMandatory(); // Verify
																		// Checked
																		// Check
																		// box
																		// on
																		// Simplyfied
																		// Signup
																		// with
																		// billing
																		// info
																		// mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End

		signupPage.regularSignUpWithBillingInfoMandatory();

		driver.quit();
	}

	/**
	 * Verify Regular Sign up CC is not checked
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithCCInfoMandatory(String adminUserName,
			String adminPassword) throws InterruptedException, AWTException,
			ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.76 Regular SignUp With CC Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxCCInfoMandatory(); // Verify
																	// Checked
																	// Check
																	// box
																	// on
																	// Simplyfied
																	// Signup
																	// with
																	// CC
																	// info
																	// mandatory
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithCCInfoMandatory(); // the billing info box
														// was displayed with
														// the following fields
		// - billing CC type
		// - billing CC number
		// - billing expiration date
		// - billing security code
		driver.quit();

	}

	/**
	 * Verify Regular Sign up ACH is checked
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithACHInfoMandatory(String adminUserName,
			String adminPassword) throws InterruptedException, AWTException,
			ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.77 Regular SignUp With ACH Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage.verifyCheckedCheckboxACHInfoMandatory(); // Verify
																	// Checked
																	// Check
																	// box
																	// on
																	// Simplyfied
																	// Signup
																	// with
																	// ACH
																	// info
																	// mandatory
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithACHInfoMandatory(); // the billing info box
														// was displayed with
														// the following fields
		// - billing bank routing nb
		// - billing bank account nb
		// - billing bank account type
		// - billing bank name
		// - billing bank account name

		driver.quit();
	}

	/**
	 * Verify Regular Sign up basic info (mandatory) billing address info (not
	 * mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryAndBillingAddressInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.78 Regular SignUp With * basic info mandatory and billing address info not mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryAndBillingAddressInfoNotMandatory(); //
																								// Verify
																								// Checked
																								// Checkbox
																								// BasicInfo
																								// Mandatory
																								// And
																								// Billing
																								// Address
																								// Info
																								// Not
																								// Mandatory
		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryAndBillingAddressInfoNotMandatory(); // Basic
																							// Info
																							// Mandatory
																							// And
																							// Billing
																							// Address
																							// Info
																							// Not
																							// Mandatory
		driver.quit();

	}

	/**
	 * Verify Regular Sign up basic info ( Not mandatory) billing address info (
	 * mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryAndBillingAddressInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.79 Regular SignUp With * basic info not mandatory and billing address info not mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryAndBillingAddressInfoMandatory();
		// Verify
		// Checked
		// Checkbox
		// BasicInfo
		// Mandatory
		// And
		// Billing
		// Address
		// Not
		// Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryAndBillingAddressInfoMandatory(); // Basic
																							// Info
																							// Mandatory
																							// And
																							// Billing
																							// Address
																							// Info
																							// Not
																							// Mandatory
		driver.quit();

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) billing address info (
	 * mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryAndBillingAddressInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.80 Regular SignUp With * basic info mandatory and billing address info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryAndBillingAddressInfoMandatory(); //
																							// Verify
																							// Checked
																							// Checkbox
																							// BasicInfo
																							// Mandatory
																							// And
																							// Billing
																							// Address
																							// Info
																							// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryAndBillingAddressInfoMandatory(); // Basic
																						// Info
																						// Mandatory
																						// And
																						// Billing
																						// Address
																						// Info
																						// Not
																						// Mandatory
		driver.quit();

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) CC info ( Not Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryAndCCInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.81 Regular SignUp With * basic info mandatory and CC info not mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryAndCCInfoNotMandatory(); //
																					// Verify
																					// Checked
																					// Checkbox
																					// BasicInfo
																					// Mandatory
																					// And
																					// CC
																					// Info
																					// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithBasicInfoMandatoryAndCCInfoNotMandatory(); // Basic
																				// Info
																				// Mandatory
																				// And
																				// CC
																				// Not
																				// Mandatory
		driver.quit();

	}

	/**
	 * Verify Regular Sign up basic info (Not mandatory) CC info ( Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryAndCCInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.82 Regular SignUp With * basic info Not mandatory and CC info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryAndCCInfoMandatory(); //
																					// Verify
																					// Checked
																					// Check
																					// box
																					// BasicInfo
																					// Not
																					// Mandatory
																					// And
																					// CC
																					// Info
																					// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithBasicInfoNotMandatoryAndCCInfoMandatory(); // Basic
																				// Info
																				// Mandatory
																				// And
																				// CC
																				// Info
																				// Not
																				// Mandatory
		driver.quit();

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) CC info ( Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryAndCCInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.83 Regular SignUp With * basic info  mandatory and CC info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryAndCCInfoMandatory(); //
																				// Verify
																				// Checked
																				// Check
																				// box
																				// BasicInfo
																				// Mandatory
																				// And
																				// CC
																				// Info
																				// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithBasicInfoMandatoryAndCCInfoMandatory(); // Basic
																			// Info
																			// Mandatory
																			// And
																			// CC
																			// Info
																			// Mandatory
		driver.quit();

	}

	/**
	 * Verify Regular Sign up basic info (mandatory) ACH info ( Not Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryAndACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.84 Regular SignUp With * basic info  mandatory and ACH info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryAndACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// BasicInfo
		// Mandatory
		// And
		// ACH
		// Info
		// Not
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithBasicInfoMandatoryAndACHInfoNotMandatory(); // Basic
																				// Info
																				// Mandatory
																				// And
																				// ACH
																				// Info
																				// Not
																				// Mandatory
		driver.quit();

	}

	/**
	 * Verify Regular Sign up basic info (Not Mandatory) ACH info (Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryAndACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.85 Regular SignUp With * basic info Not mandatory and ACH info Not mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryAndACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// BasicInfo
		// Not
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		// signupPage.regularSignUpWithBasicInfoNotMandatoryAndACHInfoMandatory();
		// // Basic
		// Info
		// Not
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up basic info (Mandatory) ACH info (Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryAndACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.86 Regular SignUp With * basic info Not mandatory and ACH info Not mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryAndACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// BasicInfo
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithBasicInfoNotMandatoryAndACHInfoMandatory(); // Basic
																				// Info
																				// Mandatory
																				// And
																				// ACH
																				// Info
																				// Not
																				// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up billing info (Mandatory) CC info (Not Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoMandatoryAndCCInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.87 Regular SignUp With * billing info mandatory and CC info Not mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoMandatoryAndCCInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// CC
		// Info Not
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithBillingInfoMandatoryAndCCInfoNotMandatory(); // Billing
																					// Info
																					// Mandatory
																					// And
																					// CC
																					// Info
																					// Not
																					// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up billing info (Not Mandatory) CC info (Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoNotMandatoryAndCCInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.88 Regular SignUp With * billing info Not mandatory and CC info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoNotMandatoryAndCCInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info Not
		// Mandatory
		// And
		// CC
		// Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithBillingInfoNotMandatoryAndCCInfoMandatory(); // Billing
																					// Info
																					// Not
																					// Mandatory
																					// And
																					// CC
																					// Info
																					// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up billing info (Mandatory) CC info (Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoMandatoryAndCCInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.89 Regular SignUp With * billing info mandatory and CC info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoNotMandatoryAndCCInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// CC
		// Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithBillingInfoNotMandatoryAndCCInfoMandatory(); // Billing
																					// Info
																					// Mandatory
																					// And
																					// CC
																					// Info
																					// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up billing info (Mandatory) ACH info (Not Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoMandatoryAndACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.90 Regular SignUp With * billing info mandatory and ACH info Not mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoMandatoryAndACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info Not
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoMandatoryAndACHInfoNotMandatory(); // Billing
																				// Info
																				// Mandatory
																				// And
																				// ACH
																				// Info
																				// Not
																				// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up billing info (Not Mandatory) ACH info (Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoNotMandatoryAndACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.91 Regular SignUp With * billing info Not mandatory and ACH info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoNotMandatoryAndACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoNotMandatoryAndACHInfoMandatory(); // Billing
																				// Info
																				// Not
																				// Mandatory
																				// And
																				// ACH
																				// Info
																				// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up billing info (Mandatory) ACH info (Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoMandatoryAndACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.92 Regular SignUp With * billing info mandatory and ACH info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoNotMandatoryAndACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoNotMandatoryAndACHInfoMandatory(); // Billing
																				// Info
																				// Mandatory
																				// And
																				// ACH
																				// Info
																				// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up CC info (Mandatory) ACH info (Not Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithCCInfoMandatoryAndACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.93 Regular SignUp With * CC info mandatory and ACH info Not mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxCCInfoNotMandatoryAndACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// CC Info
		// Mandatory
		// And
		// ACH
		// Info Not
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithCCInfoMandatoryAndACHInfoNotMandatory(); // CC
																				// Info
																				// Mandatory
																				// And
																				// ACH
																				// Info
																				// Not
																				// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up CC info (Not Mandatory) ACH info (Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithCCInfoNotMandatoryAndACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.94 Regular SignUp With * CC info Not mandatory and ACH info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxCCInfoNotMandatoryAndACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// CC Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithCCInfoNotMandatoryAndACHInfoMandatory(); // CC
																				// Info
																				// Not
																				// Mandatory
																				// And
																				// ACH
																				// Info
																				// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular Sign up CC info (Mandatory) ACH info (Mandatory)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithCCInfoMandatoryAndACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.95 Regular SignUp With * CC info mandatory and ACH info mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxCCInfoMandatoryAndACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// CC Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.regularSignUpWithCCInfoMandatoryAndACHInfoMandatory(); // CC
																			// Info
																			// Mandatory
																			// And
																			// ACH
																			// Info
																			// Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info not
	 * Mandatory CC info not mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingAddressInforNotMandatoryCCInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.96 Regular SignUp With Basic info Mandatory Billing address info not Mandatory CC info not mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoNotMandatoryCCInfoNotMandatory();
		// Verify
		// Checked
		// Check box

		// Basic Info
		// Mandatory
		// And
		// CC
		// Info Not
		// Mandatory
		// Billing Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingAddressInfoNotMandatoryAndCCinfoNotMandatory();
		// Basic Info
		// Mandatory
		// And
		// CC
		// Info Not
		// Mandatory
		// Billing Info
		// Not Mandatory
		driver.quit();
	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory CC info Not mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingAddressInforMandatoryCCInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.97 Regular SignUp With Basic info Not Mandatory Billing address info Mandatory CC info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoMandatoryCCInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// CC
		// Info Not
		// Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoMandatoryAndCCinfoNotMandatory();
		// Basic Info
		// Not Mandatory
		// And
		// CC
		// Info Not
		// Mandatory
		// Billing Info
		// Mandatory

		driver.quit();
	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Not Mandatory CC info mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingAddressInforNotMandatoryCCInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.98 Regular SignUp With Basic info Not Mandatory Billing address info Not Mandatory CC info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoNotMandatoryCCInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// CC
		// Info
		// Mandatory
		// Billing Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoNotMandatoryAndCCinfoMandatory();
		// Basic Info
		// Not Mandatory
		// And
		// CC
		// Info
		// Mandatory
		// Billing Info
		// Not Mandatory

		driver.quit();
	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info
	 * Mandatory CC info Not mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingAddressInforMandatoryCCInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.99 Regular SignUp With Basic info Mandatory Billing address info Mandatory CC info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoMandatoryCCInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// CC
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingAddressInfoMandatoryAndCCinfoNotMandatory();
		// Basic Info
		// Mandatory
		// And
		// CC
		// Info
		// Not Mandatory
		// Billing Info
		// Mandatory

		driver.quit();
	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info Not
	 * Mandatory CC info mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingAddressInforNotMandatoryCCInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.100 Regular SignUp With Basic info Mandatory Billing address info NotMandatory CC info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoNotMandatoryCCInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// CC
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingAddressInfoNotMandatoryAndCCinfoMandatory();
		// Basic Info
		// Mandatory
		// And
		// CC
		// Info
		// Mandatory
		// Billing Info
		// Not Mandatory

		driver.quit();
	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory CC info mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingAddressInforMandatoryCCInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.101 Regular SignUp With Basic info Not Mandatory Billing address info Mandatory CC info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoMandatoryCCInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// CC
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoMandatoryAndCCinfoMandatory();
		// Basic Info
		// Mandatory
		// And
		// CC
		// Info
		// Mandatory
		// Billing Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory CC info mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingAddressInforMandatoryCCInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.102 Regular SignUp With Basic info Mandatory Billing address info Mandatory CC info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoMandatoryCCInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// CC
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingAddressInfoMandatoryAndCCinfoMandatory();
		// Basic Info
		// Mandatory
		// And
		// CC
		// Info
		// Mandatory
		// Billing Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info Not
	 * Mandatory ACH info Not mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingAddressInfoNotMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.103 Regular SignUp With Basic info Mandatory Billing address info Not Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoNotMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// Billing Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingAddressInfoNotMandatoryAndACHinfoNotMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// Billing Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Not Mandatory ACH info mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingAddressInfoNotMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.105 Regular SignUp With Basic info Not Mandatory Billing address info Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoNotMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// Billing Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoNotMandatoryAndACHinfoMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// Billing Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory ACH info Not mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingAddressInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.104 Regular SignUp With Basic info Not Mandatory Billing address info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoMandatoryAndACHinfoNotMandatory();
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// Billing Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info
	 * Mandatory ACH info Not mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingAddressInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.106 Regular SignUp With Basic info Mandatory Billing address info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// Billing Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingAddressInfoMandatoryAndACHinfoNotMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// Billing Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info Not
	 * Mandatory ACH info mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingAddressInfoNotMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.107 Regular SignUp With Basic info Mandatory Billing address info Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoNotMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingAddressInfoNotMandatoryAndACHinfoMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// Billing Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory Billing address info
	 * Mandatory ACH info mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingAddressInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.108 Regular SignUp With Basic info Not Mandatory Billing address info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingAddressInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingAddressInfoMandatoryAndACHinfoMandatory();
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory Billing address info
	 * Mandatory ACH info mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingAddressInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.109 Regular SignUp With Basic info Mandatory Billing address info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingAddressInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingAddressInfoMandatoryAndACHinfoMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory CC info Not Mandatory ACH
	 * info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.110 Regular SignUp With Basic info Mandatory CC info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// Billing Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory CC info Mandatory ACH
	 * info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.111 Regular SignUp With Basic info Not Mandatory CC info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CCInfo
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory CC info Not Mandatory
	 * ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.112 Regular SignUp With Basic info Not Mandatory CC info Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryCCInfoNotMandatoryAndACHinfoMandatory();
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CCInfo
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory CC info Not Mandatory
	 * ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryCCInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.113 Regular SignUp With Basic info Mandatory CC info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryCCInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CCInfo
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory CC info Not Mandatory ACH
	 * info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryCCInfoNotMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.114 Regular SignUp With Basic info Mandatory CC info Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryCCInfoNotMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryCCInfoNotMandatoryAndACHinfoMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CCInfo
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Not Mandatory CC info Mandatory ACH
	 * info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryCCInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.115 Regular SignUp With Basic info Not Mandatory CC info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryCCInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryCCInfoMandatoryAndACHinfoMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CCInfo
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic info Mandatory CC info Mandatory ACH
	 * info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryCCInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.116 Regular SignUp With Basic info Mandatory CC info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryCCInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryCCInfoMandatoryAndACHinfoMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Billing info Mandatory CC info Not Mandatory
	 * ACH Not info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.117 Regular SignUp With Billing info Mandatory CC info Not Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoNotMandatory();
		// Basic Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Billing info Not Mandatory CC info Mandatory
	 * ACH Not info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.118 Regular SignUp With Billing info Not Mandatory CC info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Billing info Not Mandatory CC info Not
	 * Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.119 Regular SignUp With Billing info Not Mandatory CC info Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoNotMandatoryCCInfoNotMandatoryAndACHinfoMandatory();
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Billing info Mandatory CC info Mandatory ACH
	 * Not info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.120 Regular SignUp With Billing info Mandatory CC info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Billing info Mandatory CC info Not Mandatory
	 * ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoMandatoryCCInfoNotMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.121 Regular SignUp With Billing info Mandatory CC info Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoMandatoryCCInfoNotMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Billing info Not Mandatory CC info Mandatory
	 * ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoNotMandatoryCCInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.122 Regular SignUp With Billing info Not Mandatory CC info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoNotMandatoryCCInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoMandatory();
		// Billing Info
		// Mandatory
		// Not And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Billing info Mandatory CC info Mandatory ACH
	 * info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBillingInfoMandatoryCCInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.123 Regular SignUp With Billing info Mandatory CC info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBillingInfoMandatoryCCInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBillingInfoMandatoryCCInfoMandatoryAndACHinfoMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Not
	 * Mandatory CC info Not Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.124 Regular SignUp With Basic Info Mandatory Billing info Not Mandatory CC info Not Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info
	 * Mandatory CC info Not Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.125 Regular SignUp With Basic Info Not Mandatory Billing info Mandatory CC info Not Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info Not
	 * Mandatory CC info Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.126 Regular SignUp With Basic Info Not Mandatory Billing info Not Mandatory CC info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory
		// Basic Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory
		// Basic Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info Not
	 * Mandatory CC info Not Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.127 Regular SignUp With Basic Info Not Mandatory Billing info Not Mandatory CC info Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory
		// Basic Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryAndACHinfoMandatory();
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Mandatory CC
	 * info Not Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.128 Regular SignUp With Basic Info Mandatory Billing info Mandatory CC info Not Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Not
	 * Mandatory CC info Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.129 Regular SignUp With Basic Info Mandatory Billing info Not Mandatory CC info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info`
		// Not Mandatory
		// CC Info
		// Mandatory
		// Basic Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory
		// Basic Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Not
	 * Mandatory CC info Not Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.130 Regular SignUp With Basic Info Mandatory Billing info Not Mandatory CC info Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoNotMandatoryAndACHinfoMandatory();
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info
	 * Mandatory CC info Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.131 Regular SignUp With Basic Info Not Mandatory Billing info Mandatory CC info  Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info
	 * Mandatory CC info Not Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.132 Regular SignUp With Basic Info Not Mandatory Billing info Mandatory CC info  Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info Not
	 * Mandatory CC info Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.133 Regular SignUp With Basic Info Not Mandatory Billing info Not Mandatory CC info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Mandatory
		// Basic Info
		// Not Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoMandatory();
		// Billing Info
		// Not Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Mandatory
		// Basic Info
		// Not Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Mandatory CC
	 * info Mandatory ACH info Not Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.134 Regular SignUp With Basic Info Mandatory Billing info Mandatory CC info Mandatory ACH info Not Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoNotMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory
		// Basic Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryAndACHinfoNotMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Not Mandatory
		// CC Info
		// Mandatory
		// Basic Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Mandatory CC
	 * info Not Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.135 Regular SignUp With Basic Info Mandatory Billing info Mandatory CC info Not Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingInfoMandatoryCCInfoNotMandatoryAndACHinfoMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Not
	 * Mandatory CC info Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.136 Regular SignUp With Basic Info Mandatory Billing info Not Mandatory CC info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingInfoNotMandatoryCCInfoMandatoryAndACHinfoMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Not Mandatory Billing info
	 * Mandatory CC info Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.137 Regular SignUp With Basic Info Not Mandatory Billing info Mandatory CC info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoNotMandatoryBillingInfoMandatoryCCInfoMandatoryAndACHinfoMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		driver.quit();

	}

	/**
	 * Verify Regular SignUp With Basic Info Mandatory Billing info Mandatory CC
	 * info Mandatory ACH info Mandatory
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoMandatory(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.138 Regular SignUp With Basic Info Mandatory Billing info Mandatory CC info Mandatory ACH info Mandatory Feature.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryACHInfoMandatory();
		// Verify
		// Checked
		// Check box
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.regularSignUpWithBasicInfoMandatoryBillingInfoMandatoryCCInfoMandatoryAndACHinfoMandatory();
		// Billing Info
		// Mandatory
		// And
		// ACH
		// Info
		// Mandatory
		// CC Info
		// Not Mandatory
		// Basic Info
		// Mandatory

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with
	 * "verify email upon account registration" active "Send confirmation link"
	 * active => enter the correct email the 2nd time (link is sent) => don't
	 * click the link - check account status
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithSameSettingsasForWithVerifyEmailUponAccountRegistrationActiveAndSendConfirmationLinkWithVerifyTheMessageAccountNotVerifiedIsDisplayed(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.145 Regular SignUp With same settings as for test 1.1 (regular signup) with verify email upon account registration active Send confirmation link.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistration();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.verifyemailandConfirmemailWithAccountNotVerified(); // Verify
																		// Email
																		// And
																		// Confirm
																		// Email
																		// With
																		// Account
																		// Not
																		// Verified

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with * "verify email upon
	 * account registration" active * "Send confirmation link" active => enter
	 * the correct email the 2nd time (link is sent) => don't click the link -
	 * check account status error message displayed saying that the confirmation
	 * email doesn't match the email
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithSameSettingsasForWithVerifyEmailUponAccountRegistrationActiveAndSendConfirmationLinkWithVerifyTheMessageAccountNotVerifiedIsDisplayedAndConfirmationEmailDoesNotMatch(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.146 Regular SignUp With same settings as for test 1.1 (regular signup) with verify email upon account registration active Send confirmation link.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistration();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailandConfirmemailWithAccountNotVerifiedAndConfirmEmailDoesNotMatch(); // Verify
		// Email
		// And
		// Confirm
		// Email
		// With
		// Account
		// Not
		// Verified
		// ConfirmationEmail Does Not Match

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with * "verify email upon
	 * account registration" active * "Send confirmation link" active => enter
	 * the correct email the 2nd time (link is sent) => don't click the link -
	 * check account status error message displayed saying that the confirmation
	 * "Verify email upon account registration" is checked
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithSameSettingsasForWithVerifyEmailUponAccountRegistrationActiveAndSendConfirmationLinkWithVerifyEmailUponAccountRegistrationIsChecked(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.147 Regular SignUp With same settings as for test 1.1 (regular signup) with Verify Email up on Account Registration Is Checked.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistrationVerifiedEmailUponAccountRegistrationChecked();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailandConfirmemailWithAccountNotVerifiedAndConfirmEmailDoesNotMatchVerifiedEmailUponAccountRegistrationChecked(); // Verify
		// Email
		// And
		// Confirm
		// Email
		// With
		// Account
		// Not
		// Verified
		// ConfirmationEmail Does Not Match

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with * "verify email upon
	 * account registration" active * "Send confirmation link" active => enter
	 * the correct email the 2nd time (link is sent) => don't click the link -
	 * check account status error message displayed saying that the confirmation
	 * email doesn't match the email "Verify email upon account registration" is
	 * checked
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithSameSettingsasForWithVerifyEmailUponAccountRegistrationActiveAndSendConfirmationLinkWithVerifyEmailUponAccountRegistrationIsCheckedAndConfirmEmailDoesNotMatch(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.147 Regular SignUp With same settings as for test 1.1 (regular signup) with Verify Email up on Account Registration Is Checked.");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyEmailAccountRegistrationVerifiedEmailUponAccountRegistrationChecked();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailandConfirmemailWithAccountNotVerifiedAndConfirmEmailDoesNotMatchVerifiedEmailUponAccountRegistrationChecked(); // Verify
		// Email
		// And
		// Confirm
		// Email
		// With
		// Account
		// Not
		// Verified
		// ConfirmationEmail Does Not Match

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with
	 * "Require Credit Card on signup" active On registration = CAPTURE Amount =
	 * 10 Expires = -1
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnSignUpActive(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.158 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active On registration  CAPTURE Amount 10 Expires minus 1");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUp();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.verifyemailWithRequireCreditCardOnSignUpActive(); // Verify

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with * "Require Credit
	 * Card on signup" active * On registration = CAPTURE * Amount = 10 *
	 * Expires = -1 => use expired CC
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnExpiredCC(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.159 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active  On registration CAPTURE Amount 10  Expires -1 use expired CC");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUp();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage.verifyemailWithRequireCreditCardOnSignUpActiveAndExpiredCC(); // Verify

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with * "Require Credit
	 * Card on signup" active * * signup not successful "required" error message
	 * is displayed in red next to all the CC fields NO CC
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnRequiredErrorMessageIsDisplayedInRedNextToAllTheCCFields(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.159 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active  On same settings as for test regular signup with Require Credit Card on signup active  signup not successful required error message is displayed in red next to all the CC fields");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUp(); // Verify
																							// Checked
																							// Checkbox
																							// for
																							// Regular
																							// Signup
																							// with
																							// Verify
																							// Required
																							// Credit
																							// Card
																							// On
																							// Sign
																							// up

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailWithRequireCreditCardOnRequiredErrorMessageIsDisplayedInRedNextToAllTheCCFieldss(); // Verify
																												// Required
																												// Fields

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with
	 * "Require Credit Card on signup" active On registration = Authorize Amount
	 * = 10 Expires = -1
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnSignUpActiveOnRegistrationAuthorizeAmount(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.161 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active On registration Authorize Amount 10 Expires minus 1");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpActiveOnAuthorizeAmount();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailWithRequireCreditCardOnSignUpActiveOnRegistrationAuthorizeAmount(); // Verify
																								// Email
																								// required
																								// Credit
																								// Card
																								// On
																								// Signup
																								// Active
																								// On
																								// Registration
																								// Authorize
																								// Amount

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with * "Require Credit
	 * Card on signup" active * On registration = AUTHORIZE * Amount = 10 *
	 * Expires = -1 => use expired CC
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnSignUpActiveOnRegistrationAuthorizeAmountWithExpriedCC(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.162 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active  On registration AUTHORIZE Amount 10  Expired -1 use expired CC");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpOnExpriedCC();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailWithRequireCreditCardOnSignUpActiveAndExpiredCCOnAuthorizeAmount(); // Verify
																								// Email
																								// With
																								// Required
		// Credit Card On SignuP Active And Expired CC on Authorize Amount

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with * "Require Credit
	 * Card on signup" active * * signup not successful "required" error message
	 * is displayed in red next to all the CC fields NO CC
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnRequiredErrorMessageIsDisplayedInRedNextToAllTheCCFieldsWithNOCC(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.163 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active  On same settings as for test regular signup with Require Credit Card on signup active  signup not successful required error message is displayed in red next to all the CC fields");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithNoCC(); // Verify
		// Checked
		// Checkbox
		// for
		// Regular
		// Signup
		// with
		// Verify
		// Required
		// Credit
		// Card
		// On
		// Sign
		// up
		// NO CC

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailWithRequireCreditCardOnRequiredErrorMessageIsDisplayedInRedNextToAllTheCCFieldssithNoCC(); // Verify
		// Required
		// Fields
		// NO CC

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with
	 * "Require Credit Card on signup" active On registration = None Amount = 10
	 * Expires = -1 NONE CC
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnSignUpActiveOnRegistrationNoneAmount(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.164 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active On registration None Amount 10 Expires minus 1");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpActiveOnNoneAmount();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailWithRequireCreditCardOnSignUpActiveOnRegistrationNoneAmount(); // Verify
																							// Email
																							// required
																							// Credit
																							// Card
																							// On
																							// Signup
																							// Active
																							// On
																							// Registration
																							// None
																							// Amount

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with * "Require Credit
	 * Card on signup" active * On registration = None * Amount = 10 * Expires =
	 * -1 => use expired CC
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnSignUpActiveOnRegistrationNoneAmountWithExpriedCC(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.165 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active  On registration None Amount 10  Expired -1 use expired CC");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpOnExpriedCCNONECC();

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailWithRequireCreditCardOnSignUpActiveAndExpiredCCOnNoneAmount(); // Verify
																							// Email
																							// With
																							// Required
		// Credit Card On SignuP Active And Expired CC on None Amount

		driver.quit();

	}

	/**
	 * same settings as for test 1.1 (regular signup) with * "Require Credit
	 * Card on signup" active * * signup not successful "required" error message
	 * is displayed in red next to all the CC fields NO CC(None User)
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnRequiredErrorMessageIsDisplayedInRedNextToAllTheCCFieldsWithNOCCNoneAccount(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.166 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active  On same settings as for test regular signup with Require Credit Card on signup active  signup not successful required error message is displayed in red next to all the CC fields For NONE CC");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithNoCCNoneCC(); // Verify
		// Checked
		// Checkbox
		// for
		// Regular
		// Signup
		// with
		// Verify
		// Required
		// Credit
		// Card
		// On
		// Sign
		// up
		// NO CC

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End
		signupPage
				.verifyemailWithRequireCreditCardOnRequiredErrorMessageIsDisplayedInRedNextToAllTheCCFieldssithNoCCNONECC(); // Verify
		// Required
		// Fields
		// NO CC

		driver.quit();

	}

	/**
	 * same settings as for test 2.1 (simplified signup) with
	 * "Require Credit Card on signup" active On registration = NONE Amount = 10
	 * Expires = 0 => include CC info and make CC info required is then
	 * automatically checked => use correct CC
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnSignUpWithRequireCreditCardActiveOnRegistrationNoneAmountWithCorrectCC(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.168 same settings as for test 1.1 (regular signup) with Require Credit Card on signup active  On same settings as for test regular signup with NONE Amount = 10 Expires = 0 => include CC info and make CC info required automatically checked => use correct CC");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithCorrectCCNoneModule(); // Verify
		// Checked
		// Checkbox
		// for
		// Regular
		// Signup
		// with
		// Verify
		// Required
		// Credit
		// Card
		// On
		// Sign
		// up
		// correct CC
		// Automatically Checked

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End

		driver.quit();

	}

	/**
	 * 1.169 same settings as for test 1.1 (regular signup) with * "Validate
	 * user CC upon registration" active => Make sure that "Require CC on
	 * signup" becomes automatically checked with NONE/0/-1
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnSignUpWithRequireCreditCardActiveOnRegistrationAndVerifyRequireCCOnSignUpBecomesAutomaticallyChecked(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.169 Selenium  Regular SignUp With same settings as for test 1.1 (regular signup) with require credit card on signup active on registration And Verify Require CC on Signup Becomes automatically checked");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithRequireCCOnSignUpBecomesAutomaticallyChecked(); // Verify
		// Checked
		// Checkbox
		// for
		// Regular
		// Signup
		// with
		// Verify
		// Required
		// Credit
		// Card
		// On
		// Sign
		// up
		// Automatically Checked

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End

		driver.quit();

	}

	/**
	 * 1.170 same settings as for test 2.1 (simplified signup) with * "Validate
	 * user CC upon registration" active => Make sure that "Include CC info" and
	 * "make CC info required" becomes automatically checked under the
	 * simplified signup section
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnSignUpWithIncludeCCinfomakeCCinforequiredBecomesAutomaticallyCheckedUnderTheSimplifiedSignupSection(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Regular SignUp Feature,TestCase Name: 1.170 Selenium  Regular SignUp With same settings as for test 1.1 (regular signup) with require credit card on signup active on registration And Verify Include CC info and make CC info required becomes automatically checked under the simplified signup section");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithVerifyRequireCreditCardOnSignUpWithIncludeCCinfomakeCCinforequiredBecomesAutomaticallyCheckedUnderTheSimplifiedSignupSection(); // Verify
		// Checked
		// Checkbox
		// for
		// Regular
		// Signup
		// with
		// Verify
		// Required
		// Credit
		// Card
		// On
		// Sign
		// up
		// With IncludeCC info Make CC info require BecomesAutomatically checked
		// Under The Simplified Signup Section

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End

		driver.quit();

	}

	/**
	 * 1.181 same settings as for test 2.1 (simplified signup) with * "Auto
	 * assign preferred bidder privileges upon signup" active * "Include CC
	 * info" is active * use no CC simplified signup section
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException
	 */
	@Test(dataProvider = "regularsignup")
	public void regularSignupWithRequireCreditCardOnSignUpWithAutoAssignPreferredBidderPrivilegesUponSignupActiveIncludeCCInfoIsActiveAndNoCC(
			String adminUserName, String adminPassword)
			throws InterruptedException, AWTException, ParseException {
		log("Feature"
				+ "-"
				+ "UAT"
				+ "\"Selenium  Regular SignUp With same settings as for test 2.1 (regular signup) with Auto assign preferred bidder privileges upon signup active Include CC info is active and use no cc");
		log("<br></br> Step 1 : Enter the URL in browser address bar and hit enter.");

		driver.get("https://v2-10.auctionserver.net/admin"); // Admin URL
		adminDashboardPage = indexPage // Admin Signin
				.adminSignin(adminUserName, adminPassword);
		adminDashboardPage.verifyUserProfilePage(); // Verify Users profile page
		adminDashboardPage
				.verifyCheckedCheckboxRegularSignupWithAutoAssignPreferredBidderPrivilegesUpOnSIgnup(); // "Auto assign preferred bidder privileges upon signup"
																																														// active

		// Under The Simplified Signup Section

		adminDashboardPage.adminLogout(); // Logout From Admin
		signupPage = adminDashboardPage
				.goToFrontEndAndEnterRegistrationDetails(); // Go
															// To
															// Front
															// End

		driver.quit();

	}

	// ------------------------------------------------------------------------------------------------------------------------//
	// ------------------------------------------- Data Providers
	// ------------------------------------------------------------//
	// ------------------------------------------------------------------------------------------------------------------------//

	/**
	 * Data Provider for Login Feature
	 * 
	 * @return
	 * @throws Exception
	 */
	@DataProvider(name = "login")
	public Object[][] getLogin() throws Exception {

		Object[][] retObjectArr = parseCsv();

		return retObjectArr;

	}

	/**
	 * Data Provider for Signup Feature
	 * 
	 * @return
	 * @throws Exception
	 */
	@DataProvider(name = "signup")
	public Object[][] getSignup() throws Exception {

		Object[][] retObjectArr = parseSignUpCsv();

		return retObjectArr;

	}

	/**
	 * Data Provider for Regular Signup Feature
	 * 
	 * @return
	 * @throws Exception
	 */
	@DataProvider(name = "regularsignup")
	public Object[][] getRegularSignup() throws Exception {

		Object[][] retObjectArr = parseRegularSignupCsv();

		return retObjectArr;

	}
}
