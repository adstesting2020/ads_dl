package pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import common.SlideScreen;
import io.appium.java_client.*;
import io.appium.java_client.ios.IOSDriver;



public class AndroidHomePage {
	
	private AppiumDriver driver;
	

	public AndroidHomePage(AppiumDriver _driver) {
		this.driver = _driver;
	}
	

	
	/**
	 * 点击他社按钮
	 */
	public void setOtherShrines() {
		System.out.println("111");
//		SlideScreen ss = new SlideScreen();
//		ss.slideDown();
//		System.out.println("222");
//		List<WebElement> list = driver.findElementsByXPath("/XCUIElementTypeOther");
	    driver.findElements(By.className("android.widget.RadioButton"));
	    driver.findElementsByTagName("div");
	    
		
		driver.findElementByXPath("(//XCUIElementTypeStaticText[@name='他社')").click();
		
//		List<WebElement> list = driver.findElementsByName("他社");
//		System.out.println(list.size());
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setOtherShrines.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
