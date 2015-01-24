package autonomous;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import subsystems.DriveTrain;


public class NoTote extends Auto{
	Timer timer = new Timer();
	Talon talon = new Talon(2);
	public void initialize(){
		timer.start();
	}
	public void execute(){
		while (timer.get()<zoneDriveTime){
			talon.set(1);
			SmartDashboard.putNumber("timer", timer.get());
			//DriveTrain.driveStraight
		}
		talon.set(0);
	}
}
