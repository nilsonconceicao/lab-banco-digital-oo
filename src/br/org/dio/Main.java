package br.org.dio;

import br.org.dio.conta.Conta;
import br.org.dio.conta.IConta;
import br.org.dio.conta.TipoConta;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		IConta cc = new Conta(venilton, TipoConta.CORRETE);
		IConta cp = new Conta(venilton, TipoConta.POUPANCA);

		cc.depositar(100);
		cc.transferir(100, cp);
		cc.imprimirExtrato();

		cp.sacar(50);
		cp.imprimirExtrato();

		Banco banco = new Banco("DevBank");
		banco.getContas().add(cc);
		banco.getContas().add(cp);

		System.out.println(banco.getNome());
		System.out.println(banco.getContas());
	}

}
