/*package org.usfirst.frc.team293.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import autonomous.*;

public class Init {
	

	public static final Object setUp(){
        SendableChooser autonomousChooser = new SendableChooser();
        String[] autonomiNames;
        Auto[] autonomi;
        autonomiNames = new String[]{"Auto"};

        //colorNames = new String[]{"BLUE", "RED"};

        autonomi = new Auto[]{};
        for (int i = 0; i < autonomiNames.length; ++i) {
            autonomousChooser.addObject(autonomiNames[i], autonomi[i]);
        }
        SmartDashboard.putData("Which Autonomous?", autonomousChooser);
        return autonomousChooser.getSelected();
	}
}
*/