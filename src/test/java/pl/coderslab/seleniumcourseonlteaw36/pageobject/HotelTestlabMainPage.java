package pl.coderslab.seleniumcourseonlteaw36.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelTestlabMainPage {
    private final WebDriver driver;

    public HotelTestlabMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        WebElement signInBtn = driver.findElement(By.cssSelector("ul.navbar-nav li a.user_login"));
        signInBtn.click();
    }
}
