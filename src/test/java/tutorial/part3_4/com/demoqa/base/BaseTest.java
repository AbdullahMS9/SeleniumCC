package tutorial.part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static util.Utility.setUtilityDriver;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com";

    @BeforeClass
    public void setUp(){

        /* FOR SPEED PURPOSES:
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless"); // Enables headless mode
            options.addArguments("--disable-gpu"); // Improves speed in headless mode
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--no-sandbox");
            options.addArguments("--blink-settings=imagesEnabled=false");
            */


        driver = new ChromeDriver(/*options*/);
        driver.manage().window().maximize();
        // Implicit wait setup:
        //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Page Load / Script Timeout setup:
        //   driver.manage().timeouts().( pageLoadTimeout(duration) or scriptTimeout(duration) );

    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterMethod
    public void takeFailedResultSS(ITestResult testResult){
        if (testResult.getStatus() == ITestResult.FAILURE){
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir")
                    + "/resources/screenshots/(" + java.time.LocalDate.now() +")"
                    + testResult.getName() +".png");
            try{
                FileHandler.copy(source,destination);
            } catch (IOException e){
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot location: " + destination);

        }

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
