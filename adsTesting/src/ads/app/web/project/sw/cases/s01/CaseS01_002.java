package ads.app.web.project.sw.cases.s01;

import ads.app.web.bean.BaseWebCaseIF;
import ads.app.web.bean.BaseWebCase;
import ads.app.web.project.sw.pages.HomePage;
import ads.com.KindBean;

public class CaseS01_002 extends BaseWebCase implements BaseWebCaseIF {
	public CaseS01_002() {
		super();
	}

	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-23
	 */
	public void action(KindBean kb) {
		HomePage cpObj = new HomePage();

		// 点击「電気のご契約」-「関西電力」
		cpObj.kansaiElectric1Click();

		// 点击「ガスのご契約」-「他社（関西電力以外）」并截图
		cpObj.otherShrines2Click();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "otherShrines.png");

		super.outputExls(kb);

		sleep(5000);
	}
}
