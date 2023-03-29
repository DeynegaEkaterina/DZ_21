package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TsirtShop{

    @FindBy(xpath = "//div[@data-original=\"https://static.tildacdn.com/stor3232-3731-4662-b032-643566313764/10361691.jpg\"]")
    private WebElement TshirtOversize;
    @FindBy(xpath = "//td[@class=\"js-store-prod-popup-buy-btn-txt\"]")
    private WebElement addToKorzinaButton;

    @FindBy(xpath = "//div[@class=\"t706__carticon t706__carticon_sm t706__carticon_showed\"]")
    private WebElement Korzina;

    @FindBy(xpath = "//button[@class=\"t706__sidebar-continue t-btn\"]")
    private WebElement makeOrder;

    @FindBy(xpath = "//input[@id=\"input_1496239431201\"]")
    private WebElement Name;

    @FindBy(xpath = "//input[@name= \"tildaspec-phone-part[]\"][@style]")
    private WebElement Phone;
    @FindBy(xpath = "//input[@id=\"input_1627385047591\"]")
    private WebElement Region;

    @FindBy(xpath = "//textarea[@id=\"input_1630305196291\"]")
    private WebElement FullAddress;
    @FindBy(xpath = "//input[@name=\"tildadelivery-userinitials\"]")
    private WebElement FIO;
    @FindBy(xpath = "//input[@name=\"tildadelivery-street\"]")
    private WebElement Street;

    @FindBy(xpath = "//input[@name=\"tildadelivery-house\"]")
    private WebElement House;

    @FindBy(xpath = "//input[@name=\"tildadelivery-aptoffice\"]")
    private WebElement Office;

    @FindBy(xpath = "//button[@type][text()=\"ОФОРМИТЬ ЗАКАЗ\"]")
    private WebElement FinalOrder;











    private WebDriver driver;
    public TsirtShop(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public TsirtShop clickOnTshirt(){
        TshirtOversize.click();
        return this;
    }
    public TsirtShop addToKorzina(){
        addToKorzinaButton.click();
        return this;
    }
    public TsirtShop clickToKorzina(){
        Korzina.click();
        return this;
    }

    public TsirtShop makeOrder(){
        makeOrder.click();
        return this;
    }

    public TsirtShop fillName(String name){
       Name.sendKeys(name);
        return this;
    }
    public TsirtShop fillPhoneNumber(String phone){
        Phone.sendKeys(phone);
        return this;
    }
    public TsirtShop fillRegion(String region){
        Region.sendKeys(region);
        return this;
    }

    public TsirtShop fillFullAddress(String address){
        FullAddress.sendKeys(address);
        return this;
    }
    public TsirtShop fillFIO(String fio){
        FIO.sendKeys(fio);
        return this;
    }
    public TsirtShop fillStreet(String street){
        Street.sendKeys(street);
        return this;
    }

    public TsirtShop fillHouse(String house){
        House.sendKeys(house);
        return this;
    }
    public TsirtShop fillOffice(String office){
        Office.sendKeys(office);
        return this;
    }
    public TsirtShop makeFinalOrder(){
        FinalOrder.click();
        return this;
    }


}
