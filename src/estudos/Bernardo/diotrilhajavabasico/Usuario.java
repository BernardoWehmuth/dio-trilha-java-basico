package estudos.bernardo.diotrilhajavabasico;

import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {
		
		SmartTV smartTv = new SmartTV();
		
		smartTv.ligar();
		
		Scanner leitor = new Scanner(System.in);
		
		while(smartTv.ligada) {
			System.out.println("Insira a Função que deseja realizar: \n[1] - Subir Canal\n[2] - Descer Canal\n[3] - Aumentar Volume\n[4] - Diminuir Volume\n[5] - Mudar Canal\n[6] - Desligar TV\n\nEscolha: ");
			int escolha = leitor.nextInt();
			
				switch(escolha) {
					case 1:
						smartTv.subirCanal();
						break;
					case 2:
						smartTv.descerCanal();
						break;
					case 3:
						smartTv.aumentarVolume();
						break;
					case 4:
						smartTv.diminuirVolume();
						break;
					case 5:
						smartTv.mudarCanal();
						break;
					case 6:
						smartTv.desligar();
						break;
					default:
						System.out.println("Insira uma opção válida!!!");
				}
		}
		System.exit(0);
	}
}
