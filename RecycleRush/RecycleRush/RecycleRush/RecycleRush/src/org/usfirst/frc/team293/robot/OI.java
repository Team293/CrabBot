package org.usfirst.frc.team293.robot;

import edu.wpi.first.wpilibj.Joystick;
import subsystems.*;

public class OI {
	public static final Joystick
			leftJoystick = new Joystick(Ports.leftJoystick),
			rightJoystick = new Joystick(Ports.rightJoystick),
			gamepad = new Joystick(Ports.gamepad);
	public static void controlDrive() {
        DriveTrain.tankDrive(leftJoystick.getY(), rightJoystick.getY());
    }
    
    
    public static void controlToteLifter() {
    	ToteLifter.move(rightJoystick.getRawButton(Ports.joyTrigger));
    }
    
    public static void controlSlurper() {
    	Slurper.slurp(gamepad.getRawAxis(Ports.leftStick)/2.5, gamepad.getRawAxis(Ports.rightStick)/2.5);
    	
    }

    public static void controlCanLifter() {
    	double speed = 0;
    	if (gamepad.getRawButton(Ports.rightBumper)) {
    		speed=0.7;
    	} else if (gamepad.getRawButton(Ports.leftBumper)) {
    		speed=-0.7;
    	}
    	CanLifter.move(speed);
    }
}
