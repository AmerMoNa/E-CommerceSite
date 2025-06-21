package E_commerceSite.E_commerceSite;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest extends testData {

	@BeforeTest
	public void mySetup() {

		setUp();

	}

	@Test(priority = 1)
	public void signUp() {
		WebElement signUpPage = driver.findElement(By.linkText("Signup / Login"));
		signUpPage.click();

		WebElement nameField = driver.findElement(By.name("name"));
		nameField.sendKeys(randomName);

		WebElement emailField = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		emailField.sendKeys(email);

		WebElement signUpButton = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		signUpButton.click();

	}

	@Test(priority = 2)
	public void accountInformation() {
		List<WebElement> title = driver.findElements(By.className("radio-inline"));
		int randomTitle = rand.nextInt(title.size());
		title.get(randomTitle).click();

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys(password);

		WebElement dateOfDay = driver.findElement(By.id("days"));
		dateOfDay.click();
		List<WebElement> allDays = dateOfDay.findElements(By.tagName("option"));
		int randomDay = rand.nextInt(allDays.size());
		allDays.get(randomDay).click();

		WebElement dateOfMonth = driver.findElement(By.id("months"));
		dateOfMonth.click();
		List<WebElement> allMonths = dateOfMonth.findElements(By.tagName("option"));
		int randomMonth = rand.nextInt(allMonths.size());
		allMonths.get(randomMonth).click();

		WebElement dateOfYears = driver.findElement(By.id("years"));
		dateOfYears.click();
		List<WebElement> allYears = dateOfYears.findElements(By.tagName("option"));
		int randomYears = rand.nextInt(allYears.size());
		allYears.get(randomYears).click();

		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys(names[randomFirstName]);

		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys(names[randomLastName]);

		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys(companies[randomCompany]);

		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys(addresses[randomAddress]);

		WebElement country = driver.findElement(By.id("country"));
		List<WebElement> allCountries = country.findElements(By.tagName("option"));
		int randomCountry = rand.nextInt(allCountries.size());
		allCountries.get(randomCountry).click();

		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys(states[randomState]);

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys(cities[randomCity]);

		WebElement zipcode = driver.findElement(By.id("zipcode"));
		zipcode.sendKeys(randomThreeNumber);

		WebElement mobileNumber = driver.findElement(By.id("mobile_number"));
		mobileNumber.sendKeys(randomMobileNumber);

		WebElement createAccount = driver.findElement(By.xpath("//button[@data-qa='create-account']"));
		createAccount.click();

		WebElement continueButton = driver.findElement(By.linkText("Continue"));
		continueButton.click();
	}

	@Test(priority = 3)
	public void searchProducts() {
		WebElement searchPage = driver.findElement(By.partialLinkText("Product"));
		searchPage.click();

		WebElement searchProductField = driver.findElement(By.id("search_product"));
		searchProductField.sendKeys(productsName[randomProduct]);

		WebElement searchButton = driver.findElement(By.id("submit_search"));
		searchButton.click();

		js.executeScript("window.scrollTo(0,7500)");

		WebElement susbscribeInHome = driver.findElement(By.id("susbscribe_email"));
		susbscribeInHome.sendKeys(email);

		WebElement confirmSusbscribe = driver.findElement(By.id("subscribe"));
		confirmSusbscribe.click();
	}

	@Test(priority = 4)
	public void addProduct() {

		List<WebElement> addToCart = driver.findElements(By.linkText("Add to cart"));
		List<WebElement> selectOneRandom = new ArrayList<>();
		for (int i = 0; i < addToCart.size(); i = i + 2) {
			selectOneRandom.add(addToCart.get(i));
		}
		int randomAddOne = rand.nextInt(selectOneRandom.size());
		selectOneRandom.get(randomAddOne).click();

		WebElement continueShopping = driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block"));
		continueShopping.click();
	}

	@Test(priority = 5)
	public void brands() {

		WebElement brands = driver.findElement(By.className("brands-name"));
		List<WebElement> allBrands = brands.findElements(By.tagName("li"));
		int randomBrand = rand.nextInt(allBrands.size());
		allBrands.get(randomBrand).click();

		List<WebElement> viewProduct = driver.findElements(By.cssSelector(".fa.fa-plus-square"));
		int randomProduct = rand.nextInt(viewProduct.size());
		viewProduct.get(randomProduct).click();

		WebElement addToCartButton = driver.findElement(By.cssSelector(".btn.btn-default.cart"));
		addToCartButton.click();

		WebElement continueShopping = driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block"));
		continueShopping.click();

		WebElement productPage = driver.findElement(By.partialLinkText("Products"));
		productPage.click();
	}

	@Test(priority = 6)
	public void cartPage() {

		WebElement moveToCartPage = driver.findElement(By.linkText("Cart"));
		moveToCartPage.click();

		WebElement susbscribeInCart = driver.findElement(By.id("susbscribe_email"));
		susbscribeInCart.sendKeys(email);

		WebElement confirmSusbscribe = driver.findElement(By.id("subscribe"));
		confirmSusbscribe.click();

		WebElement checkout = driver.findElement(By.linkText("Proceed To Checkout"));
		checkout.click();

		WebElement placeOrder = driver.findElement(By.linkText("Place Order"));
		placeOrder.click();

		WebElement nameOnCardField = driver.findElement(By.name("name_on_card"));
		nameOnCardField.sendKeys(nameOnCard);

		WebElement cardNumber = driver.findElement(By.name("card_number"));
		cardNumber.sendKeys(randomCardNumber);

		WebElement cvcNumber = driver.findElement(By.name("cvc"));
		cvcNumber.sendKeys(randomThreeNumber);

		WebElement expirationMonth = driver.findElement(By.name("expiry_month"));
		expirationMonth.sendKeys(dateExpirationMonth);

		WebElement expirationYear = driver.findElement(By.name("expiry_year"));
		expirationYear.sendKeys(dateExpirationYear);

		WebElement payAndConfirmButton = driver.findElement(By.id("submit"));
		payAndConfirmButton.click();

		WebElement continueButton = driver.findElement(By.linkText("Continue"));
		continueButton.click();

	}

	@Test(priority = 7)
	public void contactPage() {

		WebElement moveToContactPage = driver.findElement(By.linkText("Contact us"));
		moveToContactPage.click();

		WebElement nameField = driver.findElement(By.name("name"));
		nameField.sendKeys(randomName);

		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys(email);

		WebElement subjectField = driver.findElement(By.name("subject"));
		subjectField.sendKeys("Hello everyone");

		WebElement messageField = driver.findElement(By.id("message"));
		messageField.sendKeys("Thank you for Test");

		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		String actualContactSuccess = driver.findElement(By.className("status")).getText();
		assertEquals(actualContactSuccess.contains("Success"), true);

		WebElement homePageButton = driver.findElement(By.linkText("Home"));
		homePageButton.click();
	}
	
	@Test(priority = 8)
	public void logoutAndLogin() {

		WebElement logout = driver.findElement(By.partialLinkText("Logout"));
		logout.click();

		WebElement emailToLogin = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		emailToLogin.sendKeys(email);

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys(password);

		WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
		loginButton.click();

	}

	@Test(priority = 9)
	public void deleteAccount() {

		WebElement deleteAccountButton = driver.findElement(By.partialLinkText("Delete Account"));
		deleteAccountButton.click();

		WebElement continueButton = driver.findElement(By.linkText("Continue"));
		continueButton.click();
	}

}
