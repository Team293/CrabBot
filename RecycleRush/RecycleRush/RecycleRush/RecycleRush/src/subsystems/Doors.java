package subsystems;

import org.usfirst.frc.team293.robot.Ports;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Doors {
	private static final DoubleSolenoid doors = new DoubleSolenoid(Ports.door1, Ports.door2);
	public static void move(boolean direction) {
		if (direction) {
			doors.set(DoubleSolenoid.Value.kForward);
		} else {
			doors.set(DoubleSolenoid.Value.kReverse);
		}
	}
	

}
