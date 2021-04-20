package br.com.udemy.view;

import javax.swing.JOptionPane;

import br.com.udemy.bean.ContaBancaria;

public class TelaInicial {

	public static void main(String[] args) {

		
		
		ContaBancaria bc1 = new ContaBancaria();
		boolean repeticaoTela = true;
		do {	
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Seja Bem Vindo ao Nubank\n\n"
					+ "Pressione o número indicado:\n\n1. Abrir Conta\n2. Fechar Conta"
					+ "\n3. Depositar Valor\n4. Sacar Valor\n5. Verificar Saldo\n6. Sair"));
			switch (opcao) {
			case 1:
				bc1.abrirConta();
				break;
			case 2:
				bc1.fecharConta();
				break;
			case 3:
				double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado:"));
				bc1.depositarValor(deposito);
				break;
			case 4:
				double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado:"));
				bc1.sacarValor(saque);
				break;
			case 5:
				bc1.mostrarConta();
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos serviços Bancários!");
				repeticaoTela = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Incorreta!\n\n Tente novamente reiniciando o menu.");
				repeticaoTela = true;
				break;
			}
			if (opcao >= 1 && opcao <= 5) {
				int continua = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar operando?\n\n1. Sim\n2. Não"));
				if(continua == 1) {
					repeticaoTela = true;
				} else {
					repeticaoTela = false;
					JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos serviços Bancários!");
				}
			}
		} while(repeticaoTela);
	
			
		

	}

}
