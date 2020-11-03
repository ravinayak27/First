import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class countImagebutton {
    @Test
    public void testNGAsserts() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
        driver.get("http://automationpractice.com/index.php");
        String actualTitle = "My Store";
        Assert.assertEquals(driver.getTitle(), actualTitle);
        Thread.sleep(2000);
        List<WebElement> listImages=driver.findElements(By.tagName("img"));
        System.out.println("No. of Images: "+listImages.size());
        List<WebElement> listButton=driver.findElements(By.tagName("button"));
        System.out.println("No. of Button: "+listButton.size());

        driver.close();


    }
}