package br.com.dio.digitalBank;

public abstract class Conta implements IConta{
	//
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAl = 1;
	
	//variaveis
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAl++;
		this.cliente = cliente;
		
	}
	//implentacoes de metodos
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	//get e set
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
		}
	protected void imprimirMeuExtrato() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
