package subsystems;

import org.usfirst.frc.team293.robot.Ports;

//import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;

public class Slurper {
	private static final Talon leftSlurperHand = new Talon(Ports.leftSlurperHand),
			rightSlurperHand = new Talon(Ports.rightSlurperHand);
//	private static final DigitalInput toteDetector = new DigitalInput(Ports.toteDetectorLimit);


	public static void slurp(double leftSpeed, double rightSpeed) {
		leftSlurperHand.set(leftSpeed);
		rightSlurperHand.set(-rightSpeed);
	}
	
/*	public static boolean hasTote() {
		if (toteDetector.get()) {
			return true;
		}
		
		return false;
	}*/
	
}
