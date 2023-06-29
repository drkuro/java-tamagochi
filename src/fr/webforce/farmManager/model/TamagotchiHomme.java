package fr.webforce.farmManager.model;

public class TamagotchiHomme extends Tamagotchi {
	
	
	
	//s'il atteint 10, fin du jeu
	protected int hungerLevel = 0;
	

	public TamagotchiHomme(String name, String type) {
		super(name, type);
	}

	public TamagotchiHomme() {
	}
	public void travailler() {
	}
	
	public void statistic() {
		System.out.println("Voici les information de " + this.name + " : ");
		System.out.println("Joie : " + this.happyLevel + " Faim : " + this.hungerLevel + "Vie : " + this.pv);
	}

    // Méthode isDead()
    public boolean isDead() {
        return (hungerLevel >= 10 || happyLevel <= 0 || pv <= 0);
    }

    // Méthode checkStatus() pour l'alerte
    private void checkStatus() {
    	if (hungerLevel >= 8 || happyLevel <= 2 || pv <= 2) {
            System.out.println("Attention ! " + name + " est sur le point de mourir !");
        }
		this.statistic();
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
