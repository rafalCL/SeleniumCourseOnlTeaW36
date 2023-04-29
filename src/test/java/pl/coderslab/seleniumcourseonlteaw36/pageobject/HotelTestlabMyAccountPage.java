package pl.coderslab.seleniumcourseonlteaw36.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelTestlabMyAccountPage {
    private final WebDriver driver;

    public HotelTestlabMyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAccountCreationConfirmationDisplayed() {
        WebElement confirmationPanel = driver.findElement(By.cssSelector("p.alert.alert-success"));
        return confirmationPanel.getText().equals("Your account has been created.");
    }
}
