package Git_Teste;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Digite os valores da opera��o de exponencia��o: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro n�mero: ");
		double num1 = sc.nextDouble();
		System.out.println("Segundo n�mero: ");
		int num2 = sc.nextInt();
		
		Exponencial ex = new Exponencial();
		ex.calcular(num1, num2);
		
	}

}
