package subsystems;

import org.usfirst.frc.team293.SpikeLibrary.SpikeButton;
import org.usfirst.frc.team293.robot.Ports;


import edu.wpi.first.wpilibj.Talon;


public class Multitool {

	 private static final Talon multitoolTalon=new Talon(Ports.multitool);
	
	 public static void ControlMultitool(SpikeButton multitoolupbutton, SpikeButton multitoolstopbutton, SpikeButton multitooldownbutton){
		{
			double speed = .2;
			 if (multitoolupbutton.get()) {
				 multitoolTalon.set(speed);
		    	} else if (multitooldownbutton.get()) {
		    		speed=-speed;
		    		multitoolTalon.set(speed);
		    	}
		    		multitoolTalon.set(speed);
		    	
			
		 }
}

}
