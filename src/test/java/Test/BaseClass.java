package Test;

import Page.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
    static WebDriver driver;

    protected static PageFactory pageFactory;
    public static void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        pageFactory = new PageFactory(driver);
    }
    public static void Close()
    {
        driver.close();
    }


}
