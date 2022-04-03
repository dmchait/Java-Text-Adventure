package package1;
/**
 * @author dchtk
 * Description: Text adventure game with GUI. Player decides between set choices to continue.
 */

public class Game{
	
	// class instantiation
	UI ui = new UI();
	ChoiceHandler cHandler = new ChoiceHandler(this);
	VisibilityManager vm = new VisibilityManager(ui);
	Story story = new Story(this, ui, vm);
	
	String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
	
	public static void main(String[] args) {
		new Game();
		
	}
	
	public Game() {
		ui.createUI(cHandler);
		vm.showTitleScreen();
		story.defaultSetup();
	}
}

