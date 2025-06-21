package E_commerceSite.E_commerceSite;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		zipcode.sendKeys(randomZipCode);

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

	}

	@Test(priority = 4)
	public void buyAProduct() {

		List<WebElement> addToCart = driver.findElements(By.linkText("Add to cart"));
		List<WebElement> selectOneRandom = new ArrayList<>();
		for(int i = 0 ; i < addToCart.size() ; i=i+2 ) {
		selectOneRandom.add(addToCart.get(i));
		}
		int randomAddOne = rand.nextInt(selectOneRandom.size());
		selectOneRandom.get(randomAddOne).click();
		
		WebElement continueShopping =driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block"));
		continueShopping.click();
		
		WebElement  cart = driver.findElement(By.linkText("Cart"));
		cart.click();
		
		WebElement checkout = driver.findElement(By.linkText("Proceed To Checkout"));
		checkout.click();
		
		WebElement placeOrder = driver.findElement(By.linkText("Place Order"));
		placeOrder.click();
		
		WebElement nameOnCardField = driver.findElement(By.name("name_on_card"));
		nameOnCardField.sendKeys(nameOnCard);
		
		WebElement cardNumber = driver.findElement(By.name("card_number"));
		cardNumber.sendKeys(randomCardNumber);
		System.out.println(randomCardNumber);
	}

}
