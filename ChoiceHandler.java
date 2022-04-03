package package1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {

	Game game;
	
	public ChoiceHandler(Game g) {
		
		game = g;
	}
	
	public void actionPerformed(ActionEvent event) {
		String yourChoice = event.getActionCommand();
		
		
		switch(yourChoice) {
		case "start": game.vm.titleToGame(); game.story.Cellar(); break;
		case "choice1": game.story.selectPosition(game.nextPosition1); break;
		case "choice2": game.story.selectPosition(game.nextPosition2); break;
		case "choice3": game.story.selectPosition(game.nextPosition3); break;
		case "choice4": game.story.selectPosition(game.nextPosition4); break;
		case "exit": System.exit(0);
		}
	}
}
