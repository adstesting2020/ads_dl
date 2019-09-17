package pages.mobile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import cases.task07.mobile.s01.*;

import cases.task07.mobile.s02.*;

import cases.task07.mobile.s03.*;

import common.SlideScreen;
import dto.DataBean;
import io.appium.java_client.AppiumDriver;

public class HomePage {
	private AppiumDriver driver;
	private DataBean dataBean;

	public HomePage(AppiumDriver _driver) {
		this.driver = _driver;
	}

	/**
	 * 現在のご契約状況确认
	 */
	public void currentContractConditions(String msg) {
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			String imgName = "currentContractConditions.jpg";
			
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + imgName));
			
			CaseS01_001.setDataInfo(msg, imgName);
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

	/**
	 * 点击他社按钮
	 */
	public void setOtherShrines(String msg) {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[1]/input").click();;
		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setOtherShrines.jpg"));
			CaseS03_001.setDataInfo(msg, "setOtherShrines.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	「関西電力」ラジオボタンを確認する。
	public void radioButon(String msg) {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[2]/span").click();;
		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "clickTest.jpg"));
			CaseS01_001.setDataInfo(msg, "setOtherShrines.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * 「電気のご契約」-「関西電力」ラジオボタンを選択する。
	 */
	public void clickElectricContractKansaiElectricPower() {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[2]").click();
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "clickElectricContractKansaiElectricPower.jpg"));
//			CaseS01_001.setDataInfo("「電気のご契約」-「関西電力」ラジオボタンを選択する。", "clickElectricContractKansaiElectricPower.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「ガスのご契約」-「他社（関西電力以外）」ラジオボタンを選択する。
	 */
	
	public void clickGasContractOtherCompanies() {
		new SlideScreen().slideUp(driver, 400, 200);
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[1]").click();
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "clickGasContractOtherCompanies.jpg"));
//			CaseS01_001.setDataInfo("「ガスのご契約」-「他社（関西電力以外）」ラジオボタンを選択する。", "clickGasContractOtherCompanies.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「お客さま番号を入力する」ラジオボタンを選択する。
	 */
	public void clickSelectCustomerNumber() {
		new SlideScreen().slideUp(driver, 400, 100);
		driver.findElementByXPath("//*[@id=\"div_agreement\"]/div/label").click();
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "clickSelectCustomerNumber.jpg"));
//			CaseS01_001.setDataInfo("「お客さま番号を入力する」ラジオボタンを選択する。", "clickSelectCustomerNumber.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「番号」ラベルを確認する。
	 * @throws InterruptedException 
	 */
	public void ConfirmNumberLabel(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		Thread.sleep(2000);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "ConfirmNumberLabel.jpg"));
			CaseS01_021.setDataInfo(msg, "ConfirmNumberLabel.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「日程」入力欄に"01"を入力する。
	 * @throws InterruptedException 
	 */
	public void InputIntoSchedule(String msg, String schedule) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[1]/dd/input").sendKeys(schedule);
		new SlideScreen().slideUp(driver, 200, 195);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "InputIntoSchedule.jpg"));
			CaseS01_022.setDataInfo(msg, "InputIntoSchedule.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「所」入力欄に"14"を入力する。
	 * @throws InterruptedException 
	 */
	public void InputIntoPlace(String msg,String place) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[2]/dd/input").sendKeys(place);
		new SlideScreen().slideUp(driver, 200, 195);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "InputIntoPlace.jpg"));
			CaseS01_023.setDataInfo(msg, "InputIntoPlace.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「番号」入力欄に"5122"-"130533"を入力する。
	 * @throws InterruptedException 
	 */
	public void InputIntoPhone(String msg, String phone1, String phone2) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[3]/dd/input").sendKeys(phone1);
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[4]/dd/input").sendKeys(phone2);
		new SlideScreen().slideUp(driver, 200, 195);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "InputIntoPlace.jpg"));
			CaseS01_024.setDataInfo(msg, "InputIntoPlace.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 「確定」ボタンを確認する。
	 * @throws InterruptedException 
	 */
	public void ConfirmConfirmLabel(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		new SlideScreen().slideUp(driver, 400, 100);
		Thread.sleep(2000);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "ConfirmConfirmLabel.jpg"));
			CaseS01_025.setDataInfo(msg, "ConfirmConfirmLabel.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「現在のご契約状況」ラベルを確認する。
	 * @throws InterruptedException
	 */
	public void confirmS02001(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 200);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "confirmS02001.jpg"));
			CaseS02_001.setDataInfo(msg, "confirmS02001.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 「契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。」ラベルを確認する。
	 * @throws InterruptedException
	 */
	public void confirmS02002(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 200);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "confirmS02002.jpg"));
			CaseS02_002.setDataInfo(msg, "confirmS02002.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 「電気のご契約」ラベルを確認する。
	 * @throws InterruptedException
	 */
	public void confirmS02003(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 200);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "confirmS02003.jpg"));
			CaseS02_003.setDataInfo(msg, "confirmS02003.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 「電気のご契約」ラベル横のアイコンを確認する。
	 * @throws InterruptedException
	 */
	public void confirmS02004(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 200);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "confirmS02004.jpg"));
			CaseS02_004.setDataInfo(msg, "confirmS02004.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 「電気のご契約」ラベル横の必須マークを確認する。
	 * @throws InterruptedException
	 */
	public void confirmS02005(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 200);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "confirmS02005.jpg"));
			CaseS02_005.setDataInfo(msg, "confirmS02005.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *「ガスのご契約」ラベルのを確認する。
	 */
	
	public void gasContactlabel(String msg) {
		driver.findElementByXPath("/html/body/div[18]/div").click();
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			String imgName = "currentContractConditions.jpg";
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + imgName));
			CaseS02_008.setDataInfo(msg, imgName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *「お客さま番号を入力する」ラジオボタンを確認する。
	 */
	
	public void customerId(String msg) {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[2]").click();
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[1]").click();
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			String imgName="currentContractConditions.jpg";
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + imgName));
			CaseS02_013.setDataInfo(msg, imgName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 点击他社按钮2
	 */
	public void setOtherShrines2() {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[1]").click();;

		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setOtherShrines2.jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 点击「関西電力」按钮2
	 */
	public void kansaiElectricPower2() {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[2]").click();;
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "kansaiElectricPower2.jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 点击「お客さま番号を入力する」
	 */
	public void enterCustomerNumber() {

		driver.findElementByXPath("//*[@id=\"div_agreement\"]/div/label").click();;
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "enterCustomerNumber.jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	/**
	 * 点击
	 * */
	public void enter(String msg) throws InterruptedException{
		driver.findElementByXPath("/html/body/div[18]/div").click();;
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			String imgName="enter.jpg";
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + imgName));	
			CaseS02_016.setDataInfo(msg, imgName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「日程」入力欄に"01"を入力する。
	 * @throws InterruptedException 
	 */
	public void InputIntoSchedule() throws InterruptedException {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[1]/dd/input").sendKeys("01");
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "InputIntoSchedule.jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「所」入力欄に"14"を入力する。
	 * @throws InterruptedException 
	 */
	public void InputIntoPlace() throws InterruptedException {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[2]/dd/input").sendKeys("14");
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "InputIntoPlace.jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 「番号」入力欄に"5122"-"130533"を入力する。
	 * @throws InterruptedException 
	 */
	public void InputIntoPhone() throws InterruptedException {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[3]/dd/input").sendKeys("5122");
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[4]/dd/input").sendKeys("130533");
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "InputIntoPlace.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 点击
	 * */
	public void enter2(String msg) throws InterruptedException {
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/h4[4]/span[1]").click();;
		Thread.sleep(2000);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			String imgName = "enter2.jpg";
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + imgName));
			CaseS02_022.setDataInfo(msg, imgName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 点击「関西電力」按钮
	 */
	public void kansaiElectricPower() {

		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[2]").click();;		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "kansaiElectricPower.jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 点击关西电力
	 * 
	 * @throws InterruptedException
	 */
	public void setKansaiElectricPower(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 200);
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[2]").click();
		;
		// Thread.sleep(2000);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setKansaiElectricPower.jpg"));
			CaseS03_002.setDataInfo(msg, "setKansaiElectricPower.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 点击 点击他社按钮
	 * 
	 * @throws InterruptedException
	 */
	public void setOtherShrines1(String msg) throws InterruptedException {
		
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[1]").click();
		;
		new SlideScreen().slideUp(driver, 400, 200);
		Thread.sleep(1000);
		new SlideScreen().slideUp(driver, 400, 200);
		Thread.sleep(1000);
		new SlideScreen().slideUp(driver, 400, 200);
		Thread.sleep(1000);
		new SlideScreen().slideUp(driver, 400, 200);
		Thread.sleep(1000);
		new SlideScreen().slideUp(driver, 400, 200);
		Thread.sleep(1000);
		new SlideScreen().slideUp(driver, 400, 200);
		Thread.sleep(1000);
		new SlideScreen().slideUp(driver, 400, 200);
		Thread.sleep(1000);
		new SlideScreen().slideUp(driver, 400, 200);
		Thread.sleep(1000);
		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setOtherShrines1.jpg"));
			CaseS03_003.setDataInfo(msg, "setOtherShrines1.jpg");
			CaseS03_005.setDataInfo(msg, "setOtherShrines1.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 点击关西电力
	 * 
	 * @throws InterruptedException
	 */
	public void setKansaiElectricPower1(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 200);
		driver.findElementByXPath("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[2]").click();
		;
		// Thread.sleep(2000);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setKansaiElectricPower1.jpg"));
			CaseS03_004.setDataInfo(msg, "setKansaiElectricPower1.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 点击输入号码
	 * 
	 * @throws InterruptedException
	 */
	public void setemployee(String msg) throws InterruptedException {
		new SlideScreen().slideUp(driver, 400, 200);
		driver.findElementByXPath("//*[@id=\"div_agreement\"]/div/label").click();
		;
		// Thread.sleep(2000);
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("IMG" + File.separator + "setemployee.jpg"));
			CaseS03_006.setDataInfo(msg, "setemployee.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
