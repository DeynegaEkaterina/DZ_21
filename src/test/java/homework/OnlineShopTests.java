package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class OnlineShopTests {
    @Test
    public void isValidCost(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Екатерина\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://homebrandofficial.ru/wear");
        By search = By.xpath("//img[@src=\"https://thumb.tildacdn.com/tild3161-3866-4438-a464-303861663738/-/resize/68x/-/format/webp/-_7.png\"]");
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {

        }
        driver.findElement(search).click();

        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {

        }
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Лонгслив в красную полоску");
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {

        }
        String cost = driver.findElement(By.xpath("//div[@class=\"t-search-widget__result_product-price t-descr t-descr_xs\"]")).getText();
        String expectedCost = "2800 RUB";
        Assert.assertEquals(expectedCost, cost);
        driver.findElement(By.xpath("//a[@href='https://homebrandofficial.ru/tproduct/349466149-" +
                "623015205961-longsliv-v-krasnuyu-polosku']")).click();

    }
    @Test
    public void isValidAmount(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Екатерина\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://homebrandofficial.ru/wear");
        By search = By.xpath("//img[@src=\"https://thumb.tildacdn.com/tild3161-3866-4438-a464-303861663738/-/resize/68x/-/format/webp/-_7.png\"]");
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {

        }
        driver.findElement(search).click();

        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {

        }
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Лонгслив в красную полоску");
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {

        }
        String amount = driver.findElement(By.xpath("//div[@class=\"t-container t-search-widget__query-result t-descr t-opacity_50\"]")).getText();
        String expectedAmount = "1 результат по запросу: Лонгслив в красную полоску";
        Assert.assertEquals(expectedAmount, amount);
    }

    @Test
    public void isValidProductName(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Екатерина\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://homebrandofficial.ru/wear");
        By search = By.xpath("//img[@src=\"https://thumb.tildacdn.com/tild3161-3866-4438-a464-303861663738/-/resize/68x/-/format/webp/-_7.png\"]");
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {

        }
        driver.findElement(search).click();

        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {

        }
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Лонгслив в красную полоску");
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {

        }
        String productName = driver.findElement(By.xpath("//div[@class=\"t-search-widget__result_product-title t-name t-name_xs\"]")).getText();
        String expectedProductName = "Лонгслив в красную полоску";
        Assert.assertEquals(expectedProductName, productName);
    }


}



