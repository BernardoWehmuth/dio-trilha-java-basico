package estudos.Bernardo.diotrilhajavabasico;

public class Usuario {
	public static void main(String[] args) {
		
		SmartTV smartTv = new SmartTV();
		
		System.out.println("TV Ligada ? " + smartTv.ligada);
		System.out.println("Canal Atual : " + smartTv.canal);
		System.out.println("Volume Atual : " + smartTv.volume + "\n");

		smartTv.ligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada + "\n");
		
		smartTv.desligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada + "\n");
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		System.out.println("Volume Atual : " + smartTv.volume + "\n");
		
		smartTv.aumentarVolume();
		System.out.println("Volume Atual : " + smartTv.volume);
		
		smartTv.desligar();
		smartTv.mudarCanal();
		
		smartTv.ligar();
		smartTv.mudarCanal();
		
	}
}
