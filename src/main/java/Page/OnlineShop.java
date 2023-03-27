package Page;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class OnlineShop{
    @FindBy(xpath = "//img[@src=\"https://thumb.tildacdn.com/tild3161-3866-4438-a464-303861663738/-/resize/68x/-/format/webp/-_7.png\"]")
    private WebElement search;
    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchInput;


    private WebDriver driver;
    public OnlineShop(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public OnlineShop clickOnSearch(){
        search.click();
        return this;
    }

    public OnlineShop putInfo(String password){
        searchInput.sendKeys(password);
        return this;
    }

}