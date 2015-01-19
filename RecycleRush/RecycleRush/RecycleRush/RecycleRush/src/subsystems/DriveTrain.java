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
    private static final RobotDrive drive = new RobotDrive(leftMotor,
            rightMotor);
    private static final RobotDrive drive2 = new RobotDrive(leftMotor2,
            rightMotor2);  
=======
    private static final RobotDrive drive = new RobotDrive(leftMotor, leftMotor2, rightMotor, rightMotor2);   
>>>>>>> origin/master
 
	public static void tankDrive(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed, rightSpeed);
	}
	
	public static void adjustedDrive(double leftValue, double rightValue) {
		double leftSpeed = Math.sin(leftValue*Math.PI/2);
		double rightSpeed = Math.sin(rightValue*Math.PI/2);
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
