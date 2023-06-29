package fr.webforce.farmManager.model;

final public class BabyTamagotchi extends Tamagotchi{
	
	protected String name;
	
	protected String type;
	
	//s'il atteint 0, fin du jeu
	protected int pv = 5;
	
	//s'il atteint 5, fin du jeu
	protected int hungerLevel = 0;

	public BabyTamagotchi(String name, String type, int pv, int hungerLevel, int happyLevel) {
		super();
		this.name = name;
		this.type = type;
		this.pv = pv;
		this.hungerLevel = hungerLevel;
	}
	
	public BabyTamagotchi(String name, String type) {
		this.pv = 5;
		this.hungerLevel = 0;
	}

	public BabyTamagotchi() {
	}
	
	public void manger() {
		this.hungerLevel -= 1;
		this.pv -= 2;
		this.checkStatus();
	}
	
	public void dormir() {
		this.hungerLevel += 2;
		this.pv += 1;
		this.checkStatus();
	}
	
	public void statistic() {
		System.out.println("Voici les information de " + this.name + " : ");
		System.out.println(" Faim : " + this.hungerLevel + "Vie : " + this.pv);
	}

    // Méthode isDead()
    public boolean isDead() {
        return (hungerLevel >= 5 || pv <= 0);
    }

    // Méthode checkStatus() pour l'alerte
    private void checkStatus() {
    	if (hungerLevel >= 4 || pv <= 2) {
            System.out.println("Attention ! " + name + " est sur le point de mourir !");
        }
		this.statistic();
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
