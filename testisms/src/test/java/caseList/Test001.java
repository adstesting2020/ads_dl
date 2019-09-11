package caseList;

import java.util.ArrayList;

import common.SlideScreen;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import model.OutputReport;
import pages.LoginPage;

/**
 * Case001
 * @author ondor
 *
 */
public class Test001 {

	private static ArrayList<DataBean> DATALIST = new ArrayList<DataBean>();

	public void test001(AppiumDriver<IOSElement> driver) throws Exception {
		LoginPage lp = new LoginPage(driver);

		lp.setUserId("test");
		lp.setPassword("test");
		lp.okBtnClick();
		Thread.sleep(2000);
		driver.findElementById("studyBtn_00").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"scroll\"]/a[3]").click();
		Thread.sleep(5000);
		SlideScreen ss = new SlideScreen(driver);
		ss.slideUp(driver);
		Thread.sleep(2000);
		
	}

	public static void setDataInfo(String msg, String img) {
		DataBean d1 = new DataBean();
		d1.setMsg(msg);
		d1.setImgPath(img);
		DATALIST.add(d1);

	}

	public void createReport() {

		KindBean kb = new KindBean();
		kb.setTestCaseId("T001");
		kb.setKind1("スマホ");
		kb.setKind2("Android 7.0");
		kb.setBrower("Chrome");
		kb.setTestKind("Appium");
		new OutputReport().outputExls(kb, Test001.DATALIST);

	}

}
