package E_commerceSite.E_commerceSite;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Year;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testData {

	WebDriver driver = new ChromeDriver();
	String theWebsite = "https://www.automationexercise.com/";
	Random rand = new Random();
	String randomName = "user" + new Random().nextInt(1000);
	public static String email = RandomStringUtils.randomAlphabetic(8) + "@gmail.com";
	public static String password = RandomStringUtils.randomAlphanumeric(8);

	String[] names = { "Amer", "John", "Sara", "Lina", "Mike", "Nora", "Ali", "Emma", "Ahmad", "Mohammed", "Omer",
			"Noor" };
	int randomFirstName = rand.nextInt(names.length);
	int randomLastName = rand.nextInt(names.length);

	String[] companies = { "TechNova Inc", "AlphaSoft", "NextGen Solutions", "CodeCraft Co.", "ByteWorks", "DataSpark",
			"VisionTech", "TestCorp", "CyberNest" };
	int randomCompany = rand.nextInt(companies.length);

	String[] addresses = { "123 Main St, Apt 4B", "456 Elm Street", "P.O. Box 789", "987 Sunset Blvd", "654 Maple Ave",
			"22 Tech Park Road", "700 Innovation Dr", "33 Market St", "88 Alpha Plaza" };
	int randomAddress = rand.nextInt(addresses.length);

	String[] states = { "California", "Texas", "New York", "Florida", "Illinois", "Ohio", "Michigan" };
	int randomState = rand.nextInt(states.length);

	String[] cities = { "Los Angeles", "Houston", "Chicago", "Miami", "Dallas", "Detroit", "Cleveland" };
	int randomCity = rand.nextInt(cities.length);

	int createZipCodes = 100 + new Random().nextInt(100);
	String randomThreeNumber = String.valueOf(createZipCodes);
	String randomMobileNumber = "+" + (1000000000 + rand.nextInt(100000000));

	String[] productsName = { "jeans", "T-shirt", "shirt", "Dress", "tops" };
	int randomProduct = rand.nextInt(productsName.length);

	public static String nameOnCard = RandomStringUtils.randomAlphabetic(5).toUpperCase();
	public static String randomCardNumber = RandomStringUtils.randomNumeric(16);

	LocalDate date = LocalDate.now();
	LocalDate nextYear = date.plusYears(1);
	int month = date.getMonthValue();
	int year = nextYear.getYear();
	String dateExpirationMonth = String.valueOf(month);
	String dateExpirationYear = String.valueOf(year);

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void setUp() {

		driver.get(theWebsite);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

}
