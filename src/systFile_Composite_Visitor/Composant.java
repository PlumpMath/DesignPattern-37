package systFile_Composite_Visitor;

public abstract class Composant {
	protected String m_chaine;
	
	protected Composant(String m_chaine) {
		super();
		this.m_chaine = m_chaine;
	}
	
	public abstract void accept(ComposantVisitor cmd);
	
	public void setName(String m_chaine) {
		this.m_chaine = m_chaine;
	}
	public String getName() {
		return m_chaine;
	}
}
