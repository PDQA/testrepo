package com.auction.init;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.apache.james.mime4j.field.datetime.DateTime;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * Define Common Webdriver
 * 
 * @author Rahul Sharma
 */
public class Common {

	Date date = new Date();
	protected Wait<WebDriver> wait;
	protected WebDriver driver;

	public Common(WebDriver driver) {

		this.driver = driver;
	}

	/**
	 * Find web-element for given locator.
	 * 
	 * @param elementName
	 * @return
	 */
	public WebElement findElement(String elementName) {

		String locator;

		locator = elementName;

		int count = 0;
		while (count < 4) {
			try {
				if (locator.startsWith("link=") || locator.startsWith("LINK=")) {
					locator = locator.substring(5); // remove "link=" from
													// locator
					try {
						if (locator.contains(" "))
							return driver.findElement(By
									.partialLinkText(locator));

						return driver.findElement(By.linkText(locator));
					} catch (Exception e) {
						return null;
					}
				}
				if (locator.startsWith("id=")) {
					locator = locator.substring(3); // remove "id=" from locator
					try {
						return driver.findElement(By.id(locator));
					} catch (Exception e) {
						return null;
					}
				} else if (locator.startsWith("//")) {
					try {
						return driver.findElement(By.xpath(locator));
					} catch (Exception e) {
						return null;
					}
				} else if (locator.startsWith("css=")) {

					locator = locator.substring(4); // remove "css=" from
													// locator
					try {
						return driver.findElement(By.cssSelector(locator));
					} catch (Exception e) {
						return null;
					}
				} else if (locator.startsWith("name=")) {

					locator = locator.substring(5); // remove "name=" from
													// locator
					try {
						return driver.findElement(By.name(locator));
					} catch (Exception e) {
						return null;
					}
				} else {
					try {
						return driver.findElement(By.id(locator));
					} catch (Exception e) {
						return null;
					}

				}
			} catch (StaleElementReferenceException e) {
				e.toString();

				count = count + 1;
				// System.out.println("Trying["+
				// count+"] to recover from a stale element :" +
				// e.getMessage());
			}
			count = count + 4;
		}
		return null;

	}

	/**
	 * Checks checkbox or toggle element.
	 * 
	 * @param element
	 *            Checkbox element.
	 */
	public void checkChkBox(WebElement element) {

		boolean isCheckBoxSet;

		isCheckBoxSet = element.isSelected();

		if (!isCheckBoxSet) {

			element.click();

		}

	}

	/**
	 * Open Mailinator
	 * 
	 * @param emailAddress
	 */
	public void openMailinator(String emailAddress) {
		pause(3);
		String emailParsed[] = emailAddress.split("@");
		String url = "http://" + emailParsed[0] + ".mailinator.com";
		open(url);
	}

