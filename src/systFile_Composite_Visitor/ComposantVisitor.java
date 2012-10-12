package systFile_Composite_Visitor;

public interface ComposantVisitor 
{
	public void visit(Repertoire cp);
	public void visit(Fichier cp);
	public void visit(Lien cp);
	
}
