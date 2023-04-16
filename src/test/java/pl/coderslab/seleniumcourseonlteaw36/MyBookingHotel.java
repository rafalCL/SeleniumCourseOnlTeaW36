package pl.coderslab.seleniumcourseonlteaw36;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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

public class MyBookingHotel {
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
}
