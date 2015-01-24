package autonomous;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import subsystems.DriveTrain;

public class RobotSet extends Auto {
	/**
	 * Puts yellow bin without stacking the three bins in a stack.
	 */

	public RobotSet() {
		super();
	}
	
	public void init() {
		super.init();
	}
	
	public void run() {
		if (autoTimer.get() < driveToAutozoneTime) {
			DriveTrain.tankDrive(1, 1);
		}
	}

}
