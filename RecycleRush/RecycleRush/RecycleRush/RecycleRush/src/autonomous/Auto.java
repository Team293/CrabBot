package autonomous;
import edu.wpi.first.wpilibj.Gyro;

import org.usfirst.frc.team293.robot.Ports;

import subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Auto {
	static final Gyro gyro = new Gyro(Ports.gyro);
    public static boolean hasRunAuto = false;
    // TODO: change to final when actual value obtained
    static double kStraight = 0.0, kAlign = 0.071;
/*    double alignTime = 0.5,
            stopTime1 = 2.2,
            stopTime2 = 2.4,
            searchTime = 3.3,
            quickBack1 = 0.85,
            driveSpeedForward = 0.79,
            driveSpeedForward2 = 0.79,
            driveSpeedReverse = -0.7,
            leftStopSpeed = -0.3,
            rightStopSpeed = -0.3,
            turnLeft = 20,
            blobCount = 0,
            turnTime = 0.75,
            turnRight = (-turnLeft);
            
    double commandStartTime = 0;
    public static Timer autoTimer = new Timer();*/
    
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
}
