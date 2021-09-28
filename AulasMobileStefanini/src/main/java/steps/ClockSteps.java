package steps;

import static utils.Utils.*;

import java.util.List;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.ClockPage;

public class ClockSteps {

	ClockPage clock = new ClockPage(driver);

	@Dado("que o usuario acione o menu Alarme")
	public void acionarOMenuAlarme() throws Exception {

		clock.acessarMenuAlarme();

	}

	@Quando("o usuario acionar o botao Adicionar Alarme")
	public void oUsuarioAcionarOBotaoAdicionarAlarme() throws Exception {

		clock.novoAlarme();

	}

	@Quando("configurar a hora para {string},{string}")
	public void configurarAHoraPara(String horario, String periodo) throws Exception {

		String tempo[] = horario.split(":");
		String hora = tempo[0];
		String minutos = tempo[1];

		System.out.println(hora);
		System.out.println("========================");
		System.out.println(minutos);

		clock.selecionaHora(hora);
		clock.selecionaMinuto(minutos);
		clock.selecionaPeriodo(periodo);
		clock.botaoOk();
	}

	@Entao("o app adiciona um novo alarme com as informacoes:")
	public void oAppAdicionaUmNovoAlarmeComAsInformacoes(List<String> dados) {

		clock.validarInformacoes(dados);
		
	}

}
