package project.sw.cases.task07.web.s03;

import dto.BaseCase;
import dto.KindBean;
import project.sw.pages.web.HomePage;

public class CaseS03_002 extends BaseCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(KindBean kb) throws Exception {
		HomePage cpObj = new HomePage();
		cpObj.kansaiElectric1Click("kansaiElectric1002");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "kansaiElectric1002.png");
		Thread.sleep(1000);
		cpObj.otherShrines2Click("otherShrines2Click");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "otherShrines2Click.png");
		cpObj.idPasswordElemClick("idPasswordClick002");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "idPasswordClick002.png");
		super.outputExls(kb);
	}
}
