package systFile_Composite_Visitor;

public class CptVisitorLsR implements ComposantVisitor {

	@Override
	public void visit(Repertoire cp) {
		System.out.println(cp.getName()+ " ");
		for (Composant c : cp.m_fileList) {
			c.accept(this);
		}
	}

	@Override
	public void visit(Fichier cp) {
		System.out.println(cp.getName()+ " ");
	}

	@Override
	public void visit(Lien cp) {
		System.out.println(cp.getName()+ "[=>"+cp.getSource().getName()+"]"+" ");
	}

}
