
public class ExhaustFansOff implements Command {
	
	ExhaustFans exhaustFans;
	
	public ExhaustFansOff(ExhaustFans exhaustFans) {
		this.exhaustFans = exhaustFans;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		exhaustFans.off();
		
	}



}
