package ads.app.web.project.sw.cases.s03;

import ads.app.web.bean.ADSCaseIFWeb;
import ads.app.web.bean.BaseCaseWeb;
import ads.app.web.project.sw.pages.HomePage;
import ads.com.KindBean;

public class CaseS03_002 extends BaseCaseWeb implements ADSCaseIFWeb {
	public CaseS03_002() {
		super();
	}

	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-23
	 */
	public void action(KindBean kb) {
		HomePage cpObj = new HomePage();

		// 点击「電気のご契約」-「関西電力」并截图
		cpObj.kansaiElectric1Click();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "kansaiElectric1002.png");
		sleep(1000);

		// 点击「電気のご契約」-「関西電力」并截图
		cpObj.otherShrines2Click();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "otherShrines2Click.png");

		// 点击「「はぴeみる電」のID・パスワードを入力する」并截图
		cpObj.idPasswordAClick();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "idPasswordClick002.png");

		super.outputExls(kb);
	}
}
