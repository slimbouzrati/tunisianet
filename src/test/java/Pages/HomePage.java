package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {

	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[3]/div[2]/div/div[1]/ul/li/a")
	List<WebElement> sousmenus;
	
	@FindBy(xpath="/html/body/main/section/div/div/nav/ol/li[4]/a/span")
	WebElement verifpage;
	
	@FindBy(id="search_query_top")
	WebElement insertsearch;
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/h1")
	WebElement Verifrecherche;
	
	public HomePage() {
		
		PageFactory.initElements(Config.driver, this);
		
	}
	
	public void mouseovermenu (String menutitle) throws InterruptedException {
		try {
		for(WebElement menu:menus) {
			
			if(menu.getText().contains(menutitle)) {
				
				Config.actions = new Actions(Config.driver);
				Thread.sleep(5000);
				Config.actions.moveToElement(menu).perform();
			}
		} }
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void clickonsubmenu(String subtitle) {
		try {
		for(WebElement submenu:sousmenus) {
			
			if(submenu.getText().contains(subtitle)) {
				
			submenu.click();
				
			}
			
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void verifsousmenu (String Subtitle) {
		Config.attente(10);
		
		Assert.assertEquals(verifpage.getText(), Subtitle);
		
	}
	
	
	public void recherche(String nomproduit) {
		Config.attente(10);
		insertsearch.sendKeys(nomproduit+Keys.ENTER);
		
	}
	
	public void verifrecherche(String nomproduit) {
		Config.attente(10);
		Assert.assertTrue("la resultat de la recherche est incorrecte", Verifrecherche.getText().toLowerCase().contains(nomproduit));
		
	}
	
}
