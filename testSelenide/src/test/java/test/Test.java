package test;

import java.util.ArrayList;

import dto.DataBean;
import dto.KindBean;
import model.OutputReport;

public class Test {
	private ArrayList<DataBean> getDataList() {
		ArrayList<DataBean> list = new ArrayList<DataBean>();

		//
		DataBean d1 = new DataBean();

		d1.setMsg("サンプル　１　の画像です");
		d1.setImgPath("setUp.png");

		list.add(d1);

		//
		DataBean d2 = new DataBean();

		d2.setMsg("サンプル　２　の画像です");
		d2.setImgPath("setUserId.png");

		list.add(d2);

		return list;
	}

	public static void main(String[] args) {
		Test obj = new Test();

		KindBean kb = new KindBean();

		kb.setTestCaseId("T001");
		kb.setKind1("スマホ");
		kb.setKind2("Android 7.0");
		kb.setBrower("Chrome");
		kb.setTestKind("Appium");

		ArrayList<DataBean> dataList = obj.getDataList();

		new OutputReport().outputExls(kb, dataList);
	}
}
