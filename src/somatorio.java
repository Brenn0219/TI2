import java.util.*;

public class somatorio {
	public static void main(String[] args) {
		int a = 0, b = 0, soma = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número para A: ");
		a = ler.nextInt();
		
		System.out.println("Digite um número para B: ");
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.println("Soma: " + soma);
	}
}
