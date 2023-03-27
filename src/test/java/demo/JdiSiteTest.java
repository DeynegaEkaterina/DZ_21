package demo;

import Page.LoginForm;
import com.sun.source.tree.AssertTree;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class JdiSiteTest {

    private LoginForm page;

   /* @After
    public void tearDown(){
        driver.quit();
    }*/
    @Test
    public void firstScenario(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Екатерина\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        page = new LoginForm(driver);
        driver.get("https://jdi-testing.github.io/jdi-light/index.html");
        By toggleBy = By.xpath("//*[@href=\"#\"]");
        driver.findElement(toggleBy).click();
        String username = "Roman";
        String password = "Jdi1234";
        page.setName(username)
                .setPassword(password)
                .submit();
        String full_username = driver.findElement(By.xpath("//span[contains(text(),\"Roman Iovlev\")]")).getText();
        String expectations = "ROMAN IOVLEV";
        Assert.assertEquals(expectations, full_username);

    }


}
