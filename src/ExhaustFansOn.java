
public class ExhaustFansOn implements Command {

	ExhaustFans exhaustFans;
	
	public ExhaustFansOn(ExhaustFans exhaustFans) {
		this.exhaustFans = exhaustFans;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		exhaustFans.on();
	}

}
