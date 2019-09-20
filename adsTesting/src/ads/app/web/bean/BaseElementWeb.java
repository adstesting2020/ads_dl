package ads.app.web.bean;

import static com.codeborne.selenide.Selenide.screenshot;

import java.time.Duration;

public class BaseElementWeb {
	static Duration duration = Duration.ofSeconds(1);

	public BaseElementWeb( ) {
	}

	public void screenShot(String imgName) {		
		screenshot(imgName);
	}
}
