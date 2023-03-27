package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TsirtShop {

    @FindBy(xpath = "//div[@data-original=\"https://static.tildacdn.com/stor3232-3731-4662-b032-643566313764/10361691.jpg\"]")
    private WebElement TshirtOversize;



    private WebDriver driver;
    public TsirtShop(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public TsirtShop clickOnTshirt(){
        TshirtOversize.click();
        return this;
    }
}
