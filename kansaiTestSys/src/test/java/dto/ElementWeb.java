package dto;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElementWeb extends BaseElementWeb {
	private String title;// 标题
	private String tab;// 标签
	private int minLen;
	private int mzxLen;
	private String idAttr;// 通过id
	private String nameAttr;// 通过name
	private String xpathAttr;// 通过Xpath
	private String linkTextAttr;// 通过链接文字

	public ElementWeb() {
		this.title = "";
		this.tab = "";
		this.idAttr = "";
		this.nameAttr = "";
		this.xpathAttr = "";
		this.linkTextAttr = "";
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
	 * 
	 * @return
	 */
	private SelenideElement findElementBy() {
		if (!"".equals(idAttr)) {
			return $(idAttr);
		} else if (!"".equals(nameAttr)) {
			return $(By.name(nameAttr));
		} else if (!"".equals(xpathAttr)) {
			return $(By.xpath(xpathAttr));
		} else if (!"".equals(linkTextAttr)) {
			return $(By.linkText(linkTextAttr));
		}
		return null;
	}

	/*
	 * 鼠标点击事件
	 **/
	public void click() {
		findElementBy().click();
	}

	/*
	 * 键盘设值事件
	 **/
	public void sendKeys(String val) {
		findElementBy().sendKeys(val);
	}
}
