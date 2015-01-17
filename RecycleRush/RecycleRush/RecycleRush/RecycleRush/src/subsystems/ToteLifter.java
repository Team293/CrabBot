package subsystems;

import org.usfirst.frc.team293.robot.Ports;
import edu.wpi.first.wpilibj.DoubleSolenoid;


public class ToteLifter {
	public static final DoubleSolenoid cylinders = new DoubleSolenoid(Ports.solenoid1, Ports.solenoid2);
	
	public static void move(boolean buttonValue) {
		
		if (Logic.buttonState(buttonValue)) {
			cylinders.set(DoubleSolenoid.Value.kForward);
		} else {
			cylinders.set(DoubleSolenoid.Value.kReverse);
		}
	}
}
