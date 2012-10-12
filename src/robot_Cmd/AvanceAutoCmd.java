package robot_Cmd;

public class AvanceAutoCmd implements ICommand {
	private Robot m_robot;

	public AvanceAutoCmd(Robot m_robot) {
		super();
		this.m_robot = m_robot;
	}

	@Override
	public void Do() {
		while (true)
			m_robot.avancerJusquaObstacle();		
	}

	@Override
	public void Undo() {}

	@Override
	public Boolean IsUndoable() {return false;}
}
