package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DisqueSSD {
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List<WebElement> productlist;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/h1")
	WebElement verifproduct;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[3]/span")
	WebElement verifstock;
	
	public DisqueSSD() {
		
		PageFactory.initElements(Config.driver, this);
		
	}
	
	
	public void clickonproductbyname(String productname) {
		try {
		for(WebElement product:productlist) {
			
			if(product.getText().contains(productname)) {
				
				product.click();
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void verifpageproduct(String productname) {
		Config.attente(10);
		Assert.assertEquals(verifproduct.getText().toLowerCase(), productname.toLowerCase()); 
		
	}
	
	
	public void verifdisponibilite () {
		Assert.assertEquals(verifstock.getText(), "En stock");
		
	}

}
