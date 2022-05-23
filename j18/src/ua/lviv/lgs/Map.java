package ua.lviv.lgs;


import java.util.*;
import java.util.Map.Entry;

@SuppressWarnings("resource")
public class Map {
	public HashMap<String, Integer> addNewObj(HashMap<String, Integer> hm) {
		System.out.println("Enter key: ");
		
		Scanner sc = new Scanner(System.in);  											// Scanner
		String key = sc.next();
		
		System.out.println("Enter value: ");
		Scanner sc2 = new Scanner(System.in);  											// Scanner
		Integer value = sc2.nextInt();
		
		hm.put(key, value);
		
		return hm;
	}
	
	public HashMap<String, Integer> removeByKey(HashMap<String, Integer> hm) {
		System.out.println("Enter the value you want to remove: ");
		Scanner sc = new Scanner(System.in);  											// Scanner
		String KeyToRemove = sc.next();
		
		hm.remove(KeyToRemove);
		
		return hm;
	}
	
	@SuppressWarnings("unused")
	public HashMap<String, Integer> removeByValue(HashMap<String, Integer> hm) {
			System.out.println("Enter the value you want to remove: ");
			Scanner sc = new Scanner(System.in);  											// Scanner
			Integer valueToRemove = sc.nextInt();
			
			Set<Integer> values = new HashSet<Integer>();
			for (Entry<String, Integer> entry : hm.entrySet()) {
				if (valueToRemove.equals(entry.getValue())) {
					hm.remove(entry.getKey(), entry.getValue());
				}
			}
			return hm;
		}
	
	public void showKeysSet(HashMap<String, Integer> hm) {
		Set<String> keysSet = new HashSet<>();
		
		Iterator<Entry<String, Integer>> iterator = hm.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			keysSet.add(next.getKey());
		}
		
		System.out.println(keysSet.toString());
	}
	
	public void showListOfValues(HashMap<String, Integer> hm) {
		List<Integer> valueList = new LinkedList<>();
		
		Iterator<Entry<String, Integer>> iterator = hm.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<String, Integer>  next = iterator.next();
			valueList.add(next.getValue());
		}
		System.out.println("Values List :" + " " + valueList);
	}
	
	public void showMap (HashMap<String, Integer> hm) {
		System.out.println(hm.toString());
	}
}


