package br.org.dio;

import br.org.dio.conta.IConta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<IConta> contas;

	public Banco(String nome){
		this.nome = nome;
		contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<IConta> getContas() {
		return contas;
	}

	public void setContas(List<IConta> contas) {
		this.contas = contas;
	}

}
