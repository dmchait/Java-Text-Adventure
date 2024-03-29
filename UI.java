package package1;
import java.awt.*;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class UI {

	JFrame window;
	JPanel titleNamePanel, startButtonPanel, exitButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, itemNameLabel, itemLabel, injuryLabel, injuryNameLabel;
	JButton startButton, choice1, choice2, choice3, choice4, exitButton;
	JTextArea mainTextArea;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 65);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
	
	public void createUI(ChoiceHandler cHandler) {
		        
		// WINDOW
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		// TITLE SCREEN
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 500);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("IN COLD BLOOD");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.setFocusPainted(false);
		startButtonPanel.add(startButton);
		startButton.addActionListener(cHandler);
		startButton.setActionCommand("start");
		window.add(titleNamePanel);
		window.add(startButtonPanel);
		
		// GAME SCREEN
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		itemNameLabel = new JLabel();
		itemNameLabel.setBackground(Color.black);
		itemNameLabel.setForeground(Color.white);
		mainTextPanel.add(itemNameLabel);
		
		window.add(mainTextPanel);
		
		mainTextArea = new JTextArea("This is the main text area");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		window.add(choiceButtonPanel);
		
		choice1 = new JButton("choice1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(cHandler);
		choice1.setActionCommand("choice1");
		choiceButtonPanel.add(choice1);
		choice2 = new JButton("choice2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(cHandler);
		choice2.setActionCommand("choice2");
		choiceButtonPanel.add(choice2);
		choice3 = new JButton("choice3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(cHandler);
		choice3.setActionCommand("choice3");
		choiceButtonPanel.add(choice3);
		choice4 = new JButton("choice4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(cHandler);
		choice4.setActionCommand("choice4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
		window.add(playerPanel);
		
		itemLabel = new JLabel("Item:");
		itemLabel.setFont(normalFont);
		itemLabel.setForeground(Color.white);
		playerPanel.add(itemLabel);
		itemNameLabel = new JLabel();
		itemNameLabel.setForeground(Color.white);
		itemNameLabel.setFont(normalFont);
		playerPanel.add(itemNameLabel);
		injuryLabel = new JLabel("Injury:");
		injuryLabel.setFont(normalFont);
		injuryLabel.setForeground(Color.white);
		playerPanel.add(injuryLabel);
		injuryNameLabel = new JLabel();
		injuryNameLabel.setForeground(Color.white);
		injuryNameLabel.setFont(normalFont);
		playerPanel.add(injuryNameLabel);
		
		//Exit Screen (Game End)
		exitButtonPanel = new JPanel();
		exitButton = new JButton("EXIT");
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
		exitButtonPanel.setBounds(300, 350, 100, 50);
		exitButtonPanel.setBackground(Color.black);
		exitButton.addActionListener(cHandler);
		exitButton.setActionCommand("exit");
		exitButtonPanel.add(exitButton);
		window.add(exitButtonPanel);
		
		window.setVisible(true);
	}

}
