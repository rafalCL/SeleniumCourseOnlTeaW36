package pl.coderslab.seleniumcourseonlteaw36.pageobject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumcourseonlteaw36.Tools;

import java.time.Duration;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static pl.coderslab.seleniumcourseonlteaw36.Tools.assertVisibleAndEnabled;

// ocą lokalizatora By.id:
//
//
//(pole tekstowe) Hotel Location
//(przycisk) Search Now
//(pole tekstowe) Enter your e-mail (pole na dole stron)
//Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
//
//Hotel Location - Warsaw
//Enter your e-mail - test@test.com
//Użyj metody sendKeys np.

public class MyBookingHotelTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get("https://hotel-testlab.coderslab.pl/en/");
    }

    @Test
    public void searchWithDuckDuckGo() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
        assertNotNull(hotelLocationInput);
        hotelLocationInput.sendKeys("Warsaw");
        WebElement hotelLocationSubmitButton = driver.findElement(By.id("search_room_submit"));
        assertNotNull(hotelLocationSubmitButton);
        WebElement newsletterInput = driver.findElement(By.id("newsletter-input"));
        assertNotNull(newsletterInput);
        newsletterInput.sendKeys("test@test.com");
    }

    @Test
    public void navigateToAndFillRegistrationForm() {
        HotelTestlabMainPage hotelMainPage = new HotelTestlabMainPage(driver);
        hotelMainPage.clickSignIn();

        final String randomEmail = Tools.generateRandomEmail();
        HotelTestlabAuthenticationPage authenticationPage = new HotelTestlabAuthenticationPage(driver);
        authenticationPage.submitCreateAnAccountForm(randomEmail);
//
//        WebElement firstNameInput = driver.findElement(By.cssSelector("#customer_firstname"));
//        assertVisibleAndEnabled(firstNameInput);
//        firstNameInput.sendKeys("Ala");
//        WebElement lastNameInput = driver.findElement(By.cssSelector("#customer_lastname"));
//        assertVisibleAndEnabled(lastNameInput);
//        lastNameInput.sendKeys("Makota");
//        WebElement registrationEmailInput = driver.findElement(By.cssSelector("#email"));
//        assertVisibleAndEnabled(registrationEmailInput);
//        WebElement passwordInput = driver.findElement(By.cssSelector("#passwd"));
//        assertVisibleAndEnabled(passwordInput);
//        passwordInput.sendKeys("admin123");
//
//        WebElement registrationSubmitButton = driver.findElement(By.cssSelector("#submitAccount"));
//        assertVisibleAndEnabled(registrationSubmitButton);
//        registrationSubmitButton.click();
        // todo assert account created
    }
}
