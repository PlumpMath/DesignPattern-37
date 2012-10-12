package robot_Cmd;

public abstract class DispositifManipulation {
	protected CapteurTactile ct = null;
	public abstract void ouvrirDispositif();
	public abstract void fermerDispositif();
	public abstract void avancerDispositif();
	public abstract void positionInitiale();
}
