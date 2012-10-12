package robot_Cmd;

import java.util.ArrayList;

public class MacroCmd implements ICommand{

	private ArrayList<ICommand> m_listCmd;

	public MacroCmd(ArrayList<ICommand> listCmd) {
		super();
	}

	@Override
	public void Do() {
		for (ICommand c : m_listCmd) {
			c.Do();
		}
	}

	@Override
	public void Undo() {}

	@Override
	public Boolean IsUndoable() {
		return false;
	}

}
