package homework;

import Page.OnlineShop;
import Page.TsirtShop;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TshirtTest {

    //private TsirtShop tshirtShop;

    @Test
    public void TshirtTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Екатерина\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://homebrandofficial.ru/wear");
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
       driver.findElement(By.xpath("//div[@data-original=\"https://static.tildacdn.com/stor3232-3731-4662-b032-643566313764/10361691.jpg\"]")).click();
       //tshirtShop.clickOnTshirt();
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//td[@class=\"js-store-prod-popup-buy-btn-txt\"]")).click();
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//div[@class=\"t706__carticon t706__carticon_sm t706__carticon_showed\"]")).click();
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//button[@class=\"t706__sidebar-continue t-btn\"]")).click();

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//input[@id=\"input_1496239431201\"]")).sendKeys("Катя");

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//input[@id=\"input_1627385047591\"]")).sendKeys("MO");

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//textarea[@id=\"input_1630305196291\"]")).sendKeys("г Москва, улица Московская, дом 13");

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//input[@name=\"tildadelivery-userinitials\"]")).sendKeys("Дейнега Екатерина Юрьевна");

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//input[@name=\"tildadelivery-street\"]")).sendKeys("ул Московская");
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//input[@name=\"tildadelivery-house\"]")).sendKeys("дом 13");
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
        driver.findElement(By.xpath("//input[@name=\"tildadelivery-aptoffice\"]")).sendKeys("16");

    }
}
