package robot_Cmd;

public class ReculerCmd implements ICommand
{
	private Robot m_robot;

	public ReculerCmd(Robot m_robot) {
		super();
		this.m_robot = m_robot;
	}

	@Override
	public void Do() {
		m_robot.reculer();
	}

	@Override
	public void Undo() {
		m_robot.avancer();	
	}

	@Override
	public Boolean IsUndoable() {return true;}
}
