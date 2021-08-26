package br.com.dio.digitalBank;

import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> conta;
	
	public String getNome() {
		return nome;
	}

	public List<Conta> getConta() {
		return conta;
	}

	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
