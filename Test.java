import file_based_library.*;

import java.util.Scanner;

//import file_based_library.fileDatabase;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
		
		fileDatabase obj=fileDatabase.getInstance();
		
		
		
		Scanner in = new Scanner(System.in);
	 
		boolean continueOperation=true;
		System.out.println("CONTINUE ( YES / NO )\n");
		String action=in.nextLine();
		while(continueOperation) {
			
			
			if(action.equalsIgnoreCase("yes")) {
				System.out.println("AVAILABLE OPERATIONS TO PERFORM\n\n");
				System.out.println("1.CREATE DATABASE\n");
				System.out.println("2.READ FROM DATABASE\n");
				System.out.println("3.DELETE FROM DATABASE\n");
				System.out.println("4.EXIT\n");
				System.out.println("==========================================\n");
				System.out.println("ENTER NUMBER TO PERFORM OPERATION:\n");
				
				int operationNo=Integer.parseInt(in.nextLine());
				switch(operationNo) {
				case 1:
					obj.createDatabase();
					break;
				case 2:
					obj.readFromDatabase();
					break;
				case 3:
					obj.deleteFromDatabase();
					break;
				case 4:
					break;
				default:
					System.out.println("INVALID NUMBER\n");
					break;
				}
				
			}
			else {
				continueOperation=false;}
			
			System.out.println("CONTINUE ( YES / NO )\n");
			action=in.nextLine();
			
		

	}

}}

