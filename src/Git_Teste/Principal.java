package Git_Teste;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Digite os valores da operação de exponenciação: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Segundo número: ");
		int num2 = sc.nextInt();
		
		Exponencial ex = new Exponencial();
		ex.calcular(num1, num2);
		
	}

}
