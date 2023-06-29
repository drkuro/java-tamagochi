package fr.webforce.farmManager;

import java.util.ArrayList;
import java.util.Scanner;

import fr.webforce.farmManager.model.Tamagotchi;
import fr.webforce.farmManager.model.TamagotchiFemme;
import fr.webforce.farmManager.model.TamagotchiHomme;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String type = (Math.random() <= 0.5) ? "Homme" : "Femme";

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenu sur tamagochi Couple Game");
		
		ArrayList<Tamagotchi> myTamaList = new ArrayList<Tamagotchi>();
				
		// je crée mon premier Tamagotchi
		System.out.println("Quel est le nom de ton tamagochi Homme");
		String name = sc.next();
		myTamaList.add(new TamagotchiHomme(name, "Homme"));

		// je crée mon second Tamagotchi
		System.out.println("Quel est le nom de ton tamagochi Femme");
		name = sc.next();
		myTamaList.add(new TamagotchiFemme(name, "Femme"));
		
		while(true) {
			for (Tamagotchi tamagotchi : myTamaList) {
				System.out.println(tamagotchi );
				System.out.println("Que vas faire aujourd'hui " + tamagotchi.getName());
				System.out.println("1 - Voir les statistiques");
				System.out.println("2 - Manger");
				System.out.println("3 - Jouer");
				System.out.println("4 - Dormir");
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1: {
					tamagotchi.statistic();
					break;
				}
				case 2: {
					tamagotchi.manger();
					break;
				}
				case 3: {
					//homme.jouer();
					//femme.jouer();
					break;
				}
				case 4: {
					tamagotchi.dormir();
					break;
				}
					default:
						System.out.println("Je ne comprends pas, que voulez vous faire");
				}
				
				if(tamagotchi.isDead()) {
					System.out.println("Un de vos tamagochi est mort, fin du jeu ");
					myTamaList.remove(tamagotchi);
				}
				
				//si le tamagochi que j'ai est de type femme
				if(tamagotchi instanceof TamagotchiFemme) {
					
					//alors son bebe, s'il elle en as un, grandit
					((TamagotchiFemme) tamagotchi).pregnancyLive();			
				}
			}			
		}
	}
}
