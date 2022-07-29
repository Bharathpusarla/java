package virtualkey;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n**************************************\n");
        System.out.println("\t   Welcome to TheDesk \n");
        System.out.println("\t    VirtualKey  Repositry\n");
        System.out.println("\t    Done by pusarla Bharath\n");
        
        System.out.println("**************************************");

        optionsSelection();
    }
    @SuppressWarnings("unchecked")
	private static void optionsSelection() {
    	ArrayList  a = new ArrayList();
    	a.add("sum");
    	a.add("java");
    	a.add("rope");
    	a.add("dotnet");
    	a.add("simplilearn");
    	a.add("softskills");
    	a.add("addition");
    	a.add("not");
        String[] arr = {"1.List the files",
        		         "2.Features here ",
        		         "3.Close the application\n"};
        for(int  i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the option:");
            int  options =  sc.nextInt();
            for(int j=0;j<=arr.length;j++){
                if(options==j){
                    switch (options){
                        case 1:
                            System.out.println("The list the files are: ");
                            a.sort(null);
                            for(int i=0;i<a.size();i++)
                            {
                            	System.out.println(a.get(i));
                            }
                            optionsSelection();
                            break;
                        case 2:
                        	System.out.println(" Select any one of the following:  ");
                    	    System.out.println("   1 - Add a file                  ");
                    	    System.out.println("   2 - Delete a file               ");
                    	    System.out.println("   3 - Search a file               ");
                    	    System.out.println("   4 - Go Back                     ");
                    	    System.out.println("enter an option");
                    	   int op = sc.nextInt();
                    	   for (int k=1;k<=4;k++) {
                    		   if(op==k) {
                    			   switch (op) {
                    			   case 1:
                    				   System.out.println("Enter file name to add: ");
                    				   String s = sc.next();
                    				   a.add(s);
                    				   a.sort(null);
                    				   System.out.println("File added sucessfully! ");
                    				   for(int i=0;i<a.size();i++)
                                       {
                                       	System.out.println(a.get(i));
                                       }
                    				   optionsSelection();
                    				   break;
                    			   case 2:
                    				   System.out.println("Enter file name to delete: ");
                    				   String u = sc.next();
                    				   a.remove(u);
                    				   a.sort(null);
                    				   System.out.println("file deleted sucessfully! ");
                    				   for(int i=0;i<a.size();i++)
                                       {
                                       	System.out.println(a.get(i));
                                       }
                    				   break;
                    			   case 3:
                    				   System.out.println("Enter file name to search: ");
                    				   String v = sc.next();
                    				   int l = a.indexOf(v);
                    				   System.out.println("File is located at:"+l);
                    				   break;
                    				   
                    			   case 4:
                    				   optionsSelection();
                    				   break;
                    			   default:
                                       System.out.println("You have made an invalid choice!");
                                       break;   
                    			   }
                    			   
                    		   }
                 
                    	   }
                            break;
                        case 3:
                            System.out.println("exit");
                            break;
    
                    }
                
            }
        }
            
            
    }
}
