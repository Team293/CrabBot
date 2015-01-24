package autonomous;
import edu.wpi.first.wpilibj.Gyro;

import org.usfirst.frc.team293.robot.Ports;

import subsystems.DriveTrain;

import java.util.Timer;
import java.util.TimerTask;
import edu.wpi.first.wpilibj.DigitalInput;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Command;

public  class Auto extends Command{
    public static boolean hasRunAuto = false;
    // TODO: change to final when actual value obtained
    public long drivingTime = 1000;
    
	protected void initialize() {}
	public void execute() {}
	protected synchronized final void setTimeout(int timeout){
		super();
	}
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		DriveTrain.stopMotors();
	}
	protected void interrupted() {
		end();
	}
}
