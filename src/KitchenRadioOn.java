
public class KitchenRadioOn implements Command {

	KitchenRadio kitchenRadio;
	
	public KitchenRadioOn(KitchenRadio kitchenRadio) {
		this.kitchenRadio = kitchenRadio;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		kitchenRadio.on();
	}

	
	

}
