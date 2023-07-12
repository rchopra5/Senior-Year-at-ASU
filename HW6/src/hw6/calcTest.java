import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class calcTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Test
    public void test1()
    {
        //Referred to mathTest.java in Module 10
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        baseUrl = "http://webstrar99.fulton.asu.edu/page2/";
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.name("number 1")).clear();
        driver.findElement(By.name("number 1")).sendKeys("6");
        driver.findElement(By.name("number 2")).clear();
        driver.findElement(By.name("number 2")).sendKeys("4");
        WebElement ope = driver.findElement(By.id("Add"));
        ope.click();
        driver.findElement(By.name("Calculate")).click();
        assertEquals("10", driver.findElement(By.name("Result")).getAttribute("value"));


    }
    //Multiply test
    @Test
    public void test2()
    {
        //Referred to mathTest.java in Module 10
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        baseUrl = "http://webstrar99.fulton.asu.edu/page2/";
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.name("number 1")).clear();
        driver.findElement(By.name("number 1")).sendKeys("6");
        driver.findElement(By.name("number 2")).clear();
        driver.findElement(By.name("number 2")).sendKeys("4");
        WebElement ope = driver.findElement(By.id("Mul"));
        ope.click();
        driver.findElement(By.name("Calculate")).click();
        assertEquals("24", driver.findElement(By.name("Result")).getAttribute("value"));


    }
    //subtraction test
    @Test
    public void test3()
    {
        //Referred to mathTest.java in Module 10
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        baseUrl = "http://webstrar99.fulton.asu.edu/page2/";
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.name("number 1")).clear();
        driver.findElement(By.name("number 1")).sendKeys("6");
        driver.findElement(By.name("number 2")).clear();
        driver.findElement(By.name("number 2")).sendKeys("4");
        WebElement ope = driver.findElement(By.id("Sub"));
        ope.click();
        driver.findElement(By.name("Calculate")).click();
        assertEquals("2", driver.findElement(By.name("Result")).getAttribute("value"));


    }
    //division test
    @Test
    public void test4()
    {
        //Referred to mathTest.java in Module 10
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        baseUrl = "http://webstrar99.fulton.asu.edu/page2/";
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.name("number 1")).clear();
        driver.findElement(By.name("number 1")).sendKeys("4");
        driver.findElement(By.name("number 2")).clear();
        driver.findElement(By.name("number 2")).sendKeys("4");
        WebElement ope = driver.findElement(By.id("Div"));
        ope.click();
        driver.findElement(By.name("Calculate")).click();
        assertEquals("1", driver.findElement(By.name("Result")).getAttribute("value"));


    }
}