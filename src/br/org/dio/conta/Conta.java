package br.org.dio.conta;

import br.org.dio.Cliente;

public class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int sequencial = 1;

	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	private TipoConta tipoConta;

	public Conta(Cliente cliente, TipoConta tipoConta) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = sequencial++;
		this.cliente = cliente;
		this.tipoConta = tipoConta;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(String.format("=== Extrato Conta %s ===", tipoConta.getDescricao()));
		imprimirInfosComuns();
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public String toString() {
		return "{Titular: " + cliente.getNome()
				+ " Agencia: " + agencia
				+ " Numero: " + numero
				+ " Saldo: " + saldo + "}" ;
	}
}
