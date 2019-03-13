package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {
	
	private List<WordEnhanced> dictionary;

	public AlienDictionary() {
		dictionary= new ArrayList<WordEnhanced>();
	}
	public void addWord(String alien, String trans) {
		WordEnhanced w = new WordEnhanced(alien);
		if (dictionary.contains(w)) {
			dictionary.get(dictionary.indexOf(w)).setTranslation(trans);
			return;
		}
		w.setTranslation(trans);
		dictionary.add(w);
	}

	public String translateWord(String alien) {
		WordEnhanced we = new WordEnhanced(alien);
		if (dictionary.contains(we))
			return dictionary.get(dictionary.indexOf(we)).getTranslation();
		return null;
}
	}

