package com.uml;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		Pessoa usuario = new Pessoa(3456);
		
		// Declaração de variaveis
		String altura;
		String peso;
		
		
		//entrada de dados
		usuario.setNome(JOptionPane.showInputDialog("Informe o nome:"));
		usuario.setEmail(JOptionPane.showInputDialog("Informe o email:"));
		usuario.setProfissao(JOptionPane.showInputDialog("Informe a profissão:"));
		
		//Recebe os valores de altura
		altura = JOptionPane.showInputDialog("Informe a altura");
		altura = altura.replace(",", ".");
		usuario.setAltura(Double.parseDouble(altura));
				
		// Recebe os valores de peso
		peso =  JOptionPane.showInputDialog("Informe o peso");
		peso = peso.replace(",", ".");
		usuario.setPeso(Double.parseDouble(peso));
		
		JOptionPane.showMessageDialog(null, String.format("%.2f",usuario.calcularImc()) + "\n" + usuario.exibirDiagnostico(0));

		
		
	}

}
