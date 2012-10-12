package robot_Cmd;

import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Robot robot = new Robot(null, new DriversMouvementRobot(new Jambes()), null, null);
		
				
		AvancerCmd avancer = new AvancerCmd(robot);
		AvanceAutoCmd avancerJusqua = new AvanceAutoCmd(robot);
		ReculerCmd reculer = new ReculerCmd(robot);
		ContournerCmd contourner = new ContournerCmd(robot);
		RamasserCmd ramasser = new RamasserCmd(robot);
		
		Telecommand telecommand = new Telecommand();
		telecommand.setCommand(0, avancer);
		telecommand.setCommand(1, reculer);
		telecommand.setCommand(2, contourner);
		telecommand.setCommand(3, ramasser);
		telecommand.setCommand(4,avancerJusqua);
		
		ArrayList<ICommand> listCmd = new ArrayList<ICommand>();
		listCmd.add(avancerJusqua); listCmd.add(ramasser);
		MacroCmd macro = new MacroCmd(listCmd);
		telecommand.setCommand(4,macro);
			
		//telecommand.pressBoutton(0);// NE marchera pas si pas de dispo capteur, manip...
		
		// TODO Auto-generated method stub
		System.out.println("EXIT SUCCESS");
	}

}
