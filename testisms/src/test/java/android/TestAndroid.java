package android;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sahagin.runlib.external.adapter.appium.AppiumAdapter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pages.DataSecurity;
import pages.HomePage;
import pages.LoginPage;

public class TestAndroid {
    private AppiumDriver driver;

    @Before
    public void setup()throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");//指定测试平台
        capabilities.setCapability("deviceName", "72V7N16C20002047"); //指定测试机的ID,通过adb命令[adb devices]获取
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("unicodeKeyboard", "true");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

//        WebDriverAdapter.setAdapter(driver);
        AppiumAdapter.setAdapter(driver);
    }

    @After
    public void tearDown()throws Exception{
        driver.quit();
    }

    @Test
    public void testAndroid() throws Exception{
        driver.get("http://www.test-arts.cn/isms/");
        LoginPage lp = new LoginPage(driver);
        HomePage hp = new HomePage(driver);
        lp.setUserId("test");        
        lp.setPassword("test");
        lp.okBtnClick();
        hp.showHistoryBtnClick();
        hp.analysBtnClick();
        hp.historyBtnClick();
       
        
    }


}
