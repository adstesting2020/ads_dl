package safari;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import pages.LoginPage;
import util.BaseTest;
import util.TestngListener;

import static com.codeborne.selenide.Selenide.*;

import java.io.IOException;



public class TestSafari extends BaseTest{
	public WebDriver driver;
	
	@Step("111")
	@BeforeClass(description = "setUp") 
	public  void setUp() {

//		driver = new SafariDriver();
//	    WebDriverAdapter.setAdapter(driver);	    
		Configuration.timeout = 6000;
        Configuration.browser = "Safari"; 
        Configuration.startMaximized = true;
        ScreenShooter.captureSuccessfulTests = true;
        Configuration.reportsFolder = "allure-results";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

    }

	
	@Test(description = "isms")
    public void testSafari() throws InterruptedException, IOException {
			
		open("http://www.test-arts.cn/isms/");		
		saveScreenshot("setUp");
		LoginPage lp = new LoginPage();
        lp.setUserId("test");        
        lp.setPassword("test");        
        lp.okBtnClick();       
        sleep(2000);                      
        close();      
        
    }
	

	
}
