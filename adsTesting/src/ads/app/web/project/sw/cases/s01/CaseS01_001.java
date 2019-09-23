package ads.app.web.project.sw.cases.s01;

import ads.app.web.bean.ADSCaseIFWeb;
import ads.app.web.bean.BaseCaseWeb;
import ads.app.web.project.sw.pages.HomePage;
import ads.com.KindBean;

public class CaseS01_001 extends BaseCaseWeb implements ADSCaseIFWeb {
	public CaseS01_001() {
		super();
	}

	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-23
	 */
	public void action(KindBean kb) {
		HomePage cpObj = new HomePage();

		// 在「契約切替を希望されるご住所の、現在の電気とガスのご契約先を選択してください」截图
		cpObj.switchContractMsgP("switchContractMsg");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "switchContractMsg.png");

		super.outputExls(kb);
	}
}
