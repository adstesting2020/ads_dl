package project.sw.cases.task07.mobile.s02;

import dto.BaseCase;
import dto.ElementMobile;
import dto.KindBean;
import project.sw.pages.mobile.HomePage;
import io.appium.java_client.AppiumDriver;

public class CaseS02_001 extends BaseCase {

	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage hpObj = new HomePage(driver);
		
		hpObj.mainHeadClick("mainHeadClick.jpg");
		saveReportInfo("即契約確認・エリア判定・申込みメニュー画面", "mainHeadClick.jpg");
		
		hpObj.btn1_2Click("btn1_2Click.jpg");
		saveReportInfo("", "btn1_2Click.jpg");
		
		hpObj.btn2_1Click("btn2_1Click.jpg");
		saveReportInfo("", "btn2_1Click.jpg");
		
		hpObj.btn3_1Click("btn3_1Click.jpg");
		saveReportInfo("", "btn3_1Click.jpg");
		
		hpObj.setInput1("input1.jpg", "01");
		hpObj.setInput2("input2.jpg", "14");
		hpObj.setInput3("input3.jpg", "5122");
		hpObj.setInput4("input4.jpg", "130533");
		saveReportInfo("", "input4.jpg");
		
		hpObj.clickNITTEI("Nittei.jpg");
		saveReportInfo("", "Nittei.jpg");
		// 
		
		// 输出报告
		super.outputExls(kb);
	}
}