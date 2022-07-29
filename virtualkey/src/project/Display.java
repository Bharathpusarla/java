package project;
import java.io.IOException;
import java.util.Scanner;


public class Display
{
	
	Scanner scan = new Scanner(System.in);
	Funtionality fun = new Funtionality();
	
	public void Welcome() {
		System.out.println("*************************************************");
		System.out.println("         VIRTUAL KEY REPOSISTRY         ");
		System.out.println("*************************************************");
		System.out.println("*      DEVELOPED BY PUSARLA BHARATH      *");
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.println("\n\n");
		
		
	}
	
	public void exitScreen() {
		
		System.out.println("*    THANK YOU FOR VISITING        *");
		
		
	}
	
	public void mainMenuOptions() {
		
		System.out.println("            MAIN MENU              ");
		System.out.println("");
		System.out.println(" Select any one of the following:  ");
	    System.out.println("   1 - List All Files              ");
	    System.out.println("   2 - More Options                ");
	    System.out.println("   3 - Exit                        ");
	    System.out.println("");
	    System.out.println("Enter your choice : ");
	}
	
	public void subMenuOptions() {
		
		System.out.println("            SUB MENU               ");
		System.out.println("");
		System.out.println(" Select any one of the following:  ");
	    System.out.println("   1 - Add a file                  ");
	    System.out.println("   2 - Delete a file               ");
	    System.out.println("   3 - Search a file               ");
	    System.out.println("   4 - Go Back                     ");
	    System.out.println("");
	    System.out.println("Enter your choice : ");
		
	}
	
	public void mainMenu() {
		
		int choice = 0;
		char decision = 0;
		do {
			
			mainMenuOptions();
			
			try {
				choice = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("\nInvalid Input ");
				mainMenu();
			}
			
			
			switch (choice) {
			
			case 1:
					System.out.println();
					try {
						fun.listAllFiles(Main.path);
					}catch(NullPointerException e) {
						System.out.println(e.getMessage());
					}catch(IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
					
			case 2: 
					System.out.println();
					subMenu();
					break;
					
			case 3: 
					System.out.println("\n Are you sure you want to exit ? ");
					System.out.println("  (Y) ==> Yes    (N) ==> No        ");
					decision =  scan.nextLine().toUpperCase().charAt(0);
					if(decision == 'Y') {
						System.out.println("\n");
						exitScreen();
						System.exit(1);
					}else if(decision == 'N') {
						System.out.println("\n");
						mainMenu();
					}else {
						System.out.println("\nInvalid Input");
						mainMenu();
					}
					
					
			default:
					System.out.println("\nInvalid Input\n");
					mainMenu();
				
			}
			
			
		}while(true);
		
	}
	
	
	public void subMenu() {
		String file = null;
		String fileName = null;
		int choice = 0;
		
		do {
			
			subMenuOptions();
			
			try {
				choice = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input");
				subMenu();
			}
			
			
			switch (choice) {
			case 1: 
					System.out.println(" Adding a File...");
					System.out.println("Please enter a file name : ");
					file = scan.nextLine();
					fileName = file.trim();
					try {
						fun.createNewFile(Main.path, fileName);
					}catch(NullPointerException e) {
						System.out.println(e.getMessage());
					}catch(IOException e) {
						System.out.println("Please try again...");
					}catch(Exception e) {
						System.out.println("Please try again...");
					}
					break;
					
			case 2: 
					System.out.println("\n==> Deleting a File...");
					System.out.println("Please enter a file name to Delete : ");
					file = scan.nextLine();
					fileName = file.trim();
					try {
						fun.deleteFile(Main.path, fileName);
					}catch(NullPointerException e) {
						System.out.println(e.getMessage());
					}catch(IOException e) {
						System.out.println("Please try again...");
					}catch(Exception e) {
						System.out.println("Please try again...");
					}
		
					break;
					
			case 3: 
					System.out.println("Searching a File...");
					System.out.println("Please enter a file name to Search : ");
					file = scan.nextLine();
					fileName = file.trim();
					try {
						fun.searchFile(Main.path, fileName);
					}catch(NullPointerException e) {
						System.out.println(e.getMessage());
					}catch(IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
			case 4: mainMenu();
					break;
					
			default:
				System.out.println("Invalid Input");
				subMenu();
				
			}
			
		file = null;
		fileName = null;
			
		}while(true);
		
	}
	
}
