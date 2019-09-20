package project.sw.pages.mobile;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.AppiumDriver;
import project.sw.cases.task07.mobile.s01.CaseS01_001;

public class TestPage {
	
	private AppiumDriver driver;

	public TestPage(AppiumDriver _driver) {
		this.driver = _driver;
	}

	
	public void setUserId(String value) throws IOException {
		driver.findElementById("j_username").sendKeys("test");
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setUserId.jpg"));
			CaseS01_001.setDataInfo("setUserId", "setUserId.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setPassword(String value) throws IOException {
		driver.findElementById("j_password").sendKeys("test");
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setPassword.jpg"));
			CaseS01_001.setDataInfo("setPassword", "setPassword.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void okBtnClick() throws IOException {
		driver.findElementById("loginBtn").click();
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "okBtnClick.jpg"));
			CaseS01_001.setDataInfo("okBtnClick", "okBtnClick.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
