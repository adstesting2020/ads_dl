package project.sw.cases.task07.mobile.s01;

import common.TXCase;
import dto.ElementBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;

/*
 * @author:Qin.SQ
 * @date:2019-09-16
 * */
public class CaseS01_001 extends TXCase {

	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		//
		ElementBean userIdElem = new ElementBean(driver);
		userIdElem.setTab("用户名");
		userIdElem.setAttr("//*[@id=\\\"Container\\\"]/form/section/div[2]/div/div[1]/label[1]/input");
		userIdElem.sendKeys("test");

		//
		ElementBean pswElem = new ElementBean(driver);
		pswElem.setTab("密码");
		pswElem.setAttr("//*[@id=\\\"Container\\\"]/form/section/div[2]/div/div[1]/label[2]/input");
		pswElem.sendKeys("test");

		//
		ElementBean okBtnElem = new ElementBean(driver);
		okBtnElem.setTab("登录");
		okBtnElem.setAttr("//*[@id=\\\"Container\\\"]/form/section/div[2]/div/div[1]/label[2]/input");
		okBtnElem.click();

		//
		okBtnElem.screenShot("InputIntoSchedule.jpg");
		saveReportInfo("契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。", "InputIntoSchedule.jpg");

		// 输出报告
		super.outputExls(kb);
	}
}
