package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class ProductData  extends BasePage{
	public WebDriver driver = null;

	private final By startdate = By.id("startdate");
	private final By insurancesum = By.id("insurancesum");
	private final By meritrating = By.id("meritrating");
	private final By damageinsurance = By.id("damageinsurance");

	private final By  courtesycar = By.id("courtesycar");
	private final By  nextselectpriceoption = By.id("nextselectpriceoption");
	
	
	public ProductData(WebDriver driver) {
		this.driver= driver;
	}
	public void escreveStarDate(String string) {
		escrever(startdate,string,driver);
	}
	
	public void selecionaInsurancesum(String string) {
		selecionarCombo(insurancesum,string,driver);
	}
	public void selecionaDamageinsurance(String string) {
		selecionarCombo(damageinsurance,string,driver);
	}
	public void selecionaMeritrating(String string) {
		selecionarCombo(meritrating,string,driver);
	}
	public void selecionaCourtesycar(String string) {
		selecionarCombo(courtesycar,string,driver);
	}
	public void selecionaOptionalsProducts(Integer int1) {
		//Regra adicionada 
		//1 seleciona EuroProtection 
		//2 seleciona legal defense insurance 
		//3 seleciona os dois 
		
		switch (int1) {
		case 1:
			executarJS("EuroProtection.click();",driver);
			break;
		case 2:
			executarJS("LegalDefenseInsurance.click();",driver);
			break;
		case 3:

			executarJS("EuroProtection.click();",driver);
			executarJS("LegalDefenseInsurance.click();",driver);
			break;

		default:
			//Nada sera selecionado
			break;
		} 
	}
	
	
	public void clicaNext() {
		clicarBotao(nextselectpriceoption,driver);
	}

}
