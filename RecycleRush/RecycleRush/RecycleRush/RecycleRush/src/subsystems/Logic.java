package subsystems;

public class Logic {
	private static boolean
		lastButton = false,
		buttonState=true,
		currentState=false;
	
	public static boolean buttonState(boolean bool){
		buttonState = bool;
		if (buttonState && !lastButton) {
			currentState= !currentState;
		}
		lastButton=buttonState;
		return currentState;
	}
}
