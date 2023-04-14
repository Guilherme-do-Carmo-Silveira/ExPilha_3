package controller;

import docarmo.pilhaint.pilha;

public class ConverteBinController {

	pilha p = new pilha();
	String numero = "";
	
	public ConverteBinController() {
		
	}
	
	public String decToBin(int decimal) {
		while(decimal / 2 != 0) {
			if(decimal %2 == 0) {
				p.push(0);
			}else {
				p.push(1);
			}
			decimal /= 2;
		}
		p.push(decimal);	
		
		int tamanho = p.size();
		
		for(int i = 0; i < tamanho; i++) {
			try {
				int valor = p.top();	
				numero += valor;
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return numero;
	}
}
