package common;

import java.util.ArrayList;

import dto.DataBean;

public class TXCase {	
	public static ArrayList<DataBean> DATALIST = new ArrayList<DataBean>();

	public TXCase() {
		System.out.println("data list clear");
		DATALIST.clear();
	}
	
	public static void setDataInfo(String msg, String img) {
		DataBean data = new DataBean();
		
		data.setMsg(msg);
		data.setImgPath(img);
		
		DATALIST.add(data);
	}
}
