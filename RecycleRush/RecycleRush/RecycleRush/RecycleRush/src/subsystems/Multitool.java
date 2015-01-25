package subsystems;

import org.usfirst.frc.team293.SpikeLibrary.SpikeButton;
import org.usfirst.frc.team293.robot.Ports;


import edu.wpi.first.wpilibj.Talon;


public class Multitool {

	 private static final Talon multitoolTalon=new Talon(Ports.multitool);
	
	 public static void ControlMultitool(SpikeButton multitoolupbutton, SpikeButton multitoolstopbutton, SpikeButton multitooldownbutton){
		{
			 
			 if (multitoolupbutton.get()) {
				 
				 multitoolTalon.set(.3);
		    	} else if (multitooldownbutton.get()) {
		    		multitoolTalon.set(-.3);
		    	}
		    	else if (multitoolstopbutton.get()){
		    		multitoolTalon.set(0);
		    	}
			
		 }
}

}
