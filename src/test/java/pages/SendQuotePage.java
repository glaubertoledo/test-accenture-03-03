package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class SendQuotePage extends BasePage {
	public WebDriver driver = null;

	private final By email = By.id("email");
	private final By username = By.id("username");
	private final By password = By.id("password");
	private final By confirmpassword = By.id("confirmpassword");
	private final By sendemail = By.id("sendemail");
	
	public SendQuotePage (WebDriver driver) {
			this.driver= driver;
		}

	public void escreveEmail(String string) {
		escrever(email, string, driver);
	}

	public void escreveUsername(String string) {
		escrever(username, string, driver);
	}

	public void escrevePassword(String string) {
		escrever(password, string, driver);
	}

	public void escreveConfirmpassword(String string) {
		escrever(confirmpassword, string, driver);
	}

	public void clicaNext() {
		clicarBotao(sendemail, driver);				
        
	}

}
