package pl.coderslab.seleniumcourseonlteaw36.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelTestlabMyAccountPage {
    @FindBy(css = "p.alert.alert-success")
    private WebElement confirmationPanel;

    public HotelTestlabMyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isAccountCreationConfirmationDisplayed() {
        return confirmationPanel.getText().equals("Your account has been created.");
    }
}
