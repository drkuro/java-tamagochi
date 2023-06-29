package fr.webforce.farmManager.model;

import java.util.ArrayList;
import java.util.Scanner;

public class TamagotchiFemme extends Tamagotchi{
	
	//verifie si la personne est enceine
	private boolean isPregnant = false;
	
	//s'il atteint 4, alors un bébé nait
	private int pregnantLevel = 0;
	
	private ArrayList<BabyTamagotchi> babies;
	
	
	public TamagotchiFemme(String name, String type) {
		// TODO Auto-generated constructor stub
		super(name, type);
		this.babies = new ArrayList<BabyTamagotchi>();
	}

	public void dormir() {
		super.dormir();
		this.pregnancyTest();
	}
	
	public void statistic() {
		super.statistic();
		System.out.println("Est enceinte : " + this.isPregnant);
	}
	
	/**
	 * Je veux une fonction qui me permet de faire l'aleatoire pour avoir une change d'etre enceinte
	 */
	
	public void pregnancyTest() {
		if(!this.isPregnant) {
			this.isPregnant = (Math.random() <= 0.5) ? true : false;
		}
	}
	
	/**
	 * 
	 */
	public void pregnancyLive() {
		if(this.isPregnant) {
			this.pregnantLevel += 2;
			if(this.pregnantLevel >= 4) {
				System.out.println("Oyez Oyez !! Un nouvel etre est né");
				System.out.println("Il s'appellera ??");

				Scanner sc = new Scanner(System.in);
				String name = sc.next();
				
				babies.add(
						new BabyTamagotchi(name, (Math.random() <= 0.5) ? "Homme" : "Femme")
						);
				
				this.isPregnant = false;
				this.pregnantLevel = 0;
			}
		}
	}
}
