package autonomous;
import edu.wpi.first.wpilibj.command.Command;
import subsystems.CanLifter;
import subsystems.DriveTrain;
import subsystems.ToteLifter;

public  class Auto extends Command{
    public static boolean hasRunAuto = false;
    // TODO: change to final when actual value obtained
    public long zoneDriveTime = 1;
    
	protected void initialize() {}
	public void execute() {}
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		DriveTrain.stopMotors();
		CanLifter.move(0);
		ToteLifter.down();
	}
	protected void interrupted() {
		end();
	}
}
