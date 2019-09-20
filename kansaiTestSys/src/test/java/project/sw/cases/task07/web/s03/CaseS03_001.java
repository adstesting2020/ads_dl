package project.sw.cases.task07.web.s03;

import dto.BaseCase;
import dto.KindBean;
import project.sw.pages.web.HomePage;

public class CaseS03_001 extends BaseCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(KindBean kb) throws Exception {
		HomePage cpObj = new HomePage();
		cpObj.otherShrines1Click("otherShrines001");
		Thread.sleep(1000);
		cpObj.kansaiElectric2Click("kansaiElectric2Click001");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "kansaiElectric2Click001.png");
		Thread.sleep(1000);
		super.outputExls(kb);
	}
}