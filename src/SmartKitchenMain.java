//Ryan Ecarma
public class SmartKitchenMain {
	
	public static void logo() throws InterruptedException {
		System.out.println("\n");
		System.out.println("88        88                   88                                  ");
		Thread.sleep(500);
		System.out.println("88        \"\"   ,d              88                                  ");
		Thread.sleep(500);
		System.out.println("88             88              88                                  ");
		Thread.sleep(500);
		System.out.println("88   ,d8  88 MM88MMM ,adPPYba, 88,dPPYba,   ,adPPYba, 8b,dPPYba,   ");
		Thread.sleep(500);
		System.out.println("88 ,a8\"   88   88   a8\"     \"\" 88P'    \"8a a8P_____88 88P'   `\"8a  ");
		Thread.sleep(500);
		System.out.println("8888[     88   88   8b         88       88 8PP\"\"\"\"\"\"\" 88       88  ");
		Thread.sleep(500);
		System.out.println("88`\"Yba,  88   88,  \"8a,   ,aa 88       88 \"8b,   ,aa 88       88  ");
		Thread.sleep(500);
		System.out.println("88   `Y8a 88   \"Y888 `\"Ybbd8\"' 88       88  `\"Ybbd8\"' 88       88  ");
		Thread.sleep(500);
		System.out.println("\n");
		System.out.println("*sparkle* A Fancy Schmancy Smart Kitchen *sparkle*\n");
		System.out.println("#############################################################################");
		System.out.println("\n");
		System.out.println("Intializing...\n");
		Thread.sleep(1200);
	}

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		logo();
		
		//Load in all the smartkitchen functions for On
		Lights lights = new Lights();
		LightsOn lightsOn = new LightsOn(lights);
		CommandHandler smartPad = new CommandHandler();
		ExhaustFans exhaustFans = new ExhaustFans();
		ExhaustFansOn exhaustFansOn = new ExhaustFansOn(exhaustFans);
		KitchenRadio kitchenRadio = new KitchenRadio();
		KitchenRadioOn kitchenRadioOn = new KitchenRadioOn(kitchenRadio);
		Oven oven = new Oven();
		OvenOn ovenOn = new OvenOn(oven);
		
		smartPad.setCommand(lightsOn);
		smartPad.commandExecute();
		Thread.sleep(250);
		smartPad.setCommand(exhaustFansOn);
		smartPad.commandExecute();
		Thread.sleep(250);
		smartPad.setCommand(kitchenRadioOn);
		smartPad.commandExecute();
		Thread.sleep(250);
		smartPad.setCommand(ovenOn);
		smartPad.commandExecute();
		
		
		
	}

}
