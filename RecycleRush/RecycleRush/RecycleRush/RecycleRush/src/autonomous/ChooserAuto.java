package autonomous;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//See this for details
//http://wpilib.screenstepslive.com/s/4485/m/26401/l/255419-choosing-an-autonomous-program-from-smartdashboard
public class ChooserAuto {
//Command autonomousCommand;
//SendableChooser autoChooser= new SendableChooser();
void inits(){//in auto initiation

	//autoChooser.addDefault("Go Forward",new Pickup());  add stuff here...different autos
//	SmartDashboard.putData("Autonomous mode chooser", autoChooser);
}
void starts(){//in auto initiation
//	autonomousCommand=(Command) autoChooser.getSelected();
//	autonomousCommand.start();//starts up the chooser and reads in get selected.
}
void Periodics()//run this in auto Periodic
{
//	Scheduler.getInstance().run();
}
}

