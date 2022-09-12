package classesAndObjects.initFields;

public class StaticInitializationBlock {
	public static int[] vetorDe100Posicoes = inicializarVetor();
	
	private static int[] inicializarVetor(){
		vetorDe100Posicoes = new int[100];
		for(int i=0; i<100; i++) {
			vetorDe100Posicoes[i]=i;
		}
		return vetorDe100Posicoes;
	}
			
	public static int[] resetarVetor() {
		vetorDe100Posicoes = inicializarVetor();
		return vetorDe100Posicoes;
	}

	public static void printarVetor() {
		for(int i=0; i<100; i++) {
			System.out.print(StaticInitializationBlock.vetorDe100Posicoes[i] + "-");
		}
		System.out.println("FIM");
	}
	
}
