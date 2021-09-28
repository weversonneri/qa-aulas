package pageObject;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ClockPage {


	public ClockPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ALARME']")
	private MobileElement botaoAlarme;

	@AndroidFindBy(accessibility = "Adicionar alarme")
	private MobileElement botaoAdd;

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoOk;

	@AndroidFindBy(id = "com.google.android.deskclock:id/edit_label")
	private MobileElement campoLabel;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	private MobileElement labelText;

	@AndroidFindBy(id = "com.google.android.deskclock:id/choose_ringtone")
	private MobileElement trocarToque;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Buzzer Alarm']")
	private MobileElement escolherToque;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	private MobileElement escolherToqueVoltar;

	@AndroidFindBy(xpath = "//android.widget.Switch[@text='ON'][1]")
	private MobileElement switchClock;

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Repeat']")
	private MobileElement checkbox;

	public void acessarMenuAlarme() throws Exception {
		System.out.println("Acessando o menu  Alarme");
		botaoAlarme.click();

	}

	public void novoAlarme() throws Exception {
		System.out.println("Adicionando novo Alarme");
		botaoAdd.click();

	}

	public void botaoOk() throws Exception {
		System.out.println("botao ok");

		botaoOk.click();

		// android.widget.RadialTimePickerView$RadialPickerTouchHelper
		// android.widget.RadialTimePickerView$RadialPickerTouchHelper

	}

	public void interacaoEditText() throws Exception {
		System.out.println("clock ativar");

		acessarMenuAlarme();
		novoAlarme();

		campoLabel.click();

		labelText.sendKeys("Acordar");

		/*
		 * // com.google.android.deskclock:id/arrow MobileElement botaoExpandir =
		 * (MobileElement) driver.findElement(MobileBy .xpath(
		 * "//android.widget.ImageButton[@resource-id='com.google.android.deskclock:id/arrow'][1]"
		 * )); botaoExpandir.click();
		 * 
		 * Thread.sleep(2000);
		 */

		/*
		 * 
		 * 
		 * 
		 * 
		 * MobileElement botaoDeletar = (MobileElement) driver
		 * .findElement(MobileBy.xpath("//android.widget.Button[@text='Delete']"));
		 * botaoDeletar.click();
		 * 
		 * Thread.sleep(2000);
		 */

	}

	public void interagirComCombo() throws Exception {
		System.out.println("interagir com combo de alarmes");

		acessarMenuAlarme();
		novoAlarme();

		trocarToque.click();
		System.out.println("trocarToque");

		escolherToque.click();
		System.out.println("Buzzer Alarm");

		escolherToqueVoltar.click();
		System.out.println("back");

	}

	public void interagirComSwitch() throws Exception {
		System.out.println("interagir com switch");

		acessarMenuAlarme();
		novoAlarme();

		switchClock.click();

		assertEquals("false", switchClock.getAttribute("checked"));

	}

	public void interagirComCheckbox() throws Exception {
		System.out.println("interagir com Checkbox");

		acessarMenuAlarme();
		novoAlarme();

		checkbox.click();

		assertEquals("true", checkbox.getAttribute("checked"));

	}

	public void selecionaHora(String hora) throws Exception {

		MobileElement selectHora = (MobileElement) driver.findElement(MobileBy.AccessibilityId(hora));
		selectHora.click();

	}

	public void selecionaMinuto(String minuto) throws Exception {

		MobileElement selectMinuto = (MobileElement) driver.findElement(MobileBy.AccessibilityId(minuto));
		selectMinuto.click();

	}

	public void selecionaPeriodo(String periodo) throws Exception {

		String formatedPeriodo = periodo.toLowerCase();

		MobileElement selectPeriodo = (MobileElement) driver
				.findElement(MobileBy.id("android:id/" + formatedPeriodo + "_label"));
		selectPeriodo.click();

	}
	
	public void validarInformacoes(List<String> dados) {
		
		MobileElement infos;
		
		for (String info : dados) {
			
			 infos = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='" + info + "'][1]"));
			 System.out.println("Infos: " + infos);
			 assertEquals(info, infos.getText());
		}
		
	}
	

	public void fecharApp() {
		driver.quit();
	}

}
