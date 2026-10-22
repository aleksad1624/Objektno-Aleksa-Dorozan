package vezbe2;

import java.util.Scanner;

public class Basic {
	
	public static void prvaVezba() {

	
			
		}
		
		int broj = 50;
		double decimalnaVrednost;
		{

		decimalnaVrednost = 20.25;
		
		String tekst = "Ovo je nas prvi string";
		
		System.out.println(broj);
		decimalnaVrednost = 20.10;
		System.out.println(decimalnaVrednost);
		System.out.println(tekst);
		}
	public static void drugaVezba() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite celobrojnu vrednost");
		int broj = scanner.nextInt();
			
		if (broj % 2 == 0) {
			System.out.println(broj + "je paran");
		}
		else {
			System.out.println(broj + " je neparan");
		}
	}
	public static void trecaVezba() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite celobrojnu vrednost");
		int broj = scanner.nextInt();
		
		for (int i = 1; i < broj; i++)
			System.out.println(i);
	}
	    int i = 1; {
	    while (i < broj) {
	    	System.out.println(i);
	    	i++;
	    }
		
	}
	
	    
	public static void main(String[] args) {
		prvaVezba();
		drugaVezba();
		trecaVezba();
		
	}
}
