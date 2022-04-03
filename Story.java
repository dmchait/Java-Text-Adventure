package package1;

import package2.Item_BoltCutter;
import package2.Item_ClosetKey;
import package2.Item_FirstAid;
import package2.Item_Hammer;

public class Story {
	Game game;
	UI ui;
	VisibilityManager vm;
	Player player = new Player();
	
	public Story(Game g, UI userInterface, VisibilityManager vManager) {
		
		game = g;
		ui = userInterface;
		vm = vManager;
	}
	
	public void defaultSetup() {
		// Player starts game with a necklace and no injuries
		ui.itemNameLabel.setText("");
		player.injury = false;
		ui.injuryNameLabel.setText("");
	}
	
	public void selectPosition(String nextPosition) {
		
		switch(nextPosition){
		case "searchCellar": searchCellar(); break;
		case "jumpToLadder": jumpToLadder(); break;
		case "approachFence": approachFence(); break;
		case "inspectHouse": inspectHouse(); break;
		case "shakeGate": shakeGate(); break;
		case "climbFence": climbFence(); break;
		case "frontDoor": frontDoor(); break;
		case "window": window(); break;
		case "backDoor": backDoor(); break;
		case "forceHandle": forceHandle(); break;
		case "exploreHouse": exploreHouse(); break;
		case "tryDoor": tryDoor(); break;
		case "searchPantry": searchPantry(); break;
		case "searchDiningRoom": searchDiningRoom(); break;
		case "searchLivingRoom": searchLivingRoom(); break;
		case "openFDoor": openFDoor(); break;
		case "searchCompartment": searchCompartment(); break;
		case "closet": closet(); break;
		case "unlockCloset": unlockCloset(); break;
		case "unlockGate": unlockGate(); break;
		case "breakWindow": breakWindow(); break;
		case "reachShelf": reachShelf(); break;
		case "upstairs": upstairs(); break;
		case "searchBathroom": searchBathroom(); break;
		case "tryBedroom": tryBedroom(); break;
		case "searchStudy": searchStudy(); break;
		case "readNote": readNote(); break;
		}
	}
	
	public void Cellar() {
		ui.mainTextArea.setText("You wake up in a cold, dark cellar. \nYou feel your stomach rumbling and notice your mouth is dry."
				+ "\nAs you get your bearings, you notice a broken ladder that leads up to a trap door."
				+ "\n\nWhat do you do?");
		
		ui.choice1.setText("Search the cellar");
		ui.choice2.setText("Jump");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "searchCellar";
		game.nextPosition2 = "jumpToLadder";
	}
	
