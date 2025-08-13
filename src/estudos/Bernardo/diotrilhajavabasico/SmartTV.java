package estudos.Bernardo.diotrilhajavabasico;

import java.util.Scanner;

public class SmartTV {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
	public void descerCanal() {
		canal--;
	}
	public void subirCanal() {
		canal++;
	}
	public void mudarCanal() {
		 if (!ligada) {
	            System.out.println("A TV está desligada. Ligue-a primeiro.");
	            return;
	        }		
		
		boolean canalPossivel = false;
		Scanner canalDesejado = new Scanner(System.in);
		
		while(!canalPossivel) {
			System.out.println("Insira o Canal Desejado(de 1 a 99): ");
			int novoCanal = canalDesejado.nextInt();
			
			if (novoCanal >= 1 && novoCanal <= 99) {
				this.canal = novoCanal;
				System.out.println("Canal alterado para: " + canal);
				canalPossivel = true;
			}else {
				System.out.println("Canal inválido, tente novamente.");
			}
		}
	}
}
