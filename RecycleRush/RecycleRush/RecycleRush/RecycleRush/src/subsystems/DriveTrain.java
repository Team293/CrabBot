package subsystems;

import org.usfirst.frc.team293.robot.Ports;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrain {
//	private static final double diameter = 10;
//	private static final double width = 40;
	
    private static final Talon leftMotor = new Talon(Ports.leftDrive);
    private static final Talon rightMotor = new Talon(Ports.rightDrive);
    private static final Talon leftMotor2 = new Talon(Ports.leftDrive2);
    private static final Talon rightMotor2 = new Talon(Ports.rightDrive2);
<<<<<<< HEAD
<<<<<<< HEAD
    private static final RobotDrive drive = new RobotDrive(leftMotor, leftMotor2, rightMotor, rightMotor2);

	public static void tankDrive(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed, rightSpeed);
	}
	
	public static double adjustSpeed(double value) {
		double speed = Math.sin(value*Math.PI/2);
		return speed;
=======
    private static final RobotDrive drive = new RobotDrive(leftMotor,
            rightMotor);
    private static final RobotDrive drive2 = new RobotDrive(leftMotor2,
            rightMotor2);  
>>>>>>> 1b2a7e5475d32c8aaefc3a2368678105e44fc30f
=======
    private static final RobotDrive drive = new RobotDrive(leftMotor, leftMotor2, rightMotor, rightMotor2);   
>>>>>>> origin/master
 
	public static void tankDrive(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed, rightSpeed);
>>>>>>> b01236d18ff892c3a1a8f4ee245f8005dfd2ae61
	}
	
	public static void adjustedDrive(double leftValue, double rightValue) {
		double leftSpeed = adjustSpeed(leftValue);
		double rightSpeed = adjustSpeed(rightValue);
		tankDrive(leftSpeed, rightSpeed);
	}
	
	public static void arcadeDrive(double move, double rotate) {
		drive.arcadeDrive(move, rotate);
	}
	
/*	public static double convertToDistance(double count) {
		double rotations  = count/256;
		double distance = Math.PI*diameter*rotations;
		
		return distance;
	} */
}
