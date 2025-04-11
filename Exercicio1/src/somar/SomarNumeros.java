package somar;
import java.util.*;
public class SomarNumeros {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.println("digite o primeiro numero: ");
        n1 = scanner.nextInt();
        System.out.println("digite o segundo numero: ");
        n2 = scanner.nextInt();
        int soma = n1+n2;
        System.out.println("A soma é: " +soma);
        scanner.close();
    }
}
