package org.usfirst.frc.team293.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.DigitalInput;

public class Sensor {
	private static final PowerDistributionPanel pdp=new PowerDistributionPanel();
	private static final DigitalInput 
			toteSensor1 = new DigitalInput(Ports.toteSensor1),
			toteSensor2 = new DigitalInput(Ports.toteSensor2);
	
	
	public static void monitor(){
		SmartDashboard.putNumber("current0", pdp.getCurrent(0));
		SmartDashboard.putNumber("current1", pdp.getCurrent(1));
		SmartDashboard.putNumber("current9", pdp.getCurrent(9));
		SmartDashboard.putNumber("current10", pdp.getCurrent(10));
		SmartDashboard.putNumber("current11", pdp.getCurrent(11));
		SmartDashboard.putBoolean("toteSensor1", toteSensor1.get());
		SmartDashboard.putBoolean("toteSensor2", toteSensor2.get());
	}
}
