package br.com.entra21.orientacao.objetos.principal.aula01.classes;

import java.util.Scanner;

public class Aluno {
	// definir atributos de uma aluno e cada objeto aluno tera essas variaveis,
	// chamadas de atributos
	public String nome;
	public byte idade;
	public byte quantidadePresencas;

	// na declara��o s� t�m acesso e tipo de retorno.
	public Aluno() {// construtor vazio que ao utilizar o (new Aluno) ele � executado

	}

	public byte responderChamada() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("O aluno " + this.nome + "est� ai?");
		String resposta = entrada.next();
		if (resposta.equalsIgnoreCase("Sim")) {
			this.quantidadePresencas++;
		}
		return this.quantidadePresencas;
	}

}