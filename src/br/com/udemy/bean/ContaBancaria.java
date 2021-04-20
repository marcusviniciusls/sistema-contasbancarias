package br.com.udemy.bean;

import javax.swing.JOptionPane;

public class ContaBancaria {
	
	//Atributos
	private int numeroConta;
	private String digitoConta;
	private String nomeTitular;
	private int numeroAgencia;
	private double saldo;
	
	
	//Opção 01:
	public void abrirConta() {
		this.nomeTitular = JOptionPane.showInputDialog("Digite Seu nome: ");
		this.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da agencia: "));
		this.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
		this.digitoConta = JOptionPane.showInputDialog("Digite o digito da conta: ");
		
		JOptionPane.showMessageDialog(null, "Abertura realizada com sucesso!");
	}
	
	//Opção 02:
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
				JOptionPane.showMessageDialog(null, "Conta Fechada Com Sucesso!\nNão há valor a ser sacado da conta.\nSaldo: R$"+ this.getSaldo());
			}else {
				JOptionPane.showMessageDialog(null, "Não é possível fechar a conta! Saldo abaixo do limite." +"\n Saldo R$" + this.getSaldo());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Nao existe conta aberta para ser encerrada!");
		}
	}
	
	//Opção 03:
	public void depositarValor(double valor) {
		this.saldo += valor;
		JOptionPane.showMessageDialog(null, "Valor depositado com sucesso!");
	}
	
	//Opção 04:
	public void sacarValor(double valor) {
		if(valor > this.saldo) {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente para saque");
		} else {
			this.saldo -= valor;
			JOptionPane.showMessageDialog(null, "Saque Realizado com sucesso!");
		}
	}
	
	//Opção 05:
	public void mostrarConta() {
		this.exibirDadosConta();
	}
	
	// Método para exibir dados
	public void exibirDadosConta() {
		JOptionPane.showMessageDialog(null,"Abaixos dados da conta:\n\nNome Titular: " + this.getNomeTitular() + "\nAgência: " + this.getNumeroAgencia()
		+ "\nConta: " + this.getNumeroConta() + "\nDigíto Agência: " + this.getDigitoConta() + "\nSaldo: " + this.getSaldo());
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
