package pl.coderslab.seleniumcourseonlteaw36.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelTestlabCreateAnAccountPage {
    private final WebDriver driver;

    public HotelTestlabCreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillPersonalInformationForm(UserPersonalData userData) {
        WebElement firstNameInput = driver.findElement(By.cssSelector("#customer_firstname"));
        WebElement lastNameInput = driver.findElement(By.cssSelector("#customer_lastname"));
        WebElement registrationEmailInput = driver.findElement(By.cssSelector("#email"));
        WebElement passwordInput = driver.findElement(By.cssSelector("#passwd"));

//        assertVisibleAndEnabled(firstNameInput);
//        assertVisibleAndEnabled(lastNameInput);
//        assertVisibleAndEnabled(registrationEmailInput);
//        assertVisibleAndEnabled(passwordInput);

        firstNameInput.sendKeys(userData.getFirstName());
        lastNameInput.sendKeys(userData.getLastName());
        passwordInput.sendKeys(userData.getPassword());
    }

    public void clickRegister() {
        WebElement registrationSubmitButton = driver.findElement(By.cssSelector("#submitAccount"));
        // assertVisibleAndEnabled(registrationSubmitButton);
        registrationSubmitButton.click();
    }
}
