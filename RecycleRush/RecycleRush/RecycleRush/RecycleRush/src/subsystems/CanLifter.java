package subsystems;

import org.usfirst.frc.team293.robot.Ports;
import edu.wpi.first.wpilibj.Talon;
 
public class CanLifter {
	private static final Talon belt = new Talon(Ports.belt);
	
	public static void move(double speed) {
		belt.set(speed);
	}

}
