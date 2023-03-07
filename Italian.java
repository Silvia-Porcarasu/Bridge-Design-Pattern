package Proiect;

//abstractizarea perfectionata
public class Italian extends Restaurant{

	Italian(Meniu f1) {
		super(f1);
		// TODO Auto-generated constructor stub
	}

	@Override
	void alegereClient() {
		// TODO Auto-generated method stub
		System.out.println("Specific italian ");
		System.out.println("S-a ales ");
		fel.Produs();
	}
	
}