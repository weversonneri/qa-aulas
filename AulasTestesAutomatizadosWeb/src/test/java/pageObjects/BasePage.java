package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	
	@FindBy(xpath = "//a[@class='firstLevelMenu']//b[text()='Admin']")
	public WebElement abaAdmin;
	
	@FindBy(xpath = "//a[@class='firstLevelMenu']//b[text()='PIM']")
	public WebElement abaPIM;
	
	@FindBy(id = "menu_pim_Configuration")
	public WebElement menuConfiguration;
	
	@FindBy(id = "menu_pim_listCustomFields")
	public WebElement customField;

}
