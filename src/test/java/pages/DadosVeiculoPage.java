package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class DadosVeiculoPage extends BasePage {

	public WebDriver driver = null;

	private final By make = By.id("make");
	private final By engineperformance = By.id("engineperformance");
	private final By dateofmanufacture = By.id("dateofmanufacture");
	private final By numberofseats = By.id("numberofseats");
	private final By fuel = By.id("fuel");
	private final By annualmileage = By.id("annualmileage");
	private final By model = By.id("model");
	private final By listprice = By.id("listprice");
	private final By cylindercapacity = By.id("cylindercapacity");
	private final By numberofseatsmotorcycle = By.id("numberofseatsmotorcycle");
	private final By payload = By.id("payload");
	private final By totalweight = By.id("totalweight");
	private final By nextenterinsurantdata = By.id("nextenterinsurantdata");
	
	public DadosVeiculoPage(WebDriver driver) {
		this.driver = driver;

	}

	public void escreveEngineperformance(String texto) throws InterruptedException {

		escrever(engineperformance, texto, driver);

	}

	public void SelecionaMake(String texto) {

		selecionarCombo(make, texto, driver);

	}

	public void SelecionaModel(String texto) {

		selecionarCombo(model, texto, driver);

	}

	public void escreveDateOfManufacture(String texto) throws InterruptedException {

		escrever(dateofmanufacture, texto, driver);

	}

	public void SelecionaNumberOfSeats(String texto) {

		selecionarCombo(numberofseats, texto, driver);

	}

	public void SelecionaFuel(String texto) {

		selecionarCombo(fuel, texto, driver);

	}

	public void escreveListprice(String texto) throws InterruptedException {

		escrever(listprice, texto, driver);

	}

	public void escreveAnnualMileage(String texto) throws InterruptedException {

		escrever(annualmileage, texto, driver);

	}

	public void escreveCylindercapacity(String texto) {

		escrever(cylindercapacity, texto, driver);

	}

	public void SelecionaNumberOfSeatsmotorcycle(String texto) {

		selecionarCombo(numberofseatsmotorcycle, texto, driver);

	}

	public void escrevePayload(String texto) {

		escrever(payload, texto, driver);

	}

	public void escreveTotalWeight(String texto) {

		escrever(totalweight, texto, driver);

	}
	
	public void clicaNext() {
		clicarBotao(nextenterinsurantdata,driver);
	}

}
