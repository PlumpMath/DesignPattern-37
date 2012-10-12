package systFile_Composite_Visitor;

public class CptVisitorRmR implements ComposantVisitor {

	@Override
	public void visit(Repertoire cp) {
		for (Composant c : cp.m_fileList) {
			c.accept(this);
		}
		cp.m_fileList.clear();
	}

	@Override
	public void visit(Fichier cp) {
		cp.setName("");
	}

	@Override
	public void visit(Lien cp) {
		cp.setName(""); cp.setSource(null);
	}

}
