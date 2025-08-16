package estudos.bernardo.diotrilhajavabasico;

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
		System.out.println("Volume Atual: " + volume + "\n");
	}
	public void diminuirVolume() {
		volume--;
		System.out.println("Volume Atual: " + volume + "\n");
	}
	public void descerCanal() {
		canal--;
		System.out.println("Canal Atual: " + canal + "\n");
	}
	public void subirCanal() {
		canal++;
		System.out.println("Canal Atual: " + canal + "\n");
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
				System.out.println("Canal alterado para: " + canal + "\n");
				canalPossivel = true;
			}else {
				System.out.println("Canal inválido, tente novamente.\n\n" );
			}
		}
	}
}
