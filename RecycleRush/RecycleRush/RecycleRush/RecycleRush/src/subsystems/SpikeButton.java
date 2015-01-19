package subsystems;

public class SpikeButton {
	private static boolean lastButton,
		buttonState,
		currentState;
	public SpikeButton(){
		this.lastButton = false;
		this.buttonState=true;
		this.currentState=false;
	}
	public static boolean buttonState(this,boolean bool){
		this.buttonState = bool;
		if (this.buttonState && !this.lastButton) {
			this.currentState= !this.currentState;
		}
		this.lastButton=this.buttonState;
		return this.currentState;
	}
}
