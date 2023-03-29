package homework;

import Page.TsirtShop;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TshirtTest {

    private TsirtShop tshirtShop;
    public void await(int time){
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {}
    }

    @Test
    public void TshirtTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Екатерина\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://homebrandofficial.ru/wear");
        tshirtShop = new TsirtShop(driver);
        await(5000);
        tshirtShop.clickOnTshirt();
        await(3000);
        tshirtShop.addToKorzina();
         await(3000);
        tshirtShop.clickToKorzina();
        await(3000);
        tshirtShop.makeOrder();
        await(3000);
        tshirtShop.fillName("Катя");
        tshirtShop.fillPhoneNumber("(000) 000-00-00");
        tshirtShop.fillRegion("MO");
        tshirtShop.fillFullAddress("г Москва, улица Московская, д. 1");
        tshirtShop.fillFIO("Дейнега Екатерина Юрьевна");
        tshirtShop.fillStreet("ул Московская");
        await(3000);
        tshirtShop.fillHouse("д. 1");
        tshirtShop.fillOffice("16");
        await(2000);
        tshirtShop.makeFinalOrder();

        String warning = driver.findElement(By.xpath("//p[@class=\"t-form__errorbox-item js-rule-error js-rule-error-phone\"][text()=\"Укажите, пожалуйста, корректный номер телефона\"]")).getText();
        String expectedWarning = "Укажите, пожалуйста, корректный номер телефона";
        Assert.assertEquals(expectedWarning, warning);
    }
}
