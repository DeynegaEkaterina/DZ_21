package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginForm {
    @FindBy(xpath = "//input[@id=\"name\"]")
    private WebElement nameField;
    @FindBy(xpath = "//input[@id=\"password\"]")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement LoginButton;
    @FindBy(xpath = "//span[contains(text(),\"Roman Iovlev\")]")
    private WebElement FullUsername;

    private WebDriver driver;
    public LoginForm(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public LoginForm setName(String name){
        nameField.sendKeys(name);
        return this;
    }

    public LoginForm setPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }
    public LoginForm submit(){
        LoginButton.click();
        return this;
    }

}
