package subsystems;

import org.usfirst.frc.team293.SpikeLibrary.SpikeButton;
import org.usfirst.frc.team293.robot.Ports;


import edu.wpi.first.wpilibj.Talon;


public class Multitool {

	 private static final Talon multitoolTalon=new Talon(Ports.multitool);
	
	 public static void ControlMultitool(SpikeButton multitoolupbutton, SpikeButton multitoolstopbutton, SpikeButton multitooldownbutton){
		{
			double speed = 0;
			 if (multitoolupbutton.get()) {
				 speed=.2;
				 multitoolTalon.set(.2);
		    	} else if (multitooldownbutton.get()) {
		    		speed=-.2;
		    		multitoolTalon.set(-.2);
		    	}
		    	
		    		multitoolTalon.set(speed);
		    	
			
		 }
}

}
