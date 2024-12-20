package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.DisqueSSD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisueSSDsuit {
	
	
	
	@Given("Utilisateur est sur la page SSD")
	public void utilisateur_est_sur_la_page_ssd() {
	     
	    Config.driver = new ChromeDriver();
	    Config.maximizewindow();
	    String url="https://www.tunisianet.com.tn/379-disques-ssd";
	    Config.driver.get(url);
	}

	@When("Utilisateur clique sur un produit {string}")
	public void utilisateur_clique_sur_un_produit(String nameproduct) {
		
		DisqueSSD Disque = new DisqueSSD();
		Disque.clickonproductbyname(nameproduct);
	     
	}

	@Then("La page de produit est affichée  {string}")
	public void la_page_de_produit_est_affichée(String nameproduct) {
		DisqueSSD Disque = new DisqueSSD();
		Disque.verifpageproduct(nameproduct);
	    
	}

	@Then("Le produit est en stock")
	public void le_produit_est_en_stock() {
		DisqueSSD Disque = new DisqueSSD();
		Disque.verifdisponibilite();
 
	}


}