	public void searchCellar() {
		ui.mainTextArea.setText("While searching the cellar you found a stool. \n You use the stool to reach what remains of the ladder. \n"
				+ "When you reach the top, you push on the trap door to find it is unlocked and hoist yourself out of the cellar."
				+ "\nYou are now in the backyard and see a large house and barbed wire fence in front of you. "
				+ "\n\nWhat do you do?");
		ui.choice1.setText("Approach the fence");
		ui.choice2.setText("Inspect the house");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "approachFence";
		game.nextPosition2 = "inspectHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	
	public void jumpToLadder() {
		ui.mainTextArea.setText("No matter how many times you jumped, you could not reach what remains of the ladder. "
				+ "\n You are now exhausted. \n\nWhat do you do?");
		ui.choice1.setText("Search the Cellar");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "searchCellar";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	
	public void approachFence() {
		ui.mainTextArea.setText("As you approach the fence you peer through it. \n You cannot see a car in the driveway."
				+ "\n\n What do you do?");
		ui.choice1.setText("Shake the Gate");
		ui.choice2.setText("Climb the fence");
		ui.choice3.setText("Inspect the House");
		ui.choice4.setText("");
		
		game.nextPosition1 = "shakeGate";
		game.nextPosition2 = "climbFence";
		game.nextPosition3 = "inspectHouse";
		game.nextPosition4 = "";
		}
	
	public void shakeGate() {
		ui.mainTextArea.setText("Aside from some rattling, the fence is deeply rooted in the ground and will not move."
				+ "You notice a large padlock on the gate, but do not possess a way to remove it."
				+ "\n\n What do you do?");
		ui.choice1.setText("Climb the Fence");
		ui.choice2.setText("Inspect the House");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "climbFence";
		game.nextPosition2 = "inspectHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	
	public void climbFence() {
		ui.mainTextArea.setText("Your attempt to cross the fence caused your left leg to get snagged on one of the barbs."
				+ "\nAfter snagging your leg, you fall from the fence. You tear off a sleeve to act as a tourniquet for your injury."
				+ "\n(You are now limping and will make more noise when you walk)"
				+ "\n\nWhat do you do?");
		ui.choice1.setText("Shake Gate");
		ui.choice2.setText("Inspect the House");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		player.injury = true;
		ui.injuryNameLabel.setText("Leg Gash");
		
		game.nextPosition1 = "shakeGate";
		game.nextPosition2 = "inspectHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void inspectHouse() {
		ui.mainTextArea.setText("After inspecting the house, you notice three possible points of entry:"
				+ "\nA back door, A front door, and a window"
				+ "\n\nWhat do you do?");
		ui.choice1.setText("Try Back door");
		ui.choice2.setText("Try Front door");
		ui.choice3.setText("Try Window");
		ui.choice4.setText("<");
		
		game.nextPosition1 = "backDoor";
		game.nextPosition2 = "frontDoor";
		game.nextPosition3 = "window";
		game.nextPosition4 = "approachFence";
	}
	public void backDoor() {
		ui.mainTextArea.setText("Looking through the glass, it appears the back door leads to the kitchen."
				+ "\n The knob is caked with rust and doesn't move."
				+ "\n\nWhat do you do?");
		ui.choice1.setText("Force Handle");
		ui.choice2.setText("<");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "forceHandle";
		game.nextPosition2 = "inspectHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	
	public void forceHandle() {
		ui.mainTextArea.setText("You force the handle and the door has opened."
				+ "\nAs you look around the kitchen, you notice a pair of latex gloves and bleach on the counter."
				+"\n You hear the drip of water falling from the faucet."
				+"\n\nWhat do you do?");
		ui.choice1.setText("Search Pantry");
		ui.choice2.setText("Explore House");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "searchPantry";
		game.nextPosition2 = "exploreHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void frontDoor() {
		ui.mainTextArea.setText("You approach the front door of the house."
				+ "\n\nWhat do you do?");
		ui.choice1.setText("Try to open it");
		ui.choice2.setText("<");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "tryDoor";
		game.nextPosition2 = "inspectHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void tryDoor() {
		ui.mainTextArea.setText("The knob moves, but the door won't budge. It seems that something is barring it from the other side."
				+ "\n\nWhat do you do?");
		ui.choice1.setText("<");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "inspectHouse";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void window() {
		ui.mainTextArea.setText("The brown shutters have seen better days. Fortunately, it looks large enough for \n"
				+ "you to fit through. Your attempts to push it open are in vain. \n\n"
				+ "What do you do?");
		ui.choice1.setText("Break window");
		ui.choice2.setText("<");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "breakWindow";
		game.nextPosition2 = "inspectHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
		
	}
	public void breakWindow() {
		ui.mainTextArea.setText("After some searching, you found a rock. You can now break the window."
				+"\n\nDo you want to break the window?");
		ui.choice1.setText("Yes");
		ui.choice2.setText("No");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "exploreHouse";
		game.nextPosition2 = "inspectHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void searchPantry() {
		ui.mainTextArea.setText("The pantry seems to have nothing but canned beans and bread.");
		ui.choice1.setText("Reach for bread");
		ui.choice2.setText("Explore House");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "reachShelf";
		game.nextPosition2 = "exploreHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void reachShelf() {
		ui.mainTextArea.setText("While reaching for the bread, a half empty bottle of oil falls."
				+ "\nAside from a bruise and headache you are fine. Unfortunately, the bread is moldy."
				+ "\n\nWhat do you do?");
		ui.choice1.setText("<");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "exploreHouse";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void exploreHouse() {
		ui.mainTextArea.setText("As you enter the hall, you notice a strong smell. Left of the kitchen lies a dining room and closet."
				+ "\nDown the right is the living room. One of the rooms is bound to have something to escape." 
				+ "\n\nWhere would you like to search?");
		ui.choice1.setText("Dining Room");
		ui.choice2.setText("Living Room");
		ui.choice3.setText("Kitchen Pantry");
		ui.choice4.setText("Closet");
		
		game.nextPosition1 = "searchDiningRoom";
		game.nextPosition2 = "searchLivingRoom";
		game.nextPosition3 = "searchPantry";
		game.nextPosition4 = "closet";
	}
	public void searchLivingRoom() {
		ui.mainTextArea.setText("Upon entering the living room, you notice boards barring the door. You will need to find something to remove them."
				+"\nThere is a flight of stairs in the left corner leading to the second floor, but nothing else of use."
				+ "\n\nWhat do you do?");
		ui.choice1.setText("Explore upstairs");
		ui.choice2.setText("<");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "upstairs";
		game.nextPosition2 = "exploreHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void searchDiningRoom() {
		ui.mainTextArea.setText("The smell has gotten stronger, it seems to be coming from the closet across the hall."
				+ "\nSearching the dining room you find a note on the table and a hidden compartment in the china cabinet."
				+ "\nThe note may give you some clue as to who brought you here and why."
				+ "\n\nWhat do you do?");
		ui.choice1.setText("Read Note");
		ui.choice2.setText("Check hidden compartment");
		ui.choice3.setText("<");
		ui.choice4.setText("");
		
		game.nextPosition1 = "readNote";
		game.nextPosition2 = "searchCompartment";
		game.nextPosition3 = "exploreHouse";
		game.nextPosition4 = "";
	}
	public void readNote() {
		ui.mainTextArea.setText("The note reads: "
				+ "\nTom, How are you? We have not heard from you in some time."
				+ "\nPlease write us back soon, we love you."
				+ "\n\nP.S. Did you ever make up with that friend of yours?"
				+ "\nYour loving family"
				+ "\n\n(you have a sinking feeling about the smell from across the hall and why you're here)");
		
		ui.choice1.setText("Check hidden compartment");
		ui.choice2.setText("<");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "searchCompartment";
		game.nextPosition2 = "exploreHouse";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void searchCompartment() {
		ui.mainTextArea.setText("You open the hidden compartment and find a hammer!."
				+"\n(You can now remove the boards from the front door!");
		ui.choice1.setText("Unbarricade front door");
		ui.choice2.setVisible(false);
		ui.choice3.setVisible(false);
		ui.choice4.setVisible(false);
		
		player.currentItem = new Item_Hammer();
		ui.itemNameLabel.setText(player.currentItem.name);
		
		game.nextPosition1 = "openFDoor";
	}
	public void openFDoor() { //unbarricade the front door and win
		ui.mainTextArea.setText("You used the " +player.currentItem.name + " to remove the barricade and escaped the house!"
				+ "\n\nCoNgRaTuLaTiOnS! YoU'rE fReE! [End]");
		ui.choiceButtonPanel.setVisible(false);
		ui.exitButtonPanel.setVisible(true);
	}
	
	public void closet() {
		ui.mainTextArea.setText("The closet is locked. (You need the key) The pundgent smell is most potent here.");
		ui.choice1.setText("<");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "exploreHouse";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void upstairs() {
		ui.mainTextArea.setText("As you climb the stairs you notice a small hall with three doors."
				+"\n\nWhat do you do?");
		ui.choice1.setText("Left Door");
		ui.choice2.setText("Right Door");
		ui.choice3.setText("Middle Door");
		ui.choice4.setText("Downstairs");
		
		game.nextPosition1 = "searchBathroom";
		game.nextPosition2 = "searchStudy";
		game.nextPosition3 = "tryBedroom";
		game.nextPosition4 = "searchLivingRoom";
	}
	public void searchBathroom() {		
		if (player.injury != false) {//only true if player climbed fence
			player.currentItem = new Item_FirstAid();
			ui.itemNameLabel.setText(player.currentItem.name);
			ui.mainTextArea.setText("You found a  first aid kit in the bathroom."
					+ "\nYou used the " + player.currentItem.name + " to take care of your injury."
					+"\nYour injury is healed!");
			ui.injuryNameLabel.setText("None");
			player.injury = false;
		}
		else if (player.injury != true){
			ui.mainTextArea.setText("Opening the door, you find yourself in a bathroom."
					+ "\nThere is a first aid kit in the medicine cabinet. \n\nWhat do you do?");
		}
		ui.choice1.setText("<");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "upstairs";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void tryBedroom() {
		ui.mainTextArea.setText("You try the middle door, but it is locked."
				+ "\n\nWhat will you do?");
		ui.choice1.setText("<");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		
		game.nextPosition1 = "upstairs";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void searchStudy() {
		player.currentItem = new Item_ClosetKey();
		ui.itemNameLabel.setText(player.currentItem.name);
		ui.mainTextArea.setText("The room appears to be a study. There are books and papers everywhere."
				+ "\n\nAfter searching for several hours you found the " +player.currentItem.name + " .");
		
		ui.choice1.setText("Back to closet");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "unlockCloset";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void unlockCloset() {
		ui.mainTextArea.setText("You used the " + player.currentItem.name + " to unlock the closet."
				+ "\nYou see a black contractor bag that is the source of the smell."
				+ "\n\n (You obtained bolt cutters)");
		
		player.currentItem = new Item_BoltCutter();
		ui.itemNameLabel.setText(player.currentItem.name);
		
		ui.choice1.setText("Unlock Gate");
		ui.choice2.setVisible(false);
		ui.choice3.setVisible(false);
		ui.choice4.setVisible(false);
		
		game.nextPosition1 = "unlockGate";
	}
	public void unlockGate() { //win the game by unlocking gate
		ui.mainTextArea.setText("You used the " + player.currentItem.name + " to remove the padlock and escape the house!"
				+"\n\nCoNgRaTuLaTiOnS! YoU'rE fReE! [End]");
		ui.choiceButtonPanel.setVisible(false);
		ui.exitButtonPanel.setVisible(true);
	}
}
