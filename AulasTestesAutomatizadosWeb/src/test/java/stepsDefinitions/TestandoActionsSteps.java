package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TestandoActionsSteps {

	@Quando("^acionar o submenu customField$")
	public void acionarOSubmenuCustomField() throws Throwable {
		Na(TelaInicialPage.class).AcessarMenuCustomField();
	}

	@Entao("^o sistema apresenta a tela customField$")
	public void oSistemaApresentaATelaCustomField() throws Throwable {
		assertEquals("Defined Custom Fields", driver.findElement(By.xpath("//h1[text()='Defined Custom Fields']")).getText());
	}


}
