package pl.coderslab.seleniumcourseonlteaw36.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelTestlabCreateAnAccountPage {
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

    public void clickRegister() {
        // assertVisibleAndEnabled(registrationSubmitButton);
        registrationSubmitButton.click();
    }

    public String getEmail() {
        return registrationEmailInput.getAttribute("value");
    }
}
