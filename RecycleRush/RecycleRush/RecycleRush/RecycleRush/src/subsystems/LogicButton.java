package subsystems;

public class LogicButton {
	public boolean
		lastButton,
		buttonState,
		currentState;
	
	public LogicButton() {
		lastButton = false;
		buttonState = true;
		currentState = false;
	}
	
	public boolean buttonState(boolean bool){
		buttonState = bool;
		if (buttonState && !lastButton) {
			currentState= !currentState;
		}
		lastButton=buttonState;
		return currentState;
	}
}
