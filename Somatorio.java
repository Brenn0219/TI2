import java.util.*;

public class Somatorio {
	public static void main(String[] args) {
		int num1=0, num2=0, soma=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Primeiro Número: ");
		num1 = sc.nextInt();
		System.out.println("Digite o Segundo Número: ");
		num2  = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Soma: " + soma);
	}
}
