package util;
import static com.codeborne.selenide.Selenide.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import com.google.common.io.Files;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;



public class BaseTest {
	
	public WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

  
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","bin/chromedriver");
        Configuration.timeout = 6000;
        Configuration.browser = "chrome";
//        Configuration.browserSize ="1920x1080";
        Configuration.startMaximized = true;
        ScreenShooter.captureSuccessfulTests = true;
        Configuration.reportsFolder = "report";
        
        
    }
    
    
    public byte[] saveScreenshot(String imgName) throws IOException {
    	screenshot(imgName);
    	File screenShot = Screenshots.getLastScreenshot();
        return Files.toByteArray(screenShot);
    }


//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }


}
