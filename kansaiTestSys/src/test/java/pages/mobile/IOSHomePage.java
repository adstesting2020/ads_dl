package pages.mobile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import cases.task07.mobile.s01.CaseS01_001;
import common.SlideScreen;
import dto.DataBean;
import io.appium.java_client.AppiumDriver;

public class IOSHomePage {
	private AppiumDriver driver;
	private DataBean dataBean;

	public IOSHomePage(AppiumDriver _driver) {
		this.driver = _driver;
	}

	/**
	 * 現在のご契約状況确认
	 */
	public void currentContractConditions(String Msg) {
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "currentContractConditions.jpg"));
			CaseS01_001.setDataInfo(dataBean.getMsg(), "currentContractConditions.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 「契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。」ラベルを確認する。
	 */
	public void switchContractMsg() {
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "switchContractMsg.jpg"));
			CaseS01_001.setDataInfo("契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。」ラベルを確認する。", "switchContractMsg.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 「電気のご契約」ラベルを確認する。
	 */
	public void electricityContract() {
		new SlideScreen().slideUp(driver, 400, 200);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "electricityContract.jpg"));
			CaseS01_001.setDataInfo("「電気のご契約」ラベルを確認する。", "electricityContract.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	public void test123() {
//		ElementBean eb = new ElementBean();
//		eb.setIdAtr("");
//		
//		testFunc(eb);
//	}	
//	
//	public void testFunc(ElementBean eb) {
//		if (!"".equals(eb.getIdAtr())) {
//			driver.findElementByXPath(eb.getIdAtr()).click();
//		} else if (!"".equals(eb.getNameAtr())) {
//			driver.findElementByName(eb.getNameAtr()).click();
//		}
//	}

	/**
	 * 点击他社按钮
	 */
	public void setOtherShrines() {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[1]/input").click();;
		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setOtherShrines.jpg"));
			CaseS01_001.setDataInfo("click OtherShrines radio", "setOtherShrines.jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
