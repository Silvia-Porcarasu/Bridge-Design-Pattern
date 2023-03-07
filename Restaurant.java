package Proiect;

public abstract class Restaurant {
	Meniu fel;
	
	Restaurant(Meniu f1) {
		this.fel=f1;
	}
	
	abstract void alegereClient();
}