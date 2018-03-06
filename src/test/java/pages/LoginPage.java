package pages;

import entities.LoginDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    private WebDriver driver;

    @FindBy(id = "email")
    private WebElement userName;

    @FindBy(id = "pass")
    private WebElement password;

    @FindBy(id = "loginbutton")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAs(LoginDetails loginDetails) {
        enterText(userName, loginDetails.getUsername(), driver);
        enterText(password, loginDetails.getPassword(), driver);
        clickOnButton(loginBtn, driver);
    }

    public void isLoginPage() {
        if (!isElementPresent(By.id("loginbutton"), driver))
            throw new RuntimeException("User is not in Login Page");
    }
}
