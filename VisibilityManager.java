package package1;
public class VisibilityManager {

	UI ui;
	
	public VisibilityManager(UI userInterface) {
		
		ui = userInterface;
	}

	public void showTitleScreen() {
		// TODO Auto-generated method stub
		
		// show title screen
		ui.titleNamePanel.setVisible(true);
		ui.startButtonPanel.setVisible(true);
		ui.exitButtonPanel.setVisible(false);
						
		// hide game screen
		ui.mainTextPanel.setVisible(false);
		ui.choiceButtonPanel.setVisible(false);
		ui.playerPanel.setVisible(false);
	}
	public void titleToGame() {
		
		// hide title screen
		ui.titleNamePanel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
		ui.exitButtonPanel.setVisible(false);
		
		// show game screen
		ui.mainTextPanel.setVisible(true);
		ui.choiceButtonPanel.setVisible(true);
		ui.playerPanel.setVisible(true);
	}
}
