package systFile_Composite_Visitor;

import java.util.ArrayList;

public class Repertoire extends Composant {

	private static Repertoire racine = null;

	protected ArrayList<Composant> m_fileList = new ArrayList<Composant>();

	private Repertoire()
	{
		super("/");
	}

	public Repertoire(String m_chaine) {
		super(m_chaine);

		if (Repertoire.racine == null)
		{
			racine = new Repertoire();
			racine.add(this);
		}
	}

	public static Repertoire getRacine()
	{
		return racine;
	}

	public void add(Composant cp)
	{
		m_fileList.add(cp);
	}

	@Override
	public void accept(ComposantVisitor cmd) {
		cmd.visit(this);		
	}
}
