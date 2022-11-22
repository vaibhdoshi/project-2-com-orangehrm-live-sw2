package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com";

    @Before

    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldLoginSucesssfullyWithValidCredentials() {
        //Enter username
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        //Enter password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        //Click on login button
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        //Verify the Dashboard text is display
        String expectedMessage="Dashboard";
        WebElement actualTextMessage = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        String actualMessage = actualTextMessage.getText();
        //validate actual and expected
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {

        closeBrowser();
    }


}
