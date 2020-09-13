package ui;

import java.util.Scanner;

import model.Control;


public class Menu {

	public static final int EXIT_OPTION=4;
	
	public Scanner sc;
	public Control prototype;
	
	public Menu() {
	
		sc = new Scanner(System.in);
		prototype = new Control();
	}
	
	public void startMenu() {
		String m = getMenuText();
		int option;
		do {
			System.out.println(m);
			option = readOption();
			executeOperation(option);
		}while(option!=EXIT_OPTION);
	}
	
	private String getMenuText() {
		String m;
		m = "===============\n";
		m+= "    Menu\n";
		m+= "===============\n";
		m+= "1. \n";
		m+= "2. \n";
		m+= "3.\n";
		
		return m;
	}
	private int readOption() {
		int option;
		option= Integer.parseInt(sc.nextLine()); 
		return option;
	}
	
	private void executeOperation(int option) {
			
		switch(option) {
			
			
		default: break;
		}
	}
	
	private void exitProgram() {
		sc.close();
	}
	
	}


