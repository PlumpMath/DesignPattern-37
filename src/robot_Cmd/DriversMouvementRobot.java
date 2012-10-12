package robot_Cmd;

/* Pattern Adapteur */

public class DriversMouvementRobot implements DispositifMouvement {

	private Jambes j;

	public DriversMouvementRobot(Jambes j) {
		super();
		this.j = j;
	}

	@Override
	public void avancer() {
		j.avancerPiedDroit();
		j.avancerPiedGauche();
	}

	@Override
	public void reculer() {
		j.reculerPiedDroit();
		j.reculerPiedGauche();
	}

	@Override
	public void pivoterD() {
		j.avancerPiedGauche();
		j.avancerPiedGauche();
	}

	@Override
	public void pivoterG() {
		j.avancerPiedDroit();
		j.avancerPiedDroit();
	}
}
