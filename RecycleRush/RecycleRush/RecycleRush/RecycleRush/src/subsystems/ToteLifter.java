package subsystems;

import org.usfirst.frc.team293.robot.Ports;

//import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;


public class ToteLifter {
	public static final DoubleSolenoid cylinders = new DoubleSolenoid(Ports.solenoid1, Ports.solenoid2);
//	public static final DigitalInput leftLimit = new DigitalInput(Ports.leftCylinderLimit);
//	public static final DigitalInput rightLimit = new DigitalInput(Ports.rightCylinderLimit);
	
	public static void move(boolean buttonValue) {
		
		if (Logic.buttonState(buttonValue)) {
			cylinders.set(DoubleSolenoid.Value.kForward);
		} else {
			cylinders.set(DoubleSolenoid.Value.kReverse);
		}
	}
	
/*	public static boolean isDown() {
		if (leftLimit.get() && rightLimit.get()){
			return true;
		}
		return false;
	}*/
	
/*	public static void autoFeed() {
		if (Slurper.hasTote()) {
			
		} else {
			Slurper.slurp(0.4, 0.4);
		}
	}*/
}
