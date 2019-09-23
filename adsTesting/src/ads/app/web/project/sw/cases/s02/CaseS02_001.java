package ads.app.web.project.sw.cases.s02;

import ads.app.web.bean.BaseWebCaseIF;
import ads.app.web.bean.BaseWebCase;
import ads.app.web.project.sw.pages.HomePage;

public class CaseS02_001 extends BaseWebCase implements BaseWebCaseIF {
	public CaseS02_001() {
		super();
	}

	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-23
	 */
	public void action(String caseId) {
		HomePage cpObj = new HomePage();

		// 在「契約切替を希望されるご住所の、現在の電気とガスのご契約先を選択してください」截图
		cpObj.switchContractMsgP();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "switchContractMsg.png");

		// 在「ガスのご契約」-「他社（関西電力以外）」截图
		cpObj.scrollToOtherShrines2();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "scrollToOtherShrines2.png");

		super.outputExls(caseId);
	}
}
