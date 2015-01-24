package org.usfirst.frc.team293.robot;

import edu.wpi.first.wpilibj.Joystick;
import subsystems.*;

import org.usfirst.frc.team293.SpikeLibrary.SpikeButton;

public class OI {
	public static final Joystick
			leftJoystick = new Joystick(Ports.leftJoystick),
			rightJoystick = new Joystick(Ports.rightJoystick),
			gamepad = new Joystick(Ports.gamepad);
	private static final SpikeButton toteButton = new SpikeButton(leftJoystick, Ports.joyTrigger);
	private static final SpikeButton doorButton = new SpikeButton(gamepad, Ports.B);
	private static final SpikeButton canUpButton = new SpikeButton(gamepad, Ports.rightBumper);
	private static final SpikeButton canDownButton = new SpikeButton(gamepad, Ports.leftBumper);

	public static void controlDrive() {
        DriveTrain.adjustedDrive(leftJoystick.getY(), rightJoystick.getY());
    }
    
    
    public static void controlToteLifter() {
    	ToteLifter.move(toteButton.isToggled());
    }
    
    public static void controlCanLifter() {
    	double speed = 0;
    	if (canUpButton.get()) {
    		speed=0.7;
    	} else if (canDownButton.get()) {
    		speed=-0.7;
    	}
    	CanLifter.move(speed);
    }
    
    public static void controlDoors() {
    	Doors.move(doorButton.isToggled());
    }
}
