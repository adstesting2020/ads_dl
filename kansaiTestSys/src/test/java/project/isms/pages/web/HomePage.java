package project.isms.pages.web;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;

import java.io.IOException;

import dto.ElementWeb;

public class HomePage {
	public HomePage() {
	}

	ElementWeb userIdElem = new ElementWeb();
	ElementWeb pswElem = new ElementWeb();
	ElementWeb okBtnElem = new ElementWeb();

	public void setUserId(String value) throws IOException {
		userIdElem.setTab("用户名");
		userIdElem.setIdAttr("#j_username");
		userIdElem.sendKeys(value);
	}

	public void setPassword(String value, String imgName) throws IOException {
		pswElem.setTab("密码");
		pswElem.setIdAttr("#j_password");
		pswElem.sendKeys(value);

		pswElem.screenShot(imgName);
	}

	public void okBtnClick(String imgName) throws IOException {
		okBtnElem.setTab("登录");
		okBtnElem.setIdAttr("#loginBtn");
		okBtnElem.click();

		okBtnElem.screenShot(imgName);
	}

}