	/**
	 * Accept Alert
	 * 
	 */
	public void acceptAlert() {

		pause(4);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	/**
	 * Click on Auction Page
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnAuctionPage() throws InterruptedException {

		waitForElementIsDisplayed(By.xpath("//a[text()='Auctions']"));
		driver.findElement(By.xpath("//a[text()='Auctions']")).click();

	}

	/**
	 * Refresh Page
	 * 
	 */
	public void refreshPage() {

		driver.navigate().refresh();
	}

	/**
	 * Current Date to Tomorrow's Date
	 * 
	 * @throws ParseException
	 * 
	 */
	public String currentDate() throws ParseException {

		Date dateNow = new Date();
		SimpleDateFormat dateformatyyyyMMdd = new SimpleDateFormat("MM/dd/yyyy"); // Date
																					// Format
		String date_to_string = dateformatyyyyMMdd.format(dateNow);
		String untildate = date_to_string; // Current Date
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // Format

		return untildate;

	}

	/**
	 * TomorrowDate
	 * 
	 * @return
	 * @throws ParseException
	 */
	public String tomorrowDate() throws ParseException {

		Date dateNow = new Date();
		SimpleDateFormat dateformatyyyyMMdd = new SimpleDateFormat("MM/dd/yyyy"); // Date
																					// Format
		String date_to_string = dateformatyyyyMMdd.format(dateNow);
		String untildate = date_to_string;// Current Date
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance(); // Get Calendar Instance
		cal.setTime(dateFormat.parse(untildate));

		// Tomorrow's Date
		cal.add(Calendar.DATE, 1); // Date Increase by One
		String convertedDate = dateFormat.format(cal.getTime());
		System.out.println("Date increase by one.." + convertedDate);

		return convertedDate;

	}

	/**
	 * Gets current time in the following format Month, Date, Hours, Minutes,
	 * Seconds, Millisecond.
	 * 
	 * @return Current date.
	 */
	public String getCurrentTimeStampString() {

		java.util.Date date = new java.util.Date();

		SimpleDateFormat sd = new SimpleDateFormat("MMddHHmmssSS");
		TimeZone timeZone = TimeZone.getDefault();
		Calendar cal = Calendar.getInstance(new SimpleTimeZone(timeZone
				.getOffset(date.getTime()), "GMT"));
		sd.setCalendar(cal);
		return sd.format(date);
	}

	/**
	 * Takes screenshot and adds it to TestNG report.
	 * 
	 * @param driver
	 *            WebDriver instance.
	 */
	public void makeScreenshot(WebDriver driver, String screenshotName) {

		WebDriver augmentedDriver = new Augmenter().augment(driver);

		/* Take a screenshot */
		File screenshot = ((TakesScreenshot) augmentedDriver)
				.getScreenshotAs(OutputType.FILE);
		String nameWithExtention = screenshotName + ".png";

		/* Copy screenshot to specific folder */
		try {
			String reportFolder = "target" + File.separator
					+ "failsafe-reports" + File.separator + "firefox"
					+ File.separator;
			String screenshotsFolder = "screenshots";
			File screenshotFolder = new File(reportFolder + screenshotsFolder);
			if (!screenshotFolder.getAbsoluteFile().exists()) {
				screenshotFolder.mkdir();
			}
			FileUtils.copyFile(screenshot, new File(screenshotFolder
					+ File.separator + nameWithExtention).getAbsoluteFile());
		} catch (IOException e) {
			this.log("Failed to capture screenshot: " + e.getMessage());
		}
		log(getScreenshotLink(nameWithExtention, nameWithExtention)); // add
																		// screenshot
																		// link
																		// to
																		// the
																		// report
	}

	/**
	 * Log given message to Reporter output.
	 * 
	 * @param msg
	 *            Message/Log to be reported.
	 */
	public void log(String msg) {
		Reporter.log(msg);
	}

	/**
	 * Generates link for TestNG report.
	 * 
	 * @param screenshot_name
	 *            Screenshot name.
	 * @param link_text
	 *            Link text.
	 * @return Formatted link for TestNG report.
	 */
	public String getScreenshotLink(String screenshot_name, String link_text) {

		log("<br><Strong><font color=#FF0000>--Failed</font></strong>");
		return "<a href='../target/failsafe-reports/firefox/screenshots/"
				+ screenshot_name + "'>" + link_text + "</a>";
	}

	/**
	 * Checks whether the needed WebElement is displayed or not.
	 * 
	 * @param element
	 *            Needed element
	 * 
	 * @return true or false.
	 */
	public boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isElementNotDisplayed(WebElement element) {
		try {
			return !element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Select Drop down
	 * 
	 * @param dropdwon
	 */
	public void dropdownmenu(String dropdwon, String elementLocator) {

		Select dropdown = new Select(driver.findElement(By.id(elementLocator)));
		dropdown.selectByValue(dropdwon);
	}

	/**
	 * Assertion to check that given element is not being displayed.
	 * 
	 * @param locator
	 *            Locator of element.
	 */
	public void assertElementIsNotDisplayed(String locator) {

		Assert.assertFalse(isElementDisplayed(locator));
	}

	/**
	 * Wait(max. 1 minute) till given element does not disappear from page.
	 * 
	 * @param by
	 *            Locator of element.
	 * @return
	 * 
	 * @throws InterruptedException
	 */
	public boolean waitForElementIsNotDisplayed(By by)
			throws InterruptedException {

		for (int second = 0;; second++) {
			if (second >= 60) {

				break;
			}
			try {
				if (!isElementDisplayed(by))
					break;
			} catch (Exception e) {
			}
			pause(1000);
		}
		return false;
	}

	/**
	 * Wait(max. 1 minute) till given element does not disappear from page.
	 * 
	 * @param by
	 *            Locator of element.
	 * @return
	 * 
	 * @throws InterruptedException
	 */
	public boolean waitForElementIsDisplayed(By by) throws InterruptedException {

		for (int second = 0;; second++) {
			if (second >= 60) {

				break;
			}
			try {
				if (isElementDisplayed(by))
					break;
			} catch (Exception e) {
			}
			pause(1000);
		}
		return false;
	}

	/**
	 * Front End URL
	 * 
	 */
	public void openFrontEndURL() {

		driver.get("https://v2-10.auctionserver.net/"); // FrontEnd URL
	}

	/**
	 * Click on Logout From Admin
	 * 
	 */
	public void clickOnLogoutFromAdmin() {

		this.driver.findElement(By.xpath("//a[text()='Logout']")).click();
		waitForConditionIsElementPresent("//input[@id='sub']");
	}

	/**
	 * Checks if given elements is checked.
	 * 
	 * @param locator
	 *            Locator of element.
	 * 
	 * @return true if checked else false.
	 */
	public boolean isChecked(String locator) {

		return this.findElement(locator).isSelected();

	}

	/**
	 * Checks whether the needed WebElement is displayed or not.
	 * 
	 * @param elementLocator
	 * @return
	 */
	public boolean isElementDisplayed(By elementLocator) {
		try {
			return driver.findElement(elementLocator).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Checks whether the visibility of Element Located
	 * 
	 * @param by
	 * @return
	 */
	public ExpectedCondition<WebElement> visibilityOfElementLocated(final By by) {
		return new ExpectedCondition<WebElement>() {

			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(by);
				return element.isDisplayed() ? element : null;
			}
		};
	}

	/**
	 * Wait up to String locator present
	 * 
	 * @param selector
	 */
	public void waitForElement(String selector) {
		wait = new WebDriverWait(driver, 50);
		try {
			wait.until(visibilityOfElementLocated(By.cssSelector(selector)));
		} catch (TimeoutException e) {
		}
	}

	/**
	 * Finds handle to second window other than given handle to current window
	 * and switches to as well.
	 * 
	 * @param handleCurrentWindow
	 * @return handleSecondWindow
	 */
	public String findAndSwitchToSecondWindow(String handleCurrentWindow) {

		pause(1000);
		Set<String> windows = driver.getWindowHandles();
		String handleSecondWindow = null;
		for (String window : windows) {
			if (!window.contains(handleCurrentWindow)) {
				handleSecondWindow = window;
			}
		}

		// Switch to the second window.
		try {

			pause(2000);

			driver.switchTo().window(handleSecondWindow);

		} catch (Throwable failure) { // If there is problem in switching
										// window, then re-try.

			pause(1000);

			driver.switchTo().window(handleSecondWindow);

		}

		return handleSecondWindow;

	}

	/**
	 * Wait up to By element present
	 * 
	 * @param element
	 */
	public void waitForElement(By element) {
		wait = new WebDriverWait(driver, 30);
		try {
			wait.until(visibilityOfElementLocated(element));
		} catch (TimeoutException e) {
		}
	}

	/**
	 * Clicks on visible or not visible element.
	 * 
	 * @param element
	 *            Web element.
	 */
	public void jsClick(WebElement element) {
		((JavascriptExecutor) driver).executeScript(
				"return arguments[0].click();", element);
		// this.waitForAjax("0");
	}

	/**
	 * Generates random symbols;
	 * 
	 * @param length
	 *            Length of the generated symbols.
	 * 
	 * @return StringBuffer object.
	 */
	public static String generateRandomChars(int length) {
		String total = "iokijfmnbxcvfrpqsdfgvcxzdferiuytjndifur";
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < length; i++) {
			char _char = total.charAt((int) (Math.random() * 100)
					% total.length());
			buf.append(_char);
		}
		return buf.toString();
	}

	/**
	 * Generate Random Number in Length
	 * 
	 * @param length
	 * @return
	 */
	public static int GenerateRandomNumber(int length) {

		Random rand = new Random();
		int num = rand.nextInt(length);
		int numNoRange = rand.nextInt();
		return numNoRange;

	}

	/**
	 * Mouse Hover in Web element
	 * 
	 * @param element
	 */
	public void mouseOver(WebElement element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element).build().perform();

	}

	/**
	 * Get text in a given element.
	 * 
	 * @param elementName
	 *            Locator of element.
	 * 
	 * @return text in given element.
	 */
	public String getText(String elementName) {

		String text;

		try {
			text = this.findElement(elementName).getText();

		} catch (Exception e) {

			text = "Element was not found";
		}

		return text;
	}

	public void open(String url) {

		driver.get(url);
	}

	/**
	 * Select given option for given element.
	 * 
	 * @param elementName
	 * @param optionToChoose
	 */
	public void select(String elementName, String optionToChoose) {

		if (optionToChoose.startsWith("label="))
			optionToChoose = optionToChoose.substring(6);

		Select select = new Select(this.findElement(elementName));

		select.selectByVisibleText(optionToChoose);

	}

	/**
	 * Get value of given element dynamically.
	 * 
	 * @param locator
	 *            Locator of element.
	 * 
	 * @return Dynamic value.
	 */
	public String getValue(String locator) {

		return this.findElement(locator).getAttribute("value");
	}

	/**
	 * Get value of given element dynamically.
	 * 
	 * @param locator
	 *            Locator of element.
	 * 
	 * @return Dynamic value.
	 */
	public String getStyle(String locator) {

		return this.findElement(locator).getAttribute("style");
	}

	/**
	 * Assertion to check that two values are equal.
	 * 
	 * @param value1
	 *            Value-1.
	 * @param value2
	 *            Value-2.
	 */
	public void assertTwoValuesAreEqual(Object value1, Object value2) {

		Assert.assertEquals(value1, value2);
	}

	/**
	 * Checks if given element is being displayed on page.
	 * 
	 * @param elementName
	 *            Locator of element.
	 * 
	 * @return true if displayed else false.
	 */
	public boolean isElementDisplayed(String elementName) {

		WebElement webElement;
		try {
			webElement = this.findElement(elementName);
			return webElement.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Wait till given element is present.
	 * 
	 * @param locator
	 *            Locator of element.
	 */
	public void waitForConditionIsElementPresent(String locator) {

		for (int second = 0;; second++) {
			if (second >= 10) {
				break;
			}

			try {
				if (isElementPresent(locator))
					break;
			} catch (Throwable failure) {
			}

			pause(1000);
		}

	}

	/**
	 * Checks if element loaded in browser memory.
	 * 
	 * @param locator
	 *            Locator of element.
	 * @return true if loaded else false.
	 */
	public boolean isElementPresent(String locator) {

		WebElement webElement = this.findElement(locator);
		if (webElement != null) {
			return true;
		} else {

			return false;
		}
	}

	/**
	 * Assertion to check that given element is not present.
	 * 
	 * @param locator
	 *            Locator of element.
	 */
	public void assertElementNotPresent(String locator) {

		Assert.assertFalse(isElementPresent(locator));
	}

	/**
	 * Assertion to check that given element is present.
	 * 
	 * @param locator
	 *            Locator of element.
	 */
	public void assertElementPresent(String locator) {

		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * Pauses for given seconds.
	 * 
	 * @param secs
	 */
	public void pause(int secs) {
		try {
			Thread.sleep(secs * 200);
		} catch (InterruptedException interruptedException) {

		}
	}

	/**
	 * Get random numeric of given length.
	 * 
	 * @param length
	 *            desired length.
	 * @return
	 */
	public int randomNumericValueGenerate(int length) {

		Random randomGenerator = new Random();

		int randomInt = randomGenerator.nextInt(length);
		return randomInt;
	}

	/**
	 * Clears and type new value into given text-box.
	 * 
	 * @param locator
	 * 
	 * @param value
	 *            New text/value.
	 */
	public void type(String locator, String value) {

		this.findElement(locator).clear();
		this.findElement(locator).sendKeys(value);

	}

	/**
	 * Wait till all ajax calls finish.
	 * 
	 * @param num
	 *            Number of ajax calls to finish.
	 */
	public void waitForAjax(String num) {

		String ajax;

		ajax = this.ajaxFinised(num);

		for (int second = 0;; second++) {
			if (second >= 20) {
				break;
			} else if (ajax.equals("true")) {
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * Wait till ajax call finish.
	 * 
	 * @throws InterruptedException
	 */
	public void WaitForAjax() throws InterruptedException {

		String ajax;
		ajax = this.ajaxFinised("1");

		for (int second = 0;; second++) {
			if (second >= 15) {
				break;
			} else if (ajax.equals("true")) {
				break;
			}
			Thread.sleep(1000);
		}

	}

	/**
	 * Admin {URL}
	 * 
	 */
	public void adminURL() {

		this.driver.get("http://v2-10.auctionserver.net/admin/");
	}

	/**
	 * Checks that all ajax calls are completed on page.
	 * 
	 * @param num
	 *            Number of ajax calls to wait for completion.
	 * 
	 * @return "true" if completed else "false".
	 */
	public String ajaxFinised(String num) {

		Object isAjaxFinished;

		JavascriptExecutor js = (JavascriptExecutor) driver;

		isAjaxFinished = js.executeScript("return jQuery.active == " + num);

		return isAjaxFinished.toString();

	}

	/**
	 * Clears and type new value into given text-box.
	 * 
	 * @param locator
	 *            Locator of element.
	 * 
	 * @param value
	 *            New text/value.
	 */
	public void typeNew(String locator, String newValue) {

		this.findElement(locator).clear();
		this.findElement(locator).sendKeys(newValue);

	}
}
