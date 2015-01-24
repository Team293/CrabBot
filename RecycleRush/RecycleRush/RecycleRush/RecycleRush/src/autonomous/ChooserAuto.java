package autonomous;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//See this for details
//http://wpilib.screenstepslive.com/s/4485/m/26401/l/255419-choosing-an-autonomous-program-from-smartdashboard
public class ChooserAuto {
	static Auto autonomousCommand;
	static SendableChooser autoChooser= new SendableChooser();
	public static void init(){
		autoChooser.addDefault("Go Forward",new NoTote());//  add stuff here...different autos
		SmartDashboard.putData("Autonomous mode chooser", autoChooser);
	}
	public static Auto autoChosen(){//in auto initiation
		autonomousCommand = (Auto) autoChooser.getSelected();
		autonomousCommand.start();//starts up the chooser and reads in get selected.
		autonomousCommand.setTimeout(15);
		return autonomousCommand;
	}
	void Periodics()//run this in auto Periodic
	{
		Scheduler.getInstance().run();
	}
}

