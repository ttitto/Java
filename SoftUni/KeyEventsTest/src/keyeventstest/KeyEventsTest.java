package keyeventstest;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class KeyEventsTest {


	public static EventHandler<KeyEvent> keyEventHandler = new EventHandler<KeyEvent>(){

		public void handle(KeyEvent keyEvent) {
			if(keyEvent.getCode()==KeyCode.LEFT){
				//write here logic for left key pressed
				System.out.println("Left arrow pressed");
				//End logic
				
				keyEvent.consume();
			}
			
		}
		
	};

}
