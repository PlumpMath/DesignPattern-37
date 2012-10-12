package robot_Cmd;

public class DefaultCmd implements ICommand
{
	public DefaultCmd() {}

	@Override
	public void Do() {}

	@Override
	public void Undo() {}

	@Override
	public Boolean IsUndoable() {return true;}
}
