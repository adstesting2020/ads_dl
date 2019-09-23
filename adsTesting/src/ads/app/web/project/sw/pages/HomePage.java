package ads.app.web.project.sw.pages;

import java.io.IOException;
import ads.app.web.bean.ElementWeb;

public class HomePage {
	public HomePage() {
	}

	// 「電気のご契約」-「他社（関西電力以外）」
	ElementWeb otherShrinesLabel1 = new ElementWeb();

	// 「電気のご契約」-「関西電力」
	ElementWeb kansaiElectricLabel1 = new ElementWeb();

	// 「電気のご契約」-「他社（関西電力以外）」
	ElementWeb otherShrinesLabel2 = new ElementWeb();

	// 「電気のご契約」-「関西電力」
	ElementWeb kansaiElectricLabel2 = new ElementWeb();

	// 契約切替を希望されるご住所の、現在の電気とガスのご契約先を選択してください。
	ElementWeb switchContractMsgP = new ElementWeb();

	// 「お客さま番号を入力する」
	ElementWeb customerNumLabel = new ElementWeb();

	// 「「はぴeみる電」のID・パスワードを入力する」
	ElementWeb idPasswordA = new ElementWeb();

	// 「日程」
	ElementWeb scheduleInput = new ElementWeb();

	// 「所」
	ElementWeb placeInput = new ElementWeb();

	// 「番号1」
	ElementWeb number1Input = new ElementWeb();

	// 「番号2」
	ElementWeb number2Input = new ElementWeb();

	// 「お客さま番号の確認方法」
	ElementWeb customerCodeSpan = new ElementWeb();

	// 「確 定」
	ElementWeb confirmBtn = new ElementWeb();

	// 「お客さま番号の確認方法」ダイアログを閉じる
	ElementWeb closeDiv = new ElementWeb();

	// 「電気契約のお客さま番号」
	ElementWeb contuctSpan = new ElementWeb();

	/**
	 * 契約切替を希望されるご住所の、現在の電気とガスのご契約先を選択してください 为了截图证明前12个case
	 * 
	 * @param imgName
	 * @throws IOException
	 */
	public void switchContractMsgP(String imgName) {
		switchContractMsgP.setTab("契約切替を希望されるご住所の、現在の電気とガスのご契約先を選択してください。");
		switchContractMsgP.setIdAttr("#switchContractMsgElem");
	}

	/**
	 * 滚动到「ガスのご契約」-「他社（関西電力以外）」
	 * 
	 * @param imgName
	 * @throws IOException
	 */
	public void scrollToOtherShrines2(String imgName) {
		otherShrinesLabel2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[1]");
		otherShrinesLabel2.scrollTo();
	}

	/**
	 * 点击「電気のご契約」-「他社（関西電力以外）」
	 * 
	 * @param imgName
	 * @throws IOException
	 */
	public void otherShrines1Click(String imgName) {
		otherShrinesLabel1.setTab("他社（関西電力以外）");
		otherShrinesLabel1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[1]");
		otherShrinesLabel1.click();
	}

	/**
	 * 点击「電気のご契約」-「関西電力」
	 * 
	 * @param imgName
	 * @throws IOException
	 */
	public void kansaiElectric1Click(String imgName) {
		kansaiElectricLabel1.setTab("関西電力");
		kansaiElectricLabel1.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[1]/label[2]");
		kansaiElectricLabel1.click();
	}

	/**
	 * 点击「ガスのご契約」-「他社（関西電力以外）」
	 * 
	 * @param imgName
	 * @throws IOException
	 */
	public void otherShrines2Click(String imgName) {
		otherShrinesLabel2.setTab("他社（関西電力以外）");
		otherShrinesLabel2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[1]");
		otherShrinesLabel2.click();
		otherShrinesLabel2.scrollTo();
	}

	/**
	 * 点击「ガスのご契約」-「関西電力」
	 * 
	 * @param imgName
	 * @throws IOException
	 */
	public void kansaiElectric2Click(String imgName) {
		kansaiElectricLabel2.setTab("関西電力");
		kansaiElectricLabel2.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[4]/label[2]");
		kansaiElectricLabel2.click();
	}

	/**
	 * 点击「お客さま番号を入力する」
	 * 
	 * @throws IOException
	 */
	public void customerNumLabelClick() {
		customerNumLabel.setTab("お客さま番号を入力する");
		customerNumLabel.setXpathAttr("//*[@id=\"div_agreement\"]/div/label");
		customerNumLabel.click();
		customerNumLabel.scrollTo();
	}

	/**
	 * 点击「「はぴeみる電」のID・パスワードを入力する」
	 * 
	 * @param imgName
	 * @throws IOException
	 */
	public void idPasswordAClick(String imgName) {
		idPasswordA.setTab("「はぴeみる電」のID・パスワードを入力する");
		idPasswordA.setXpathAttr("//*[@id=\"div_agreement\"]/div/a");
		idPasswordA.click();
	}

	/**
	 * 点击「お客さま番号の確認方法」
	 * 
	 * @param imgName
	 * @throws IOException
	 */
	public void customerCodeSpanClick(String imgName) {
		customerCodeSpan.setTab("お客さま番号の確認方法");
		customerCodeSpan.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/h4[4]/span[4]");
		customerCodeSpan.click();
	}

	/**
	 * 「お客さま番号の確認方法」ダイアログを閉じる
	 * 
	 * @param imgName
	 * @throws IOException
	 */
	public void closeDivClick(String imgName) {
		closeDiv.setTab("閉じる");
		closeDiv.setXpathAttr("/html/body/div[2]/div[2]");
		closeDiv.click();
	}

	/**
	 * 「日程」设值
	 * 
	 * @param value
	 * @throws IOException
	 */
	public void scheduleInput(String value) {
		scheduleInput.setTab("日程");
		scheduleInput.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[1]/dd/input");
		scheduleInput.sendKeys(value);
	}

	/**
	 * 「所」设值
	 * 
	 * @param value
	 * @throws IOException
	 */
	public void placeInput(String value) {
		placeInput.setTab("所");
		placeInput.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[2]/dd/input");
		placeInput.sendKeys(value);
	}

	/**
	 * 「番号1」设值
	 * 
	 * @param value
	 * @throws IOException
	 */
	public void number1Input(String value) {
		number1Input.setTab("番号1");
		number1Input.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[3]/dd/input");
		number1Input.sendKeys(value);
	}

	/**
	 * 「番号2」设值
	 * 
	 * @param value
	 * @param imgName
	 * @throws IOException
	 */
	public void number2Input(String value, String imgName) {
		number2Input.setTab("番号2");
		number2Input.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/div[11]/dl[4]/dd/input");
		number2Input.sendKeys(value);
	}

	/**
	 * 点击「確 定」
	 * 
	 * @param imgName
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void confirmBtnClick(String imgName) {
		confirmBtn.setTab("確 定");
		confirmBtn.setXpathAttr("//*[@id=\"Container\"]/form/section/button[1]");
		confirmBtn.click();
	}

	/**
	 * 滚动到「電気契約のお客さま番号」
	 * 
	 * @param imgName
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void scrollTocontuctSpan(String imgName) {
		contuctSpan.setTab("電気契約のお客さま番号");
		contuctSpan.setXpathAttr("//*[@id=\"Container\"]/form/section/div[2]/div/h4[4]/span[1]");
		contuctSpan.scrollTo();
	}

}
