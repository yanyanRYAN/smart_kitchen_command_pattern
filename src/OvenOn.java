
public class OvenOn implements Command {

	Oven oven;
	
	public OvenOn (Oven oven) {
		this.oven = oven;
	}
	
	
	public void execute() {
		// TODO Auto-generated method stub
		oven.on();
	}

	
}
