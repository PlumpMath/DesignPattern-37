package robot_Cmd;

public class RamasserCmd implements ICommand
{
	private Robot m_robot;

	public RamasserCmd(Robot m_robot) {
		super();
		this.m_robot = m_robot;
	}

	@Override
	public void Do() {
		m_robot.ramasser();
	}

	@Override
	public void Undo() {
		m_robot.remettre();
	}

	@Override
	public Boolean IsUndoable() {return true;}
}
