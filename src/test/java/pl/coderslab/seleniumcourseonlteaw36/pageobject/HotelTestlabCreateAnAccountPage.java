package pl.coderslab.seleniumcourseonlteaw36.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pl.coderslab.seleniumcourseonlteaw36.Tools.isVisibleAndEnabled;

public class HotelTestlabCreateAnAccountPage {
    private final WebDriver driver;

    @FindBy(id = "email")
    private WebElement registrationEmailInput;
    @FindBy(id = "customer_firstname")
    private WebElement firstNameInput;
    @FindBy(id = "customer_lastname")
    private WebElement lastNameInput;
    @FindBy(id = "passwd")
    private WebElement passwordInput;
    @FindBy(id = "submitAccount")
    private WebElement registrationSubmitButton;

    public HotelTestlabCreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillPersonalInformationForm(UserPersonalData userData) {
        firstNameInput.sendKeys(userData.getFirstName());
        lastNameInput.sendKeys(userData.getLastName());
        if (userData.getEmail() != null) {
            registrationEmailInput.sendKeys(userData.getEmail());
        }
        passwordInput.sendKeys(userData.getPassword());
    }

    public boolean areMandatoryFormFieldsVisibleAndEnabled() {
        return isVisibleAndEnabled(firstNameInput)
                && isVisibleAndEnabled(lastNameInput)
                && isVisibleAndEnabled(registrationEmailInput)
                && isVisibleAndEnabled(passwordInput);
    }

    public void clickRegister() {
        registrationSubmitButton.click();
    }

    public boolean isRegistrationSubmitButtonVisibleAndEnabled() {
        return isVisibleAndEnabled(registrationSubmitButton);
    }

    public String getEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        // the below code uses a "lambda expression"
        wait.until(wd -> !registrationEmailInput.getAttribute("value").equals("")); // this is like a while that tests for at most 4 seconds

        return registrationEmailInput.getAttribute("value");
    }
}
