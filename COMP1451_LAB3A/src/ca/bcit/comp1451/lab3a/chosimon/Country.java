package ca.bcit.comp1451.lab3a.chosimon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Country {
	private String[][] provinces;
	private HashMap<String, String> provinceAbb;
	
	public Country() {
		this.provinces = new String[10][2];
		
		provinces[0][0] = "ab";
		provinces[1][0] = "bc";
		provinces[2][0] = "mb";
		provinces[3][0] = "nb";
		provinces[4][0] = "nl";
		provinces[5][0] = "ns";
		provinces[6][0] = "on";
		provinces[7][0] = "pe";
		provinces[8][0] = "qc";
		provinces[9][0] = "sk";
		
		provinces[0][1] = "alberta";
		provinces[1][1] = "british columbia";
		provinces[2][1] = "manitoba";
		provinces[3][1] = "new brunswick";
		provinces[4][1] = "newfoundland";
		provinces[5][1] = "nova scotia";
		provinces[6][1] = "ontario";
		provinces[7][1] = "prince edward island";
		provinces[8][1] = "quebec";
		provinces[9][1] = "saskatchewan";
	}
		
	public void createHashMap(){
		provinceAbb = new HashMap<>();
		
		for(int i = 0; i < provinces.length; i++) {
			provinceAbb.put(provinces[i][0], provinces[i][1]);
		}
	}
	
	public void showAllMappings() {
		Set<Map.Entry<String, String>> set = provinceAbb.entrySet();
		
		for(Map.Entry<String, String> p : set) {
			System.out.println("The abbreviation " + p.getKey() + " is for the province of " + p.getValue().substring(0, 1).toUpperCase() + p.getValue().substring(1));
		}

	}
	
	public void showAllMappings2() {
		Set<String> keys = provinceAbb.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String p  = provinceAbb.get(key);
			
			System.out.println("The province of " + p.substring(0, 1).toUpperCase() + p.substring(1) + 
							   " has an abbreviation of " + key);
		}
	}
	
	public boolean doesAnyProvinceContain(String substring) {
		if(provinceAbb.containsKey(substring)) {
			return true;
		} else {
			return false;
		}
	}
}