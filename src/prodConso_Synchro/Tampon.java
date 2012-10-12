package prodConso_Synchro;
/*
 * C'est notre moniteur!
 */
public class Tampon {
	private static final int TAILLE = 10;
	private Object[] tampon = new Object[TAILLE];
	private int n = 0;

	public synchronized Object get()
	{
		//section critique. La methode n'est pas bloquer. Uniquement cette partie
		// equivaut a synchronize(this)
		//tant qu'il y a pas de produit, s'endormir et attendre reveil
		while(n==0)
		{
			System.out.print("dors sur get   ");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("reveil sur get");

		}
		Object object = tampon[n-1];
		n=n-1;
		//reveille le prod pour qu'il produise.
		notifyAll();
		return object;
	}

	public synchronized void put(Object o)
	{
		while(n==TAILLE-1)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		n++;
		tampon[n-1] = o;
		notifyAll();
	}
}