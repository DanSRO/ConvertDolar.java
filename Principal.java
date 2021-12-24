package Dolar;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
				
		System.out.println("What is the dollar price? ");
		double d = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double q = sc.nextDouble();
		
		double conversao = d*(q+q*0.06);
		System.out.print("Amount to be paid in reais = "+conversao);
		sc.close();
	}
}