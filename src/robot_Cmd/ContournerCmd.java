package robot_Cmd;

public class ContournerCmd implements ICommand
{

	private Robot m_robot = null;
	
	public ContournerCmd(Robot m_robot) {
		super();
		this.m_robot = m_robot;
	}

	@Override
	public void Do() {
		m_robot.contourner();	
	}

	@Override
	public void Undo() {}

	@Override
	public Boolean IsUndoable() {return false;}

}
