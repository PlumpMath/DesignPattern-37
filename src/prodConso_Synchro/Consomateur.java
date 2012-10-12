package prodConso_Synchro;

public class Consomateur extends Thread {
	private Tampon tampon;
	private int numero;

	public Consomateur(Tampon t, int no)
	{
		tampon = t;
		numero = no;
	}
	public void run()
	{
		for (int i = 0; i < 100; i++) {
			System.out.print("Appel de get par "+numero+" ");
			Integer val = (Integer)tampon.get();
			System.out.println("Consomation par "+numero+" : "+val);
			try {
				sleep((int)Math.random()*100);
			} catch (Exception e) {
				System.out.println("Execpt Conso");	}
		}
		System.out.println("FIN CONSOMMATEUR N°"+numero);
	}


}
