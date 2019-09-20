package ads.app.mobile.project.isms.cases.s02;

import ads.app.mobile.bean.ElementMobile;
import ads.com.*;
import io.appium.java_client.AppiumDriver;

/*
 * @author:Qin.SQ
 * @date:2019-09-16
 * */
public class Case_001 extends BaseCase implements ADSCaseIFMobile {
	public void action(AppiumDriver driver, KindBean kb) {
		//
		ElementMobile userIdElem = new ElementMobile(driver);
		userIdElem.setTab("用户名");
		userIdElem.setIdAttr("j_username");

		//
		ElementMobile pswElem = new ElementMobile(driver);
		pswElem.setTab("密码");
		pswElem.setIdAttr("j_password");

		//
		ElementMobile okBtnElem = new ElementMobile(driver);
		okBtnElem.setTab("登录");
		okBtnElem.setIdAttr("loginBtn");

		// 输出报告
		super.outputExls(kb);
	}
}
