import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();
    // static String timeStamp =  new SimpleDataFormat ("dd.MM.yy.mm.ss).format (new Data());
    LoadProp loadProp = new LoadProp();


    @BeforeMethod

    public void setBrowserSelector () {

        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(loadProp.getProperty("url"));

    }
    @AfterMethod
    public void closeBrowser(){
    driver.close();

    }




}
