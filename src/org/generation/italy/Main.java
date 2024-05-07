package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float altezza, peso, bmi;
		String range = null;
		int conferma;
		do {
			do {
				System.out.println("Inserisci Altezza");
				altezza = sc.nextFloat();
				sc.nextLine();
				if (altezza <= 0)
					System.out.println("Sei troppo basso!");
				if (altezza >= 2.5)
					System.out.println("Inseriscila in metri!");
			} while (altezza <= 0 || altezza >= 2.5);

			do {
				System.out.println("Inserisci Peso");
				peso = sc.nextFloat();
				sc.nextLine();
				if (peso <= 0)
					System.out.println("Sei troppo leggero!");
			} while (peso <= 0);

			bmi = (peso / (altezza * altezza));

			if (bmi < 16)
				range = "Grave magrezza";
			else if (bmi < 18.5)
				range = "Sottopeso";
			else if (bmi < 25)
				range = "Normopeso";
			else if (bmi < 30)
				range = "Sovrappeso";
			else if (bmi < 35)
				range = "Obeso";
			else if (bmi < 40)
				range = "Obeso classe II";
			else if (bmi < 100)
				range = "Obeso classe III";
			else if (bmi >= 100)
				range = "un cetaceo!";

			System.out.println("Il tuo BMI indica che sei " + range);
			System.out.println("Vuoi fare un altro conteggio?");
			conferma = sc.nextInt();
		} while (conferma == 1);
		sc.close();
	}

}
