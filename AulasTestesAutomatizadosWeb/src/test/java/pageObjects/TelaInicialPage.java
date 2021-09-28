package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class TelaInicialPage extends BasePage {
	
	public void acionarAbaAdmin() {
		abaAdmin.click();
	}
	
	@FindBy(xpath = "//input[@name='btnAdd']")
	public WebElement botaoAddElement;
	
	public void acionarBotaoAdd() {
		botaoAddElement.click();
	}
	
	public void AcessarMenuCustomField() {
		
		Actions action = new Actions(driver);
		
		action.moveToElement(abaPIM).build().perform();
		action.moveToElement(menuConfiguration).build().perform();
		action.moveToElement(customField).click().build().perform();
	}

}
