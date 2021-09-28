#language: pt 
#encoding: UTF-8

Funcionalidade: Clock mobile

		Eu como uaurio gostaria de adicionar um novo alarme
	
	Cenario: Adicionar novo alarme
		Dado que o usuario acione o menu Alarme
		Quando o usuario acionar o botao Adicionar Alarme
		E configurar a hora para "6:0","AM"
		Entao o app adiciona um novo alarme com as informacoes:
			|Repeat								|
			|Default (Cesium)			|
			|Label								|
			|Delete								|