import java.util.Scanner;

class Poligono {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Quantas macas desejada?");
		int numLados;
		numLados = tc.nextInt();
		if (numLados < 3) {
			System.out.println("N�o � um pol�gono");
		} else if (numLados > 5) {
			System.out.println("Pol�gono nao identificado."); 
		} else {
			System.out.println("Pol�gono"); 
		}
		
		tc.close();
	}

}
