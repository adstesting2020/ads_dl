package project.sw.cases.task07.web.s01;

import dto.BaseCase;
import dto.KindBean;
import project.sw.pages.web.HomePage;

public class CaseS01_002 extends BaseCase {
	
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-19
	 * */
	public void action(KindBean kb) throws Exception {
		HomePage cpObj = new HomePage();
		cpObj.kansaiElectric1Click("kansaiElectri");
		cpObj.otherShrines2Click("otherShrines");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "otherShrines.png");
		super.outputExls(kb);
		Thread.sleep(5000);
	}
}
