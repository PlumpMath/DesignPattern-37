package systFile_Composite_Visitor;

public class Lien extends Composant {

	private Composant m_source;
	
	protected Lien(String m_chaine, Composant source) {
		super(m_chaine);
		m_source = source;
		}

	@Override
	public void accept(ComposantVisitor cmd) {
		cmd.visit(this);
	}

	public void setSource(Composant m_source) {
		this.m_source = m_source;
	}

	public Composant getSource() {
		return m_source;
	}
}
