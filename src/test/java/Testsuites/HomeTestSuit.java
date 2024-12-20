package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeTestSuit {
	

@Given("utilisateur est sur la page dacceuil")
public void utilisateur_est_sur_la_page_dacceuil() {
    Config.driver = new ChromeDriver();
    Config.maximizewindow();
    String url="https://www.tunisianet.com.tn/";
    Config.driver.get(url);
}

@When("utilisasteur survole la souris sur le menu {string}")
public void utilisasteur_survole_la_souris_sur_le_menu(String menu) throws InterruptedException {
   HomePage X = new HomePage(); 
   X.mouseovermenu(menu);
   
}

@When("utilisateur clique sur le menu {string}")
public void utilisateur_clique_sur_le_menu(String submenu) {
	HomePage X = new HomePage();
	X.clickonsubmenu(submenu);
    
}

@Then("utilisateur est derige vers la page produit {string}")
public void utilisateur_est_derige_vers_la_page_produit(String verifpage) {
	HomePage X = new HomePage();
	X.verifsousmenu(verifpage);
	
}



@When("utilisateur cherche un produit avec son nom {string}")
public void utilisateur_cherche_un_produit_avec_son_nom(String nomproduit) {
     HomePage X = new HomePage();
     X.recherche(nomproduit);
}

@Then("le resultat de recherche du produit {string} est affiche")
public void le_resultat_de_recherche_du_produit_est_affiche(String nomproduit) {
	HomePage X = new HomePage();
	X.verifrecherche(nomproduit);
}
}
