package fr.webforce.farmManager;

import java.util.Scanner;

import fr.webforce.farmManager.model.Tamagotchi;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenu sur tamagochi Game");
		System.out.println("Quel est le nom de ton tamagochi");
		String name = sc.next();

		String type = (Math.random() <= 0.5) ? "Homme" : "Femme";
		
		// je crée mon premier Tamagotchi
		Tamagotchi tamagochi1 = new Tamagotchi(name, type);
		
		while(true) {
			System.out.println("Que voulez vous faire ? ");
			System.out.println("1 - Voir les statistiques");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1: {
					tamagochi1.statistic();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
		// je crée mon second Tamagotchi
		//Tamagotchi tamagochi2 = new Tamagotchi("Anna", "Femme");
		

		
	}

}
