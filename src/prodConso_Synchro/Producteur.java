package prodConso_Synchro;
/*
 * Il serait apparament preferable de faire des implements Runnable. Plus propre...
 */
public class Producteur extends Thread {
	private Tampon tampon;
	private int numero;
	public Producteur(Tampon t, int no)
	{
		tampon = t;
		numero = no;
	}
	public void run()
	{
		for (int i = 0; i < 200; i++) {
			System.out.println("Production par "+numero+"!");
			tampon.put(new Integer(i));
			try {
				sleep((int)Math.random()*100);
			} catch (Exception e) {
				System.out.println("Execpt Productor");
			}
		}
		System.out.println("FIN PRODUCTEUR");
	}
}
