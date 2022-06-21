package _06_String;

import java.util.Scanner;

public class Quersumme {
	public static int Quer (String a) {
		int erg=0;
		for (int i=0; i<=a.length()-1; i++) {
		  int b = Character.getNumericValue(a.charAt(i));
		  erg = erg + b; 	
		}
		return erg;
	}
	
	public static void main (String args[]) {
		System.out.print("Zahl: ");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		System.out.println("Quersumme: " + Quer(a));
		System.out.println();
	}
}

