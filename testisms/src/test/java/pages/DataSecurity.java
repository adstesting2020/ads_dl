package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.sahagin.runlib.external.PageDoc;
import org.sahagin.runlib.external.TestDoc;

import io.appium.java_client.AppiumDriver;

@PageDoc("dataSecurity page")
public class DataSecurity {
	
	private AppiumDriver driver;

    public DataSecurity(AppiumDriver _driver){
        this.driver=_driver;
    }
    
    @TestDoc("情報セキュリティ　2016年度版")
    public void dataBtnClick() throws InterruptedException{
        driver.findElementByLinkText("情報セキュリティ　2016年度版").click();
        Thread.sleep(5000);
    }
    
    @TestDoc("次へios")
    public void iosNextBtnClick(){
//        driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"次へ\"])[1]").click();
    	 
    	 List<WebElement> list = driver.findElementsByClassName("XCUIElementTypeButton");
    	 System.out.println(list.size());
    	 list.get(0).click();
//        driver.findElementByXPath("(//XCUIElementTypeButton[@name='次へ'])[1]").click();
        
    }
    
    @TestDoc("次へandroid")
    public void androidNextBtnClick(){
//    	List<WebElement> list = driver.findElementsByClassName("android.widget.Button");
    	driver.findElementByXPath("//android.widget.FrameLayout[@resource-id='com.android.chrome:id/compositor_view_holder']/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[2]").click();
        
//        driver.findElementByName("次へ").[1];
    }

}
