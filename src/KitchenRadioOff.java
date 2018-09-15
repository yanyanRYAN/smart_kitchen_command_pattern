
public class KitchenRadioOff implements Command {
	
	KitchenRadio kitchenRadio;
	
	public KitchenRadioOff(KitchenRadio kitchenRadio) {
		this.kitchenRadio = kitchenRadio;
	}

	
	public void execute() {
		// TODO Auto-generated method stub
		kitchenRadio.off();
	}
}
