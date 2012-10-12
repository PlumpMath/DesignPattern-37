package robot_Cmd;

import java.util.ArrayList;

public class Telecommand
{
	// Historique des commandes effectuées
	private ArrayList<ICommand> m_listCommand = null;
	// Mes boutons sur lequels je "clique"
	private ICommand [] m_buttonCmd = null;
	
	public Telecommand() {
		super();
		m_listCommand = new ArrayList<ICommand>();
		m_buttonCmd = new ICommand[5];
		
		for (int i = 0; i < m_buttonCmd.length; i++)
			m_buttonCmd[i] = new DefaultCmd();
	}

	public void setCommand(Integer i,ICommand ic)
	{
		if (i<m_buttonCmd.length)
			m_buttonCmd[i] = ic;
		else
			System.out.println("Le bouton n'existe pas. Action impossible.");
	}

	public void pressBoutton(int i) {
		m_buttonCmd[i].Do();
		m_listCommand.add(m_buttonCmd[i]);
	}

	public void Undo()
	{
		m_listCommand.get(m_listCommand.size()).Undo();
		m_listCommand.remove(m_listCommand.size());
	}

}
