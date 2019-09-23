package ads.com;

public class Const {
	public Const() {
	}

	//
	public static final int RUNFLG = 1;

	public static final int ANDROID_5 = 1;// 1 - Android 5.0
	public static final int ANDROID_6 = 2;// 2 - Android 6.0
	public static final int ANDROID_7 = 3;// 3 - Android 7.0
	public static final int ANDROID_8 = 4;// 4 - Android 8.0
	public static final int ANDROID_9 = 5;// 5 - Android 9.0
	public static final int IPHONE_7PLUS = 6;// 6 - iPhone7Plus
	public static final int IPHONE_8 = 7;// 7 - iPhone8
	public static final int IPHONE_X = 8;// 8 - iPhoneX
	public static final int WINDOWS7_IE = 9;// 9 - Win7-IE
	public static final int WINDOWS7_CHROME = 10;// 10 - Win7-Chrome
	public static final int WINDOWS10_IE = 11;// 11 - Win10-IE
	public static final int WINDOWS10_CHROME = 12;// 12 - Win10-Chrome
	public static final int WINDOWS10_EDGE = 13;// 13 - Win10-Edge
	public static final int MAC_SAFARI = 14;// 14 - Mac-Safari
	public static final int MAC_CHROME = 15;// 15 - Mac-Chrome

	// picture dictory
	public static final String COPYPICFROM = "IMG";

	// mobile picture width and height
	public static final int MOBILE_PICWIDTH = 12;
	public static final int MOBILE_PICHEIGHT = 73;

	// web picture width and height
	public static final int WEB_PICWIDTH = 25;
	public static final int WEB_PICHEIGHT = 46;

	// sw system url
	public static final String SWURL = "https://keiyaku.kepco.jp/switch/switch_01";

	public static KindBean getRunKindBean() {
		KindBean kb = new KindBean();

		switch (Const.RUNFLG) {
		case Const.ANDROID_5:
		case Const.ANDROID_6:
		case Const.ANDROID_7:
		case Const.ANDROID_8:
		case Const.ANDROID_9:
		case Const.IPHONE_7PLUS:
		case Const.IPHONE_8:
		case Const.IPHONE_X:
			kb.setWidth(Const.MOBILE_PICWIDTH);
			kb.setHeight(Const.MOBILE_PICHEIGHT);
			break;
		case Const.WINDOWS7_IE:
		case Const.WINDOWS7_CHROME:
		case Const.WINDOWS10_IE:
		case Const.WINDOWS10_CHROME:
		case Const.WINDOWS10_EDGE:
		case Const.MAC_SAFARI:
		case Const.MAC_CHROME:
			kb.setWidth(Const.WEB_PICWIDTH);
			kb.setHeight(Const.WEB_PICHEIGHT);
			break;
		}

		switch (Const.RUNFLG) {
		case Const.ANDROID_5:
			kb.setKind1("スマホ");
			kb.setKind2("Android 5.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");
			break;
		case Const.ANDROID_6:
			kb.setKind1("スマホ");
			kb.setKind2("Android 6.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");
			break;
		case Const.ANDROID_7:
			break;
		case Const.ANDROID_8:
			break;
		case Const.ANDROID_9:
			kb.setKind1("スマホ");
			kb.setKind2("Android 9.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");
			break;
		case Const.IPHONE_7PLUS:
			kb.setKind1("スマホ");
			kb.setKind2("iOS 12.4");
			kb.setBrower("Safari");
			kb.setTestKind("Appium");
			break;
		case Const.IPHONE_8:
			break;
		case Const.IPHONE_X:
			break;
		case Const.WINDOWS7_IE:
			break;
		case Const.WINDOWS7_CHROME:
			break;
		case Const.WINDOWS10_IE:
			break;
		case Const.WINDOWS10_CHROME:
			break;
		case Const.WINDOWS10_EDGE:
			kb.setKind1("Win10");
			kb.setKind2("17.17134");
			kb.setBrower("Edge");
			kb.setTestKind("Selenide");
			break;
		case Const.MAC_SAFARI:
			kb.setKind1("Mac");
			kb.setKind2("12.1.2");
			kb.setBrower("Safari");
			kb.setTestKind("Selenide");
			break;
		case Const.MAC_CHROME:
			kb.setKind1("Mac");
			kb.setKind2("76");
			kb.setBrower("Chrome");
			kb.setTestKind("Selenide");
			break;
		}

		switch (Const.RUNFLG) {
		case Const.ANDROID_5:
			kb.setKind1("スマホ");
			kb.setKind2("Android 5.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");
			break;
		case Const.ANDROID_6:
			kb.setKind1("スマホ");
			kb.setKind2("Android 6.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");
			break;
		case Const.ANDROID_7:
			break;
		case Const.ANDROID_8:
			break;
		case Const.ANDROID_9:
			kb.setKind1("スマホ");
			kb.setKind2("Android 9.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");
			break;
		case Const.IPHONE_7PLUS:
			kb.setKind1("スマホ");
			kb.setKind2("iOS 12.4");
			kb.setBrower("Safari");
			kb.setTestKind("Appium");
			break;
		case Const.IPHONE_8:
			break;
		case Const.IPHONE_X:
			break;
		case Const.WINDOWS7_IE:
			break;
		case Const.WINDOWS7_CHROME:
			break;
		case Const.WINDOWS10_IE:
			break;
		case Const.WINDOWS10_CHROME:
			break;
		case Const.WINDOWS10_EDGE:
			kb.setKind1("Win10");
			kb.setKind2("17.17134");
			kb.setBrower("Edge");
			kb.setTestKind("Selenide");
			break;
		case Const.MAC_SAFARI:
			kb.setKind1("Mac");
			kb.setKind2("12.1.2");
			kb.setBrower("Safari");
			kb.setTestKind("Selenide");
			break;
		case Const.MAC_CHROME:
			kb.setKind1("Mac");
			kb.setKind2("76");
			kb.setBrower("Chrome");
			kb.setTestKind("Selenide");
			break;
		}

		return kb;
	}
}
