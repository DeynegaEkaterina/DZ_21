package demo;

import com.sun.source.tree.AssertTree;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class JdiSiteTest {

   /* public void setUp(){

    }*/
   /* @After
    public void tearDown(){
        driver.quit();
    }*/
    @Test
    public void firstScenario(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Екатерина\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //SoftAssertions softAssertions = new SoftAssertions();
        driver.get("https://jdi-testing.github.io/jdi-light/index.html");
        By toggleBy = By.xpath("//*[@href=\"#\"]");
        driver.findElement(toggleBy).click();
        driver.findElement(By.id("name")).sendKeys("Roman");
        driver.findElement(By.id("password")).sendKeys("Jdi1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String username = driver.findElement(By.xpath("//span[contains(text(),\"Roman Iovlev\")]")).getText();
        String expectations = "ROMAN IOVLEV";
        Assert.assertEquals(expectations, username);
        //softAssertions.assertThat(username).as("Неправильное имя").isEqualTo(expectations);
        //softAssertions.assertAll();
    }


}
