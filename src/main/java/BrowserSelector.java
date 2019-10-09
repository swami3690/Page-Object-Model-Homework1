import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BrowserSelector extends Utils {


    LoadProp loadProp = new LoadProp();

    public void setUpBrowser() {

        String browser = loadProp.getProperty("browser");

        if (browser.equalsIgnoreCase("Firefox")) {

            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDrive\\geckodriver.exe");

            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDrive\\chromedriver.exe");

            driver = new ChromeDriver();

        } else {

            System.out.println("Browser name is empty or typed wrong " + browser);
        }


    }}
