package project.sw.cases.task07.mobile.s01;

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
		userIdElem.setIdAttr("//*[@id=\\\"Container\\\"]/form/section/div[2]/div/div[1]/label[1]/input");
		userIdElem.sendKeys("test");

		//
		ElementMobile pswElem = new ElementMobile(driver);
		pswElem.setTab("密码");
		pswElem.setNameAttr("//*[@id=\\\"Container\\\"]/form/section/div[2]/div/div[1]/label[2]/input");
		pswElem.sendKeys("test");

		//
		ElementMobile okBtnElem = new ElementMobile(driver);
		okBtnElem.setTab("登录");
		okBtnElem.setXpathAttr("//*[@id=\\\"Container\\\"]/form/section/div[2]/div/div[1]/label[2]/input");
		okBtnElem.click();

		//
		okBtnElem.screenShot("InputIntoSchedule.jpg");
		saveReportInfo("契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。", "InputIntoSchedule.jpg");

		// 输出报告
		super.outputExls(kb);
	}
}
