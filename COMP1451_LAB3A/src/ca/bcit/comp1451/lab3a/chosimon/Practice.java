package ca.bcit.comp1451.lab3a.chosimon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice {
	private String[][] provinces = new String[10][2];
	private HashMap<String, String> provincePair;
	
	public Practice() {
		provinces[0][0]="ab";
		provinces[1][0]="bc";
		provinces[2][0]="mb";
		provinces[3][0]="nb";
		provinces[4][0]="nl";
		provinces[5][0]="ns";
		provinces[6][0]="on";
		provinces[7][0]="pe";
		provinces[8][0]="qc";
		provinces[9][0]="sk";

		provinces[0][1]="alberta";
		provinces[1][1]="british columbia";
		provinces[2][1]="manitoba";
		provinces[3][1]="new brunswick";
		provinces[4][1]="newfoundland";
		provinces[5][1]="nova scotia";
		provinces[6][1]="ontario";
		provinces[7][1]="prince edward island";
		provinces[8][1]="quebec";
		provinces[9][1]="saskatchewan";
		
		for(int i = 0; i < provinces.length; i++) {
			System.out.println(provinces[i][0] + ", " + provinces[i][1]);
		}
	}
	
	public void createHashMap() {
		provincePair = new HashMap<String, String>();
		
		for(int i = 0; i < provinces.length; i++) {
			provincePair.put(provinces[i][0], provinces[i][1]);
		}
		
		Set<Map.Entry<String, String>> setP = provincePair.entrySet();
		
		for(Map.Entry<String, String> s : setP) {
			System.out.println("Abb: " + s.getKey() + ", name: " + s.getValue());
		}
		
	}
	
	public void iterateHashMap() {
		Set<String> sp = provincePair.keySet();
		
		Iterator<String> it = sp.iterator();
		
		while(it.hasNext()) {
			String k = it.next();
			String v = provincePair.get(k);
			
			System.out.println(k + ": " + v);
		}
		
	}
	
	public void useIt() {
		Set<Map.Entry<String, String>> setting = provincePair.entrySet();
		
		Iterator<Map.Entry<String, String>> it = setting.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> k = it.next();
			
			System.out.println("here are the entries lol: " + k);
		}
	}
	
}
