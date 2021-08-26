package br.com.dio.digitalBank;

public class Main {

	public static void main(String[] args) {
		Cliente nCliente1 = new Cliente();
		nCliente1.setNome("Tarcisio");
		Cliente nCliente2 = new Cliente();
		nCliente2.setNome("Jemima");
		// TODO Auto-generated method stub
Conta cc = new ContaCorrente(nCliente1);
Conta cp = new ContaPoupanca(nCliente2);

cc.depositar(100);
cc.transferir(10, cp);

cc.imprimirExtrato();
cp.imprimirExtrato();
	}

}
