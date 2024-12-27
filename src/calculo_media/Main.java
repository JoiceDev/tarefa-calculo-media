package calculo_media;

public class Main {

	public static void main(String[] args) {
		Notas notas = new Notas();
		
		notas.setNota1(8);
		notas.setNota2(4);
		notas.setNota3(7);
		notas.setNota4(5);

		float media = notas.calcularMedia();
		System.out.println("A média das notas é: " + media);
	}

}
