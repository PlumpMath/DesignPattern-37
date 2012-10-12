package gridAndPathFinder;

import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("<=======================DATA GRID======================>");
		Grid<Character> grille = new Grid<Character>(7, 5,'_');
		grille.set(0, 0, '#');	grille.set(0, 3, '#');
		grille.set(1, 3, '#');	grille.set(2, 4, '#');
		grille.set(3, 2, '#');	grille.set(4, 0, '#');
		grille.set(4, 1, '#');	grille.set(5, 3, '#');
		grille.set(4, 3, '#');	grille.set(6, 1, '#');
		Location2D beginLoc = new Location2D(6,0);
		Location2D targedLoc = new Location2D(0, 2);
		grille.set(beginLoc, '@');
		grille.set(targedLoc, 'T');
		grille.affiche();
		
		
		System.out.println("<=======================PATH FINDER=====================>");
		Grid<Direction2D> pathFinder = new Grid<Direction2D>(7, 5, Direction2D.U);
		ArrayList<Location2D> voisinAVisiter = new ArrayList<Location2D>();

		voisinAVisiter.add(beginLoc);

		Direction2D[] resources = Direction2D.values();
		while (voisinAVisiter.size() > 0)
		{
			Location2D currentLoc = voisinAVisiter.get(0);
			voisinAVisiter.remove(0);
			
			if (grille.get(currentLoc).equals('T'))
				break;
			
			for (int i = 0 ; i < resources.length-1  ; i++) {
				Location2D currentNeightbour = currentLoc.getNeighbourLocation(resources[i]);
				if (pathFinder.contain(currentNeightbour) &&
						!grille.get(currentNeightbour).equals('#')
						&& pathFinder.get(currentNeightbour).equals(Direction2D.U)
						&& !grille.get(currentNeightbour).equals('@'))
				{
					voisinAVisiter.add(currentNeightbour);
					pathFinder.set(currentNeightbour, Direction2D.opposedDir(resources[i]));
				}
			}
		}
		pathFinder.affiche();
		System.out.println("<=======================EXIT SUCCESS====================>");
	}
}
