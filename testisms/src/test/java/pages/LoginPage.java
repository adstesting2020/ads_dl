package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import caseList.Test001;
import io.appium.java_client.AppiumDriver;

/**
 * 登录画面
 * 
 * @author ondor
 *
 */
public class LoginPage {
	private AppiumDriver driver;

	public LoginPage(AppiumDriver _driver) {
		this.driver = _driver;
	}

	/**
	 * userId设值
	 * 
	 * @param value
	 */
	public void setUserId(String value) {
		driver.findElementById("j_username").sendKeys(value);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setId.jpg"));
			Test001.setDataInfo("setUserId sdsd sd s ds 222", "setId.jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 密码设值
	 * 
	 * @param value
	 */
	public void setPassword(String value) {
		driver.findElementById("j_password").sendKeys(value);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setPassword.jpg"));
			Test001.setDataInfo("setUserId sdsd sd s ds 222", "setPassword.jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 点击登录按钮
	 * 
	 * @throws InterruptedException
	 */
	public void okBtnClick() throws InterruptedException {
		driver.findElementById("loginBtn").click();
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setLoginBtn.jpg"));
			Test001.setDataInfo("setUserId sdsd sd s ds 222", "setLoginBtn.jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
	}

}
