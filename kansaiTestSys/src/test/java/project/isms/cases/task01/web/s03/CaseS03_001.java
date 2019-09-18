package project.isms.cases.task01.web.s03;

import dto.BaseCase;
import dto.ElementWeb;
import dto.KindBean;
import project.isms.pages.web.HomePage;

public class CaseS03_001 extends BaseCase {

	public void action(KindBean kb) throws Exception {
		HomePage hpObj = new HomePage();

		hpObj.setUserId("test");

		hpObj.setPassword("test", "InputIntoSchedule2.png");
		saveReportInfo("2契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。", "InputIntoSchedule2.png");

		hpObj.okBtnClick("InputIntoSchedule2.png");
		saveReportInfo("契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。", "InputIntoSchedule.png");

		
		
		
		
		
		ElementWeb changePswBtn = new ElementWeb();
		changePswBtn.setTab("パスワード変更");
		changePswBtn.setIdAttr("#changePswBtn");
		changePswBtn.click();
		changePswBtn.screenShot("changePswBtn.png");
		saveReportInfo("changePswBtn。", "changePswBtn.jpg");

		ElementWeb pswNow = new ElementWeb();
		pswNow.setTab("現在のパスワード");
		pswNow.setIdAttr("#pswNow");
		pswNow.sendKeys("test");

		// 输出报告
		super.outputExls(kb);
	}
}
