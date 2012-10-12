package robot_Cmd;

public interface ICommand {
	public void Do();
	public void Undo();
	public Boolean IsUndoable();
}
