package common;

import java.util.ArrayList;

import dto.DataBean;

public class TXCase {	
	public static ArrayList<DataBean> DATALIST = new ArrayList<DataBean>();

	public TXCase() {
		System.out.println("list clear");
		DATALIST.clear();
	}
	
	public static void setDataInfo(String msg, String img) {
		DataBean d1 = new DataBean();
		d1.setMsg(msg);
		d1.setImgPath(img);
		DATALIST.add(d1);
	}
}
