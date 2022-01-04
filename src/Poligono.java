import java.util.Scanner;

class Poligono {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Quantas macas desejada?");
		int numLados;
		numLados = tc.nextInt();
		if (numLados < 3) {
			System.out.println("Não é um polígono");
		} else if (numLados > 5) {
			System.out.println("Polígono nao identificado."); 
		} else {
			System.out.println("Polígono"); 
		}
		
		tc.close();
	}

}
