package project.isms.cases.task01.mobile.s01;

import dto.BaseCase;
import dto.ElementMobile;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;

/*
 * @author:Qin.SQ
 * @date:2019-09-16
 * */
public class CaseS01_001 extends BaseCase {

	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		//
		ElementMobile userIdElem = new ElementMobile(driver);
		userIdElem.setTab("用户名");
		userIdElem.setIdAttr("j_username");
		userIdElem.sendKeys("test");

		//
		ElementMobile pswElem = new ElementMobile(driver);
		pswElem.setTab("密码");
		pswElem.setIdAttr("j_password");
		pswElem.sendKeys("test");

		//
		ElementMobile okBtnElem = new ElementMobile(driver);
		okBtnElem.setTab("登录");
		okBtnElem.setIdAttr("loginBtn");
		okBtnElem.click();

		//
		okBtnElem.screenShot("InputIntoSchedule.jpg");
		saveReportInfo("契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。", "InputIntoSchedule.jpg");
		
		//
		ElementMobile changePswBtn = new ElementMobile(driver);
		changePswBtn.setTab("パスワード変更");
		changePswBtn.setIdAttr("changePswBtn");
		changePswBtn.click();
		changePswBtn.screenShot("changePswBtn.jpg");
		saveReportInfo("changePswBtn。", "changePswBtn.jpg");
		
		//
		ElementMobile pswNow = new ElementMobile(driver);
		pswNow.setTab("現在のパスワード");
		pswNow.setIdAttr("pswNow");
		pswNow.sendKeys("test");
		
		//
		ElementMobile pswNew1 = new ElementMobile(driver);
		pswNew1.setTab("新しいパスワード");
		pswNew1.setXpathAttr("pswNew1");
		pswNew1.sendKeys("test1");
		
		//
		ElementMobile pswNew2 = new ElementMobile(driver);
		pswNew2.setTab("新しいパスワード");
		pswNew2.setXpathAttr("pswNew2");
		pswNew2.sendKeys("test1");
		
		//
		ElementMobile changeBtn = new ElementMobile(driver);
		changeBtn.setTab("パスワード変更");
		changeBtn.setXpathAttr("/html/body/form/table/tbody/tr[6]/td/table/tbody/tr[9]/td/input[1]");
		changeBtn.screenShot("changeBtn.jpg");
		changeBtn.click();		
		saveReportInfo("changeBtn。", "changeBtn.jpg");
		
		

		// 输出报告
		super.outputExls(kb);
	}
}
