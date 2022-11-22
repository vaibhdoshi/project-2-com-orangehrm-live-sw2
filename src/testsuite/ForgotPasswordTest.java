package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com";

    @Before

    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test

    public void userShouldNavigateToForgotPasswordSuccessfully() {
        //click on the 'Forgot your password'link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //verify the text 'Reset Password'
        String expectedMessage = "Reset Password";
        WebElement actualTextMessage = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
        String actualMessage = actualTextMessage.getText();
        //validate actual and expected
        Assert.assertEquals(expectedMessage,actualMessage);

    }


}
