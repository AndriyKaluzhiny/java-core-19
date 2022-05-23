package ua.lviv.lgs;

import java.util.HashMap;
import java.util.Scanner;

public class Application {
	public static void menu() {
		System.out.println("Enter 1 to add new object to map");
		System.out.println("Enter 2 to remove object from map by key");
		System.out.println("Enter 3 to remove object from map by value");
		System.out.println("Enter 4 to show set of keys");
		System.out.println("Enter 5 to show list of values");
		System.out.println("Enter 6 to show map");
		System.out.println("Enter 0 to exit");
	}
	
	 public static void main(String[] args) {
		 MyEntry entry = new MyEntry("qwe", 123);
		 HashMap<String, Integer> hm = entry.hm;
	
		 Map m = new Map();
		
		 while (true) {
			 menu();
			 @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			 int input = sc.nextInt();
			 
			 switch (input) {
			 	case 1:
			 		m.addNewObj(hm);
			 		break;
			 	case 2:
			 		m.removeByKey(hm);
			 		break;
			 	case 3:
			 		m.removeByValue(hm);
			 		break;
			 	case 4: 
			 		m.showKeysSet(hm);
			 		break;
			 	case 5:
			 		m.showListOfValues(hm);
			 		break;
			 	case 6: 
			 		m.showMap(hm);
			 		break;
			 	case 0:
			 		System.exit(1);
			 }
		 }
	}
}
