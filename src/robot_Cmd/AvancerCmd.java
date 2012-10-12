package robot_Cmd;

public class AvancerCmd implements ICommand
{
	private Robot m_robot;

	public AvancerCmd(Robot m_robot) {
		super();
		this.m_robot = m_robot;
	}

	@Override
	public void Do() {
		m_robot.avancer();
	}

	@Override
	public void Undo() {
		m_robot.reculer();		
	}

	@Override
	public Boolean IsUndoable() {
		return true;
	}
}
