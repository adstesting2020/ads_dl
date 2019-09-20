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
	
	public void mainHeadClick(String imgName) throws IOException {
		mainHeadElem.setTab("現在のご契約状況");
		mainHeadElem.setXpathAttr("//*[@id=\"Container\"]/form/section/div[1]/h3");
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void btn1_1Click(String imgName) throws IOException {
		btn1_1.setTab("電気のご契約-他社");
		btn1_1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[1]");
		btn1_1.click(driver);
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void btn1_2Click(String imgName) throws IOException {
		btn1_2.setTab("電気のご契約-関西電力");
		btn1_2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[2]");
		btn1_2.click(driver);
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void btn2_1Click(String imgName) throws IOException {
		btn2_1.setTab("ガスのご契約-他社");
		btn2_1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[1]");
		btn2_1.click(driver);
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void btn2_2Click(String imgName) throws IOException {
		btn2_2.setTab("ガスのご契約-関西電力");
		btn2_2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[2]");
		btn2_2.click(driver);
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void btn3_1Click(String imgName) throws IOException {
		btn3_1.setTab("お客様番号を入力する");
		btn3_1.setXpathAttr("//*[@id=\"div_agreement\"]/div/label");
		btn3_1.click(driver);
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void btn3_2Click(String imgName) throws IOException {
		btn3_2.setTab("はぴeみる電");
		btn3_2.setXpathAttr("//*[@id=\"div_agreement\"]/div/a");
		btn3_2.click(driver);
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void setInput1(String imgName, String value)throws IOException {
		input1.setTab("日程");
		input1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[1]/dd/input");
		input1.sendKeys(driver, "01");
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void setInput2(String imgName, String value)throws IOException {
		input2.setTab("所");
		input2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[2]/dd/input");
		input2.sendKeys(driver, "14");
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void setInput3(String imgName, String value)throws IOException {
		input3.setTab("番号一");
		input3.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[3]/dd/input");
		input3.sendKeys(driver, "5122");
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void setInput4(String imgName, String value)throws IOException {
		input4.setTab("番号に");
		input4.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[4]/dd/input");
		input4.sendKeys(driver, "130533");
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void clickConfirm(String imgName) throws IOException {
		confirm.setTab("確定");
		confirm.setXpathAttr("//*[@id=\"Container\"]/form/section/button[1]");
		confirm.click(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void clickNITTEI(String imgName) throws IOException {
		dtNittei.setTab("日程dt");
		dtNittei.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[1]/dt");
		dtNittei.click(driver);
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void clickH4_3(String imgName) throws IOException {
		h4_3.setTab("関西電力の電気の お客さま番号...");
		h4_3.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/h4[3]");
		h4_3.click(driver);
		
		mainHeadElem.screenShot(driver,imgName);
	}
	
	public void clickH4_4(String imgName) throws IOException {
		h4_4.setTab("電気契約のお客さま番号");
		h4_4.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/h4[4]");
		h4_4.click(driver);
		
		mainHeadElem.screenShot(driver, imgName);
	}

	public void clickIntroduction(String imgName) throws IOException {
		introduction.setTab("お客さま番号の確認方法");
		introduction.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[14]/span");
		introduction.click(driver);

		mainHeadElem.screenShot(driver,imgName);
	}

	public void clickClose(String imgName) throws IOException {
		close.setTab("閉じる");
		close.setXpathAttr("/html/body/div[2]/div[2]/span");
		close.click(driver);

		mainHeadElem.screenShot(driver,imgName);
	}

}