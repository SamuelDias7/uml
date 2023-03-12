package com.uml;

public class Pessoa {
	// Atributos
	private int idPessoa;
	private  String nome;
	private String email;
	private String profissao;
	private double altura;
	private double peso;
	private double Imc;

	public Pessoa(int idPessoa) {
		// TODO Auto-generated constructor stub
	}
	public double calcularImc() {
		this.Imc = this.peso/ (this.altura * this.altura);
		
		return this.Imc;
	}
	public String exibirDiagnostico(double imc) {
		
		if(this.Imc<18.5)
			return "Você está abaxo do peso";
			else if(this.Imc<25)
				return "Você está no peso ideal";
			else if(this.Imc<30)
				return "Você está com excesso de peso";
			else if(this.Imc>30)
				return "Você está com obesidade";
			else if(this.Imc>30)
				return "Você está com obesidade extrema";
			else
				return "Você está com obesidade mórbida";
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}


}
