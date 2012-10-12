package robot_Cmd;

public class Robot {
	private DispositifManipulation m_dispoManip = null;
	private DispositifMouvement m_dispoMouv = null;
	private DispositifTransport m_dispoTransp = null;
	private Capteur m_capteur = null;

	public Robot(DispositifManipulation dma, DispositifMouvement dmo,
			DispositifTransport dt, Capteur cap) {
		super();
		this.m_dispoManip = dma;
		this.m_dispoMouv = dmo;
		this.m_dispoTransp = dt;
		this.m_capteur = cap;
	}

	public void avancer() {
		if (!m_capteur.detecter())
			m_dispoMouv.avancer();
	}

	public void contourner()
	{
		while (m_capteur.detecter())
			m_dispoMouv.pivoterD();
	}

	public void avancerJusquaObstacle()
	{
		while (!m_capteur.detecter())
			m_dispoMouv.avancer();
		this.contourner();
	}

	public void reculer() { m_dispoMouv.reculer();}

	public void ramasser()
	{ 
		m_dispoManip.avancerDispositif();
		m_dispoManip.fermerDispositif();
		m_dispoManip.positionInitiale();

		m_dispoTransp.ouvrirDispositif();
		m_dispoManip.ouvrirDispositif();
		m_dispoTransp.fermerDispositif();
	}
	
	public void remettre()
	{
		m_dispoTransp.ouvrirDispositif();
		m_dispoManip.ouvrirDispositif();
		m_dispoTransp.fermerDispositif();
		
		m_dispoManip.avancerDispositif();
		m_dispoManip.fermerDispositif();
		m_dispoManip.positionInitiale();
	}
}
