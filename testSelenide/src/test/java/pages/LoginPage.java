package pages;

import static com.codeborne.selenide.Selenide.*;

import java.io.IOException;

import chrome.TestChrome;

public class LoginPage {

	public void setUserId(String value) throws IOException {
		$("#j_username").setValue(value);
		screenshot("setUserId");
		TestChrome.setDataInfo("setUserId sdsd sd s ds 111", "setUserId.png");

	}

	public void setPassword(String value) throws IOException {
		$("#j_password").setValue(value);
		screenshot("setPassword");
		TestChrome.setDataInfo("setUserId sdsd sd s ds 222", "setPassword.png");

	}

	public void okBtnClick() throws IOException {
		$("#loginBtn").click(1, 1);
		screenshot("okBtnClick");
		TestChrome.setDataInfo("setUserId sdsd sd s ds 333", "okBtnClick.png");

	}

}
