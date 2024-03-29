package dto;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseElementMobile {
	private AppiumDriver driver;
	static Duration duration = Duration.ofSeconds(1);

	public BaseElementMobile(AppiumDriver _driver) {
		this.driver = _driver;
	}

	/**
	 * 向上滑动屏幕
	 */
	public void slideUp(int y1, int y2) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;

		new TouchAction(driver).press(PointOption.point(width / 2, y1)).waitAction(WaitOptions.waitOptions(duration))
				.moveTo(PointOption.point(width / 2, y2)).release().perform();
	}

	/**
	 * 向下滑动屏幕
	 */
	public static void slideDown(AppiumDriver driver) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;

		new TouchAction(driver).press(PointOption.point(width / 2, height / 10))
				.moveTo(PointOption.point(width / 2, height * 3 / 4)).release().perform();
	}

	/**
	 * 
	 * 向左滑动屏幕
	 * 
	 */
	public static void slideLeft(AppiumDriver driver) {
		// 获取手机屏幕的宽度
		int width = driver.manage().window().getSize().width;

		// 获取手机屏幕的高度
		int height = driver.manage().window().getSize().height;

		/*
		 * new一个TouchAction对象，调用其按压press()方法，输入坐标点,moveTo移动到下一个坐标点，之后调用release()和perform
		 * ()方法执行，注意，宽乘以或者除以的数字自己来定义计算的，主要是呈现一个公共的方式，兼容所有的手机
		 */
		new TouchAction(driver).press(PointOption.point(width * 3 / 4, height / 2))
				.moveTo(PointOption.point(width / 10, height / 2)).release().perform().perform();

	}

	/**
	 * 
	 * 向右滑动屏幕
	 * 
	 * 
	 */
	public static void slideRight(AppiumDriver driver) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;

		new TouchAction(driver).press(PointOption.point(width / 10, height / 2))
				.moveTo(PointOption.point(width * 3 / 4, height / 2)).release().perform();

	}

	public void screenShot(AppiumDriver driver,String imgName) {
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + imgName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
