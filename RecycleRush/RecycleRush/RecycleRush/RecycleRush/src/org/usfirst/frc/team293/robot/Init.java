package org.usfirst.frc.team293.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import autonomous.*;

public class Init {
	

	public static final Object setUp(){
		DriverStation LCD = DriverStation.getInstance();
        SendableChooser autonomousChooser = new SendableChooser();
        SendableChooser colorChooser = new SendableChooser();
        String[] autonomiNames;
        //String[] colorNames;
        Auto[] autonomi;
        Auto selectedAuto;
        autonomiNames = new String[]{"Auto"};

        //colorNames = new String[]{"BLUE", "RED"};

        autonomi = new Auto[]{};
        for (int i = 0; i < autonomiNames.length; ++i) {
            autonomousChooser.addObject(autonomiNames[i], autonomi[i]);
        }
        SmartDashboard.putData("Which Autonomous?", autonomousChooser);

        /*for (int i = 0; i < colorNames.length; ++i) {
            colorChooser.addObject(colorNames[i], colorNames[i]);
        }
        SmartDashboard.putData("Which Allaince Color?", colorChooser);*/
        
        return autonomousChooser.getSelected();
	}
}
