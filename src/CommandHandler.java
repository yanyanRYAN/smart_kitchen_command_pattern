
public class CommandHandler {
	
	Command button;
	
	public void setCommand(Command command) {
		button = command;
	}
	
	public void commandExecute() {
		button.execute();
	}

}
