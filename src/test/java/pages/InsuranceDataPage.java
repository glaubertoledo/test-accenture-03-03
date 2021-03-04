package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class InsuranceDataPage extends BasePage{
	public WebDriver driver = null;

	private final By firstname = By.id("firstname");
	private final By lastname = By.id("lastname");
	private final By birthdate = By.id("birthdate");
	private final By country = By.id("country");
	private final By occupation = By.id("occupation");
	private final By  nextenterproductdata = By.id("nextenterproductdata");
	private final By  zipcode = By.id("zipcode");
	
	public InsuranceDataPage(WebDriver driver) {
		this.driver= driver;
	}
	public void escreveFirstname(String string) {
		escrever(firstname,string,driver);
	}
	
	public void escrevelastname(String string) {
		escrever(lastname,string,driver);
	}
	public void escrevebirthdate(String string) {
		escrever(birthdate,string,driver);
	}
	public void escreveZipCode(String string) {
		escrever(zipcode,string,driver);
	}
	public void selecionaCountry(String string) {
		selecionarCombo(country,string,driver);
	}
	public void selecionaOccupation(String string) {
		selecionarCombo(occupation,string,driver);
		executarJS("speeding.click();",driver);
		
	}
	
	public void clicaNext() {
		clicarBotao(nextenterproductdata,driver);
	}

	
	

}
