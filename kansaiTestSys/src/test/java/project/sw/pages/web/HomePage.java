package project.sw.pages.web;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dto.ElementWeb;

public class HomePage {
	private WebDriver webdriver;

	public HomePage() {
	}

	ElementWeb otherShrinesElem1 = new ElementWeb();
	ElementWeb kansaiElectricElem1 = new ElementWeb();
	ElementWeb otherShrinesElem2 = new ElementWeb();
	ElementWeb kansaiElectricElem2 = new ElementWeb();
	ElementWeb switchContractMsgElem = new ElementWeb();
	ElementWeb customerNumElem = new ElementWeb();
	ElementWeb idPasswordElem = new ElementWeb();
	ElementWeb scheduleElem = new ElementWeb();
	ElementWeb placeElem = new ElementWeb();
	ElementWeb number1Elem = new ElementWeb();
	ElementWeb number2Elem = new ElementWeb();
	ElementWeb customerCodeElem = new ElementWeb();
	ElementWeb confirmElem = new ElementWeb();
	ElementWeb closeElem = new ElementWeb();
	

	/**
	 * 契約切替を希望されるご住所の、現在の電気とガスのご契約先を選択してください  为了截图证明前12个case
	 * @param imgName
	 * @throws IOException
	 */
	public void switchContractMsgElem(String imgName) throws IOException {
		otherShrinesElem1.setTab("契約切替を希望されるご住所の、現在の電気とガスのご契約先を選択してください。");
		otherShrinesElem1.setIdAttr("#switchContractMsgElem");
		switchContractMsgElem.screenShot(imgName);
	}

	/**
	 * 点击「電気のご契約」-「他社（関西電力以外）」
	 * @param imgName
	 * @throws IOException
	 */
	public void otherShrines1Click(String imgName) throws IOException {
		otherShrinesElem1.setTab("他社（関西電力以外）");
		otherShrinesElem1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[1]");
		otherShrinesElem1.click();

	}
	
	/**
	 * 点击「電気のご契約」-「関西電力」
	 * @param imgName
	 * @throws IOException
	 */
	public void kansaiElectric1Click(String imgName) throws IOException {
		kansaiElectricElem1.setTab("関西電力");
		kansaiElectricElem1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[2]");
		kansaiElectricElem1.click();
		otherShrinesElem2.screenShot(imgName);

	}

	/**
	 * 点击「ガスのご契約」-「他社（関西電力以外）」
	 * @param imgName
	 * @throws IOException
	 */
	public void otherShrines2Click(String imgName) throws IOException {
		otherShrinesElem2.setTab("他社（関西電力以外）");
		otherShrinesElem2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[1]");
		otherShrinesElem2.click();
		otherShrinesElem2.scrollTo();
		otherShrinesElem2.screenShot(imgName);

	}

	/**
	 * 点击「ガスのご契約」-「関西電力」
	 * @param imgName
	 * @throws IOException
	 */
	public void kansaiElectric2Click(String imgName) throws IOException {
		kansaiElectricElem2.setTab("関西電力");
		kansaiElectricElem2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[2]");
		kansaiElectricElem2.click();
		kansaiElectricElem2.screenShot(imgName);

	}

	/**
	 * 点击「お客さま番号を入力する」
	 * @throws IOException
	 */
	public void customerNumElemClick() throws IOException {
		kansaiElectricElem2.setTab("お客さま番号を入力する");
		kansaiElectricElem2.setXpathAttr("//*[@id=\"div_agreement\"]/div/label");
		kansaiElectricElem2.click();
		kansaiElectricElem2.scrollTo();

	}

	/**
	 * 点击「「はぴeみる電」のID・パスワードを入力する」
	 * @param imgName
	 * @throws IOException
	 */
	public void idPasswordElemClick(String imgName) throws IOException {
		idPasswordElem.setTab("「はぴeみる電」のID・パスワードを入力する");
		idPasswordElem.setXpathAttr("//*[@id=\"div_agreement\"]/div/a");
		idPasswordElem.click();
		idPasswordElem.screenShot(imgName);

	}

	/**
	 * 点击「お客さま番号の確認方法」
	 * @param imgName
	 * @throws IOException
	 */
	public void customerCodeElemClick(String imgName) throws IOException {
		customerCodeElem.setTab("お客さま番号の確認方法");
		customerCodeElem.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/h4[4]/span[4]");
		customerCodeElem.click();
	}

	/**
	 * 「お客さま番号の確認方法」ダイアログを閉じる
	 * @param imgName
	 * @throws IOException
	 */
	public void closeElemClick(String imgName) throws IOException {
		closeElem.screenShot(imgName);
		closeElem.setTab("閉じる");
		closeElem.setXpathAttr("/html/body/div[2]/div[2]");
		closeElem.click();
	}
	
	/**
	 * 「日程」设值
	 * @param value
	 * @throws IOException
	 */
	public void scheduleElem(String value) throws IOException {
		scheduleElem.setTab("日程");
		scheduleElem.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[1]/dd/input");
		scheduleElem.sendKeys(value);

	}

	/**
	 * 「所」设值
	 * @param value
	 * @throws IOException
	 */
	public void placeElem(String value) throws IOException {
		placeElem.setTab("所");
		placeElem.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[2]/dd/input");
		placeElem.sendKeys(value);

	}

	/**
	 * 「番号1」设值
	 * @param value
	 * @throws IOException
	 */
	public void number1Elem(String value) throws IOException {
		number1Elem.setTab("番号1");
		number1Elem.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[3]/dd/input");
		number1Elem.sendKeys(value);

	}

	/**
	 * 「番号2」设值
	 * @param value
	 * @param imgName
	 * @throws IOException
	 */
	public void number2Elem(String value, String imgName) throws IOException {
		number2Elem.setTab("番号2");
		number2Elem.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[4]/dd/input");
		number2Elem.sendKeys(value);
		number2Elem.screenShot(imgName);
	}

	/**
	 * 点击「確 定」
	 * @param imgName
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void confirmElemClick(String imgName) throws IOException, InterruptedException {
		confirmElem.setTab("確 定");
		confirmElem.setXpathAttr("//*[@id=\"Container\"]/form/section/button[1]");
		confirmElem.click();
		Thread.sleep(3000);
		confirmElem.screenShot(imgName);
	}

}
