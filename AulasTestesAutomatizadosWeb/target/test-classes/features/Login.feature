#language: pt 
#encoding: UTF-8

@login
Funcionalidade: Login 

	Cenario: usuario invalido
		Quando eu informar usuario "Ad" 
		E informar a senha "asd"
		E clicar no botao login
		Entao o sistema exibe a mensagem de usuario invalido

	@loginSucesso
	Cenario: Realizar login
		Quando eu informar usuario "Admin" 
		E informar a senha "admin123"
		E clicar no botao login
		Entao o sistema exibe o usuario logado