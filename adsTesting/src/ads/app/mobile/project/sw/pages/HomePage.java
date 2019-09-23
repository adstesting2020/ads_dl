package ads.app.mobile.project.sw.pages;

import java.io.IOException;

import ads.app.mobile.bean.ElementMobile;
import ads.com.DataBean;
import io.appium.java_client.AppiumDriver;

public class HomePage {
	private AppiumDriver driver;
	private DataBean dataBean;

	public HomePage(AppiumDriver _driver) {
		this.driver = _driver;
	}

	ElementMobile mainHeadElem = new ElementMobile(driver);
	ElementMobile btn1_1 = new ElementMobile(driver);
	ElementMobile btn1_2 = new ElementMobile(driver);
	ElementMobile btn2_1 = new ElementMobile(driver);
	ElementMobile btn2_2 = new ElementMobile(driver);
	ElementMobile btn3_1 = new ElementMobile(driver);
	ElementMobile btn3_2 = new ElementMobile(driver);
	ElementMobile input1 = new ElementMobile(driver);
	ElementMobile input2 = new ElementMobile(driver);
	ElementMobile input3 = new ElementMobile(driver);
	ElementMobile input4 = new ElementMobile(driver);
	ElementMobile confirm = new ElementMobile(driver);
	ElementMobile dtNittei = new ElementMobile(driver);
	ElementMobile h4_3 = new ElementMobile(driver);
	ElementMobile h4_4 = new ElementMobile(driver);
	ElementMobile introduction = new ElementMobile(driver);
	ElementMobile close = new ElementMobile(driver);
	ElementMobile bottomImg = new ElementMobile(driver);

	/**
	 * 点击「現在のご契約状況」
	 * 
	 * @param imgName
	 */
	public void mainHeadClick(String imgName) {
		mainHeadElem.setTab("現在のご契約状況");
		mainHeadElem.setXpathAttr("//*[@id=\"Container\"]/form/section/div[1]/h3");
		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「"電気のご契約」-「他社」
	 * 
	 * @param imgName
	 */
	public void btn1_1Click(String imgName) {
		btn1_1.setTab("電気のご契約-他社");
		btn1_1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[1]");
		btn1_1.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「"電気のご契約」-「関西電力」
	 * 
	 * @param imgName
	 */
	public void btn1_2Click(String imgName) {
		btn1_2.setTab("電気のご契約-関西電力");
		btn1_2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[2]");
		btn1_2.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「"ガスのご契約」-「他社」
	 * 
	 * @param imgName
	 */
	public void btn2_1Click(String imgName) {
		btn2_1.setTab("ガスのご契約-他社");
		btn2_1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[1]");
		btn2_1.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「"ガスのご契約」-「関西電力」
	 * 
	 * @param imgName
	 */
	public void btn2_2Click(String imgName) {
		btn2_2.setTab("ガスのご契約-関西電力");
		btn2_2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[2]");
		btn2_2.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「お客様番号を入力する」
	 * 
	 * @param imgName
	 */
	public void btn3_1Click(String imgName) {
		btn3_1.setTab("お客様番号を入力する");
		btn3_1.setXpathAttr("//*[@id=\"div_agreement\"]/div/label");
		btn3_1.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「はぴeみる電」
	 * 
	 * @param imgName
	 */
	public void btn3_2Click(String imgName) {
		btn3_2.setTab("はぴeみる電");
		btn3_2.setXpathAttr("//*[@id=\"div_agreement\"]/div/a");
		btn3_2.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 向「日程」输入框输入值
	 * 
	 * @param imgName
	 * @param value
	 */
	public void setInput1(String imgName, String value) {
		input1.setTab("日程");
		input1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[1]/dd/input");
		input1.sendKeys(driver, "01");

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 向「所」输入框输入值
	 * 
	 * @param imgName
	 * @param value
	 */
	public void setInput2(String imgName, String value) {
		input2.setTab("所");
		input2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[2]/dd/input");
		input2.sendKeys(driver, "14");

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 向第一个「番号」输入框输入值
	 * 
	 * @param imgName
	 * @param value
	 */
	public void setInput3(String imgName, String value) {
		input3.setTab("番号一");
		input3.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[3]/dd/input");
		input3.sendKeys(driver, "5122");

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 向第二个「番号」输入框输入值
	 * 
	 * @param imgName
	 * @param value
	 */
	public void setInput4(String imgName, String value) {
		input4.setTab("番号に");
		input4.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[4]/dd/input");
		input4.sendKeys(driver, "130533");

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「確定」
	 * 
	 * @param imgName
	 */
	public void clickConfirm(String imgName) {
		confirm.setTab("確定");
		confirm.setXpathAttr("//*[@id=\"Container\"]/form/section/button[1]");
		confirm.click(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「日程」
	 * 
	 * @param imgName
	 */
	public void clickNITTEI(String imgName) {
		dtNittei.setTab("日程dt");
		dtNittei.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[1]/dt");
		dtNittei.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「関西電力の電気の お客さま番号...」
	 * 
	 * @param imgName
	 */
	public void clickH4_3(String imgName) {
		h4_3.setTab("関西電力の電気の お客さま番号...");
		h4_3.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/h4[3]");
		h4_3.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「電気契約のお客さま番号」
	 * 
	 * @param imgName
	 */
	public void clickH4_4(String imgName) {
		h4_4.setTab("電気契約のお客さま番号");
		h4_4.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/h4[4]");
		h4_4.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「お客さま番号の確認方法」
	 * 
	 * @param imgName
	 */
	public void clickIntroduction(String imgName) {
		introduction.setTab("お客さま番号の確認方法");
		introduction.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[14]/span");
		introduction.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击「閉じる」
	 * 
	 * @param imgName
	 */
	public void clickClose(String imgName) {
		close.setTab("閉じる");
		close.setXpathAttr("/html/body/div[2]/div[2]/span");
		close.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}

	/**
	 * 点击底部图片
	 * 
	 * @param imgName
	 */
	public void clickBottomimg(String imgName) {
		bottomImg.setTab("底部图片");
		bottomImg.setXpathAttr("html/body/div[18]");
		bottomImg.click(driver);

		mainHeadElem.screenShot(driver, imgName);
	}
}