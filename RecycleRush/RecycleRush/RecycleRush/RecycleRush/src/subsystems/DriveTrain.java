package subsystems;

import org.usfirst.frc.team293.robot.Ports;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain {
	private static final double diameter = 10;
//	private static final double width = 40;
	
    private static final Talon leftMotor = new Talon(Ports.leftDrive);
    private static final Talon rightMotor = new Talon(Ports.rightDrive);
    private static final RobotDrive drive = new RobotDrive(leftMotor,
            rightMotor);
    static double kStraight = 0.0, kAlign = 0.071;
	static final Gyro gyro = new Gyro(Ports.gyro);
 
	public static void tankDrive(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed, rightSpeed);
	}
	
	public static void stopMotors() {
		drive.tankDrive(0, 0);
	}
	
	public static void arcadeDrive(double move, double rotate) {
		drive.arcadeDrive(move, rotate);
	}
	
	public static double convertToDistance(double count) {
		double rotations  = count/256;
		double distance = Math.PI*diameter*rotations;
		
		return distance;
	}
	
	public static double[] getMotorSpeeds() {
		return new double[] {leftMotor.get(), rightMotor.get()};
	}
	
/*	public static double getAngle() {
		double leftDistance = convertToDistance(leftEncoder.getRaw());
		double rightDistance = convertToDistance(rightEncoder.getRaw());
		double deltaDistance = rightDistance - leftDistance;
		double radians = deltaDistance/width;
		double degrees = radians*180/Math.PI;
		
		return degrees;
	} */
	
	public static void driveStraight() {
    	SmartDashboard.putNumber("kStraight", kStraight);
    	double angle = gyro.getAngle();
    	
    	double[] speeds = DriveTrain.getMotorSpeeds();
    	double leftMotorOutput = speeds[0] - kStraight * angle;
    	double rightMotorOutput = speeds[1] - kStraight * angle;
    	if (rightMotorOutput > 1) {
            rightMotorOutput = 1;
        }
        if (leftMotorOutput > 1) {
            leftMotorOutput = 1;
        }
        if (rightMotorOutput < -1) {
            rightMotorOutput = -1;
        }
        if (leftMotorOutput < -1) {
            leftMotorOutput = -1;
        }
        DriveTrain.tankDrive(-leftMotorOutput, -rightMotorOutput);
        
        kStraight = SmartDashboard.getNumber("kStraight", kStraight);
    }
/*	
	public static void encodersReset() {
		leftEncoder.reset();
		rightEncoder.reset();
	}
*/
}
