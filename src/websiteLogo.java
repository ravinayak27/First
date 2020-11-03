import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class websiteLogo {
    @Test
    public void testNGAsserts() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
        driver.get("http://automationpractice.com/index.php");
        String actualTitle = "My Store";
        Assert.assertEquals(driver.getTitle(), actualTitle);
        Thread.sleep(2000);

        WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
            System.out.println("Logo not displayed.");
        }
        else
        {
            System.out.println("Logo displayed.");
        }

        Assert.assertEquals(driver.getTitle(), actualTitle);
    }
}