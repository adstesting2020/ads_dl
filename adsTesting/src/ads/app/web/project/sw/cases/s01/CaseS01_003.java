package ads.app.web.project.sw.cases.s01;

import ads.app.web.bean.BaseWebCaseIF;
import ads.app.web.bean.BaseWebCase;
import ads.app.web.project.sw.pages.HomePage;
import ads.com.KindBean;

public class CaseS01_003 extends BaseWebCase implements BaseWebCaseIF {
	public CaseS01_003() {
		super();
	}

	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-23
	 */
	public void action(KindBean kb) {
		HomePage cpObj = new HomePage();
		// 点击「お客さま番号を入力する」
		cpObj.customerNumLabelClick();

		// 「日程」设值"01"
		cpObj.scheduleInput("01");
		sleep(1000);

		// 「所」设值"14"
		cpObj.placeInput("14");
		sleep(1000);

		// 「番号1」设值"5122"
		cpObj.number1Input("5122");
		sleep(1000);

		// 「番号2」设值"130533"并截图
		cpObj.number2Input("130533");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "number2.png");

		super.outputExls(kb);
	}
}
