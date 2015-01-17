package subsystems;

import org.usfirst.frc.team293.robot.Ports;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrain {
	private static final double diameter = 10;
//	private static final double width = 40;
	
    private static final Talon leftMotor = new Talon(Ports.leftDrive);
    private static final Talon rightMotor = new Talon(Ports.rightDrive);
    private static final RobotDrive drive = new RobotDrive(leftMotor,
            rightMotor);  
 
	public static void tankDrive(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed, rightSpeed);
	}
	
	public static void arcadeDrive(double move, double rotate) {
		drive.arcadeDrive(move, rotate);
	}
	
	public static double convertToDistance(double count) {
		double rotations  = count/256;
		double distance = Math.PI*diameter*rotations;
		
		return distance;
	}
	
/*	public static double getAngle() {
		double leftDistance = convertToDistance(leftEncoder.getRaw());
		double rightDistance = convertToDistance(rightEncoder.getRaw());
		double deltaDistance = rightDistance - leftDistance;
		double radians = deltaDistance/width;
		double degrees = radians*180/Math.PI;
		
		return degrees;
	}
	
	public static void driveStraight(double speed) {
		double leftSpeed = speed + getAngle()/90;
		double rightSpeed = speed - getAngle()/90;
		tankDrive(leftSpeed, rightSpeed);
	}
	
	public static void encodersReset() {
		leftEncoder.reset();
		rightEncoder.reset();
	}*/

}
