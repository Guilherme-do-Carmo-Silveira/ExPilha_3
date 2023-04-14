package view;

import javax.swing.JOptionPane;

import controller.ConverteBinController;

public class main {

	public static void main(String[] args) {
		
		ConverteBinController converte = new ConverteBinController();
		
		double valor;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor até 1000"));
		
		while(valor > 1000) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Valor invalido, por favor digite um valora até 1000"));
		}
		
		String bin = converte.decToBin((int) valor);
		System.out.println(bin);
		
	}

}
