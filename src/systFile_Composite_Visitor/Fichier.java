package systFile_Composite_Visitor;

public class Fichier extends Composant {

	public Fichier(String m_chaine) {
		super(m_chaine);
	}

	@Override
	public void accept(ComposantVisitor cmd) {
		cmd.visit(this);
	}
}
