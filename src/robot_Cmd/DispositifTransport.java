package robot_Cmd;

public abstract class DispositifTransport {
	protected CapteurVisuel cv = null;
	public abstract void ouvrirDispositif();
	public abstract void fermerDispositif();

}
