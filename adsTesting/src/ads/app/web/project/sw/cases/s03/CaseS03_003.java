package ads.app.web.project.sw.cases.s03;

import ads.app.web.bean.ADSCaseIFWeb;
import ads.app.web.bean.BaseCaseWeb;
import ads.app.web.project.sw.pages.HomePage;
import ads.com.KindBean;

public class CaseS03_003 extends BaseCaseWeb implements ADSCaseIFWeb {
	public CaseS03_003() {
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
		sleep(1000);

		// 点击「ガスのご契約」-「他社（関西電力以外）」
		cpObj.otherShrines2Click();
		sleep(1000);

		// 点击「お客さま番号を入力する」
		cpObj.customerNumLabelClick();
		sleep(1000);

		// 点击「お客さま番号の確認方法」
		cpObj.customerCodeSpanClick();
		sleep(1000);

		// 「お客さま番号の確認方法」ダイアログを閉じる并截图
		cpObj.closeDivClick();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "closeElemClick.png");

		// 「日程」设值"01"
		cpObj.scheduleInput("01");
		sleep(1000);

		// 「所」设值"14"
		cpObj.placeInput("14");
		sleep(1000);

		// 「番号1」设值"5122"
		cpObj.number1Input("5122");
		sleep(1000);

		// 「番号2」设值"130533"
		cpObj.number2Input("130533");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "number3.png");

		// 点击「確 定」并截图
		cpObj.confirmBtnClick();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "confirmElemClick.png");

		// 滚动到「電気契約のお客さま番号」并截图
		cpObj.scrollTocontuctSpan();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "scrollToContuct.png");

		super.outputExls(kb);
	}
}
