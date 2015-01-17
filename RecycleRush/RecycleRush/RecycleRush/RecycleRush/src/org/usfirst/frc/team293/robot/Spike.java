
package org.usfirst.frc.team293.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.frc.team293.robot.OI;
import org.usfirst.frc.team293.robot.Init;
//import edu.wpi.first.wpilibj.smartdashboard.*;
//import edu.wpi.first.wpilibj.DriverStation;
//import autonomous.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Spike extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	Init.setUp();
    }

    /**
     * This function is called periodically during autonomous
     */
/*    public void autonomousInit(){
    	selectedAuto = (Auto) Init.autonomousChooser.getSelected();
        selectedAuto.init();
        Auto.hasRunAuto=false;
    }
*/    
    public void autonomousPeriodic() {
  //  	Auto.run();

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        OI.controlSlurper();
        OI.controlDrive();
        OI.controlCanLifter();
        OI.controlToteLifter();
        PDP.monitor();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	OI.controlSlurper();
        OI.controlDrive();
        OI.controlCanLifter();
        OI.controlToteLifter();
    }
    
}
