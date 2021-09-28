#language: pt 
#encoding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar usuario

	@cadastro
	Cenario: cadastrar usuario
		Quando eu acionar a aba admin 
		E acionar o botao add
		E informar no campo employer name "Dominic Chase"
		E informar no campo username "aaverson"
		E informar no campo password "12345678"
		E informar no campo confirm password "12345678"
		E acionar o batao salvar
		Entao o sistema cadastra o usuario "aaverson"