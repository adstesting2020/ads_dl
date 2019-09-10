package pages;

import org.sahagin.runlib.external.PageDoc;
import org.sahagin.runlib.external.TestDoc;

import io.appium.java_client.AppiumDriver;

@PageDoc("home page")
public class HomePage {
	
	private AppiumDriver driver;

    public HomePage(AppiumDriver _driver){
        this.driver=_driver;
    }
    
    @TestDoc("click study button")
    public void studyBtnClick() throws InterruptedException{
        driver.findElementById("studyBtn_00").click();
        Thread.sleep(2000);
    }

    @TestDoc("click showHistory button")
    public void showHistoryBtnClick() throws InterruptedException{
        driver.findElementById("showHistoryBtn").click();
        Thread.sleep(2000);
    }
    
    @TestDoc("click analys button")
    public void analysBtnClick() throws InterruptedException{
        driver.findElementById("analysBtn0").click();
        Thread.sleep(2000);
    }
    
    @TestDoc("click history button")
    public void historyBtnClick() throws InterruptedException{
        driver.findElementById("historyBtn0").click();
        Thread.sleep(2000);
    }

}
