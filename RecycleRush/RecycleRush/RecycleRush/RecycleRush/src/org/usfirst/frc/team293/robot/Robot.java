package org.usfirst.frc.team293.robot;
import edu.wpi.first.wpilibj.IterativeRobot;

import org.usfirst.frc.team293.robot.OI;

import autonomous.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


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
	
	SendableChooser autonomousChooser = new SendableChooser();
	String[] autonomiNames;
	Auto[] autonomi;
	Auto selectedAuto;
	
    public void robotInit() {
    	autonomousChooser.addObject("bin set", new BinSet());
    	autonomousChooser.addObject("bin & tote set", new BinToteSet());
    	autonomousChooser.addObject("bin set & tote stack", new BinToteStack());
    	autonomousChooser.addObject("robot set", new RobotSet());
    	autonomousChooser.addObject("tote set", new ToteSet());
    	autonomousChooser.addObject("tote stack", new ToteStack());
    	
    	SmartDashboard.putData("Which Autonomous?", autonomousChooser);
    	
    }
    
    public void autonomousInit() {
    	selectedAuto = (Auto) autonomousChooser.getSelected();
    	selectedAuto.init();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	if (Auto.autoTimer.get() < 15) {
    		SmartDashboard.putNumber("time", Auto.autoTimer.get());
    		selectedAuto.run();
    	}
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        OI.controlDrive();
        OI.controlCanLifter();
        OI.controlToteLifter();
        OI.controlDoors();
        OI.manualControlMultitool();
        OI.controlPDP();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        OI.controlDrive();
        OI.controlCanLifter();
        OI.controlToteLifter();
        OI.controlDoors();
        //PDP.monitor();
    }
    
}
