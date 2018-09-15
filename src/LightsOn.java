
public class LightsOn implements Command {
	
	Lights lights;
	
	public LightsOn(Lights lights) {
		this.lights = lights;
	}


	public void execute() {
		// TODO Auto-generated method stub
		lights.on();
	}
	
	
	
	
}
