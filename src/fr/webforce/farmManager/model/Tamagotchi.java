package fr.webforce.farmManager.model;

public class Tamagotchi {
	
	// private
	// public
	// protected
	private String name;
	
	private String type;
	
	//s'il atteint 0, fin du jeu
	private int pv = 10;
	
	//s'il atteint 10, fin du jeu
	private int hungerLevel = 0;
	
	//s'il atteint 0, fin du jeu
	private int happyLevel = 10;

	public Tamagotchi(String name, String type, int pv, int hungerLevel, int happyLevel) {
		super();
		this.name = name;
		this.type = type;
		this.pv = pv;
		this.hungerLevel = hungerLevel;
		this.happyLevel = happyLevel;
	}
	
	public Tamagotchi(String name, String type) {
		this.name = name;
		this.type = type;
		this.pv = 10;
		this.hungerLevel = 0;
		this.happyLevel = 10;
	}

	public Tamagotchi() {
	}
	
	public void manger() {
		this.hungerLevel -= 1;
		this.happyLevel += 1;
		this.pv -= 2;
		this.statistic();
	}
	
	public void dormir() {
		this.hungerLevel += 2;
		this.happyLevel -= 2;
		this.pv += 1;
		this.statistic();
	}
	
	public void statistic() {
		System.out.println("Joie : " + this.happyLevel + "Faim : " + this.hungerLevel + "Vie : " + this.pv);
	}
	
	public void crieMonNom() {
		System.out.println("Je m'appelle " + this.name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getHappyLevel() {
		return happyLevel;
	}

	public void setHappyLevel(int happyLevel) {
		this.happyLevel = happyLevel;
	}

	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}
	

}
