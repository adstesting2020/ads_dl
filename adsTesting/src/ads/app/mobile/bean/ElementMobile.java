package ads.app.mobile.bean;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class ElementMobile extends BaseMobileElement {
	private AppiumDriver driver;
	
	private String title;// 标题
	private String tab;// 标签
	private int minLen;
	private int mzxLen;
	private String idAttr;// 通过id
	private String nameAttr;// 通过name
	private String xpathAttr;// 通过Xpath
	private String linkTextAttr;// 通过链接文字
	

	public ElementMobile(AppiumDriver _driver) {
		super(_driver);
		this.driver = _driver;
		this.title = "";
		this.tab = "";
		this.idAttr = "";
		this.nameAttr = "";
		this.xpathAttr = "";
		this.linkTextAttr = "";
	}

	public AppiumDriver getDriver() {
		return driver;
	}

	public void setDriver(AppiumDriver driver) {
		this.driver = driver;
	}

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

	public int getMinLen() {
		return minLen;
	}

	public void setMinLen(int minLen) {
		this.minLen = minLen;
	}

	public int getMzxLen() {
		return mzxLen;
	}

	public void setMzxLen(int mzxLen) {
		this.mzxLen = mzxLen;
	}

	public String getIdAttr() {
		return idAttr;
	}

	public void setIdAttr(String idAttr) {
		this.idAttr = idAttr;
	}

	public String getNameAttr() {
		return nameAttr;
	}

	public void setNameAttr(String nameAttr) {
		this.nameAttr = nameAttr;
	}

	public String getXpathAttr() {
		return xpathAttr;
	}

	public void setXpathAttr(String xpathAttr) {
		this.xpathAttr = xpathAttr;
	}

	public String getLinkTextAttr() {
		return linkTextAttr;
	}

	public void setLinkTextAttr(String linkTextAttr) {
		this.linkTextAttr = linkTextAttr;
	}

	
	/**
	 * 定位方式
	 * @return
	 */
	private WebElement findElementBy(AppiumDriver driver) {
		if (!"".equals(idAttr)) {
			return driver.findElementById(idAttr);
		} else if (!"".equals(nameAttr)) {
			return driver.findElementByName(nameAttr);
		} else if (!"".equals(xpathAttr)) {
			return driver.findElementByXPath(xpathAttr);
		} else if (!"".equals(linkTextAttr)) {
			return driver.findElementByLinkText(linkTextAttr);
		}
		return null;
	}

	/*
	 * 鼠标点击事件
	 **/
	public void click(AppiumDriver driver) {
		findElementBy(driver).click();
	}

	/*
	 * 键盘设值事件
	 **/
	public void sendKeys(AppiumDriver driver, String val) {
		findElementBy(driver).sendKeys(val);
	}
}