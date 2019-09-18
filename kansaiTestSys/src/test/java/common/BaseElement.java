package common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.AppiumDriver;

public class BaseElement {
	private AppiumDriver driver;

	public BaseElement(AppiumDriver _driver) {
		this.driver = _driver;
	}

	public void slide(int y1, int y2) {
		new SlideScreen().slideUp(driver, y1, y2);
	}
	
	public void screenShot(String imgName) {
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + imgName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
