
package org.usfirst.frc.team293.robot;
import edu.wpi.first.wpilibj.IterativeRobot;

import org.usfirst.frc.team293.robot.OI;
import org.usfirst.frc.team293.robot.Sensor;
import autonomous.Auto;
import autonomous.ChooserAuto;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	private static Auto auto;
    public void robotInit() {
    	ChooserAuto.init();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousInit(){
    	
        Auto.hasRunAuto=false;
        Auto auto = ChooserAuto.autoChosen();
    }
   
    public void autonomousPeriodic() {
    	auto.execute();

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        OI.controlDrive();
        OI.controlCanLifter();
        OI.controlToteLifter();
        Sensor.monitor();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        OI.controlDrive();
        OI.controlCanLifter();
        OI.controlToteLifter();
        Sensor.monitor();
    }
    
}
