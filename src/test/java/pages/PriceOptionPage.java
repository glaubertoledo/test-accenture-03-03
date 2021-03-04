package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class PriceOptionPage extends BasePage {
	public WebDriver driver = null;

	private final By nextsendquote = By.id("nextsendquote");

	
	public PriceOptionPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void selecionaPriceOptions(String string) {

		switch (string) {
		case "Silver":
			executarJS("selectsilver.click();",driver);
			break;
		case "Gold":
			executarJS("selectgold.click();",driver);
			break;
		case "Platinum":
			executarJS("selectplatinum.click();",driver);
			break;
		case "Ultimate":
			executarJS("selectultimate.click();",driver);
			break;
		default:
			//Nada sera selecionado
			break;
		} 
	}
	
	
	public void clicaNext() {
		executarJS("nextsendquote.click();",driver);
	}

	
}
