package br.com.udemy.bean;

import javax.swing.JOptionPane;

public class ContaBancaria {
	
	//Atributos
	private int numeroConta;
	private String digitoConta;
	private String nomeTitular;
	private int numeroAgencia;
	private double saldo;
	
	
	//Op��o 01:
	public void abrirConta() {
		this.nomeTitular = JOptionPane.showInputDialog("Digite Seu nome: ");
		this.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da agencia: "));
		this.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da conta: "));
		this.digitoConta = JOptionPane.showInputDialog("Digite o digito da conta: ");
		
		JOptionPane.showMessageDialog(null, "Abertura realizada com sucesso!");
	}
	
	//Op��o 02:
	public void fecharConta() {
		if(this.nomeTitular != null) {
			if(this.getSaldo() > 0) {
				this.nomeTitular = null;
				this.numeroAgencia = 0;
				this.numeroConta = 0;
				this.digitoConta = null;
				JOptionPane.showMessageDialog(null, "Conta Fechada Com Sucesso!");
				JOptionPane.showMessageDialog(null, "Valor a ser sacado no Caixa" + this.getSaldo());
				this.saldo= 0;
			} else if(this.saldo == 0) {
				this.nomeTitular = null;
				this.numeroAgencia = 0;
				this.numeroConta = 0;
				this.digitoConta = null;
				JOptionPane.showMessageDialog(null, "Conta Fechada Com Sucesso!\nN�o h� valor a ser sacado da conta.\nSaldo: R$"+ this.getSaldo());
			}else {
				JOptionPane.showMessageDialog(null, "N�o � poss�vel fechar a conta! Saldo abaixo do limite." +"\n Saldo R$" + this.getSaldo());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Nao existe conta aberta para ser encerrada!");
		}
	}
	
	//Op��o 03:
	public void depositarValor(double valor) {
		this.saldo += valor;
		JOptionPane.showMessageDialog(null, "Valor depositado com sucesso!");
	}
	
	//Op��o 04:
	public void sacarValor(double valor) {
		if(valor > this.saldo) {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente para saque");
		} else {
			this.saldo -= valor;
			JOptionPane.showMessageDialog(null, "Saque Realizado com sucesso!");
		}
	}
	
	//Op��o 05:
	public void mostrarConta() {
		this.exibirDadosConta();
	}
	
	// M�todo para exibir dados
	public void exibirDadosConta() {
		JOptionPane.showMessageDialog(null,"Abaixos dados da conta:\n\nNome Titular: " + this.getNomeTitular() + "\nAg�ncia: " + this.getNumeroAgencia()
		+ "\nConta: " + this.getNumeroConta() + "\nDig�to Ag�ncia: " + this.getDigitoConta() + "\nSaldo: " + this.getSaldo());
	}
	
	// Getteres e Setteres
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeConta(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getDigitoConta() {
		return digitoConta;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
}
