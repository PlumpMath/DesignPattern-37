package prodConso_Synchro;

public class Main {

	public static void main(String[] args) 
	{
		Tampon monTampon = new Tampon();

		Producteur p1 = new Producteur(monTampon, 1);
		
		Consomateur c1 = new Consomateur(monTampon, 1);
		Consomateur c2 = new Consomateur(monTampon, 2);
		
		p1.start();
		c1.start();
		c2.start();
		
		System.out.println("EXIT SUCCESS!");
	}
}
