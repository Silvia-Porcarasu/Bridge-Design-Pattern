package Proiect;

//abstractizarea perfectionata
public class Frantuzesc extends Restaurant{

	Frantuzesc(Meniu f1) {
		super(f1);
		// TODO Auto-generated constructor stub
	}

	@Override
	void alegereClient() {
		// TODO Auto-generated method stub
		System.out.println("Specific frantuzesc");
		System.out.println("S-a ales ");
		fel.Produs();
	}
	
}