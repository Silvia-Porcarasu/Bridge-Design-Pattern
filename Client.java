package Proiect;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant s1=new Italian(new Paste());
		s1.alegereClient();
		
		System.out.println("\n");
		
		Restaurant s2=new Frantuzesc(new Supa());
		s2.alegereClient();
		
		System.out.println("\n");
		
		Restaurant s3=new Italian(new Friptura());
		s3.alegereClient();
		
		System.out.println("\n");
		
		Restaurant s4=new Frantuzesc(new Paste());
		s4.alegereClient();
	}
}
