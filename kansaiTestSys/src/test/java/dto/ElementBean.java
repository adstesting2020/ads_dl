package dto;

import common.BaseElement;
import io.appium.java_client.AppiumDriver;

public class ElementBean extends BaseElement {
	private AppiumDriver driver;

	public ElementBean(AppiumDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}

	private String title;// 标题
	private String tab;// 标签
	private String attr;// 定位属性值
	private int minLen;
	private int mzxLen;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	/*
	 * 鼠标点击事件
	 **/
	public void click() {
		driver.findElementByXPath(this.attr).click();
	}

	/*
	 * 键盘设值事件
	 **/
	public void sendKeys(String val) {
		driver.findElementByXPath(this.attr).sendKeys(val);
	}
}
