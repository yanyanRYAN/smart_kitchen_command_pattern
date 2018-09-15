
public class LightsOff implements Command {

	Lights lights;
	
	public LightsOff(Lights lights) {
		this.lights = lights;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		lights.off();
	}

	
}
