package systFile_Composite_Visitor;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Repertoire rep1 = new Repertoire("Rep1");
		Repertoire rep2 = new Repertoire("Rep2");
		Fichier f1 = new Fichier("liste.txt");

		ComposantVisitor cvlsr = new CptVisitorLsR();
		ComposantVisitor cvrmr = new CptVisitorRmR();
		
		rep1.add(f1);
		rep1.add(rep2);
		rep2.add(new Lien("listeBis.txt",f1));

		rep2.accept(cvrmr);
		
		Repertoire.getRacine().accept(cvlsr);
		System.out.println("\nEXIT SUCCESS");
	}

}
